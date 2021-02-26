package typingsSlinky.jupyterlabCompleter

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsSlinky.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextconnectorMod {
  
  @JSImport("@jupyterlab/completer/lib/contextconnector", "ContextConnector")
  @js.native
  class ContextConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new context connector for completion requests.
      *
      * @param options - The instatiation options for the context connector.
      */
    def this(options: IOptions) = this()
    
    var _editor: js.Any = js.native
  }
  object ContextConnector {
    
    /**
      * The instantiation options for cell completion handlers.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The session used by the context connector.
        */
      var editor: IEditor | Null = js.native
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
        def setEditor(value: IEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorNull: Self = StObject.set(x, "editor", null)
      }
    }
  }
}
