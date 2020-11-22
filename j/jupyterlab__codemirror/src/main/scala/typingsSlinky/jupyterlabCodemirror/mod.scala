package typingsSlinky.jupyterlabCodemirror

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.codemirror.mod.Editor
import typingsSlinky.codemirror.mod.StyleActiveLine
import typingsSlinky.jupyterlabCodeeditor.tokensMod.IEditorServices
import typingsSlinky.jupyterlabCodemirror.anon.PartialIConfig
import typingsSlinky.jupyterlabCodemirror.editorMod.CodeMirrorEditor.IOptions
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typingsSlinky.jupyterlabCodemirror.modeMod.Mode.IMode
import typingsSlinky.jupyterlabCodemirror.modeMod.Mode.ISpec
import typingsSlinky.jupyterlabCodemirror.modeMod.Mode.ISpecLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/codemirror", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val editorServices: IEditorServices = js.native
  
  @js.native
  class CodeMirrorEditor protected ()
    extends typingsSlinky.jupyterlabCodemirror.editorMod.CodeMirrorEditor {
    /**
      * Construct a CodeMirror editor.
      */
    def this(options: IOptions) = this()
  }
  @js.native
  object CodeMirrorEditor extends js.Object {
    
    /**
      * Add a command to CodeMirror.
      *
      * @param name - The name of the command to add.
      *
      * @param command - The command function.
      */
    def addCommand(name: String, command: js.Function1[/* cm */ Editor, Unit]): Unit = js.native
    
    /**
      * The default configuration options for an editor.
      */
    @js.native
    object defaultConfig extends js.Object {
      
      var autoClosingBrackets: Boolean = js.native
      
      var codeFolding: Boolean = js.native
      
      var coverGutterNextToScrollbar: Boolean = js.native
      
      var dragDrop: Boolean = js.native
      
      var electricChars: Boolean = js.native
      
      var extraKeys: js.Any = js.native
      
      var fixedGutter: Boolean = js.native
      
      var foldGutter: Boolean = js.native
      
      var fontFamily: String = js.native
      
      var fontSize: Double = js.native
      
      var gutters: js.Array[String] = js.native
      
      var handlePaste: Boolean = js.native
      
      var insertSpaces: Boolean = js.native
      
      var keyMap: String = js.native
      
      var lineHeight: Double = js.native
      
      var lineNumbers: Boolean = js.native
      
      var lineSeparator: String = js.native
      
      var lineWiseCopyCut: Boolean = js.native
      
      var lineWrap: off | on | wordWrapColumn | bounded = js.native
      
      var matchBrackets: Boolean = js.native
      
      var mode: String | IMode = js.native
      
      var readOnly: Boolean = js.native
      
      var rulers: js.Array[Double] = js.native
      
      var scrollPastEnd: Boolean = js.native
      
      var scrollbarStyle: String = js.native
      
      var selectionPointer: Boolean | String = js.native
      
      var showCursorWhenSelecting: Boolean = js.native
      
      var smartIndent: Boolean = js.native
      
      var styleActiveLine: Boolean | StyleActiveLine = js.native
      
      var styleSelectedText: Boolean = js.native
      
      var tabSize: Double = js.native
      
      var theme: String = js.native
      
      var wordWrapColumn: Double = js.native
    }
  }
  
  @js.native
  /**
    * Construct an IEditorFactoryService for CodeMirrorEditors.
    */
  class CodeMirrorEditorFactory ()
    extends typingsSlinky.jupyterlabCodemirror.factoryMod.CodeMirrorEditorFactory {
    def this(defaults: PartialIConfig) = this()
  }
  
  @js.native
  class CodeMirrorMimeTypeService ()
    extends typingsSlinky.jupyterlabCodemirror.mimetypeMod.CodeMirrorMimeTypeService
  
  @js.native
  class EditorSyntaxStatus protected ()
    extends typingsSlinky.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus {
    /**
      * Construct a new VDomRenderer for the status item.
      */
    def this(opts: typingsSlinky.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus.IOptions) = this()
  }
  @js.native
  object EditorSyntaxStatus extends js.Object {
    
    /**
      * A VDomModel for the current editor/mode combination.
      */
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus.Model
  }
  
  @js.native
  object Mode extends js.Object {
    
    def addSpecLoader(loader: ISpecLoader, rank: Double): Unit = js.native
    
    /**
      * Ensure a codemirror mode is available by name or Codemirror spec.
      *
      * @param mode - The mode to ensure.  If it is a string, uses [findBest]
      *   to get the appropriate spec.
      *
      * @returns A promise that resolves when the mode is available.
      */
    def ensure(mode: String): js.Promise[ISpec | Null] = js.native
    def ensure(mode: ISpec): js.Promise[ISpec | Null] = js.native
    
    /**
      * Find a codemirror mode by name or CodeMirror spec.
      */
    def findBest(mode: String): ISpec = js.native
    def findBest(mode: ISpec): ISpec = js.native
    
    /**
      * Find a codemirror mode by extension.
      */
    def findByExtension(ext: String): ISpec | Null = js.native
    def findByExtension(ext: js.Array[String]): ISpec | Null = js.native
    
    /**
      * Find a codemirror mode by filename.
      */
    def findByFileName(name: String): ISpec = js.native
    
    /**
      * Find a codemirror mode by MIME.
      */
    def findByMIME(mime: String): ISpec = js.native
    
    /**
      * Find a codemirror mode by name.
      */
    def findByName(name: String): ISpec = js.native
    
    /**
      * Get the raw list of available modes specs.
      */
    def getModeInfo(): js.Array[ISpec] = js.native
    
    /**
      * Running a CodeMirror mode outside of an editor.
      */
    def run(code: String, mode: String, el: HTMLElement): Unit = js.native
    def run(code: String, mode: ISpec, el: HTMLElement): Unit = js.native
  }
}
