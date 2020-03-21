package typingsSlinky.antd.useFilterMod

import typingsSlinky.antd.tableInterfaceMod.Key
import typingsSlinky.antd.tableInterfaceMod.TransformColumns
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/hooks/useFilter", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[RecordType](hasPrefixClsDropdownPrefixClsColumnsOnFilterChangeGetPopupContainer: FilterConfig[RecordType]): js.Tuple3[
    TransformColumns[RecordType], 
    js.Array[FilterState[RecordType]], 
    js.Function0[Record[String, js.Array[Key] | Null]]
  ] = js.native
}

