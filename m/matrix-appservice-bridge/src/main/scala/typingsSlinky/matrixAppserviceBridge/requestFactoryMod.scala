package typingsSlinky.matrixAppserviceBridge

import typingsSlinky.matrixAppserviceBridge.requestMod.Request
import typingsSlinky.matrixAppserviceBridge.requestMod.RequestOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestFactoryMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/request-factory", "RequestFactory")
  @js.native
  class RequestFactory () extends StObject {
    
    var _rejects: js.Any = js.native
    
    var _resolves: js.Any = js.native
    
    var _timeouts: js.Any = js.native
    
    /**
      * Add a function which will be invoked for every request that is rejected.
      * @param fn The function to invoke. The first argument will be the
      * Request object, the second will be the rejection argument.
      */
    def addDefaultRejectCallback(fn: HandlerFunction): Unit = js.native
    
    /**
      * Add a function which will be invoked for every request that is resolved.
      * @param fn The function to invoke. The first argument will be the
      * Request object, the second will be the resolve argument.
      */
    def addDefaultResolveCallback(fn: HandlerFunction): Unit = js.native
    
    /**
      * Add a function which will be invoked for every request that has not been
      * resolved or rejected within a certain amount of time.
      * @param fn The function to invoke. The first argument will be the
      * Request object.
      * @param durationMs The number of milliseconds to wait for a
      * resolution to the request.
      */
    def addDefaultTimeoutCallback(fn: TimeoutFunction, durationMs: Double): Unit = js.native
    
    /**
      * Generate a new request.
      * @param opts The options to pass to the Request constructor, if any.
      * @return A new request object
      */
    def newRequest[T](): Request[T | Null] = js.native
    def newRequest[T](opts: RequestOpts[T]): Request[T | Null] = js.native
  }
  
  type HandlerFunction = js.Function2[/* req */ Request[js.Any], /* value */ js.Any, js.Promise[js.Any] | js.Any]
  
  type TimeoutFunction = js.Function1[/* req */ Request[js.Any], Unit]
}
