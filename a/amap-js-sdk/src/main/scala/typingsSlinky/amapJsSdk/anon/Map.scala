package typingsSlinky.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map extends StObject {
  
  var detectRetina: js.UndefOr[Boolean] = js.native
  
  var map: typingsSlinky.amapJsSdk.AMap.Map = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
  
  var zooms: js.UndefOr[js.Array[Double]] = js.native
}
object Map {
  
  @scala.inline
  def apply(map: typingsSlinky.amapJsSdk.AMap.Map): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  @scala.inline
  implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectRetinaUndefined: Self = StObject.set(x, "detectRetina", js.undefined)
    
    @scala.inline
    def setMap(value: typingsSlinky.amapJsSdk.AMap.Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    @scala.inline
    def setZooms(value: js.Array[Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    
    @scala.inline
    def setZoomsVarargs(value: Double*): Self = StObject.set(x, "zooms", js.Array(value :_*))
  }
}
