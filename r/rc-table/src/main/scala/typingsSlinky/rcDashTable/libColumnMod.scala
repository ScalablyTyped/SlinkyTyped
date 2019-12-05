package typingsSlinky.rcDashTable

import slinky.core.ReactComponentClass
import typingsSlinky.rcDashTable.libColumnMod.ColumnProps
import typingsSlinky.rcDashTable.libInterfaceMod.ColumnType
import typingsSlinky.rcDashTable.libInterfaceMod.DefaultValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/Column", JSImport.Namespace)
@js.native
object libColumnMod extends js.Object {
  val default: ReactComponentClass[ColumnProps] = js.native
  type ColumnProps = ColumnType[DefaultValueType]
}

