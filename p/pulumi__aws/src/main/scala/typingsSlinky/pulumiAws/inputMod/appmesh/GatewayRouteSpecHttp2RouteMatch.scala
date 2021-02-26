package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecHttp2RouteMatch extends StObject {
  
  /**
    * Specifies the path to match requests with. This parameter must always start with `/`, which by itself matches all requests to the virtual service name.
    */
  var prefix: Input[String] = js.native
}
object GatewayRouteSpecHttp2RouteMatch {
  
  @scala.inline
  def apply(prefix: Input[String]): GatewayRouteSpecHttp2RouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2RouteMatch]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttp2RouteMatchMutableBuilder[Self <: GatewayRouteSpecHttp2RouteMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
