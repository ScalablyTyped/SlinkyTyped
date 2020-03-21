package typingsSlinky.d3Geo.mod

import typingsSlinky.geojson.mod.BBox
import typingsSlinky.geojson.mod.GeoJsonObject
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.GeoJsonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedFeatureCollection[FeatureType /* <: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties] */] extends GeoJsonObject {
  var features: js.Array[FeatureType]
}

object ExtendedFeatureCollection {
  @scala.inline
  def apply[FeatureType /* <: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties] */](features: js.Array[FeatureType], `type`: GeoJsonTypes, bbox: BBox = null): ExtendedFeatureCollection[FeatureType] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedFeatureCollection[FeatureType]]
  }
}

