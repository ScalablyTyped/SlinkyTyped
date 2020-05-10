package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoseControlled extends js.Object {
  /**
    * The position of the device in babylon space.
    */
  var devicePosition: js.UndefOr[Vector3] = js.native
  /**
    * The rotation quaternion of the device in babylon space.
    */
  var deviceRotationQuaternion: Quaternion = js.native
  /**
    * The scale of the device to be used when translating from device space to babylon space.
    */
  var deviceScaleFactor: Double = js.native
  /**
    * The position of the object in babylon space.
    */
  var position: Vector3 = js.native
  /**
    * The raw pose coming from the device.
    */
  var rawPose: Nullable[DevicePose] = js.native
  /**
    * The rotation quaternion of the object in babylon space.
    */
  var rotationQuaternion: Quaternion = js.native
  /**
    * Updates the poseControlled values based on the input device pose.
    * @param poseData the pose data to update the object with
    */
  def updateFromDevice(poseData: DevicePose): Unit = js.native
}

object PoseControlled {
  @scala.inline
  def apply(
    deviceRotationQuaternion: Quaternion,
    deviceScaleFactor: Double,
    position: Vector3,
    rotationQuaternion: Quaternion,
    updateFromDevice: DevicePose => Unit
  ): PoseControlled = {
    val __obj = js.Dynamic.literal(deviceRotationQuaternion = deviceRotationQuaternion.asInstanceOf[js.Any], deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotationQuaternion = rotationQuaternion.asInstanceOf[js.Any], updateFromDevice = js.Any.fromFunction1(updateFromDevice))
    __obj.asInstanceOf[PoseControlled]
  }
  @scala.inline
  implicit class PoseControlledOps[Self <: PoseControlled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceRotationQuaternion(value: Quaternion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceRotationQuaternion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationQuaternion(value: Quaternion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationQuaternion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateFromDevice(value: DevicePose => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFromDevice")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDevicePosition(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withRawPose(value: Nullable[DevicePose]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawPose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawPoseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawPose")(null)
        ret
    }
  }
  
}

