package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import typingsSlinky.esriLeaflet.esriLeafletStrings.client
import typingsSlinky.esriLeaflet.esriLeafletStrings.server
import typingsSlinky.leaflet.mod.Canvas_
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.SVG_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for FeatureLayer
  */
@js.native
trait FeatureLayerOptions extends LayerOptionsBase {
  /**
    * Will remove layers from the internal cache when they are removed from the map.
    */
  var cacheLayers: js.UndefOr[Boolean] = js.native
  /**
    * 	An array of fieldnames to pull from the service. Includes all fields by default. You should always
    * 	specify the name of the unique id for the service. Usually either `FID` or `OBJECTID`.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    * 	When paired with to defines the time range of features to display. Requires the Feature Layer to be time
    * 	enabled.
    */
  var from: js.UndefOr[js.Date] = js.native
  /**
    * When utilizing esri-leaflet-renderers '2.0.2' or above, this option makes it possible to override the
    * symbology defined by the service itself.
    */
  var ignoreRenderer: js.UndefOr[Boolean] = js.native
  /**
    * Set this to false if your own service supports GeoJSON as an output format but you'd like to ask for
    * Geoservices JSON instead.
    */
  var isModern: js.UndefOr[Boolean] = js.native
  /**
    * Closest zoom level the layer will be displayed on the map. example: maxZoom:19
    */
  var maxZoom: js.UndefOr[Double] = js.native
  /**
    * Furthest zoom level the layer will be displayed on the map. example: minZoom:3
    */
  var minZoom: js.UndefOr[Double] = js.native
  /**
    * 	Provides an opportunity to introspect individual GeoJSON features in the layer.
    */
  var onEachFeature: js.UndefOr[js.Function2[/* feature */ js.Any, /* layer */ Layer, Unit]] = js.native
  /**
    * Function that will be used for creating layers for GeoJSON points. If the option is not specified, simple
    * markers will be created). For point layers, custom panes should be passed through pointToLayer (example here).
    */
  var pointToLayer: js.UndefOr[js.Function2[/* feature */ js.Any, /* latLng */ LatLngExpression, Unit]] = js.native
  /**
    * How many digits of precision to request from the server. Wikipedia has a great reference of digit
    * precision to meters.
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * The vector renderer to use to draw the service. Usually L.svg() is preferable but setting to `L.canvas()`
    * can have performance benefits for large polygon layers.
    */
  var renderer: js.UndefOr[SVG_ | Canvas_] = js.native
  /**
    * 	How much to simplify polygons and polylines. A higher value gives better performance, a lower value
    * 	gives a more accurate representation.
    */
  var simplifyFactor: js.UndefOr[Double] = js.native
  /**
    * Function that will be used to get style options for vector layers created for GeoJSON features.
    */
  var style: js.UndefOr[js.Function2[/* feature */ js.Any, /* layer */ Layer, Unit]] = js.native
  /**
    * The name of the field to lookup the time of the feature. Can be an object like
    * {start:'startTime', end:'endTime'} or a string like 'created'.
    */
  var timeField: js.UndefOr[js.Any] = js.native
  /**
    * Determines where features are filtered by time. By default features will be filtered by the server. If
    * set to 'client' all features are requested and filtered by the app before display.
    */
  var timeFilterMode: js.UndefOr[server | client] = js.native
  /**
    * When paired with from defines the time range of features to display. Requires the Feature Layer to be
    * time enabled.
    */
  var to: js.UndefOr[js.Date] = js.native
  /**
    * An optional expression to filter features server side. String values should be denoted using single
    * quotes ie: where: "FIELDNAME = 'field value'"; More information about valid SQL syntax can be found here.
    */
  var where: js.UndefOr[String] = js.native
}

object FeatureLayerOptions {
  @scala.inline
  def apply(url: String): FeatureLayerOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerOptions]
  }
  @scala.inline
  implicit class FeatureLayerOptionsOps[Self <: FeatureLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheLayers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLayers")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRenderer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModern(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModern")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEachFeature(value: (/* feature */ js.Any, /* layer */ Layer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEachFeature")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEachFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEachFeature")(js.undefined)
        ret
    }
    @scala.inline
    def withPointToLayer(value: (/* feature */ js.Any, /* latLng */ LatLngExpression) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointToLayer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPointToLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointToLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: SVG_ | Canvas_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSimplifyFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifyFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplifyFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifyFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: (/* feature */ js.Any, /* layer */ Layer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeField")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeFilterMode(value: server | client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFilterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeFilterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFilterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

