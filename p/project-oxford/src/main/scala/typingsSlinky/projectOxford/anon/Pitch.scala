package typingsSlinky.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pitch extends js.Object {
  var pitch: Double = js.native
  var roll: Double = js.native
  var yaw: Double = js.native
}

object Pitch {
  @scala.inline
  def apply(pitch: Double, roll: Double, yaw: Double): Pitch = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pitch]
  }
  @scala.inline
  implicit class PitchOps[Self <: Pitch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

