package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.vrExperienceHelperMod.VRExperienceHelperOptions
import typingsSlinky.babylonjs.webVRCameraMod.WebVROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/VR/index", JSImport.Namespace)
@js.native
object vRIndexMod extends js.Object {
  
  @js.native
  class OnAfterEnteringVRObservableEvent ()
    extends typingsSlinky.babylonjs.vrExperienceHelperMod.OnAfterEnteringVRObservableEvent
  
  @js.native
  class VRCameraMetrics ()
    extends typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  /* static members */
  @js.native
  object VRCameraMetrics extends js.Object {
    
    /**
      * Get the default VRMetrics based on the most generic setup.
      * @returns the default vr metrics
      */
    def GetDefault(): typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics = js.native
  }
  
  @js.native
  class VRDeviceOrientationArcRotateCamera protected ()
    extends typingsSlinky.babylonjs.vrDeviceOrientationArcRotateCameraMod.VRDeviceOrientationArcRotateCamera {
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
    def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3, scene: Scene) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Scene,
      compensateDistortion: Boolean
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Scene,
      compensateDistortion: js.UndefOr[scala.Nothing],
      vrCameraMetrics: typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Scene,
      compensateDistortion: Boolean,
      vrCameraMetrics: typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
  }
  
  @js.native
  class VRDeviceOrientationFreeCamera protected ()
    extends typingsSlinky.babylonjs.vrDeviceOrientationFreeCameraMod.VRDeviceOrientationFreeCamera {
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
  
  @js.native
  class VRDeviceOrientationGamepadCamera protected ()
    extends typingsSlinky.babylonjs.vrDeviceOrientationGamepadCameraMod.VRDeviceOrientationGamepadCamera {
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
  
  @js.native
  class VRExperienceHelper protected ()
    extends typingsSlinky.babylonjs.vrExperienceHelperMod.VRExperienceHelper {
    /**
      * Instantiates a VRExperienceHelper.
      * Helps to quickly add VR support to an existing scene.
      * @param scene The scene the VRExperienceHelper belongs to.
      * @param webVROptions Options to modify the vr experience helper's behavior.
      */
    def this(scene: Scene) = this()
    def this(
      scene: Scene,
      /** Options to modify the vr experience helper's behavior. */
    webVROptions: VRExperienceHelperOptions
    ) = this()
  }
  /* static members */
  @js.native
  object VRExperienceHelper extends js.Object {
    
    /**
      * Speed Constant Teleportation Mode
      */
    val TELEPORTATIONMODE_CONSTANTSPEED: Double = js.native
    
    /**
      * Time Constant Teleportation Mode
      */
    val TELEPORTATIONMODE_CONSTANTTIME: Double = js.native
  }
  
  @js.native
  class WebVRFreeCamera protected ()
    extends typingsSlinky.babylonjs.webVRCameraMod.WebVRFreeCamera {
    /**
      * Instantiates a WebVRFreeCamera.
      * @param name The name of the WebVRFreeCamera
      * @param position The starting anchor position for the camera
      * @param scene The scene the camera belongs to
      * @param webVROptions a set of customizable options for the webVRCamera
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Scene, webVROptions: WebVROptions) = this()
  }
}
