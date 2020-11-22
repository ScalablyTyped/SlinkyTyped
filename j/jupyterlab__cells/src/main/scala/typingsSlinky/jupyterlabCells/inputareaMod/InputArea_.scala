package typingsSlinky.jupyterlabCells.inputareaMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabCells.inputareaMod.InputArea.IContentFactory
import typingsSlinky.jupyterlabCells.inputareaMod.InputArea.IOptions
import typingsSlinky.jupyterlabCells.modelMod.ICellModel
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCodeeditor.mod.CodeEditorWrapper
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells/lib/inputarea", "InputArea")
@js.native
class InputArea_ protected () extends Widget {
  /**
    * Construct an input area widget.
    */
  def this(options: IOptions) = this()
  
  var _editor: js.Any = js.native
  
  var _prompt: js.Any = js.native
  
  var _rendered: js.Any = js.native
  
  /**
    * The content factory used by the widget.
    */
  val contentFactory: IContentFactory = js.native
  
  /**
    * Get the CodeEditor used by the cell.
    */
  def editor: IEditor = js.native
  
  /**
    * Get the CodeEditorWrapper used by the cell.
    */
  def editorWidget: CodeEditorWrapper = js.native
  
  /**
    * The model used by the widget.
    */
  val model: ICellModel = js.native
  
  /**
    * Get the prompt node used by the cell.
    */
  def promptNode: HTMLElement = js.native
  
  /**
    * Render an input instead of the text editor.
    */
  def renderInput(widget: Widget): Unit = js.native
  
  /**
    * Set the prompt of the input area.
    */
  def setPrompt(value: String): Unit = js.native
  
  /**
    * Show the text editor.
    */
  def showEditor(): Unit = js.native
}
