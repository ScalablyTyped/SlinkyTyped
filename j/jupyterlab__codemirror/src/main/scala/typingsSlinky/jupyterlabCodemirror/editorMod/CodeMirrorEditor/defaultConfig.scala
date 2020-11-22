package typingsSlinky.jupyterlabCodemirror.editorMod.CodeMirrorEditor

import typingsSlinky.codemirror.mod.StyleActiveLine
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typingsSlinky.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typingsSlinky.jupyterlabCodemirror.modeMod.Mode.IMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default configuration options for an editor.
  */
@JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.defaultConfig")
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
