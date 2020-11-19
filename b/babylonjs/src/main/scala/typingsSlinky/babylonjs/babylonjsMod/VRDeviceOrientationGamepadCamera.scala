package typingsSlinky.babylonjs.babylonjsMod

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "VRDeviceOrientationGamepadCamera")
@js.native
class VRDeviceOrientationGamepadCamera protected ()
  extends typingsSlinky.babylonjs.vRIndexMod.VRDeviceOrientationGamepadCamera {
  /**
    * Creates a new VRDeviceOrientationGamepadCamera
    * @param name defines camera name
    * @param position defines the start position of the camera
    * @param scene defines the scene the camera belongs to
    * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
    * @param vrCameraMetrics defines the vr metrics associated to the camera
    */
  def this(name: String, position: Vector3, scene: Scene) = this()
  def this(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean) = this()
  def this(
    name: String,
    position: Vector3,
    scene: Scene,
    compensateDistortion: js.UndefOr[scala.Nothing],
    vrCameraMetrics: typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    position: Vector3,
    scene: Scene,
    compensateDistortion: Boolean,
    vrCameraMetrics: typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
}
