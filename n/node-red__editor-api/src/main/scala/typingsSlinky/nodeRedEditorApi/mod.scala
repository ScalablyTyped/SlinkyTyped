package typingsSlinky.nodeRedEditorApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.express.mod.Express
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.httpsMod.Server
import typingsSlinky.nodeRedRuntime.mod.LocalSettings
import typingsSlinky.nodeRedRuntime.mod.RuntimeModule
import typingsSlinky.nodeRedRuntime.mod.StorageModule
import typingsSlinky.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@node-red/editor-api", JSImport.Namespace)
  @js.native
  val ^ : EditorAPIModule = js.native
  
  @js.native
  trait Auth extends StObject {
    
    def needsPermission(permission: String): js.Function3[
        /* req */ Request_[ParamsDictionary, _, _, Query], 
        /* res */ Response_[_], 
        /* next */ NextFunction, 
        Unit
      ] = js.native
  }
  object Auth {
    
    @scala.inline
    def apply(
      needsPermission: String => js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* res */ Response_[_], 
          /* next */ NextFunction, 
          Unit
        ]
    ): Auth = {
      val __obj = js.Dynamic.literal(needsPermission = js.Any.fromFunction1(needsPermission))
      __obj.asInstanceOf[Auth]
    }
    
    @scala.inline
    implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNeedsPermission(
        value: String => js.Function3[
              /* req */ Request_[ParamsDictionary, _, _, Query], 
              /* res */ Response_[_], 
              /* next */ NextFunction, 
              Unit
            ]
      ): Self = StObject.set(x, "needsPermission", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait EditorAPIModule extends StObject {
    
    var auth: Auth = js.native
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    /**
      * The Express app used to serve the Node-RED Editor
      */
    def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    /**
      * The Express app used to serve the Node-RED Editor
      */
    def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    /**
      * The Express app used to serve the Node-RED Editor
      */
    def httpAdmin(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    /**
      * The Express app used to serve the Node-RED Editor
      */
    def httpAdmin(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    /**
      * The Express app used to serve the Node-RED Editor
      */
    @JSName("httpAdmin")
    val httpAdmin_Original: Express = js.native
    
    /**
      * Initialise the module.
      * @param  settings   The runtime settings
      * @param  _server    An instance of HTTP Server
      * @param  storage    An instance of Node-RED Storage
      * @param  runtimeAPI An instance of Node-RED Runtime
      */
    def init(settings: LocalSettings, _server: Server, storage: StorageModule, runtimeAPI: RuntimeModule): Unit = js.native
    
    /**
      * Start the module.
      */
    def start(): js.Promise[Unit] = js.native
    
    /**
      * Stop the module.
      */
    def stop(): js.Promise[Unit] = js.native
  }
  
  type _To = EditorAPIModule
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EditorAPIModule = ^
}
