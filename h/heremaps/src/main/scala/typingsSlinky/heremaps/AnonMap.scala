package typingsSlinky.heremaps

import typingsSlinky.heremaps.H.map.layer.MarkerTileLayer
import typingsSlinky.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMap extends js.Object {
  var map: TileLayer = js.native
  var traffic: TileLayer = js.native
  var trafficincidents: MarkerTileLayer = js.native
}

object AnonMap {
  @scala.inline
  def apply(map: TileLayer, traffic: TileLayer, trafficincidents: MarkerTileLayer): AnonMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any], trafficincidents = trafficincidents.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMap]
  }
  @scala.inline
  implicit class AnonMapOps[Self <: AnonMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMap(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraffic(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficincidents(value: MarkerTileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficincidents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

