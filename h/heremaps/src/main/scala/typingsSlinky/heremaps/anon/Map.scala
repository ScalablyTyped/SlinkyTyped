package typingsSlinky.heremaps.anon

import typingsSlinky.heremaps.H.map.layer.MarkerTileLayer
import typingsSlinky.heremaps.H.map.layer.TileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map extends StObject {
  
  var map: TileLayer = js.native
  
  var traffic: TileLayer = js.native
  
  var trafficincidents: MarkerTileLayer = js.native
}
object Map {
  
  @scala.inline
  def apply(map: TileLayer, traffic: TileLayer, trafficincidents: MarkerTileLayer): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any], trafficincidents = trafficincidents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  @scala.inline
  implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMap(value: TileLayer): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraffic(value: TileLayer): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficincidents(value: MarkerTileLayer): Self = StObject.set(x, "trafficincidents", value.asInstanceOf[js.Any])
  }
}
