package typingsSlinky.luminoDatagrid.celleditorMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/lib/celleditor", "InputCellEditor")
@js.native
abstract class InputCellEditor () extends CellEditor {
  
  var _onBlur: js.Any = js.native
  
  var _onInput: js.Any = js.native
  
  var _onKeyDown: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  /* protected */ def bindEvents(): Unit = js.native
  
  /* protected */ def createWidget(): Unit = js.native
  
  /* protected */ def deserialize(value: js.Any): js.Any = js.native
  
  /**
    * Handle the DOM events for the editor.
    *
    * @param event - The DOM event sent to the editor.
    */
  def handleEvent(event: Event): Unit = js.native
  
  var input: HTMLInputElement = js.native
  
  var inputType: String = js.native
}
