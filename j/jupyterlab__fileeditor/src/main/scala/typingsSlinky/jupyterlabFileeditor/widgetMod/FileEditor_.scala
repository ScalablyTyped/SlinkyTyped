package typingsSlinky.jupyterlabFileeditor.widgetMod

import org.scalajs.dom.raw.Event
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditor.IOptions
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditor")
@js.native
class FileEditor_ protected () extends Widget {
  /**
    * Construct a new editor widget.
    */
  def this(options: IOptions) = this()
  
  var _context: Context = js.native
  
  /**
    * Ensure that the widget has focus.
    */
  var _ensureFocus: js.Any = js.native
  
  var _mimeTypeService: js.Any = js.native
  
  /**
    * Handle a change to the path.
    */
  var _onPathChanged: js.Any = js.native
  
  /**
    * Get the context for the editor widget.
    */
  def context: Context = js.native
  
  var editor: IEditor = js.native
  
  var editorWidget: js.Any = js.native
  
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the widget's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  
  var model: IModel = js.native
  
  /**
    * A promise that resolves when the file editor is ready.
    */
  def ready: js.Promise[Unit] = js.native
}
