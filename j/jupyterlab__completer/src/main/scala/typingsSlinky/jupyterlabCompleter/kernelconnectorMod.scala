package typingsSlinky.jupyterlabCompleter

import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsSlinky.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions
import typingsSlinky.jupyterlabServices.sessionSessionMod.ISessionConnection
import typingsSlinky.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelconnectorMod {
  
  @JSImport("@jupyterlab/completer/lib/kernelconnector", "KernelConnector")
  @js.native
  class KernelConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new kernel connector for completion requests.
      *
      * @param options - The instantiation options for the kernel connector.
      */
    def this(options: IOptions) = this()
    
    var _session: js.Any = js.native
  }
  object KernelConnector {
    
    /**
      * The instantiation options for cell completion handlers.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The session used by the kernel connector.
        */
      var session: ISessionConnection | Null = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSession(value: ISessionConnection): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionNull: Self = StObject.set(x, "session", null)
      }
    }
  }
}
