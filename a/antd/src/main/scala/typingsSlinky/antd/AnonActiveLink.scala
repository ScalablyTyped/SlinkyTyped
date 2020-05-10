package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActiveLink extends js.Object {
  var activeLink: Null = js.native
}

object AnonActiveLink {
  @scala.inline
  def apply(activeLink: Null): AnonActiveLink = {
    val __obj = js.Dynamic.literal(activeLink = activeLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveLink]
  }
  @scala.inline
  implicit class AnonActiveLinkOps[Self <: AnonActiveLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveLink(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

