package typingsSlinky.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TileLayer {
  
  type MapTypeLayer = Layer
  
  type RoadNet = MapTypeLayer
  
  type Satellite = MapTypeLayer
  
  @js.native
  trait Traffic extends Layer {
    
    var autoRefresh: Boolean = js.native
    
    var interval: Double = js.native
  }
  object Traffic {
    
    @scala.inline
    def apply(
      autoRefresh: Boolean,
      getTiles: () => js.Array[String],
      getZooms: () => js.Array[Double],
      hide: () => Unit,
      interval: Double,
      off: (String, EventCallback) => Unit,
      on: (String, EventCallback) => Unit,
      reload: () => Unit,
      setMap: Map => Unit,
      setOpacity: Double => Unit,
      setTileUrl: () => Unit,
      setzIndex: Double => Unit,
      show: () => Unit
    ): Traffic = {
      val __obj = js.Dynamic.literal(autoRefresh = autoRefresh.asInstanceOf[js.Any], getTiles = js.Any.fromFunction0(getTiles), getZooms = js.Any.fromFunction0(getZooms), hide = js.Any.fromFunction0(hide), interval = interval.asInstanceOf[js.Any], off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), reload = js.Any.fromFunction0(reload), setMap = js.Any.fromFunction1(setMap), setOpacity = js.Any.fromFunction1(setOpacity), setTileUrl = js.Any.fromFunction0(setTileUrl), setzIndex = js.Any.fromFunction1(setzIndex), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[Traffic]
    }
    
    @scala.inline
    implicit class TrafficMutableBuilder[Self <: Traffic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRefresh(value: Boolean): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
}
