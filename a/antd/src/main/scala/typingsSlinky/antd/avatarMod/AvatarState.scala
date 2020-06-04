package typingsSlinky.antd.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarState extends js.Object {
  var isImgExist: Boolean
  var mounted: Boolean
  var scale: Double
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsImgExist(value: Boolean): Self = this.set("isImgExist", value.asInstanceOf[js.Any])
    @scala.inline
    def setMounted(value: Boolean): Self = this.set("mounted", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
  }
  
}

