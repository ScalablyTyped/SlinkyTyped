package typingsSlinky.koaWebsocket

import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.^
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpsMod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-websocket", JSImport.Namespace)
  @js.native
  def apply[StateT, CustomT](app: ^[StateT, CustomT]): App[StateT, CustomT] = js.native
  @JSImport("koa-websocket", JSImport.Namespace)
  @js.native
  def apply[StateT, CustomT](app: ^[StateT, CustomT], wsOptions: js.UndefOr[scala.Nothing], httpsOptions: ServerOptions): App[StateT, CustomT] = js.native
  @JSImport("koa-websocket", JSImport.Namespace)
  @js.native
  def apply[StateT, CustomT](app: ^[StateT, CustomT], wsOptions: typingsSlinky.ws.mod.ServerOptions): App[StateT, CustomT] = js.native
  @JSImport("koa-websocket", JSImport.Namespace)
  @js.native
  def apply[StateT, CustomT](
    app: ^[StateT, CustomT],
    wsOptions: typingsSlinky.ws.mod.ServerOptions,
    httpsOptions: ServerOptions
  ): App[StateT, CustomT] = js.native
  
  @JSImport("koa-websocket", "Server")
  @js.native
  class Server[StateT, CustomT] protected () extends StObject {
    def this(app: ^[StateT, CustomT]) = this()
    
    var app: App[DefaultState, DefaultContext] = js.native
    
    def listen(options: typingsSlinky.ws.mod.ServerOptions): typingsSlinky.ws.mod.Server = js.native
    
    var middleware: js.Array[Middleware[StateT, CustomT]] = js.native
    
    def onConnection(socket: typingsSlinky.ws.mod.^, request: IncomingMessage): Unit = js.native
    
    var server: js.UndefOr[typingsSlinky.ws.mod.Server] = js.native
    
    def use(middleware: Middleware[StateT, CustomT]): this.type = js.native
  }
  
  @js.native
  trait App[StateT, CustomT] extends ^[StateT, CustomT] {
    
    var ws: Server[StateT, CustomT] = js.native
  }
  
  type Middleware[StateT, CustomT] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<MiddlewareContext<StateT> & CustomT> */ js.Any
  
  @js.native
  trait MiddlewareContext[StateT] extends Context {
    
    // Limitation: Declaration merging cannot overwrap existing properties.
    // That's why this property is here, not in the merged declaration above.
    @JSName("app")
    var app_MiddlewareContext: App[DefaultState, DefaultContext] = js.native
    
    @JSName("state")
    var state_MiddlewareContext: StateT = js.native
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait Context extends StObject {
      
      var path: String = js.native
      
      var websocket: typingsSlinky.ws.mod.^ = js.native
    }
    object Context {
      
      @scala.inline
      def apply(path: String, websocket: typingsSlinky.ws.mod.^): typingsSlinky.koaWebsocket.mod.koaAugmentingMod.Context = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], websocket = websocket.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.koaWebsocket.mod.koaAugmentingMod.Context]
      }
      
      @scala.inline
      implicit class ContextMutableBuilder[Self <: typingsSlinky.koaWebsocket.mod.koaAugmentingMod.Context] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebsocket(value: typingsSlinky.ws.mod.^): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      }
    }
  }
}
