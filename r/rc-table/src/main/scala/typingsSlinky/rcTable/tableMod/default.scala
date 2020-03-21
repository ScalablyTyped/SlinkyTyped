package typingsSlinky.rcTable.tableMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.columnGroupMod.ColumnGroupProps
import typingsSlinky.rcTable.columnMod.ColumnProps
import typingsSlinky.rcTable.interfaceMod.DefaultRecordType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/Table", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[RecordType /* <: DefaultRecordType */](props: TableProps[RecordType]): ReactElement = js.native
  @js.native
  object Column extends js.Object {
    def apply[RecordType](_underscore: ColumnProps[RecordType]): js.Any = js.native
  }
  
  @js.native
  object ColumnGroup extends js.Object {
    def apply[RecordType](_underscore: ColumnGroupProps[RecordType]): js.Any = js.native
  }
  
  @js.native
  object defaultProps extends js.Object {
    var prefixCls: String = js.native
    var rowKey: String = js.native
    def emptyText(): String = js.native
  }
  
}

