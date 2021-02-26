package typingsSlinky.amapJsSdk.anon

import typingsSlinky.amapJsSdk.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Waypoints extends StObject {
  
  var waypoints: js.Array[LngLat] = js.native
}
object Waypoints {
  
  @scala.inline
  def apply(waypoints: js.Array[LngLat]): Waypoints = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoints]
  }
  
  @scala.inline
  implicit class WaypointsMutableBuilder[Self <: Waypoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWaypoints(value: js.Array[LngLat]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsVarargs(value: LngLat*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
