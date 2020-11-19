package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature extends Widget_ {
  
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined. Automatic popup templates are supported for layers that support the `createPopupTemplate` method. (Supported for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html) [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html), [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html), and [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#defaultPopupTemplateEnabled)
    *
    * @default false
    */
  var defaultPopupTemplateEnabled: Boolean = js.native
  
  /**
    * Paginates to a specified [media](esri-popup-content-MediaContent.html) info object. For example, you may have [media](esri-popup-content-MediaContent.html) content which contains multiple `mediaInfos`. This method allows you to specify the index of the `mediaInfos` you wish to display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#goToMedia)
    *
    * @param contentElementIndex The index position of the [media](esri-popup-content-MediaContent.html) content element to be updated.
    * @param mediaInfoIndex The index position of the [media](esri-popup-content-MediaContent.html) info object you wish to display.
    *
    */
  def goToMedia(contentElementIndex: Double, mediaInfoIndex: Double): Unit = js.native
  
  /**
    * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#graphic)
    *
    * @default null
    */
  var graphic: Graphic = js.native
  
  /**
    * A reference to the [view's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). Use this property when needing to get access to the underlying layers within the map. This can then be used within [Arcade](https://developers.arcgis.com/arcade) expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#map)
    *
    * @default null
    */
  var map: Map = js.native
  
  /**
    * Paginates to the next [media](esri-popup-content-MediaContent.html) info.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#nextMedia)
    *
    * @param contentElementIndex The index position of the [media](esri-popup-content-MediaContent.html) content element.
    *
    */
  def nextMedia(contentElementIndex: Double): Unit = js.native
  
  /**
    * Paginates to the previous [media](esri-popup-content-MediaContent.html) info in the specified [media](esri-popup-content-MediaContent.html) content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#previousMedia)
    *
    * @param contentElementIndex The index position of the [media](esri-popup-content-MediaContent.html) content element.
    *
    */
  def previousMedia(contentElementIndex: Double): Unit = js.native
  
  /**
    * The spatial reference used for [Arcade](https://developers.arcgis.com/arcade) operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#spatialReference)
    *
    * @default null
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * The title for the feature. You can disable this via the [visibleElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#visibleElements) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#title)
    *
    * @default null
    */
  val title: String = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#viewModel)
    */
  var viewModel: FeatureViewModel = js.native
  
  /**
    * The visible elements that are displayed within the widget's [graphic.popupTemplate.content](esri-PopupTemplate.html#content). This property provides the ability to turn individual elements of the widget's display on/off. See the [PopupTemplate.content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) documentation for additional information on how these elements work.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#visibleElements)
    */
  var visibleElements: FeatureVisibleElements = js.native
}
