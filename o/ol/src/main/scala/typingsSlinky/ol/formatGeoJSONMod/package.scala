package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formatGeoJSONMod {
  import typingsSlinky.geojson.geojsonMod.Feature
  import typingsSlinky.geojson.geojsonMod.FeatureCollection
  import typingsSlinky.geojson.geojsonMod.GeoJsonProperties
  import typingsSlinky.geojson.geojsonMod.Geometry
  import typingsSlinky.geojson.geojsonMod.GeometryCollection
  import typingsSlinky.geojson.geojsonMod.LineString
  import typingsSlinky.geojson.geojsonMod.MultiLineString
  import typingsSlinky.geojson.geojsonMod.MultiPoint
  import typingsSlinky.geojson.geojsonMod.MultiPolygon
  import typingsSlinky.geojson.geojsonMod.Point
  import typingsSlinky.geojson.geojsonMod.Polygon

  type GeoJSON = typingsSlinky.ol.formatJSONFeatureMod.default
  type GeoJSONFeature = Feature[Geometry, GeoJsonProperties]
  type GeoJSONFeatureCollection = FeatureCollection[Geometry, GeoJsonProperties]
  type GeoJSONGeometry = Geometry
  type GeoJSONGeometryCollection = GeometryCollection
  type GeoJSONLineString = LineString
  type GeoJSONMultiLineString = MultiLineString
  type GeoJSONMultiPoint = MultiPoint
  type GeoJSONMultiPolygon = MultiPolygon
  type GeoJSONObject = typingsSlinky.geojson.geojsonMod.GeoJSON
  type GeoJSONPoint = Point
  type GeoJSONPolygon = Polygon
}
