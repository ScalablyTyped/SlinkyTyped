package typingsSlinky.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object servicesDatasetsMod {
  import typingsSlinky.geojson.geojsonMod.Feature
  import typingsSlinky.geojson.geojsonMod.GeoJsonProperties
  import typingsSlinky.geojson.geojsonMod.Geometry
  import typingsSlinky.geojson.geojsonMod.GeometryCollection
  import typingsSlinky.geojson.geojsonMod.LineString
  import typingsSlinky.geojson.geojsonMod.MultiLineString
  import typingsSlinky.geojson.geojsonMod.MultiPoint
  import typingsSlinky.geojson.geojsonMod.MultiPolygon
  import typingsSlinky.geojson.geojsonMod.Point
  import typingsSlinky.geojson.geojsonMod.Polygon

  /**
    * All GeoJSON types except for FeatureCollection.
    */
  type DataSetsFeature = Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | (Feature[Geometry, GeoJsonProperties])
}
