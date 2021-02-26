package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpec extends StObject {
  
  /**
    * The gRPC routing information for the route.
    */
  var grpcRoute: js.UndefOr[Input[RouteSpecGrpcRoute]] = js.native
  
  /**
    * The HTTP/2 routing information for the route.
    */
  var http2Route: js.UndefOr[Input[RouteSpecHttp2Route]] = js.native
  
  /**
    * The HTTP routing information for the route.
    */
  var httpRoute: js.UndefOr[Input[RouteSpecHttpRoute]] = js.native
  
  /**
    * The priority for the route, between `0` and `1000`.
    * Routes are matched based on the specified value, where `0` is the highest priority.
    */
  var priority: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The TCP routing information for the route.
    */
  var tcpRoute: js.UndefOr[Input[RouteSpecTcpRoute]] = js.native
}
object RouteSpec {
  
  @scala.inline
  def apply(): RouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpec]
  }
  
  @scala.inline
  implicit class RouteSpecMutableBuilder[Self <: RouteSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpcRoute(value: Input[RouteSpecGrpcRoute]): Self = StObject.set(x, "grpcRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcRouteUndefined: Self = StObject.set(x, "grpcRoute", js.undefined)
    
    @scala.inline
    def setHttp2Route(value: Input[RouteSpecHttp2Route]): Self = StObject.set(x, "http2Route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2RouteUndefined: Self = StObject.set(x, "http2Route", js.undefined)
    
    @scala.inline
    def setHttpRoute(value: Input[RouteSpecHttpRoute]): Self = StObject.set(x, "httpRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRouteUndefined: Self = StObject.set(x, "httpRoute", js.undefined)
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setTcpRoute(value: Input[RouteSpecTcpRoute]): Self = StObject.set(x, "tcpRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpRouteUndefined: Self = StObject.set(x, "tcpRoute", js.undefined)
  }
}
