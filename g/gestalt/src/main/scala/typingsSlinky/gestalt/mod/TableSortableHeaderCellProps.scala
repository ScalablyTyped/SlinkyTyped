package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.HTMLTableCellElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.gestalt.anon.Event
import typingsSlinky.gestalt.gestaltStrings.active
import typingsSlinky.gestalt.gestaltStrings.asc
import typingsSlinky.gestalt.gestaltStrings.desc
import typingsSlinky.gestalt.gestaltStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableSortableHeaderCellProps extends TableHeaderCellProps {
  
  var onSortChange: AbstractEventHandler[
    SyntheticMouseEvent[HTMLTableCellElement] | SyntheticKeyboardEvent[HTMLTableCellElement], 
    js.Object
  ] = js.native
  
  var sortOrder: asc | desc = js.native
  
  var status: active | inactive = js.native
}
object TableSortableHeaderCellProps {
  
  @scala.inline
  def apply(
    onSortChange: /* arg */ js.Object with (Event[
      SyntheticMouseEvent[HTMLTableCellElement] | SyntheticKeyboardEvent[HTMLTableCellElement]
    ]) => Unit,
    sortOrder: asc | desc,
    status: active | inactive
  ): TableSortableHeaderCellProps = {
    val __obj = js.Dynamic.literal(onSortChange = js.Any.fromFunction1(onSortChange), sortOrder = sortOrder.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortableHeaderCellProps]
  }
  
  @scala.inline
  implicit class TableSortableHeaderCellPropsMutableBuilder[Self <: TableSortableHeaderCellProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSortChange(
      value: /* arg */ js.Object with (Event[
          SyntheticMouseEvent[HTMLTableCellElement] | SyntheticKeyboardEvent[HTMLTableCellElement]
        ]) => Unit
    ): Self = StObject.set(x, "onSortChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: active | inactive): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
