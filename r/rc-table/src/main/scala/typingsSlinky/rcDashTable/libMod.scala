package typingsSlinky.rcDashTable

import slinky.core.ReactComponentClass
import typingsSlinky.rcDashTable.libColumnMod.ColumnProps
import typingsSlinky.rcDashTable.libInterfaceMod.ColumnType
import typingsSlinky.rcDashTable.libInterfaceMod.DefaultValueType
import typingsSlinky.rcDashTable.libTableMod.TableProps
import typingsSlinky.rcDashTable.libTableMod.TableState
import typingsSlinky.rcDashTable.rcDashTableStrings.RC_TABLE_INTERNAL_COL_DEFINE
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class ColumnGroup ()
    extends typingsSlinky.rcDashTable.libColumnGroupMod.default
  
  @js.native
  class default[ValueType] protected ()
    extends typingsSlinky.rcDashTable.libTableMod.default[ValueType] {
    def this(props: TableProps[ValueType]) = this()
  }
  
  val Column: ReactComponentClass[ColumnProps] = js.native
  val INTERNAL_COL_DEFINE: RC_TABLE_INTERNAL_COL_DEFINE = js.native
  /* static members */
  @js.native
  object ColumnGroup extends js.Object {
    var isTableColumnGroup: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Column: ReactComponentClass[ColumnType[Record[String, _]]] = js.native
    var ColumnGroup: TypeofClassColumnGroup = js.native
    var childContextTypes: Anon_Components = js.native
    var defaultProps: Anon_BodyStyle = js.native
    def getDerivedStateFromProps(nextProps: TableProps[DefaultValueType], prevState: TableState): Anon_Children | Anon_ChildrenColumns = js.native
  }
  
}

