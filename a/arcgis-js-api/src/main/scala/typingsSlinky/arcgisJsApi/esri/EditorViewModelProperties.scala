package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorViewModelProperties extends StObject {
  
  /**
    * An array of string values which specifies what end users are allowed to edit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#allowedWorkflows)
    */
  var allowedWorkflows: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The [FeatureFormViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#featureFormViewModel)
    */
  var featureFormViewModel: js.UndefOr[FeatureFormViewModelProperties] = js.native
  
  /**
    * The [FeatureTemplatesViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#featureTemplatesViewModel)
    */
  var featureTemplatesViewModel: js.UndefOr[FeatureTemplatesViewModelProperties] = js.native
  
  /**
    * An array of editing configurations for individual layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LayerInfo]] = js.native
  
  /**
    * The [SketchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#sketchViewModel)
    */
  var sketchViewModel: js.UndefOr[SketchViewModelProperties] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object EditorViewModelProperties {
  
  @scala.inline
  def apply(): EditorViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorViewModelProperties]
  }
  
  @scala.inline
  implicit class EditorViewModelPropertiesMutableBuilder[Self <: EditorViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedWorkflows(value: js.Array[String]): Self = StObject.set(x, "allowedWorkflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedWorkflowsUndefined: Self = StObject.set(x, "allowedWorkflows", js.undefined)
    
    @scala.inline
    def setAllowedWorkflowsVarargs(value: String*): Self = StObject.set(x, "allowedWorkflows", js.Array(value :_*))
    
    @scala.inline
    def setFeatureFormViewModel(value: FeatureFormViewModelProperties): Self = StObject.set(x, "featureFormViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureFormViewModelUndefined: Self = StObject.set(x, "featureFormViewModel", js.undefined)
    
    @scala.inline
    def setFeatureTemplatesViewModel(value: FeatureTemplatesViewModelProperties): Self = StObject.set(x, "featureTemplatesViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTemplatesViewModelUndefined: Self = StObject.set(x, "featureTemplatesViewModel", js.undefined)
    
    @scala.inline
    def setLayerInfos(value: js.Array[LayerInfo]): Self = StObject.set(x, "layerInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerInfosUndefined: Self = StObject.set(x, "layerInfos", js.undefined)
    
    @scala.inline
    def setLayerInfosVarargs(value: LayerInfo*): Self = StObject.set(x, "layerInfos", js.Array(value :_*))
    
    @scala.inline
    def setSketchViewModel(value: SketchViewModelProperties): Self = StObject.set(x, "sketchViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSketchViewModelUndefined: Self = StObject.set(x, "sketchViewModel", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
