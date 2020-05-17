package typingsSlinky.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polygon
  extends Geometry
     with GeoJsonObject {
  var coordinates: js.Array[js.Array[Position]] = js.native
  @JSName("type")
  var type_Polygon: typingsSlinky.geojson.geojsonStrings.Polygon = js.native
}

object Polygon {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[Position]], `type`: typingsSlinky.geojson.geojsonStrings.Polygon): Polygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon]
  }
  @scala.inline
  implicit class PolygonOps[Self <: Polygon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: js.Array[js.Array[Position]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.geojson.geojsonStrings.Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

