package typingsSlinky.antd.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarState extends js.Object {
  var isImgExist: Boolean = js.native
  var mounted: Boolean = js.native
  var scale: Double = js.native
}

object AvatarState {
  @scala.inline
  def apply(isImgExist: Boolean, mounted: Boolean, scale: Double): AvatarState = {
    val __obj = js.Dynamic.literal(isImgExist = isImgExist.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarState]
  }
  @scala.inline
  implicit class AvatarStateOps[Self <: AvatarState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsImgExist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImgExist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMounted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

