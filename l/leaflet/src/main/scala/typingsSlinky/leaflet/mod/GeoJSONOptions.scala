package typingsSlinky.leaflet.mod

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.GeometryObject
import typingsSlinky.geojson.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class GeoJSONOptionsMutableBuilder[Self <: GeoJSONOptions[_], P] (val x: Self with GeoJSONOptions[P]) extends AnyVal {
    
    @scala.inline
    def setCoordsToLatLng(value: /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) => LatLng_): Self = StObject.set(x, "coordsToLatLng", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCoordsToLatLngUndefined: Self = StObject.set(x, "coordsToLatLng", js.undefined)
    
    @scala.inline
    def setFilter(value: /* geoJsonFeature */ Feature[GeometryObject, P] => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOnEachFeature(value: (/* feature */ Feature[GeometryObject, P], /* layer */ Layer) => Unit): Self = StObject.set(x, "onEachFeature", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnEachFeatureUndefined: Self = StObject.set(x, "onEachFeature", js.undefined)
    
    @scala.inline
    def setPointToLayer(value: (/* geoJsonPoint */ Feature[Point, P], /* latlng */ LatLng_) => Layer): Self = StObject.set(x, "pointToLayer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPointToLayerUndefined: Self = StObject.set(x, "pointToLayer", js.undefined)
    
    @scala.inline
    def setStyle(value: PathOptions | StyleFunction[P]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction1(value: /* feature */ js.UndefOr[Feature[GeometryObject, P]] => PathOptions): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
