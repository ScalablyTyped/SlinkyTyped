package typingsSlinky.leaflet.mod

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.GeometryObject
import typingsSlinky.geojson.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONOptions[P] extends LayerOptions {
  /**
    * A Function that will be used for converting GeoJSON coordinates to LatLngs.
    * The default is the coordsToLatLng static method.
    */
  var coordsToLatLng: js.UndefOr[
    js.Function1[
      /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]), 
      LatLng_
    ]
  ] = js.native
  /**
    * A Function that will be used to decide whether to show a feature or not.
    *
    * The default is to show all features:
    *
    * ```
    * function (geoJsonFeature) {
    *     return true;
    * }
    * ```
    */
  var filter: js.UndefOr[js.Function1[/* geoJsonFeature */ Feature[GeometryObject, P], Boolean]] = js.native
  /**
    * A Function that will be called once for each created Feature, after it
    * has been created and styled. Useful for attaching events and popups to features.
    *
    * The default is to do nothing with the newly created layers:
    *
    * ```
    * function (feature, layer) {}
    * ```
    */
  var onEachFeature: js.UndefOr[js.Function2[/* feature */ Feature[GeometryObject, P], /* layer */ Layer, Unit]] = js.native
  /**
    * A Function defining how GeoJSON points spawn Leaflet layers.
    * It is internally called when data is added, passing the GeoJSON point
    * feature and its LatLng.
    *
    * The default is to spawn a default Marker:
    *
    * ```
    * function(geoJsonPoint, latlng) {
    *     return L.marker(latlng);
    * }
    * ```
    */
  var pointToLayer: js.UndefOr[js.Function2[/* geoJsonPoint */ Feature[Point, P], /* latlng */ LatLng_, Layer]] = js.native
   // should import GeoJSON typings
  /**
    * PathOptions or a Function defining the Path options for styling GeoJSON lines and polygons,
    * called internally when data is added.
    *
    * The default value is to not override any defaults:
    *
    * ```
    * function (geoJsonFeature) {
    *     return {}
    * }
    * ```
    */
  var style: js.UndefOr[PathOptions | StyleFunction[P]] = js.native
}

object GeoJSONOptions {
  @scala.inline
  def apply[P](): GeoJSONOptions[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJSONOptions[P]]
  }
  @scala.inline
  implicit class GeoJSONOptionsOps[Self[p] <: GeoJSONOptions[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withCoordsToLatLng(value: /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) => LatLng_): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordsToLatLng")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCoordsToLatLng: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordsToLatLng")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* geoJsonFeature */ Feature[GeometryObject, P] => Boolean): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEachFeature(value: (/* feature */ Feature[GeometryObject, P], /* layer */ Layer) => Unit): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEachFeature")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEachFeature: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEachFeature")(js.undefined)
        ret
    }
    @scala.inline
    def withPointToLayer(value: (/* geoJsonPoint */ Feature[Point, P], /* latlng */ LatLng_) => Layer): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointToLayer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPointToLayer: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointToLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleFunction1(value: /* feature */ js.UndefOr[Feature[GeometryObject, P]] => PathOptions): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: PathOptions | StyleFunction[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

