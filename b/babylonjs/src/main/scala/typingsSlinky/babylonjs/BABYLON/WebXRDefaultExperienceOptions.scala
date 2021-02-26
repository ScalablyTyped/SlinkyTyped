package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRDefaultExperienceOptions extends StObject {
  
  /**
    * Enable or disable default UI to enter XR
    */
  var disableDefaultUI: js.UndefOr[Boolean] = js.native
  
  /**
    * Should teleportation not initialize. defaults to false.
    */
  var disableTeleportation: js.UndefOr[Boolean] = js.native
  
  /**
    * Floor meshes that will be used for teleport
    */
  var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
  
  /**
    * If set to true, the first frame will not be used to reset position
    * The first frame is mainly used when copying transformation from the old camera
    * Mainly used in AR
    */
  var ignoreNativeCameraTransformation: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the controller mesh-loading. Can be used if you want to load your own meshes
    */
  var inputOptions: js.UndefOr[IWebXRInputOptions] = js.native
  
  /**
    * A list of optional features to init the session with
    * If set to true, all features we support will be added
    */
  var optionalFeatures: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * optional configuration for the output canvas
    */
  var outputCanvasOptions: js.UndefOr[WebXRManagedOutputCanvasOptions] = js.native
  
  /**
    * An optional rendering group id that will be set globally for teleportation, pointer selection and default controller meshes
    */
  var renderingGroupId: js.UndefOr[Double] = js.native
  
  /**
    * optional UI options. This can be used among other to change session mode and reference space type
    */
  var uiOptions: js.UndefOr[WebXREnterExitUIOptions] = js.native
  
  /**
    * When loading teleportation and pointer select, use stable versions instead of latest.
    */
  var useStablePlugins: js.UndefOr[Boolean] = js.native
}
object WebXRDefaultExperienceOptions {
  
  @scala.inline
  def apply(): WebXRDefaultExperienceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebXRDefaultExperienceOptions]
  }
  
  @scala.inline
  implicit class WebXRDefaultExperienceOptionsMutableBuilder[Self <: WebXRDefaultExperienceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableDefaultUI(value: Boolean): Self = StObject.set(x, "disableDefaultUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDefaultUIUndefined: Self = StObject.set(x, "disableDefaultUI", js.undefined)
    
    @scala.inline
    def setDisableTeleportation(value: Boolean): Self = StObject.set(x, "disableTeleportation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTeleportationUndefined: Self = StObject.set(x, "disableTeleportation", js.undefined)
    
    @scala.inline
    def setFloorMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "floorMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorMeshesUndefined: Self = StObject.set(x, "floorMeshes", js.undefined)
    
    @scala.inline
    def setFloorMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "floorMeshes", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreNativeCameraTransformation(value: Boolean): Self = StObject.set(x, "ignoreNativeCameraTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreNativeCameraTransformationUndefined: Self = StObject.set(x, "ignoreNativeCameraTransformation", js.undefined)
    
    @scala.inline
    def setInputOptions(value: IWebXRInputOptions): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputOptionsUndefined: Self = StObject.set(x, "inputOptions", js.undefined)
    
    @scala.inline
    def setOptionalFeatures(value: Boolean | js.Array[String]): Self = StObject.set(x, "optionalFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalFeaturesUndefined: Self = StObject.set(x, "optionalFeatures", js.undefined)
    
    @scala.inline
    def setOptionalFeaturesVarargs(value: String*): Self = StObject.set(x, "optionalFeatures", js.Array(value :_*))
    
    @scala.inline
    def setOutputCanvasOptions(value: WebXRManagedOutputCanvasOptions): Self = StObject.set(x, "outputCanvasOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputCanvasOptionsUndefined: Self = StObject.set(x, "outputCanvasOptions", js.undefined)
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
    
    @scala.inline
    def setUiOptions(value: WebXREnterExitUIOptions): Self = StObject.set(x, "uiOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiOptionsUndefined: Self = StObject.set(x, "uiOptions", js.undefined)
    
    @scala.inline
    def setUseStablePlugins(value: Boolean): Self = StObject.set(x, "useStablePlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStablePluginsUndefined: Self = StObject.set(x, "useStablePlugins", js.undefined)
  }
}
