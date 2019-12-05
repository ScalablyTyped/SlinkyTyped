package typingsSlinky.rcDashTable

import slinky.core.TagMod
import typingsSlinky.rcDashTable.libColumnManagerMod.ColumnManager
import typingsSlinky.rcDashTable.libInterfaceMod.ColumnType
import typingsSlinky.rcDashTable.libInterfaceMod.DefaultValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/ColumnManager", JSImport.Namespace)
@js.native
object libColumnManagerMod extends js.Object {
  @js.native
  trait ColumnManager extends js.Object {
    var columns: js.Array[ColumnType[DefaultValueType]] = js.native
    def _cache(name: String, fn: js.Function): js.Any = js.native
    def _leafColumns(columns: js.Array[ColumnType[DefaultValueType]]): js.Array[_] = js.native
    def groupedColumns(): js.Array[ColumnType[DefaultValueType]] = js.native
    def isAnyColumnsFixed(): js.Any = js.native
    def isAnyColumnsLeftFixed(): js.Any = js.native
    def isAnyColumnsRightFixed(): js.Any = js.native
    def leafColumns(): js.Any = js.native
    def leftColumns(): js.Any = js.native
    def leftLeafColumns(): js.Any = js.native
    def normalize(elements: TagMod[Any]): js.Array[_] = js.native
    def reset(columns: js.Array[ColumnType[DefaultValueType]]): Unit = js.native
    def reset(columns: js.Array[ColumnType[DefaultValueType]], elements: TagMod[Any]): Unit = js.native
    def rightColumns(): js.Any = js.native
    def rightLeafColumns(): js.Any = js.native
  }
  
  @js.native
  class default protected () extends ColumnManager {
    def this(columns: js.Array[ColumnType[DefaultValueType]], elements: TagMod[Any]) = this()
  }
  
}

