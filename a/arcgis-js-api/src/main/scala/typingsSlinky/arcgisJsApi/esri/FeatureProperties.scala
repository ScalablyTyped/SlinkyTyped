package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureProperties extends WidgetProperties {
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined. Automatic popup templates are supported for layers that support the `createPopupTemplate` method. (Supported for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html), [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) and [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#defaultPopupTemplateEnabled)
    *
    * @default false
    */
  var defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#graphic)
    *
    * @default null
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  /**
    * A reference to the [view's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). Use this property when needing to get access to the underlying layers within the map. This can then be used within [Arcade](https://developers.arcgis.com/arcade) expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#map)
    *
    * @default null
    */
  var map: js.UndefOr[MapProperties] = js.native
  /**
    * The spatial reference used for [Arcade](https://developers.arcgis.com/arcade) operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#spatialReference)
    *
    * @default null
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureViewModelProperties] = js.native
  /**
    * The visible elements that are displayed within the widget's [graphic.popupTemplate.content](esri-PopupTemplate.html#content). This property provides the ability to turn individual elements of the widget's display on/off. See the [PopupTemplate.content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) documentation for additional information on how these elements work.
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
    def withDefaultPopupTemplateEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPopupTemplateEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPopupTemplateEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPopupTemplateEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphic(value: GraphicProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphic")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: MapProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: MapViewProperties | SceneViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: FeatureViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleElements(value: FeatureVisibleElements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(js.undefined)
        ret
    }
  }
  
}

