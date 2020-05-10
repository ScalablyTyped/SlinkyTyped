package typingsSlinky.jqueryGridster

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridsterCollisionData extends js.Object {
  var area: Double = js.native
  var area_coords: GridsterCoords = js.native
  var coords: GridsterCoords = js.native
  var el: HTMLElement = js.native
  var player_coords: GridsterCoords = js.native
  var region: String = js.native
}

object GridsterCollisionData {
  @scala.inline
  def apply(
    area: Double,
    area_coords: GridsterCoords,
    coords: GridsterCoords,
    el: HTMLElement,
    player_coords: GridsterCoords,
    region: String
  ): GridsterCollisionData = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], area_coords = area_coords.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], player_coords = player_coords.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsterCollisionData]
  }
  @scala.inline
  implicit class GridsterCollisionDataOps[Self <: GridsterCollisionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArea_coords(value: GridsterCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area_coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoords(value: GridsterCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayer_coords(value: GridsterCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player_coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

