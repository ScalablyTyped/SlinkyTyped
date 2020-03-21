package typingsSlinky.geojson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BBox = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  type GeoJSON = typingsSlinky.geojson.mod.Geometry | (typingsSlinky.geojson.mod.Feature[typingsSlinky.geojson.mod.Geometry, typingsSlinky.geojson.mod.GeoJsonProperties]) | (typingsSlinky.geojson.mod.FeatureCollection[typingsSlinky.geojson.mod.Geometry, typingsSlinky.geojson.mod.GeoJsonProperties])
  type GeoJsonGeometryTypes = /* import warning: importer.ImportType#apply Failed type conversion: geojson.geojson.Geometry['type'] */ js.Any
  type GeoJsonProperties = org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null
  type GeoJsonTypes = /* import warning: importer.ImportType#apply Failed type conversion: geojson.geojson.GeoJSON['type'] */ js.Any
  type GeometryObject = typingsSlinky.geojson.mod.Geometry
  type Position = js.Array[scala.Double]
}
