package typingsSlinky.heremaps.anon

import typingsSlinky.heremaps.H.map.layer.MarkerTileLayer
import typingsSlinky.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  var map: TileLayer
  var traffic: TileLayer
  var trafficincidents: MarkerTileLayer
}

object Map {
  @scala.inline
  def apply(map: TileLayer, traffic: TileLayer, trafficincidents: MarkerTileLayer): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any], trafficincidents = trafficincidents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
}

