package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "VRDeviceOrientationFreeCamera")
@js.native
class VRDeviceOrientationFreeCamera protected ()
  extends typingsSlinky.babylonjs.legacyMod.VRDeviceOrientationFreeCamera {
  /**
    * Creates a new VRDeviceOrientationFreeCamera
    * @param name defines camera name
    * @param position defines the start position of the camera
    * @param scene defines the scene the camera belongs to
    * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
    * @param vrCameraMetrics defines the vr metrics associated to the camera
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    compensateDistortion: Boolean
  ) = this()
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    compensateDistortion: js.UndefOr[scala.Nothing],
    vrCameraMetrics: typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    compensateDistortion: Boolean,
    vrCameraMetrics: typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
}
