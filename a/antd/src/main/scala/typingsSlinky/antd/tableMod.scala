package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.columnGroupMod.ColumnGroupProps
import typingsSlinky.antd.columnMod.ColumnProps
import typingsSlinky.antd.tableTableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table", JSImport.Namespace)
@js.native
object tableMod extends js.Object {
  @js.native
  object default extends js.Object {
    var SELECTION_ALL: String = js.native
    var SELECTION_INVERT: String = js.native
    def apply[RecordType /* <: js.Object */](props: TableProps[RecordType]): ReactElement = js.native
    @js.native
    object Column extends js.Object {
      def apply[RecordType](_underscore: ColumnProps[RecordType]): Null = js.native
    }
    
    @js.native
    object ColumnGroup extends js.Object {
      def apply[RecordType](_underscore: ColumnGroupProps[RecordType]): Null = js.native
    }
    
    @js.native
    object defaultProps extends js.Object {
      var rowKey: String = js.native
    }
    
  }
  
}

