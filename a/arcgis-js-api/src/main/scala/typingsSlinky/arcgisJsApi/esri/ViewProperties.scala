package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewProperties extends DOMContainerProperties {
  /**
    * Collection containing a flat list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) related to the basemap, operational layers, and group layers in this view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#allLayerViews)
    */
  var allLayerViews: js.UndefOr[CollectionProperties[LayerViewProperties]] = js.native
  /**
    * Represents an ongoing view animation initialized by [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo). You may [watch](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html#watch) this property to be notified when the view's extent changes .
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#animation)
    */
  var animation: js.UndefOr[ViewAnimationProperties] = js.native
  /**
    * Represents the view for a single basemap after it has been added to the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#basemapView)
    */
  var basemapView: js.UndefOr[BasemapViewProperties] = js.native
  /**
    * A fatal [error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) returned when the view loses its WebGL context. Watch this property to properly handle the error and attempt to recover the WebGL context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#fatalError)
    */
  var fatalError: js.UndefOr[Error] = js.native
  /**
    * Allows for adding [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) directly to the default graphics in the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics)
    */
  var graphics: js.UndefOr[CollectionProperties[GraphicProperties]] = js.native
  /**
    * A collection containing a hierarchical list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of the [operational layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#layerViews)
    */
  var layerViews: js.UndefOr[CollectionProperties[LayerViewProperties]] = js.native
  /**
    * An instance of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) object to display in the view. A view may only display one map at a time. On the other hand, one [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) may be viewed by multiple [MapViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and/or [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) simultaneously.  This property is typically set in the constructor of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [class description](#) for examples demonstrating the relationship between the map and the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map)
    */
  var map: js.UndefOr[MapProperties] = js.native
  /**
    * Options to configure the navigation behavior of the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#navigation)
    */
  var navigation: js.UndefOr[NavigationProperties] = js.native
  /**
    * Use the padding property to make the [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center), and [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent), etc. work off a subsection of the full view. This is particularly useful when layering UI elements or semi-transparent content on top of portions of the view. See the [view padding sample](https://developers.arcgis.com/javascript/latest/sample-code/view-padding/index.html) for an example of how this works.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#padding)
    *
    * @default {left: 0, top: 0, right: 0, bottom: 0}
    */
  var padding: js.UndefOr[ViewPadding] = js.native
  /**
    * The spatial reference of the view. This indicates the [Projected Coordinate System](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) or the [Geographic Coordinate System](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) used to locate geographic features in the map. In a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) the following [supported coordinate systems](esri-views-SceneView.html#supported-coordinate-systems) are available.  The spatial reference can either be set explicitly or automatically derived from the following:
    *   * In the case of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), if the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#map) is a [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) instance, the [WebScene.initialViewProperties.spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#initialViewProperties) is used.
    *   * In all other cases, the spatial reference is derived from the first layer that loads in this order:
    *   * [map.basemap.baseLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers)
    *   * [map.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers)
    *   * [map.ground.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers)
    *
    *
    * When using an [Esri basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap), the default spatial reference is Web Mercator Auxiliary Sphere.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference)
    *
    * @default null
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The view's time extent. Time-aware layers display their temporal data that falls within the view's time extent. Setting the view's time extent is similar to setting the spatial [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent) because once the time extent is set, the view updates automatically to conform to the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent)
    *
    * @default null
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.native
}

object ViewProperties {
  @scala.inline
  def apply(): ViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewProperties]
  }
  @scala.inline
  implicit class ViewPropertiesOps[Self <: ViewProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllLayerViews(value: CollectionProperties[LayerViewProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allLayerViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllLayerViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allLayerViews")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: ViewAnimationProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withBasemapView(value: BasemapViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasemapView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapView")(js.undefined)
        ret
    }
    @scala.inline
    def withFatalError(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFatalError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalError")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphics(value: CollectionProperties[GraphicProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphics")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerViews(value: CollectionProperties[LayerViewProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerViews")(js.undefined)
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
    def withNavigation(value: NavigationProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: ViewPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
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
    def withTimeExtent(value: TimeExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeExtent")(js.undefined)
        ret
    }
  }
  
}

