package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pose extends js.Object {
  /**
    * Value representing the face rotation on the pitch axis.
    */
  var Pitch: js.UndefOr[Degree] = js.native
  /**
    * Value representing the face rotation on the roll axis.
    */
  var Roll: js.UndefOr[Degree] = js.native
  /**
    * Value representing the face rotation on the yaw axis.
    */
  var Yaw: js.UndefOr[Degree] = js.native
}

object Pose {
  @scala.inline
  def apply(): Pose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pose]
  }
  @scala.inline
  implicit class PoseOps[Self <: Pose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPitch(value: Degree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pitch")(js.undefined)
        ret
    }
    @scala.inline
    def withRoll(value: Degree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Roll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Roll")(js.undefined)
        ret
    }
    @scala.inline
    def withYaw(value: Degree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Yaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Yaw")(js.undefined)
        ret
    }
  }
  
}

