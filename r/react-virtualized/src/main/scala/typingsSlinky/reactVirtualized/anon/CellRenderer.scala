package typingsSlinky.reactVirtualized.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetter
import typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetterParams
import typingsSlinky.reactVirtualized.esTableMod.TableCellProps
import typingsSlinky.reactVirtualized.esTableMod.TableCellRenderer
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderProps
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderRenderer
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellRenderer extends StObject {
  
  var cellDataGetter: TableCellDataGetter = js.native
  
  var cellRenderer: TableCellRenderer = js.native
  
  var flexGrow: `0` = js.native
  
  var flexShrink: `1` = js.native
  
  var headerRenderer: TableHeaderRenderer = js.native
}
object CellRenderer {
  
  @scala.inline
  def apply(
    cellDataGetter: /* params */ TableCellDataGetterParams => js.Any,
    cellRenderer: /* props */ TableCellProps => ReactElement,
    flexGrow: `0`,
    flexShrink: `1`,
    headerRenderer: /* props */ TableHeaderProps => ReactElement
  ): CellRenderer = {
    val __obj = js.Dynamic.literal(cellDataGetter = js.Any.fromFunction1(cellDataGetter), cellRenderer = js.Any.fromFunction1(cellRenderer), flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], headerRenderer = js.Any.fromFunction1(headerRenderer))
    __obj.asInstanceOf[CellRenderer]
  }
  
  @scala.inline
  implicit class CellRendererMutableBuilder[Self <: CellRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellDataGetter(value: /* params */ TableCellDataGetterParams => js.Any): Self = StObject.set(x, "cellDataGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellRenderer(value: /* props */ TableCellProps => ReactElement): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlexGrow(value: `0`): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexShrink(value: `1`): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRenderer(value: /* props */ TableHeaderProps => ReactElement): Self = StObject.set(x, "headerRenderer", js.Any.fromFunction1(value))
  }
}
