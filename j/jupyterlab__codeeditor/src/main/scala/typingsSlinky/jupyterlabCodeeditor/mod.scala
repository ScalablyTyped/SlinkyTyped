package typingsSlinky.jupyterlabCodeeditor

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IConfig
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.ISelectionStyle
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object CodeEditor {
    
    /**
      * The default implementation of the editor model.
      */
    @JSImport("@jupyterlab/codeeditor", "CodeEditor.Model")
    @js.native
    /**
      * Construct a new Model.
      */
    class Model ()
      extends typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Model {
      def this(options: IOptions) = this()
    }
    
    /**
      * The default configuration options for an editor.
      */
    @JSImport("@jupyterlab/codeeditor", "CodeEditor.defaultConfig")
    @js.native
    val defaultConfig: IConfig = js.native
    
    /**
      * The default selection style.
      */
    @JSImport("@jupyterlab/codeeditor", "CodeEditor.defaultSelectionStyle")
    @js.native
    val defaultSelectionStyle: ISelectionStyle = js.native
  }
  
  @JSImport("@jupyterlab/codeeditor", "CodeEditorWrapper")
  @js.native
  class CodeEditorWrapper protected ()
    extends typingsSlinky.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper {
    /**
      * Construct a new code editor widget.
      */
    def this(options: typingsSlinky.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper.IOptions) = this()
  }
  
  object IEditorMimeTypeService {
    
    /**
      * The default mime type.
      */
    @JSImport("@jupyterlab/codeeditor", "IEditorMimeTypeService.defaultMimeType")
    @js.native
    val defaultMimeType: String = js.native
  }
  
  @JSImport("@jupyterlab/codeeditor", "IEditorServices")
  @js.native
  val IEditorServices: Token[typingsSlinky.jupyterlabCodeeditor.tokensMod.IEditorServices] = js.native
  
  @JSImport("@jupyterlab/codeeditor", "JSONEditor")
  @js.native
  class JSONEditor protected ()
    extends typingsSlinky.jupyterlabCodeeditor.jsoneditorMod.JSONEditor {
    /**
      * Construct a new JSON editor.
      */
    def this(options: typingsSlinky.jupyterlabCodeeditor.jsoneditorMod.JSONEditor.IOptions) = this()
  }
}
