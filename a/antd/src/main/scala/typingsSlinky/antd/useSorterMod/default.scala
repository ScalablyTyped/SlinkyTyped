package typingsSlinky.antd.useSorterMod

import typingsSlinky.antd.tableInterfaceMod.ColumnTitleProps
import typingsSlinky.antd.tableInterfaceMod.SorterResult
import typingsSlinky.antd.tableInterfaceMod.TransformColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/hooks/useSorter", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[RecordType](hasPrefixClsColumnsChildrenOnSorterChangeSortDirections: SorterConfig[RecordType]): js.Tuple4[
    TransformColumns[RecordType], 
    js.Array[SortState[RecordType]], 
    ColumnTitleProps[RecordType], 
    js.Function0[SorterResult[RecordType] | js.Array[SorterResult[RecordType]]]
  ] = js.native
}

