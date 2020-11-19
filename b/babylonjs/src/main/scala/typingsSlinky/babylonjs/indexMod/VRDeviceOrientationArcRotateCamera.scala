package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "VRDeviceOrientationArcRotateCamera")
@js.native
class VRDeviceOrientationArcRotateCamera protected ()
  extends typingsSlinky.babylonjs.babylonjsMod.VRDeviceOrientationArcRotateCamera {
  /**
    * Creates a new VRDeviceOrientationArcRotateCamera
    * @param name defines camera name
    * @param alpha defines the camera rotation along the logitudinal axis
    * @param beta defines the camera rotation along the latitudinal axis
    * @param radius defines the camera distance from its target
    * @param target defines the camera target
    * @param scene defines the scene the camera belongs to
    * @param compensateDistortion defines if the camera needs to compensate the lens distorsion
    * @param vrCameraMetrics defines the vr metrics associated to the camera
    */
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    compensateDistortion: Boolean
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    compensateDistortion: js.UndefOr[scala.Nothing],
    vrCameraMetrics: typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    compensateDistortion: Boolean,
    vrCameraMetrics: typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  ) = this()
}
