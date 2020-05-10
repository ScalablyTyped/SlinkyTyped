package typingsSlinky.d3Geo.mod

import typingsSlinky.geojson.mod.GeoJsonObject
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.GeoJsonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedFeatureCollection[FeatureType /* <: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties] */] extends GeoJsonObject {
  var features: js.Array[FeatureType] = js.native
}

object ExtendedFeatureCollection {
  @scala.inline
  def apply[FeatureType](features: js.Array[FeatureType], `type`: GeoJsonTypes): ExtendedFeatureCollection[FeatureType] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedFeatureCollection[FeatureType]]
  }
  @scala.inline
  implicit class ExtendedFeatureCollectionOps[Self[featuretype] <: ExtendedFeatureCollection[featuretype], FeatureType] (val x: Self[FeatureType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FeatureType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FeatureType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[FeatureType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[FeatureType] with Other]
    @scala.inline
    def withFeatures(value: js.Array[FeatureType]): Self[FeatureType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

