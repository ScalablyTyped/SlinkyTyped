package typingsSlinky.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecTcpRouteTimeoutIdle extends StObject {
  
  /**
    * The unit of time. Valid values: `ms`, `s`.
    */
  var unit: String = js.native
  
  /**
    * The number of time units. Minimum value of `0`.
    */
  var value: Double = js.native
}
object RouteSpecTcpRouteTimeoutIdle {
  
  @scala.inline
  def apply(unit: String, value: Double): RouteSpecTcpRouteTimeoutIdle = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecTcpRouteTimeoutIdle]
  }
  
  @scala.inline
  implicit class RouteSpecTcpRouteTimeoutIdleMutableBuilder[Self <: RouteSpecTcpRouteTimeoutIdle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
