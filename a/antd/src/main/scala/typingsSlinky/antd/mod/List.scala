package typingsSlinky.antd.mod

import typingsSlinky.antd.anon.DataSource
import typingsSlinky.antd.anon.Grid
import typingsSlinky.antd.anon.TypeofItem
import typingsSlinky.antd.listMod.ListProps
import typingsSlinky.antd.listMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "List")
@js.native
class List[T] protected () extends default[T] {
  def this(props: ListProps[T]) = this()
}

/* static members */
@JSImport("antd", "List")
@js.native
object List extends js.Object {
  var Item: TypeofItem = js.native
  var childContextTypes: Grid = js.native
  var defaultProps: DataSource = js.native
}

