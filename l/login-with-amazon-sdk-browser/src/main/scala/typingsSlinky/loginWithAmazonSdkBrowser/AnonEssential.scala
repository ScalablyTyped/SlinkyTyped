package typingsSlinky.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEssential extends js.Object {
  var essential: Boolean = js.native
}

object AnonEssential {
  @scala.inline
  def apply(essential: Boolean): AnonEssential = {
    val __obj = js.Dynamic.literal(essential = essential.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEssential]
  }
  @scala.inline
  implicit class AnonEssentialOps[Self <: AnonEssential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEssential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("essential")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

