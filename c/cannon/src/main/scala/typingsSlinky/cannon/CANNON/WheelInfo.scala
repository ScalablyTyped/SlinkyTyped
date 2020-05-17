package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WheelInfo extends js.Object {
  var axleLocal: Vec3 = js.native
  var axleWorld: Vec3 = js.native
  var brake: Double = js.native
  var chassisConnectionPointLocal: Vec3 = js.native
  var chassisConnectionPointWorld: Vec3 = js.native
  var clippedInvContactDotSuspension: Double = js.native
  var customSlidingRotationalSpeed: Double = js.native
  var dampingCompression: Double = js.native
  var dampingRelaxation: Double = js.native
  var deltaRotation: Double = js.native
  var directionLocal: Vec3 = js.native
  var directionWorld: Vec3 = js.native
  var engineForce: Double = js.native
  var forwardImpulse: Double = js.native
  var frictionSlip: Double = js.native
  var isFrontWheel: Boolean = js.native
  var isInContact: Boolean = js.native
  var maxSuspensionForce: Double = js.native
  var maxSuspensionTravbel: Double = js.native
  var radius: Double = js.native
  var raycastResult: RaycastResult = js.native
  var rollInfluence: Double = js.native
  var rotation: Double = js.native
  var sideImpulse: Double = js.native
  var skidInfo: Double = js.native
  var sliding: Boolean = js.native
  var steering: Double = js.native
  var suspensionForce: Double = js.native
  var suspensionLength: Double = js.native
  var suspensionMaxLength: Double = js.native
  var suspensionRelativeVelocity: Double = js.native
  var suspensionRestLength: Double = js.native
  var suspensionStiffness: Double = js.native
  var useCustomSlidingRotationalSpeed: Boolean = js.native
  var worldTransform: Transform = js.native
}

object WheelInfo {
  @scala.inline
  def apply(
    axleLocal: Vec3,
    axleWorld: Vec3,
    brake: Double,
    chassisConnectionPointLocal: Vec3,
    chassisConnectionPointWorld: Vec3,
    clippedInvContactDotSuspension: Double,
    customSlidingRotationalSpeed: Double,
    dampingCompression: Double,
    dampingRelaxation: Double,
    deltaRotation: Double,
    directionLocal: Vec3,
    directionWorld: Vec3,
    engineForce: Double,
    forwardImpulse: Double,
    frictionSlip: Double,
    isFrontWheel: Boolean,
    isInContact: Boolean,
    maxSuspensionForce: Double,
    maxSuspensionTravbel: Double,
    radius: Double,
    raycastResult: RaycastResult,
    rollInfluence: Double,
    rotation: Double,
    sideImpulse: Double,
    skidInfo: Double,
    sliding: Boolean,
    steering: Double,
    suspensionForce: Double,
    suspensionLength: Double,
    suspensionMaxLength: Double,
    suspensionRelativeVelocity: Double,
    suspensionRestLength: Double,
    suspensionStiffness: Double,
    useCustomSlidingRotationalSpeed: Boolean,
    worldTransform: Transform
  ): WheelInfo = {
    val __obj = js.Dynamic.literal(axleLocal = axleLocal.asInstanceOf[js.Any], axleWorld = axleWorld.asInstanceOf[js.Any], brake = brake.asInstanceOf[js.Any], chassisConnectionPointLocal = chassisConnectionPointLocal.asInstanceOf[js.Any], chassisConnectionPointWorld = chassisConnectionPointWorld.asInstanceOf[js.Any], clippedInvContactDotSuspension = clippedInvContactDotSuspension.asInstanceOf[js.Any], customSlidingRotationalSpeed = customSlidingRotationalSpeed.asInstanceOf[js.Any], dampingCompression = dampingCompression.asInstanceOf[js.Any], dampingRelaxation = dampingRelaxation.asInstanceOf[js.Any], deltaRotation = deltaRotation.asInstanceOf[js.Any], directionLocal = directionLocal.asInstanceOf[js.Any], directionWorld = directionWorld.asInstanceOf[js.Any], engineForce = engineForce.asInstanceOf[js.Any], forwardImpulse = forwardImpulse.asInstanceOf[js.Any], frictionSlip = frictionSlip.asInstanceOf[js.Any], isFrontWheel = isFrontWheel.asInstanceOf[js.Any], isInContact = isInContact.asInstanceOf[js.Any], maxSuspensionForce = maxSuspensionForce.asInstanceOf[js.Any], maxSuspensionTravbel = maxSuspensionTravbel.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], raycastResult = raycastResult.asInstanceOf[js.Any], rollInfluence = rollInfluence.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], sideImpulse = sideImpulse.asInstanceOf[js.Any], skidInfo = skidInfo.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], steering = steering.asInstanceOf[js.Any], suspensionForce = suspensionForce.asInstanceOf[js.Any], suspensionLength = suspensionLength.asInstanceOf[js.Any], suspensionMaxLength = suspensionMaxLength.asInstanceOf[js.Any], suspensionRelativeVelocity = suspensionRelativeVelocity.asInstanceOf[js.Any], suspensionRestLength = suspensionRestLength.asInstanceOf[js.Any], suspensionStiffness = suspensionStiffness.asInstanceOf[js.Any], useCustomSlidingRotationalSpeed = useCustomSlidingRotationalSpeed.asInstanceOf[js.Any], worldTransform = worldTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelInfo]
  }
  @scala.inline
  implicit class WheelInfoOps[Self <: WheelInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxleLocal(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axleLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxleWorld(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axleWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrake(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChassisConnectionPointLocal(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chassisConnectionPointLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChassisConnectionPointWorld(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chassisConnectionPointWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClippedInvContactDotSuspension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippedInvContactDotSuspension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomSlidingRotationalSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSlidingRotationalSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDampingCompression(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dampingCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDampingRelaxation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dampingRelaxation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionLocal(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionWorld(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardImpulse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardImpulse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrictionSlip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionSlip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFrontWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFrontWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInContact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSuspensionForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuspensionForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSuspensionTravbel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuspensionTravbel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaycastResult(value: RaycastResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raycastResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollInfluence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollInfluence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSideImpulse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideImpulse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkidInfo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skidInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSliding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteering(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspensionForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspensionLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspensionMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionMaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspensionRelativeVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionRelativeVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspensionRestLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionRestLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspensionStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCustomSlidingRotationalSpeed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomSlidingRotationalSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorldTransform(value: Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldTransform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

