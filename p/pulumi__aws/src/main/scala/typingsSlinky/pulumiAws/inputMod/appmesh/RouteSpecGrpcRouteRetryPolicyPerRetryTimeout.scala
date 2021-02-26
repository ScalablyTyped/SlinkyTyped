package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecGrpcRouteRetryPolicyPerRetryTimeout extends StObject {
  
  /**
    * Retry unit. Valid values: `ms`, `s`.
    */
  var unit: Input[String] = js.native
  
  /**
    * Retry value.
    */
  var value: Input[Double] = js.native
}
object RouteSpecGrpcRouteRetryPolicyPerRetryTimeout {
  
  @scala.inline
  def apply(unit: Input[String], value: Input[Double]): RouteSpecGrpcRouteRetryPolicyPerRetryTimeout = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRouteRetryPolicyPerRetryTimeout]
  }
  
  @scala.inline
  implicit class RouteSpecGrpcRouteRetryPolicyPerRetryTimeoutMutableBuilder[Self <: RouteSpecGrpcRouteRetryPolicyPerRetryTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: Input[String]): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
