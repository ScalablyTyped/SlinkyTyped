package typingsSlinky.jupyterlabConsole.historyMod

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.EdgeLocation
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabConsole.historyMod.ConsoleHistory.IOptions
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IHistoryReplyMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/history", "ConsoleHistory")
@js.native
class ConsoleHistory_ protected () extends IConsoleHistory {
  /**
    * Construct a new console history object.
    */
  def this(options: IOptions) = this()
  var _cursor: js.Any = js.native
  var _editor: js.Any = js.native
  var _filtered: js.Any = js.native
  /**
    * Handle the current kernel changing.
    */
  var _handleKernel: js.Any = js.native
  var _hasSession: js.Any = js.native
  var _history: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _placeholder: js.Any = js.native
  var _setByHistory: js.Any = js.native
  /**
    * Handle an edge requested signal.
    */
  /* protected */ def onEdgeRequest(editor: IEditor, location: EdgeLocation): Unit = js.native
  /**
    * Populate the history collection on history reply from a kernel.
    *
    * @param value The kernel message history reply.
    *
    * #### Notes
    * History entries have the shape:
    * [session: number, line: number, input: string]
    * Contiguous duplicates are stripped out of the API response.
    */
  /* protected */ def onHistory(value: IHistoryReplyMsg): Unit = js.native
  /**
    * Handle a text change signal from the editor.
    */
  /* protected */ def onTextChange(): Unit = js.native
  /**
    * Set the filter data.
    *
    * @param filterStr - The string to use when filtering the data.
    */
  /* protected */ def setFilter(): Unit = js.native
  /* protected */ def setFilter(filterStr: String): Unit = js.native
}

