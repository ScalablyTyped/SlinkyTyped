package typingsSlinky.atJupyterlabCodeeditor

import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig
import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.ISelectionStyle
import typingsSlinky.atJupyterlabCodeeditor.libWidgetMod.CodeEditorWrapper.IOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor", JSImport.Namespace)
@js.native
object atJupyterlabCodeeditorMod extends js.Object {
  @js.native
  class CodeEditorWrapper protected ()
    extends typingsSlinky.atJupyterlabCodeeditor.libWidgetMod.CodeEditorWrapper {
    /**
      * Construct a new code editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class JSONEditor protected ()
    extends typingsSlinky.atJupyterlabCodeeditor.libJsoneditorMod.JSONEditor {
    /**
      * Construct a new JSON editor.
      */
    def this(options: typingsSlinky.atJupyterlabCodeeditor.libJsoneditorMod.JSONEditor.IOptions) = this()
  }
  
  val IEditorServices: Token[typingsSlinky.atJupyterlabCodeeditor.libTokensMod.IEditorServices] = js.native
  @js.native
  object CodeEditor extends js.Object {
    /**
      * The default implementation of the editor model.
      */
    @js.native
    /**
      * Construct a new Model.
      */
    class Model ()
      extends typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Model {
      def this(options: typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Model.IOptions) = this()
    }
    
    /**
      * The default configuration options for an editor.
      */
    var defaultConfig: IConfig = js.native
    /**
      * The default selection style.
      */
    val defaultSelectionStyle: ISelectionStyle = js.native
  }
  
  @js.native
  object IEditorMimeTypeService extends js.Object {
    /**
      * The default mime type.
      */
    val defaultMimeType: String = js.native
  }
  
}

