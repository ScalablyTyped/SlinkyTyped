package typingsSlinky.gestalt.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gestalt", "Table")
@js.native
class Table protected ()
  extends Component[TableProps, js.Any, js.Any] {
  def this(props: TableProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TableProps, context: js.Any) = this()
}
/* static members */
object Table {
  
  @JSImport("gestalt", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gestalt", "Table.Body")
  @js.native
  def Body: ReactComponentClass[TableBodyProps] = js.native
  @scala.inline
  def Body_=(x: ReactComponentClass[TableBodyProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  @JSImport("gestalt", "Table.Cell")
  @js.native
  def Cell: ReactComponentClass[TableCellProps] = js.native
  @scala.inline
  def Cell_=(x: ReactComponentClass[TableCellProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
  
  @JSImport("gestalt", "Table.Footer")
  @js.native
  def Footer: ReactComponentClass[TableFooterProps] = js.native
  @scala.inline
  def Footer_=(x: ReactComponentClass[TableFooterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  @JSImport("gestalt", "Table.Header")
  @js.native
  def Header: ReactComponentClass[TableHeaderProps] = js.native
  
  @JSImport("gestalt", "Table.HeaderCell")
  @js.native
  def HeaderCell: ReactComponentClass[TableHeaderCellProps] = js.native
  @scala.inline
  def HeaderCell_=(x: ReactComponentClass[TableHeaderCellProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderCell")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Header_=(x: ReactComponentClass[TableHeaderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  @JSImport("gestalt", "Table.Row")
  @js.native
  def Row: ReactComponentClass[TableRowProps] = js.native
  
  @JSImport("gestalt", "Table.RowExpandable")
  @js.native
  def RowExpandable: ReactComponentClass[TableRowExpandableProps] = js.native
  @scala.inline
  def RowExpandable_=(x: ReactComponentClass[TableRowExpandableProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RowExpandable")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Row_=(x: ReactComponentClass[TableRowProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  
  @JSImport("gestalt", "Table.SortableHeaderCell")
  @js.native
  def SortableHeaderCell: ReactComponentClass[TableSortableHeaderCellProps] = js.native
  @scala.inline
  def SortableHeaderCell_=(x: ReactComponentClass[TableSortableHeaderCellProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SortableHeaderCell")(x.asInstanceOf[js.Any])
}
