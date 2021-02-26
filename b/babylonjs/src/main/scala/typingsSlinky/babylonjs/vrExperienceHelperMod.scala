package typingsSlinky.babylonjs

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.anon.Controller
import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.deviceOrientationCameraMod.DeviceOrientationCamera
import typingsSlinky.babylonjs.easingMod.EasingFunction
import typingsSlinky.babylonjs.mathColorMod.Color3
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.pickingInfoMod.PickingInfo
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
import typingsSlinky.babylonjs.vrDeviceOrientationFreeCameraMod.VRDeviceOrientationFreeCamera
import typingsSlinky.babylonjs.webVRCameraMod.WebVRFreeCamera
import typingsSlinky.babylonjs.webVRCameraMod.WebVROptions
import typingsSlinky.babylonjs.webVRControllerMod.WebVRController
import typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vrExperienceHelperMod {
  
  @JSImport("babylonjs/Cameras/VR/vrExperienceHelper", "OnAfterEnteringVRObservableEvent")
  @js.native
  class OnAfterEnteringVRObservableEvent () extends StObject {
    
    /**
      * If entering vr was successful
      */
    var success: Boolean = js.native
  }
  
  @JSImport("babylonjs/Cameras/VR/vrExperienceHelper", "VRExperienceHelper")
  @js.native
  class VRExperienceHelper protected () extends StObject {
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
    
    var _btnVR: js.Any = js.native
    
    var _btnVRDisplayed: js.Any = js.native
    
    var _cachedAngularSensibility: js.Any = js.native
    
    var _cameraGazer: js.Any = js.native
    
    var _castRayAndSelectObject: js.Any = js.native
    
    var _checkRotate: js.Any = js.native
    
    var _checkTeleportBackwards: js.Any = js.native
    
    var _checkTeleportWithRay: js.Any = js.native
    
    var _circleEase: js.Any = js.native
    
    var _convertNormalToDirectionOfRay: js.Any = js.native
    
    var _createTeleportationCircles: js.Any = js.native
    
    var _defaultHeight: js.Any = js.native
    
    var _deviceOrientationCamera: js.Any = js.native
    
    var _displayGaze: js.Any = js.native
    
    var _displayLaserPointer: js.Any = js.native
    
    var _displayTeleportationTarget: js.Any = js.native
    
    var _enableInteractionOnController: js.Any = js.native
    
    var _enableTeleportationOnController: js.Any = js.native
    
    var _existingCamera: js.Any = js.native
    
    var _floorMeshName: js.Any = js.native
    
    var _floorMeshesCollection: js.Any = js.native
    
    var _fullscreenVRpresenting: js.Any = js.native
    
    var _gazeColor: js.Any = js.native
    
    var _haloCenter: js.Any = js.native
    
    var _hasEnteredVR: js.Any = js.native
    
    var _hideTeleportationTarget: js.Any = js.native
    
    var _inputElement: js.Any = js.native
    
    var _interactionsEnabled: js.Any = js.native
    
    var _interactionsRequested: js.Any = js.native
    
    var _isDefaultTeleportationTarget: js.Any = js.native
    
    var _isTeleportationFloor: js.Any = js.native
    
    var _laserColor: js.Any = js.native
    
    var _leftController: js.Any = js.native
    
    var _moveTeleportationSelectorTo: js.Any = js.native
    
    /* private */ def _noControllerIsActive: js.Any = js.native
    
    var _notifySelectedMeshUnselected: js.Any = js.native
    
    var _onDefaultMeshLoaded: js.Any = js.native
    
    var _onFullscreenChange: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onNewGamepadConnected: js.Any = js.native
    
    var _onNewGamepadDisconnected: js.Any = js.native
    
    var _onResize: js.Any = js.native
    
    var _onVRDisplayChanged: js.Any = js.native
    
    var _onVRRequestPresentComplete: js.Any = js.native
    
    var _onVRRequestPresentStart: js.Any = js.native
    
    var _onVrDisplayPresentChange: js.Any = js.native
    
    var _padSensibilityDown: js.Any = js.native
    
    var _padSensibilityUp: js.Any = js.native
    
    var _pickedGazeColor: js.Any = js.native
    
    var _pickedLaserColor: js.Any = js.native
    
    var _position: js.Any = js.native
    
    var _postProcessMove: js.Any = js.native
    
    var _rayLength: js.Any = js.native
    
    var _raySelectionPredicate: js.Any = js.native
    
    var _rightController: js.Any = js.native
    
    var _rotateCamera: js.Any = js.native
    
    var _rotationAllowed: js.Any = js.native
    
    var _rotationAngle: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _teleportActive: js.Any = js.native
    
    var _teleportBackwardsVector: js.Any = js.native
    
    var _teleportationBorderColor: js.Any = js.native
    
    var _teleportationEasing: js.Any = js.native
    
    var _teleportationFillColor: js.Any = js.native
    
    var _teleportationInitialized: js.Any = js.native
    
    var _teleportationMode: js.Any = js.native
    
    /* private */ def _teleportationRequestInitiated: js.Any = js.native
    
    var _teleportationRequested: js.Any = js.native
    
    var _teleportationSpeed: js.Any = js.native
    
    var _teleportationTarget: js.Any = js.native
    
    var _teleportationTime: js.Any = js.native
    
    var _tryEnableInteractionOnController: js.Any = js.native
    
    var _useCustomVRButton: js.Any = js.native
    
    var _vrDeviceOrientationCamera: js.Any = js.native
    
    var _webVRCamera: js.Any = js.native
    
    var _webVRpresenting: js.Any = js.native
    
    var _webVRready: js.Any = js.native
    
    var _webVRrequesting: js.Any = js.native
    
    var _webVRsupported: js.Any = js.native
    
    var _workingMatrix: js.Any = js.native
    
    var _workingQuaternion: js.Any = js.native
    
    var _workingVector: js.Any = js.native
    
    /**
      * Adds a floor mesh to be used for teleportation.
      * @param floorMesh the mesh to be used for teleportation.
      */
    def addFloorMesh(floorMesh: Mesh): Unit = js.native
    
    var beforeRender: js.Any = js.native
    
    /**
      * Sets the color of the ray from the vr headsets gaze.
      * @param color new color for the ray.
      */
    def changeGazeColor(color: Color3): Unit = js.native
    
    /**
      * Sets the color of the laser ray from the vr controllers.
      * @param color new color for the ray.
      */
    def changeLaserColor(color: Color3): Unit = js.native
    
    var completeVRInit: js.Any = js.native
    
    /**
      * Based on the current WebVR support, returns the current VR camera used.
      */
    def currentVRCamera: Nullable[Camera] = js.native
    
    /**
      * The deviceOrientationCamera used as the camera when not in VR.
      */
    def deviceOrientationCamera: Nullable[DeviceOrientationCamera] = js.native
    
    /**
      * If the ray of the gaze should be displayed.
      */
    def displayGaze: Boolean = js.native
    /**
      * Sets if the ray of the gaze should be displayed.
      */
    def displayGaze_=(value: Boolean): Unit = js.native
    
    /**
      * If the ray of the LaserPointer should be displayed.
      */
    def displayLaserPointer: Boolean = js.native
    /**
      * Sets if the ray of the LaserPointer should be displayed.
      */
    def displayLaserPointer_=(value: Boolean): Unit = js.native
    
    var displayVRButton: js.Any = js.native
    
    /**
      * Exits VR and disposes of the vr experience helper
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating that gaze can be enabled even if pointer lock is not engage (useful on iOS where fullscreen mode and pointer lock are not supported)
      */
    var enableGazeEvenWhenNoPointerLock: Boolean = js.native
    
    /**
      * Enables controllers and user interactions such as selecting and object or clicking on an object.
      */
    def enableInteractions(): Unit = js.native
    
    /**
      * Enables interactions and teleportation using the VR controllers and gaze.
      * @param vrTeleportationOptions options to modify teleportation behavior.
      */
    def enableTeleportation(): Unit = js.native
    def enableTeleportation(vrTeleportationOptions: VRTeleportationOptions): Unit = js.native
    
    /**
      * Attempt to enter VR. If a headset is connected and ready, will request present on that.
      * Otherwise, will use the fullscreen API.
      */
    def enterVR(): Unit = js.native
    
    /**
      * Attempt to exit VR, or fullscreen.
      */
    def exitVR(): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating that the VREXperienceHelper will exit VR if double tap is detected
      */
    var exitVROnDoubleTap: Boolean = js.native
    
    /**
      * The mesh used to display where the user is selecting, this mesh will be cloned and set as the gazeTracker for the left and right controller
      * when set bakeCurrentTransformIntoVertices will be called on the mesh.
      * See https://doc.babylonjs.com/resources/baking_transformations
      */
    def gazeTrackerMesh: Mesh = js.native
    def gazeTrackerMesh_=(value: Mesh): Unit = js.native
    
    /**
      * Gets the name of the VRExperienceHelper class
      * @returns "VRExperienceHelper"
      */
    def getClassName(): String = js.native
    
    /**
      * Gets a value indicating if we are currently in VR mode.
      */
    def isInVRMode: Boolean = js.native
    
    /**
      * The gaze tracking mesh corresponding to the left controller
      */
    def leftControllerGazeTrackerMesh: Nullable[Mesh] = js.native
    
    /**
      * To be optionaly changed by user to define custom selection logic (after ray selection)
      */
    def meshSelectionPredicate(mesh: AbstractMesh): Boolean = js.native
    
    var moveButtonToBottomRight: js.Any = js.native
    
    /**
      *  Observable raised after camera teleportation
      */
    var onAfterCameraTeleport: Observable[Vector3] = js.native
    
    /**
      * Observable raised when entering VR has completed.
      */
    var onAfterEnteringVRObservable: Observable[OnAfterEnteringVRObservableEvent] = js.native
    
    /**
      * Observable raised before camera teleportation
      */
    var onBeforeCameraTeleport: Observable[Vector3] = js.native
    
    /** Return this.onControllerMeshLoadedObservable
      * Note: This one is for backward compatibility. Please use onControllerMeshLoadedObservable directly
      */
    def onControllerMeshLoaded: Observable[WebVRController] = js.native
    
    /**
      * Observable raised when controller mesh is loaded.
      */
    var onControllerMeshLoadedObservable: Observable[WebVRController] = js.native
    
    /** Return this.onEnteringVRObservable
      * Note: This one is for backward compatibility. Please use onEnteringVRObservable directly
      */
    def onEnteringVR: Observable[VRExperienceHelper] = js.native
    
    /**
      * Observable raised right before entering VR.
      */
    var onEnteringVRObservable: Observable[VRExperienceHelper] = js.native
    
    /** Return this.onExitingVRObservable
      * Note: This one is for backward compatibility. Please use onExitingVRObservable directly
      */
    def onExitingVR: Observable[VRExperienceHelper] = js.native
    
    /**
      * Observable raised when exiting VR.
      */
    var onExitingVRObservable: Observable[VRExperienceHelper] = js.native
    
    /**
      * Observable raised when a new mesh is selected based on meshSelectionPredicate.
      * This observable will provide the mesh and the controller used to select the mesh
      */
    var onMeshSelectedWithController: Observable[Controller] = js.native
    
    /**
      * Observable raised when a new mesh is picked based on meshSelectionPredicate
      */
    var onNewMeshPicked: Observable[PickingInfo] = js.native
    
    /**
      * Observable raised when a new mesh is selected based on meshSelectionPredicate
      */
    var onNewMeshSelected: Observable[AbstractMesh] = js.native
    
    /**
      * Observable raised when current selected mesh gets unselected
      */
    var onSelectedMeshUnselected: Observable[AbstractMesh] = js.native
    
    var onVRDisplayChanged: js.Any = js.native
    
    var onVrDisplayPresentChange: js.Any = js.native
    
    /**
      * The position of the vr experience helper.
      */
    def position: Vector3 = js.native
    /**
      * Sets the position of the vr experience helper.
      */
    def position_=(value: Vector3): Unit = js.native
    
    /**
      * To be optionaly changed by user to define custom ray selection
      */
    def raySelectionPredicate(mesh: AbstractMesh): Boolean = js.native
    
    /**
      * Removes a floor mesh from being used for teleportation.
      * @param floorMesh the mesh to be removed.
      */
    def removeFloorMesh(floorMesh: Mesh): Unit = js.native
    
    /**
      * Defines whether or not Pointer lock should be requested when switching to
      * full screen.
      */
    var requestPointerLockOnFullScreen: Boolean = js.native
    
    /**
      * The gaze tracking mesh corresponding to the right controller
      */
    def rightControllerGazeTrackerMesh: Nullable[Mesh] = js.native
    
    /**
      * Permanently set new colors for the gaze pointer
      * @param color the new gaze color
      * @param pickedColor the new gaze color when picked mesh detected
      */
    def setGazeColor(color: Color3): Unit = js.native
    def setGazeColor(color: Color3, pickedColor: Color3): Unit = js.native
    
    /**
      * Permanently set new colors for the laser pointer
      * @param color the new laser color
      * @param pickedColor the new laser color when picked mesh detected
      */
    def setLaserColor(color: Color3): Unit = js.native
    def setLaserColor(color: Color3, pickedColor: Color3): Unit = js.native
    
    /**
      * Set lighting enabled / disabled on the laser pointer of both controllers
      * @param enabled should the lighting be enabled on the laser pointer
      */
    def setLaserLightingState(): Unit = js.native
    def setLaserLightingState(enabled: Boolean): Unit = js.native
    
    /**
      * Teleports the users feet to the desired location
      * @param location The location where the user's feet should be placed
      */
    def teleportCamera(location: Vector3): Unit = js.native
    
    /**
      * Set teleportation enabled. If set to false camera teleportation will be disabled but camera rotation will be kept.
      */
    var teleportationEnabled: Boolean = js.native
    
    /**
      * The mesh used to display where the user is going to teleport.
      */
    def teleportationTarget: Mesh = js.native
    /**
      * Sets the mesh to be used to display where the user is going to teleport.
      */
    def teleportationTarget_=(value: Mesh): Unit = js.native
    
    var updateButtonVisibility: js.Any = js.native
    
    /**
      * If the controller laser color should be updated when selecting meshes
      */
    var updateControllerLaserColor: Boolean = js.native
    
    /**
      * If the gaze trackers color should be updated when selecting meshes
      */
    var updateGazeTrackerColor: Boolean = js.native
    
    /**
      * If the gaze trackers scale should be updated to be constant size when pointing at near/far meshes
      */
    var updateGazeTrackerScale: Boolean = js.native
    
    /**
      * The html button that is used to trigger entering into VR.
      */
    def vrButton: Nullable[HTMLButtonElement] = js.native
    
    /**
      * The deviceOrientationCamera that is used as a fallback when vr device is not connected.
      */
    def vrDeviceOrientationCamera: Nullable[VRDeviceOrientationFreeCamera] = js.native
    
    /**
      * The webVRCamera which is used when in VR.
      */
    def webVRCamera: WebVRFreeCamera = js.native
    
    /** Options to modify the vr experience helper's behavior. */
    var webVROptions: VRExperienceHelperOptions = js.native
    
    /**
      * If asking to force XR, this will be populated with the default xr experience
      */
    var xr: WebXRDefaultExperience = js.native
    
    /**
      * Was the XR test done already. If this is true AND this.xr exists, xr is initialized.
      * If this is true and no this.xr, xr exists but is not supported, using WebVR.
      */
    var xrTestDone: Boolean = js.native
  }
  /* static members */
  object VRExperienceHelper {
    
    /**
      * Speed Constant Teleportation Mode
      */
    @JSImport("babylonjs/Cameras/VR/vrExperienceHelper", "VRExperienceHelper.TELEPORTATIONMODE_CONSTANTSPEED")
    @js.native
    val TELEPORTATIONMODE_CONSTANTSPEED: Double = js.native
    
    /**
      * Time Constant Teleportation Mode
      */
    @JSImport("babylonjs/Cameras/VR/vrExperienceHelper", "VRExperienceHelper.TELEPORTATIONMODE_CONSTANTTIME")
    @js.native
    val TELEPORTATIONMODE_CONSTANTTIME: Double = js.native
  }
  
  @js.native
  trait VRExperienceHelperOptions extends WebVROptions {
    
    /**
      * Create a DeviceOrientationCamera to be used as your out of vr camera. (default: true)
      */
    var createDeviceOrientationCamera: js.UndefOr[Boolean] = js.native
    
    /**
      * Create a VRDeviceOrientationFreeCamera to be used for VR when no external HMD is found. (default: true)
      */
    var createFallbackVRDeviceOrientationFreeCamera: js.UndefOr[Boolean] = js.native
    
    /**
      * A list of meshes to be used as the teleportation floor. If specified, teleportation will be enabled (default: undefined)
      */
    var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.native
    
    /**
      * Uses the main button on the controller to toggle the laser casted. (default: true)
      */
    var laserToggle: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines if WebXR should be used instead of WebVR (if available)
      */
    var useXR: js.UndefOr[Boolean] = js.native
    
    /**
      * Distortion metrics for the fallback vrDeviceOrientationCamera (default: VRCameraMetrics.Default)
      */
    var vrDeviceOrientationCameraMetrics: js.UndefOr[VRCameraMetrics] = js.native
  }
  object VRExperienceHelperOptions {
    
    @scala.inline
    def apply(): VRExperienceHelperOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VRExperienceHelperOptions]
    }
    
    @scala.inline
    implicit class VRExperienceHelperOptionsMutableBuilder[Self <: VRExperienceHelperOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateDeviceOrientationCamera(value: Boolean): Self = StObject.set(x, "createDeviceOrientationCamera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDeviceOrientationCameraUndefined: Self = StObject.set(x, "createDeviceOrientationCamera", js.undefined)
      
      @scala.inline
      def setCreateFallbackVRDeviceOrientationFreeCamera(value: Boolean): Self = StObject.set(x, "createFallbackVRDeviceOrientationFreeCamera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFallbackVRDeviceOrientationFreeCameraUndefined: Self = StObject.set(x, "createFallbackVRDeviceOrientationFreeCamera", js.undefined)
      
      @scala.inline
      def setFloorMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "floorMeshes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloorMeshesUndefined: Self = StObject.set(x, "floorMeshes", js.undefined)
      
      @scala.inline
      def setFloorMeshesVarargs(value: Mesh*): Self = StObject.set(x, "floorMeshes", js.Array(value :_*))
      
      @scala.inline
      def setLaserToggle(value: Boolean): Self = StObject.set(x, "laserToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaserToggleUndefined: Self = StObject.set(x, "laserToggle", js.undefined)
      
      @scala.inline
      def setUseXR(value: Boolean): Self = StObject.set(x, "useXR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseXRUndefined: Self = StObject.set(x, "useXR", js.undefined)
      
      @scala.inline
      def setVrDeviceOrientationCameraMetrics(value: VRCameraMetrics): Self = StObject.set(x, "vrDeviceOrientationCameraMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVrDeviceOrientationCameraMetricsUndefined: Self = StObject.set(x, "vrDeviceOrientationCameraMetrics", js.undefined)
    }
  }
  
  @js.native
  trait VRTeleportationOptions extends StObject {
    
    /**
      * The easing function used in the animation or null for Linear. (default CircleEase)
      */
    var easingFunction: js.UndefOr[EasingFunction] = js.native
    
    /**
      * The name of the mesh which should be used as the teleportation floor. (default: null)
      */
    var floorMeshName: js.UndefOr[String] = js.native
    
    /**
      * A list of meshes to be used as the teleportation floor. (default: empty)
      */
    var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.native
    
    /**
      * The teleportation mode. (default: TELEPORTATIONMODE_CONSTANTTIME)
      */
    var teleportationMode: js.UndefOr[Double] = js.native
    
    /**
      * The speed of the animation in distance/sec, apply when animationMode is TELEPORTATIONMODE_CONSTANTSPEED. (default 20 units / sec)
      */
    var teleportationSpeed: js.UndefOr[Double] = js.native
    
    /**
      * The duration of the animation in ms, apply when animationMode is TELEPORTATIONMODE_CONSTANTTIME. (default 122ms)
      */
    var teleportationTime: js.UndefOr[Double] = js.native
  }
  object VRTeleportationOptions {
    
    @scala.inline
    def apply(): VRTeleportationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VRTeleportationOptions]
    }
    
    @scala.inline
    implicit class VRTeleportationOptionsMutableBuilder[Self <: VRTeleportationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEasingFunction(value: EasingFunction): Self = StObject.set(x, "easingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingFunctionUndefined: Self = StObject.set(x, "easingFunction", js.undefined)
      
      @scala.inline
      def setFloorMeshName(value: String): Self = StObject.set(x, "floorMeshName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloorMeshNameUndefined: Self = StObject.set(x, "floorMeshName", js.undefined)
      
      @scala.inline
      def setFloorMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "floorMeshes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloorMeshesUndefined: Self = StObject.set(x, "floorMeshes", js.undefined)
      
      @scala.inline
      def setFloorMeshesVarargs(value: Mesh*): Self = StObject.set(x, "floorMeshes", js.Array(value :_*))
      
      @scala.inline
      def setTeleportationMode(value: Double): Self = StObject.set(x, "teleportationMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeleportationModeUndefined: Self = StObject.set(x, "teleportationMode", js.undefined)
      
      @scala.inline
      def setTeleportationSpeed(value: Double): Self = StObject.set(x, "teleportationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeleportationSpeedUndefined: Self = StObject.set(x, "teleportationSpeed", js.undefined)
      
      @scala.inline
      def setTeleportationTime(value: Double): Self = StObject.set(x, "teleportationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeleportationTimeUndefined: Self = StObject.set(x, "teleportationTime", js.undefined)
    }
  }
}
