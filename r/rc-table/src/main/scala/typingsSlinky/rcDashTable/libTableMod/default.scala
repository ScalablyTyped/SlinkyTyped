package typingsSlinky.rcDashTable.libTableMod

import slinky.core.ReactComponentClass
import typingsSlinky.rcDashTable.Anon_BodyStyle
import typingsSlinky.rcDashTable.Anon_Children
import typingsSlinky.rcDashTable.Anon_ChildrenColumns
import typingsSlinky.rcDashTable.Anon_Components
import typingsSlinky.rcDashTable.TypeofClassColumnGroup
import typingsSlinky.rcDashTable.libColumnMod.ColumnProps
import typingsSlinky.rcDashTable.libInterfaceMod.DefaultValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/Table", JSImport.Default)
@js.native
class default[ValueType] protected () extends Table[ValueType] {
  def this(props: TableProps[ValueType]) = this()
}

/* static members */
@JSImport("rc-table/lib/Table", JSImport.Default)
@js.native
object default extends js.Object {
  var Column: ReactComponentClass[ColumnProps] = js.native
  var ColumnGroup: TypeofClassColumnGroup = js.native
  var childContextTypes: Anon_Components = js.native
  var defaultProps: Anon_BodyStyle = js.native
  def getDerivedStateFromProps(nextProps: TableProps[DefaultValueType], prevState: TableState): Anon_Children | Anon_ChildrenColumns = js.native
}

