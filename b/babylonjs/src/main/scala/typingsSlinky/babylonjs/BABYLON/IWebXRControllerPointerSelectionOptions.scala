package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.XRHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRControllerPointerSelectionOptions extends StObject {
  
  /**
    * if provided, this scene will be used to render meshes.
    */
  var customUtilityLayerScene: js.UndefOr[Scene] = js.native
  
  /**
    * Disable the pointer up event when the xr controller in screen and gaze mode is disposed (meaning - when the user removed the finger from the screen)
    * If not disabled, the last picked point will be used to execute a pointer up event
    * If disabled, pointer up event will be triggered right after the pointer down event.
    * Used in screen and gaze target ray mode only
    */
  var disablePointerUpOnTouchOut: Boolean = js.native
  
  /**
    * Should the scene pointerX and pointerY update be disabled
    * This is required for fullscreen AR GUI, but might slow down other experiences.
    * Disable in VR, if not needed.
    * The first rig camera (left eye) will be used to calculate the projection
    */
  var disableScenePointerVectorUpdate: Boolean = js.native
  
  /**
    * Disable switching the pointer selection from one controller to the other.
    * If the preferred hand is set it will be fixed on this hand, and if not it will be fixed on the first controller added to the scene
    */
  var disableSwitchOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable pointer selection on all controllers instead of switching between them
    */
  var enablePointerSelectionOnAllControllers: js.UndefOr[Boolean] = js.native
  
  /**
    * For gaze mode for tracked-pointer / controllers (time to select instead of button press)
    */
  var forceGazeMode: Boolean = js.native
  
  /**
    * Optional WebXR camera to be used for gaze selection
    */
  var gazeCamera: js.UndefOr[WebXRCamera] = js.native
  
  /**
    * Factor to be applied to the pointer-moved function in the gaze mode. How sensitive should the gaze mode be when checking if the pointer moved
    * to start a new countdown to the pointer down event.
    * Defaults to 1.
    */
  var gazeModePointerMovedFactor: js.UndefOr[Double] = js.native
  
  /**
    * The maximum distance of the pointer selection feature. Defaults to 100.
    */
  var maxPointerDistance: js.UndefOr[Double] = js.native
  
  /**
    * Different button type to use instead of the main component
    */
  var overrideButtonId: js.UndefOr[String] = js.native
  
  /**
    * The preferred hand to give the pointer selection to. This will be prioritized when the controller initialize.
    * If switch is enabled, it will still allow the user to switch between the different controllers
    */
  var preferredHandedness: js.UndefOr[XRHandedness] = js.native
  
  /**
    *  use this rendering group id for the meshes (optional)
    */
  var renderingGroupId: js.UndefOr[Double] = js.native
  
  /**
    * The amount of time in milliseconds it takes between pick found something to a pointer down event.
    * Used in gaze modes. Tracked pointer uses the trigger, screen uses touch events
    * 3000 means 3 seconds between pointing at something and selecting it
    */
  var timeToSelect: js.UndefOr[Double] = js.native
  
  /**
    * Should meshes created here be added to a utility layer or the main scene
    */
  var useUtilityLayer: js.UndefOr[Boolean] = js.native
  
  /**
    * the xr input to use with this pointer selection
    */
  var xrInput: WebXRInput = js.native
}
object IWebXRControllerPointerSelectionOptions {
  
  @scala.inline
  def apply(
    disablePointerUpOnTouchOut: Boolean,
    disableScenePointerVectorUpdate: Boolean,
    forceGazeMode: Boolean,
    xrInput: WebXRInput
  ): IWebXRControllerPointerSelectionOptions = {
    val __obj = js.Dynamic.literal(disablePointerUpOnTouchOut = disablePointerUpOnTouchOut.asInstanceOf[js.Any], disableScenePointerVectorUpdate = disableScenePointerVectorUpdate.asInstanceOf[js.Any], forceGazeMode = forceGazeMode.asInstanceOf[js.Any], xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRControllerPointerSelectionOptions]
  }
  
  @scala.inline
  implicit class IWebXRControllerPointerSelectionOptionsMutableBuilder[Self <: IWebXRControllerPointerSelectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomUtilityLayerScene(value: Scene): Self = StObject.set(x, "customUtilityLayerScene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUtilityLayerSceneUndefined: Self = StObject.set(x, "customUtilityLayerScene", js.undefined)
    
    @scala.inline
    def setDisablePointerUpOnTouchOut(value: Boolean): Self = StObject.set(x, "disablePointerUpOnTouchOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScenePointerVectorUpdate(value: Boolean): Self = StObject.set(x, "disableScenePointerVectorUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSwitchOnClick(value: Boolean): Self = StObject.set(x, "disableSwitchOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSwitchOnClickUndefined: Self = StObject.set(x, "disableSwitchOnClick", js.undefined)
    
    @scala.inline
    def setEnablePointerSelectionOnAllControllers(value: Boolean): Self = StObject.set(x, "enablePointerSelectionOnAllControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePointerSelectionOnAllControllersUndefined: Self = StObject.set(x, "enablePointerSelectionOnAllControllers", js.undefined)
    
    @scala.inline
    def setForceGazeMode(value: Boolean): Self = StObject.set(x, "forceGazeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGazeCamera(value: WebXRCamera): Self = StObject.set(x, "gazeCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGazeCameraUndefined: Self = StObject.set(x, "gazeCamera", js.undefined)
    
    @scala.inline
    def setGazeModePointerMovedFactor(value: Double): Self = StObject.set(x, "gazeModePointerMovedFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGazeModePointerMovedFactorUndefined: Self = StObject.set(x, "gazeModePointerMovedFactor", js.undefined)
    
    @scala.inline
    def setMaxPointerDistance(value: Double): Self = StObject.set(x, "maxPointerDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPointerDistanceUndefined: Self = StObject.set(x, "maxPointerDistance", js.undefined)
    
    @scala.inline
    def setOverrideButtonId(value: String): Self = StObject.set(x, "overrideButtonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideButtonIdUndefined: Self = StObject.set(x, "overrideButtonId", js.undefined)
    
    @scala.inline
    def setPreferredHandedness(value: XRHandedness): Self = StObject.set(x, "preferredHandedness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredHandednessUndefined: Self = StObject.set(x, "preferredHandedness", js.undefined)
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
    
    @scala.inline
    def setTimeToSelect(value: Double): Self = StObject.set(x, "timeToSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToSelectUndefined: Self = StObject.set(x, "timeToSelect", js.undefined)
    
    @scala.inline
    def setUseUtilityLayer(value: Boolean): Self = StObject.set(x, "useUtilityLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUtilityLayerUndefined: Self = StObject.set(x, "useUtilityLayer", js.undefined)
    
    @scala.inline
    def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
  }
}
