package typingsSlinky.graphqlToolsUrlLoader

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.AsyncExecutor
import typingsSlinky.graphqlToolsDelegate.typesMod.ExecutionParams
import typingsSlinky.graphqlToolsDelegate.typesMod.Subscriber
import typingsSlinky.graphqlToolsUrlLoader.graphqlToolsUrlLoaderStrings.GET
import typingsSlinky.graphqlToolsUrlLoader.graphqlToolsUrlLoaderStrings.POST
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.std.AsyncIterator
import typingsSlinky.std.RequestInfo
import typingsSlinky.websocket.mod.w3cwebsocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait DefaultMethod extends js.Object {
    
    var defaultMethod: GET | POST = js.native
    
    var extraHeaders: js.Any = js.native
    
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    @JSName("fetch")
    var fetch_Original: FnCall = js.native
    
    var pointer: String = js.native
    
    var useGETForQueries: Boolean = js.native
  }
  
  @js.native
  trait Executor extends js.Object {
    
    def executor[TReturn, TArgs, TContext](params: ExecutionParams[TArgs, TContext]): js.Promise[ExecutionResult[TReturn]] = js.native
    @JSName("executor")
    var executor_Original: AsyncExecutor = js.native
    
    def subscriber[TReturn, TArgs, TContext](params: ExecutionParams[TArgs, TContext]): js.Promise[
        (AsyncIterator[ExecutionResult[TReturn], _, js.UndefOr[scala.Nothing]]) | ExecutionResult[TReturn]
      ] = js.native
    @JSName("subscriber")
    var subscriber_Original: Subscriber = js.native
  }
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  @js.native
  trait Schema extends js.Object {
    
    def executor[TReturn, TArgs, TContext](params: ExecutionParams[TArgs, TContext]): js.Promise[ExecutionResult[TReturn]] = js.native
    @JSName("executor")
    var executor_Original: AsyncExecutor = js.native
    
    var schema: GraphQLSchema = js.native
    
    def subscriber[TReturn, TArgs, TContext](params: ExecutionParams[TArgs, TContext]): js.Promise[
        (AsyncIterator[ExecutionResult[TReturn], _, js.UndefOr[scala.Nothing]]) | ExecutionResult[TReturn]
      ] = js.native
    @JSName("subscriber")
    var subscriber_Original: Subscriber = js.native
  }
  
  @js.native
  trait Typeofw3cwebsocket extends Instantiable1[/* url */ String, w3cwebsocket] {
    
    var CLOSED: Double = js.native
    
    var CLOSING: Double = js.native
    
    var CONNECTING: Double = js.native
    
    var OPEN: Double = js.native
  }
}
