package typingsSlinky.heremaps

import typingsSlinky.heremaps.H.service.MapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSatellite extends js.Object {
  var normal: MapType = js.native
  var satellite: MapType = js.native
  var terrain: MapType = js.native
}

object AnonSatellite {
  @scala.inline
  def apply(normal: MapType, satellite: MapType, terrain: MapType): AnonSatellite = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], satellite = satellite.asInstanceOf[js.Any], terrain = terrain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSatellite]
  }
  @scala.inline
  implicit class AnonSatelliteOps[Self <: AnonSatellite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormal(value: MapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSatellite(value: MapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satellite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerrain(value: MapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

