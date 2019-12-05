package typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esri {
  import typingsSlinky.geojson.geojsonMod.LineString
  import typingsSlinky.geojson.geojsonMod.MultiLineString
  import typingsSlinky.geojson.geojsonMod.Point
  import typingsSlinky.geojson.geojsonMod.Polygon
  import typingsSlinky.leaflet.leafletMod.GeoJSON
  import typingsSlinky.leaflet.leafletMod.LatLngBounds
  import typingsSlinky.leaflet.leafletMod.LatLngExpression
  import typingsSlinky.leaflet.leafletMod.Marker
  import typingsSlinky.leaflet.leafletMod.Polyline

  type CallbackHandler = js.Function2[/* error */ js.Any, /* metadata */ js.Any, Unit]
  type FeatureCallbackHandler = js.Function3[
    /* error */ js.UndefOr[js.Any], 
    /* featureCollection */ js.UndefOr[js.Any], 
    /* response */ js.UndefOr[js.Any], 
    Unit
  ]
  /**
    * Options for FeatureLayerService
    */
  type FeatureLayerServiceOptions = ServiceOptions
  /**
    * Options for Find Task
    */
  type FindOptions = ServiceOptions
  type GeoJSONGeometry = Point | Polygon | LineString
  type Geometry = LeafletGeometry | GeoJSONGeometry
  /**
    * Options for IdentifyFeatures
    */
  type IdentifyFeaturesOptions = ServiceOptions
  /**
    * Options for ImageService
    */
  type ImageServiceOptions = ServiceOptions
  type LeafletGeometry = Marker[js.Any] | typingsSlinky.leaflet.leafletMod.Polygon[js.Any] | (Polyline[LineString | MultiLineString, js.Any]) | LatLngExpression | LatLngBounds | GeoJSON[js.Any]
  /**
    * Options for MapService
    */
  type MapServiceOptions = ServiceOptions
  /**
    * Options for Query
    */
  type QueryOptions = TaskOptions
  type ResponseCallbackHandler = js.Function2[/* error */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], Unit]
  type SpatialReferenceExpression = Double | SpatialReference
  type StyleCallback = js.Function1[/* feature */ js.Any, js.Any]
  /**
    * Options for Task
    */
  type TaskOptions = ServiceOptions
}
