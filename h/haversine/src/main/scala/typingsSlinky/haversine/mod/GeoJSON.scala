package typingsSlinky.haversine.mod

import typingsSlinky.haversine.AnonCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.haversine.mod._ParamType because Already inherited */ @js.native
trait GeoJSON extends _Coordinate {
  var geometry: AnonCoordinates = js.native
}

object GeoJSON {
  @scala.inline
  def apply(geometry: AnonCoordinates): GeoJSON = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSON]
  }
  @scala.inline
  implicit class GeoJSONOps[Self <: GeoJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: AnonCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

