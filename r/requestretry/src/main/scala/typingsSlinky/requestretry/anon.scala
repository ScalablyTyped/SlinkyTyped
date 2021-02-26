package typingsSlinky.requestretry

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.requestretry.mod.RetryStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: js.Function1[/* value */ js.Any, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ js.Any, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  }
  
  @js.native
  trait FnCallOnrejected extends StObject {
    
    def apply[TResult](): js.Promise[_ | TResult] = js.native
    def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[_ | TResult] = js.native
  }
  
  @js.native
  trait HTTPOrNetworkError extends StObject {
    
    def HTTPOrNetworkError(err: js.Error, response: IncomingMessage, body: js.Any): Boolean = js.native
    @JSName("HTTPOrNetworkError")
    var HTTPOrNetworkError_Original: RetryStrategy = js.native
    
    def HttpError(err: js.Error, response: IncomingMessage, body: js.Any): Boolean = js.native
    @JSName("HttpError")
    var HttpError_Original: RetryStrategy = js.native
    
    def NetworkError(err: js.Error, response: IncomingMessage, body: js.Any): Boolean = js.native
    @JSName("NetworkError")
    var NetworkError_Original: RetryStrategy = js.native
  }
}
