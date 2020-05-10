package typingsSlinky.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTransparent extends js.Object {
  var transparent: Boolean = js.native
}

object AnonTransparent {
  @scala.inline
  def apply(transparent: Boolean): AnonTransparent = {
    val __obj = js.Dynamic.literal(transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransparent]
  }
  @scala.inline
  implicit class AnonTransparentOps[Self <: AnonTransparent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

