package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TcpRouteAction extends StObject {
  
  /**
    * An object that represents the targets that traffic is routed to when a request matches the route.
    */
  var weightedTargets: WeightedTargets = js.native
}
object TcpRouteAction {
  
  @scala.inline
  def apply(weightedTargets: WeightedTargets): TcpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpRouteAction]
  }
  
  @scala.inline
  implicit class TcpRouteActionMutableBuilder[Self <: TcpRouteAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWeightedTargets(value: WeightedTargets): Self = StObject.set(x, "weightedTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedTargetsVarargs(value: WeightedTarget*): Self = StObject.set(x, "weightedTargets", js.Array(value :_*))
  }
}
