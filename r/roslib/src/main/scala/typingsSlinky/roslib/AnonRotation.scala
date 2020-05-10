package typingsSlinky.roslib

import typingsSlinky.roslib.mod.Quaternion
import typingsSlinky.roslib.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRotation extends js.Object {
  var rotation: Quaternion = js.native
  var translation: Vector3 = js.native
}

object AnonRotation {
  @scala.inline
  def apply(rotation: Quaternion, translation: Vector3): AnonRotation = {
    val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRotation]
  }
  @scala.inline
  implicit class AnonRotationOps[Self <: AnonRotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRotation(value: Quaternion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslation(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

