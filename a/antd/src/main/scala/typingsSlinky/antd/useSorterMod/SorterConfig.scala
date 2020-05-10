package typingsSlinky.antd.useSorterMod

import slinky.core.TagMod
import typingsSlinky.antd.tableInterfaceMod.ColumnsType
import typingsSlinky.antd.tableInterfaceMod.SortOrder
import typingsSlinky.antd.tableInterfaceMod.SorterResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SorterConfig[RecordType] extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.native
  var prefixCls: String = js.native
  var sortDirections: js.Array[SortOrder] = js.native
  def onSorterChange(sorterResult: js.Array[SorterResult[RecordType]], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
  def onSorterChange(sorterResult: SorterResult[RecordType], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
}

