package typingsSlinky.antd.tableTableMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.SELECT_ALL
import typingsSlinky.antd.antdStrings.SELECT_INVERT
import typingsSlinky.antd.columnGroupMod.ColumnGroupProps
import typingsSlinky.antd.columnMod.ColumnProps
import typingsSlinky.rcTable.footerCellMod.SummaryCellProps
import typingsSlinky.rcTable.rowMod.FooterRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/table/Table", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[RecordType /* <: js.Object */](props: TableProps[RecordType]): ReactElement = js.native
  
  var SELECTION_ALL: SELECT_ALL = js.native
  
  var SELECTION_INVERT: SELECT_INVERT = js.native
  
  @js.native
  object Column extends js.Object {
    
    def apply[RecordType](_underscore: ColumnProps[RecordType]): Null = js.native
  }
  
  @js.native
  object ColumnGroup extends js.Object {
    
    def apply[RecordType](_underscore: ColumnGroupProps[RecordType]): Null = js.native
  }
  
  @js.native
  object Summary extends js.Object {
    
    var Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpan */ SummaryCellProps, ReactElement] = js.native
    
    var Row: js.Function1[/* props */ FooterRowProps, ReactElement] = js.native
  }
  
  @js.native
  object defaultProps extends js.Object {
    
    var rowKey: String = js.native
  }
}
