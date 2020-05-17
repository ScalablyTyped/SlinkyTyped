package typingsSlinky.mapboxMapboxSdk.datasetsMod

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Geometry
import typingsSlinky.geojson.mod.GeometryCollection
import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.geojson.mod.MultiPoint
import typingsSlinky.geojson.mod.MultiPolygon
import typingsSlinky.geojson.mod.Point
import typingsSlinky.geojson.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All GeoJSON types except for FeatureCollection.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.geojson.mod.Point
  - typingsSlinky.geojson.mod.MultiPoint
  - typingsSlinky.geojson.mod.LineString
  - typingsSlinky.geojson.mod.MultiLineString
  - typingsSlinky.geojson.mod.Polygon
  - typingsSlinky.geojson.mod.MultiPolygon
  - typingsSlinky.geojson.mod.GeometryCollection
  - typingsSlinky.geojson.mod.Feature[typingsSlinky.geojson.mod.Geometry, typingsSlinky.geojson.mod.GeoJsonProperties]
*/
trait DataSetsFeature extends js.Object

object DataSetsFeature {
  @scala.inline
  implicit def apply(value: Feature[Geometry, GeoJsonProperties]): DataSetsFeature = value.asInstanceOf[DataSetsFeature]
  @scala.inline
  implicit def apply(value: GeometryCollection): DataSetsFeature = value.asInstanceOf[DataSetsFeature]
  @scala.inline
  implicit def apply(value: LineString): DataSetsFeature = value.asInstanceOf[DataSetsFeature]
  @scala.inline
  implicit def apply(value: MultiLineString): DataSetsFeature = value.asInstanceOf[DataSetsFeature]
  @scala.inline
  implicit def apply(value: MultiPoint): DataSetsFeature = value.asInstanceOf[DataSetsFeature]
  @scala.inline
  implicit def apply(value: MultiPolygon): DataSetsFeature = value.asInstanceOf[DataSetsFeature]
  @scala.inline
  implicit def apply(value: Point): DataSetsFeature = value.asInstanceOf[DataSetsFeature]
  @scala.inline
  implicit def apply(value: Polygon): DataSetsFeature = value.asInstanceOf[DataSetsFeature]
}

