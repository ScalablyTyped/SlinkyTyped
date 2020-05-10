package typingsSlinky.baseui.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarState extends js.Object {
  var noImageAvailable: Boolean = js.native
}

object AvatarState {
  @scala.inline
  def apply(noImageAvailable: Boolean): AvatarState = {
    val __obj = js.Dynamic.literal(noImageAvailable = noImageAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarState]
  }
  @scala.inline
  implicit class AvatarStateOps[Self <: AvatarState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoImageAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImageAvailable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

