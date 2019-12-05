package typingsSlinky.reactDashTable.libHocSelectTableMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashTable.reactDashTableMod.TableProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-table/lib/hoc/selectTable", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props /* <: Partial[TableProps[_, _]] */](WrappedComponent: ReactComponentClass[Props]): ReactComponentClass[Props with SelectTableAdditionalProps] = js.native
  def apply[Props /* <: Partial[TableProps[_, _]] */](WrappedComponent: ReactComponentClass[Props], options: SelectTableHOCOptions): ReactComponentClass[Props with SelectTableAdditionalProps] = js.native
}

