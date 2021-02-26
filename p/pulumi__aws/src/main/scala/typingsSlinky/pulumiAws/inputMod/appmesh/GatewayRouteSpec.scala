package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpec extends StObject {
  
  /**
    * The specification of a gRPC gateway route.
    */
  var grpcRoute: js.UndefOr[Input[GatewayRouteSpecGrpcRoute]] = js.native
  
  /**
    * The specification of an HTTP/2 gateway route.
    */
  var http2Route: js.UndefOr[Input[GatewayRouteSpecHttp2Route]] = js.native
  
  /**
    * The specification of an HTTP gateway route.
    */
  var httpRoute: js.UndefOr[Input[GatewayRouteSpecHttpRoute]] = js.native
}
object GatewayRouteSpec {
  
  @scala.inline
  def apply(): GatewayRouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayRouteSpec]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecMutableBuilder[Self <: GatewayRouteSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpcRoute(value: Input[GatewayRouteSpecGrpcRoute]): Self = StObject.set(x, "grpcRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcRouteUndefined: Self = StObject.set(x, "grpcRoute", js.undefined)
    
    @scala.inline
    def setHttp2Route(value: Input[GatewayRouteSpecHttp2Route]): Self = StObject.set(x, "http2Route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2RouteUndefined: Self = StObject.set(x, "http2Route", js.undefined)
    
    @scala.inline
    def setHttpRoute(value: Input[GatewayRouteSpecHttpRoute]): Self = StObject.set(x, "httpRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRouteUndefined: Self = StObject.set(x, "httpRoute", js.undefined)
  }
}
