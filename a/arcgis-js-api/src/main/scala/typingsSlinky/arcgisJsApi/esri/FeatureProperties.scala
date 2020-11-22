package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureProperties extends WidgetProperties {
  
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#defaultPopupTemplateEnabled)
    */
  var defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  
  /**
    * A reference to the [view's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#map)
    */
  var map: js.UndefOr[MapProperties] = js.native
  
  /**
    * The spatial reference used for [Arcade](https://developers.arcgis.com/arcade) operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureViewModelProperties] = js.native
  
  /**
    * The visible elements that are displayed within the widget's [graphic.popupTemplate.content](esri-PopupTemplate.html#content).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#visibleElements)
    */
  var visibleElements: js.UndefOr[FeatureVisibleElements] = js.native
}
object FeatureProperties {
  
  @scala.inline
  def apply(): FeatureProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureProperties]
  }
  
  @scala.inline
  implicit class FeaturePropertiesOps[Self <: FeatureProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultPopupTemplateEnabled(value: Boolean): Self = this.set("defaultPopupTemplateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPopupTemplateEnabled: Self = this.set("defaultPopupTemplateEnabled", js.undefined)
    
    @scala.inline
    def setGraphic(value: GraphicProperties): Self = this.set("graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphic: Self = this.set("graphic", js.undefined)
    
    @scala.inline
    def setMap(value: MapProperties): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: FeatureViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: FeatureVisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
}
