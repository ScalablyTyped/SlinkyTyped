package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.deviceOrientationCameraMod.DeviceOrientationCamera
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vrDeviceOrientationFreeCameraMod {
  
  @JSImport("babylonjs/Cameras/VR/vrDeviceOrientationFreeCamera", "VRDeviceOrientationFreeCamera")
  @js.native
  class VRDeviceOrientationFreeCamera protected () extends DeviceOrientationCamera {
    /**
      * Creates a new VRDeviceOrientationFreeCamera
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
      vrCameraMetrics: VRCameraMetrics
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      compensateDistortion: Boolean,
      vrCameraMetrics: VRCameraMetrics
    ) = this()
  }
}
