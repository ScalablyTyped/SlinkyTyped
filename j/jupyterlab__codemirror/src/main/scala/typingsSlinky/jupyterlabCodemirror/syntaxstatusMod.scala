package typingsSlinky.jupyterlabCodemirror

import typingsSlinky.jupyterlabApputils.mod.VDomModel
import typingsSlinky.jupyterlabApputils.mod.VDomRenderer
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus.IOptions
import typingsSlinky.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus.Model
import typingsSlinky.luminoCommands.mod.CommandRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntaxstatusMod {
  
  @JSImport("@jupyterlab/codemirror/lib/syntaxstatus", "EditorSyntaxStatus")
  @js.native
  class EditorSyntaxStatus protected () extends VDomRenderer[Model] {
    /**
      * Construct a new VDomRenderer for the status item.
      */
    def this(opts: IOptions) = this()
    
    var _commands: js.Any = js.native
    
    /**
      * Create a menu for selecting the mode of the editor.
      */
    var _handleClick: js.Any = js.native
    
    var _popup: js.Any = js.native
  }
  object EditorSyntaxStatus {
    
    /**
      * A VDomModel for the current editor/mode combination.
      */
    @JSImport("@jupyterlab/codemirror/lib/syntaxstatus", "EditorSyntaxStatus.Model")
    @js.native
    class Model () extends VDomModel {
      
      var _editor: js.Any = js.native
      
      var _mode: js.Any = js.native
      
      /**
        * If the editor mode changes, update the model.
        */
      var _onMIMETypeChange: js.Any = js.native
      
      /**
        * Trigger a rerender of the model.
        */
      var _triggerChange: js.Any = js.native
      
      /**
        * The current editor for the application editor tracker.
        */
      def editor: IEditor | Null = js.native
      def editor_=(editor: IEditor | Null): Unit = js.native
      
      /**
        * The current mode for the editor. If no editor is present,
        * returns the empty string.
        */
      def mode: String = js.native
    }
    
    /**
      * Options for the EditorSyntax status item.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The application command registry.
        */
      var commands: CommandRegistry = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(commands: CommandRegistry): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      }
    }
  }
}
