package typingsSlinky.antd.useSorterMod

import typingsSlinky.antd.tableInterfaceMod.ColumnsType
import typingsSlinky.antd.tableInterfaceMod.SortOrder
import typingsSlinky.antd.tableInterfaceMod.SorterResult
import typingsSlinky.antd.tableInterfaceMod.TableLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SorterConfig[RecordType] extends js.Object {
  
  var mergedColumns: ColumnsType[RecordType] = js.native
  
  def onSorterChange(sorterResult: js.Array[SorterResult[RecordType]], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
  def onSorterChange(sorterResult: SorterResult[RecordType], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
  
  var prefixCls: String = js.native
  
  var showSorterTooltip: js.UndefOr[Boolean] = js.native
  
  var sortDirections: js.Array[SortOrder] = js.native
  
  var tableLocale: js.UndefOr[TableLocale] = js.native
}
