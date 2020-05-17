package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VRDeviceOrientationGamepadCamera")
@js.native
class VRDeviceOrientationGamepadCamera protected ()
  extends typingsSlinky.babylonjs.BABYLON.VRDeviceOrientationGamepadCamera {
  /**
    * Creates a new VRDeviceOrientationGamepadCamera
    * @param name defines camera name
    * @param position defines the start position of the camera
    * @param scene defines the scene the camera belongs to
    * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
    * @param vrCameraMetrics defines the vr metrics associated to the camera
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    compensateDistortion: Boolean
  ) = this()
  def this(
    name: String,
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    compensateDistortion: Boolean,
    vrCameraMetrics: typingsSlinky.babylonjs.BABYLON.VRCameraMetrics
  ) = this()
}

