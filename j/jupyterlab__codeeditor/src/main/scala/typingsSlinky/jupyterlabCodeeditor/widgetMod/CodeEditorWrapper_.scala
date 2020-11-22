package typingsSlinky.jupyterlabCodeeditor.widgetMod

import org.scalajs.dom.raw.Event
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsSlinky.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper.IOptions
import typingsSlinky.luminoWidgets.mod.Widget
import typingsSlinky.luminoWidgets.mod.Widget.ResizeMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/codeeditor/lib/widget", "CodeEditorWrapper")
@js.native
class CodeEditorWrapper_ protected () extends Widget {
  /**
    * Construct a new code editor widget.
    */
  def this(options: IOptions) = this()
  
  /**
    * Handle the `'lm-dragenter'` event for the widget.
    */
  var _evtDragEnter: js.Any = js.native
  
  /**
    * Handle the `'lm-dragleave'` event for the widget.
    */
  var _evtDragLeave: js.Any = js.native
  
  /**
    * Handle the `'lm-dragover'` event for the widget.
    */
  var _evtDragOver: js.Any = js.native
  
  /**
    * Handle the `'lm-drop'` event for the widget.
    */
  var _evtDrop: js.Any = js.native
  
  var _hasRefreshedSinceAttach: js.Any = js.native
  
  /**
    * Handle a change in model selections.
    */
  var _onSelectionsChanged: js.Any = js.native
  
  var _updateOnShow: js.Any = js.native
  
  /**
    * Get the editor wrapped by the widget.
    */
  val editor: IEditor = js.native
  
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the notebook panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  
  /**
    * Get the model used by the widget.
    */
  def model: IModel = js.native
  
  /**
    * A message handler invoked on a `'resize'` message.
    */
  /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
}
