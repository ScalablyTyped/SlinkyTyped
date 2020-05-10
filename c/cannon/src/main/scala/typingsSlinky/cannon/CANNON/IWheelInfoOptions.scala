package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWheelInfoOptions extends js.Object {
  var axis: js.UndefOr[Vec3] = js.native
  var axleLocal: js.UndefOr[Vec3] = js.native
  var axleWorld: js.UndefOr[Vec3] = js.native
  var body: js.UndefOr[Body] = js.native
  var chassisConnectionPointLocal: js.UndefOr[Vec3] = js.native
  var chassisConnectionPointWorld: js.UndefOr[Vec3] = js.native
  var clippedInvContactDotSuspension: js.UndefOr[Double] = js.native
  var customSlidingRotationalSpeed: js.UndefOr[Double] = js.native
  var dampingCompression: js.UndefOr[Double] = js.native
  var dampingRelaxation: js.UndefOr[Double] = js.native
  var deltaRotation: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[Vec3] = js.native
  var directionLocal: js.UndefOr[Vec3] = js.native
  var directionWorld: js.UndefOr[Vec3] = js.native
  var frictionSlip: js.UndefOr[Double] = js.native
  var isFronmtWheel: js.UndefOr[Boolean] = js.native
  var maxSuspensionForce: js.UndefOr[Double] = js.native
  var maxSuspensionTravel: js.UndefOr[Double] = js.native
  var position: js.UndefOr[Vec3] = js.native
  var radius: js.UndefOr[Double] = js.native
  var rollInfluence: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var skidInfo: js.UndefOr[Double] = js.native
  var steering: js.UndefOr[Double] = js.native
  var suspensionForce: js.UndefOr[Double] = js.native
  var suspensionLength: js.UndefOr[Double] = js.native
  var suspensionMaxLength: js.UndefOr[Double] = js.native
  var suspensionRelativeVelocity: js.UndefOr[Double] = js.native
  var suspensionRestLength: js.UndefOr[Double] = js.native
  var suspensionStiffness: js.UndefOr[Double] = js.native
  var useCustomSlidingRotationalSpeed: js.UndefOr[Boolean] = js.native
}

object IWheelInfoOptions {
  @scala.inline
  def apply(): IWheelInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWheelInfoOptions]
  }
  @scala.inline
  implicit class IWheelInfoOptionsOps[Self <: IWheelInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withAxleLocal(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axleLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxleLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axleLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withAxleWorld(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axleWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxleWorld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axleWorld")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withChassisConnectionPointLocal(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chassisConnectionPointLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChassisConnectionPointLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chassisConnectionPointLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withChassisConnectionPointWorld(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chassisConnectionPointWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChassisConnectionPointWorld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chassisConnectionPointWorld")(js.undefined)
        ret
    }
    @scala.inline
    def withClippedInvContactDotSuspension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippedInvContactDotSuspension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClippedInvContactDotSuspension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippedInvContactDotSuspension")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSlidingRotationalSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSlidingRotationalSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSlidingRotationalSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSlidingRotationalSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withDampingCompression(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dampingCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDampingCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dampingCompression")(js.undefined)
        ret
    }
    @scala.inline
    def withDampingRelaxation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dampingRelaxation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDampingRelaxation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dampingRelaxation")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionLocal(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionWorld(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionWorld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionWorld")(js.undefined)
        ret
    }
    @scala.inline
    def withFrictionSlip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionSlip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionSlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionSlip")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFronmtWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFronmtWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFronmtWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFronmtWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSuspensionForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuspensionForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSuspensionForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuspensionForce")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSuspensionTravel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuspensionTravel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSuspensionTravel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuspensionTravel")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRollInfluence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollInfluence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollInfluence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollInfluence")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSkidInfo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skidInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkidInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skidInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSteering(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steering")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspensionForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspensionForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionForce")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspensionLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspensionLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspensionMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionMaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspensionMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionMaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspensionRelativeVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionRelativeVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspensionRelativeVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionRelativeVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspensionRestLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionRestLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspensionRestLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionRestLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspensionStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspensionStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionStiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCustomSlidingRotationalSpeed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomSlidingRotationalSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCustomSlidingRotationalSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomSlidingRotationalSpeed")(js.undefined)
        ret
    }
  }
  
}

