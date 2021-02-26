package typingsSlinky.blueprintjsTable.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowHeaderCellRenderer extends StObject {
  
  var rowHeaderCellRenderer: js.Function1[/* rowIndex */ Double, ReactElement] = js.native
}
object RowHeaderCellRenderer {
  
  @scala.inline
  def apply(rowHeaderCellRenderer: /* rowIndex */ Double => ReactElement): RowHeaderCellRenderer = {
    val __obj = js.Dynamic.literal(rowHeaderCellRenderer = js.Any.fromFunction1(rowHeaderCellRenderer))
    __obj.asInstanceOf[RowHeaderCellRenderer]
  }
  
  @scala.inline
  implicit class RowHeaderCellRendererMutableBuilder[Self <: RowHeaderCellRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): Self = StObject.set(x, "rowHeaderCellRenderer", js.Any.fromFunction1(value))
  }
}
