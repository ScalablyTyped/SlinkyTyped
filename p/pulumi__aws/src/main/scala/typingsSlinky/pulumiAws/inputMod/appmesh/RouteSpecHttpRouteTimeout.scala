package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttpRouteTimeout extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[Input[RouteSpecHttpRouteTimeoutIdle]] = js.native
  
  /**
    * The per request timeout.
    */
  var perRequest: js.UndefOr[Input[RouteSpecHttpRouteTimeoutPerRequest]] = js.native
}
object RouteSpecHttpRouteTimeout {
  
  @scala.inline
  def apply(): RouteSpecHttpRouteTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecHttpRouteTimeout]
  }
  
  @scala.inline
  implicit class RouteSpecHttpRouteTimeoutMutableBuilder[Self <: RouteSpecHttpRouteTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: Input[RouteSpecHttpRouteTimeoutIdle]): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setPerRequest(value: Input[RouteSpecHttpRouteTimeoutPerRequest]): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}
