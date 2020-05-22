package typingsSlinky.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datasetsMod {
  /**
    * All GeoJSON types except for FeatureCollection.
    */
  type DataSetsFeature = typingsSlinky.geojson.mod.Point | typingsSlinky.geojson.mod.MultiPoint | typingsSlinky.geojson.mod.LineString | typingsSlinky.geojson.mod.MultiLineString | typingsSlinky.geojson.mod.Polygon | typingsSlinky.geojson.mod.MultiPolygon | typingsSlinky.geojson.mod.GeometryCollection | (typingsSlinky.geojson.mod.Feature[typingsSlinky.geojson.mod.Geometry, typingsSlinky.geojson.mod.GeoJsonProperties])
}
