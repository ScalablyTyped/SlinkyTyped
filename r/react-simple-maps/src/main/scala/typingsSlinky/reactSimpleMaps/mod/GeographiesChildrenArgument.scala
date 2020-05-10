package typingsSlinky.reactSimpleMaps.mod

import typingsSlinky.d3Geo.mod.GeoPath_
import typingsSlinky.d3Geo.mod.GeoPermissibleObjects
import typingsSlinky.d3Geo.mod.GeoProjection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeographiesChildrenArgument extends js.Object {
  var geographies: js.Array[_] = js.native
  var path: GeoPath_[_, GeoPermissibleObjects] = js.native
  var projection: GeoProjection_ = js.native
}

object GeographiesChildrenArgument {
  @scala.inline
  def apply(geographies: js.Array[_], path: GeoPath_[_, GeoPermissibleObjects], projection: GeoProjection_): GeographiesChildrenArgument = {
    val __obj = js.Dynamic.literal(geographies = geographies.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographiesChildrenArgument]
  }
  @scala.inline
  implicit class GeographiesChildrenArgumentOps[Self <: GeographiesChildrenArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeographies(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geographies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: GeoPath_[_, GeoPermissibleObjects]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjection(value: GeoProjection_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

