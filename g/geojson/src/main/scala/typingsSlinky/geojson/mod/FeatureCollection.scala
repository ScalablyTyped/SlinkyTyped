package typingsSlinky.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureCollection[G /* <: Geometry | Null */, P] extends GeoJsonObject {
  
  var features: js.Array[Feature[G, P]] = js.native
  
  @JSName("type")
  var type_FeatureCollection: typingsSlinky.geojson.geojsonStrings.FeatureCollection = js.native
}
object FeatureCollection {
  
  @scala.inline
  def apply[G /* <: Geometry | Null */, P](features: js.Array[Feature[G, P]], `type`: typingsSlinky.geojson.geojsonStrings.FeatureCollection): FeatureCollection[G, P] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCollection[G, P]]
  }
  
  @scala.inline
  implicit class FeatureCollectionOps[Self <: FeatureCollection[_, _], G /* <: Geometry | Null */, P] (val x: Self with (FeatureCollection[G, P])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFeaturesVarargs(value: (Feature[G, P])*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[Feature[G, P]]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.geojson.geojsonStrings.FeatureCollection): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
