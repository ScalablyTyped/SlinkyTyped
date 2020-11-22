package typingsSlinky.reactMdTable

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTableCaptionElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTable.captionMod.CaptionProps
import typingsSlinky.reactMdTable.tableBodyMod.TableBodyProps
import typingsSlinky.reactMdTable.tableCellContentMod.TableCellContentProps
import typingsSlinky.reactMdTable.tableCellMod.TableCellElement
import typingsSlinky.reactMdTable.tableCellMod.TableCellProps
import typingsSlinky.reactMdTable.tableCheckboxMod.TableCheckboxProps
import typingsSlinky.reactMdTable.tableContainerMod.TableContainerProps
import typingsSlinky.reactMdTable.tableFooterMod.TableFooterProps
import typingsSlinky.reactMdTable.tableHeaderMod.TableHeaderProps
import typingsSlinky.reactMdTable.tableMod.TableProps
import typingsSlinky.reactMdTable.tableRowMod.TableRowProps
import typingsSlinky.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/table", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Caption: ForwardRefExoticComponent[CaptionProps with RefAttributes[HTMLTableCaptionElement]] = js.native
  
  val Table: ForwardRefExoticComponent[TableProps with RefAttributes[HTMLTableElement]] = js.native
  
  val TableBody: ForwardRefExoticComponent[TableBodyProps with RefAttributes[HTMLTableSectionElement]] = js.native
  
  val TableCell: ForwardRefExoticComponent[TableCellProps with RefAttributes[TableCellElement]] = js.native
  
  val TableCellContent: ForwardRefExoticComponent[TableCellContentProps with RefAttributes[HTMLButtonElement]] = js.native
  
  val TableCheckbox: ForwardRefExoticComponent[TableCheckboxProps with RefAttributes[HTMLTableDataCellElement]] = js.native
  
  val TableContainer: ForwardRefExoticComponent[TableContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  val TableFooter: ForwardRefExoticComponent[TableFooterProps with RefAttributes[HTMLTableSectionElement]] = js.native
  
  val TableHeader: ForwardRefExoticComponent[TableHeaderProps with RefAttributes[HTMLTableSectionElement]] = js.native
  
  val TableRow: ForwardRefExoticComponent[TableRowProps with RefAttributes[HTMLTableRowElement]] = js.native
}
