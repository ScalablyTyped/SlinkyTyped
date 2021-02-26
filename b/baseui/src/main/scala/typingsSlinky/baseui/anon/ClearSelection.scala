package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.dataTableMod.RowT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearSelection extends StObject {
  
  def clearSelection(): js.Any = js.native
  
  var event: SyntheticMouseEvent[HTMLButtonElement] = js.native
  
  var selection: js.Array[RowT] = js.native
}
object ClearSelection {
  
  @scala.inline
  def apply(
    clearSelection: () => js.Any,
    event: SyntheticMouseEvent[HTMLButtonElement],
    selection: js.Array[RowT]
  ): ClearSelection = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), event = event.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSelection]
  }
  
  @scala.inline
  implicit class ClearSelectionMutableBuilder[Self <: ClearSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearSelection(value: () => js.Any): Self = StObject.set(x, "clearSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[HTMLButtonElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: js.Array[RowT]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionVarargs(value: RowT*): Self = StObject.set(x, "selection", js.Array(value :_*))
  }
}
