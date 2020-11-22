package typingsSlinky.jupyterlabCodeeditor

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IConfig
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.ISelectionStyle
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/codeeditor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val IEditorServices: Token[typingsSlinky.jupyterlabCodeeditor.tokensMod.IEditorServices] = js.native
  
  @js.native
  object CodeEditor extends js.Object {
    
    /**
      * The default configuration options for an editor.
      */
    val defaultConfig: IConfig = js.native
    
    /**
      * The default selection style.
      */
    val defaultSelectionStyle: ISelectionStyle = js.native
    
    /**
      * The default implementation of the editor model.
      */
    @js.native
    /**
      * Construct a new Model.
      */
    class Model ()
      extends typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Model {
      def this(options: IOptions) = this()
    }
  }
  
  @js.native
  class CodeEditorWrapper protected ()
    extends typingsSlinky.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper {
    /**
      * Construct a new code editor widget.
      */
    def this(options: typingsSlinky.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper.IOptions) = this()
  }
  
  @js.native
  object IEditorMimeTypeService extends js.Object {
    
    /**
      * The default mime type.
      */
    val defaultMimeType: String = js.native
  }
  
  @js.native
  class JSONEditor protected ()
    extends typingsSlinky.jupyterlabCodeeditor.jsoneditorMod.JSONEditor {
    /**
      * Construct a new JSON editor.
      */
    def this(options: typingsSlinky.jupyterlabCodeeditor.jsoneditorMod.JSONEditor.IOptions) = this()
  }
}
