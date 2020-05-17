package typingsSlinky.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature[G /* <: Geometry | Null */, P]
  extends GeoJsonObject
     with GeoJSON {
  /**
    * The feature's geometry
    */
  var geometry: G = js.native
  /**
    * A value that uniquely identifies this feature in a
    * https://tools.ietf.org/html/rfc7946#section-3.2.
    */
  var id: js.UndefOr[String | Double] = js.native
  /**
    * Properties associated with this feature.
    */
  var properties: P = js.native
  @JSName("type")
  var type_Feature: typingsSlinky.geojson.geojsonStrings.Feature = js.native
}

object Feature {
  @scala.inline
  def apply[G, P](geometry: G, properties: P, `type`: typingsSlinky.geojson.geojsonStrings.Feature): Feature[G, P] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature[G, P]]
  }
  @scala.inline
  implicit class FeatureOps[Self[g, p] <: Feature[g, p], G, P] (val x: Self[G, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[G, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[G, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[G, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[G, P]) with Other]
    @scala.inline
    def withGeometry(value: G): Self[G, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: P): Self[G, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.geojson.geojsonStrings.Feature): Self[G, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self[G, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[G, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

