package typingsSlinky.blueprintjsTable.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowHeaderCellRenderer extends js.Object {
  
  var rowHeaderCellRenderer: js.Function1[/* rowIndex */ Double, ReactElement] = js.native
}
object RowHeaderCellRenderer {
  
  @scala.inline
  def apply(rowHeaderCellRenderer: /* rowIndex */ Double => ReactElement): RowHeaderCellRenderer = {
    val __obj = js.Dynamic.literal(rowHeaderCellRenderer = js.Any.fromFunction1(rowHeaderCellRenderer))
    __obj.asInstanceOf[RowHeaderCellRenderer]
  }
  
  @scala.inline
  implicit class RowHeaderCellRendererOps[Self <: RowHeaderCellRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): Self = this.set("rowHeaderCellRenderer", js.Any.fromFunction1(value))
  }
}
