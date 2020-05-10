package typingsSlinky.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureCollection[G /* <: Geometry | Null */, P] extends GeoJsonObject {
  var features: js.Array[Feature[G, P]] = js.native
  @JSName("type")
  var type_FeatureCollection: typingsSlinky.geojson.geojsonStrings.FeatureCollection = js.native
}

object FeatureCollection {
  @scala.inline
  def apply[G, P](features: js.Array[Feature[G, P]], `type`: typingsSlinky.geojson.geojsonStrings.FeatureCollection): FeatureCollection[G, P] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCollection[G, P]]
  }
  @scala.inline
  implicit class FeatureCollectionOps[Self[g, p] <: FeatureCollection[g, p], G, P] (val x: Self[G, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[G, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[G, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[G, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[G, P]) with Other]
    @scala.inline
    def withFeatures(value: js.Array[Feature[G, P]]): Self[G, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.geojson.geojsonStrings.FeatureCollection): Self[G, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

