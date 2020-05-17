package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Space
import typingsSlinky.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdjustRoll extends js.Object {
  var adjustPitch: js.UndefOr[Double] = js.native
  var adjustRoll: js.UndefOr[Double] = js.native
  var adjustYaw: js.UndefOr[Double] = js.native
  var maxPitch: js.UndefOr[Double] = js.native
  var maxYaw: js.UndefOr[Double] = js.native
  var minPitch: js.UndefOr[Double] = js.native
  var minYaw: js.UndefOr[Double] = js.native
  var pitchAxis: js.UndefOr[Vector3] = js.native
  var slerpAmount: js.UndefOr[Double] = js.native
  var upAxis: js.UndefOr[Vector3] = js.native
  var upAxisSpace: js.UndefOr[Space] = js.native
  var yawAxis: js.UndefOr[Vector3] = js.native
}

object AdjustRoll {
  @scala.inline
  def apply(): AdjustRoll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustRoll]
  }
  @scala.inline
  implicit class AdjustRollOps[Self <: AdjustRoll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withAdjustRoll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustRoll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustRoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustRoll")(js.undefined)
        ret
    }
    @scala.inline
    def withAdjustYaw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustYaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustYaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustYaw")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxYaw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxYaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYaw")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withMinYaw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minYaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinYaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minYaw")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchAxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withSlerpAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slerpAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlerpAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slerpAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withUpAxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withUpAxisSpace(value: Space): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upAxisSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpAxisSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upAxisSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withYawAxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yawAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYawAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yawAxis")(js.undefined)
        ret
    }
  }
  
}

