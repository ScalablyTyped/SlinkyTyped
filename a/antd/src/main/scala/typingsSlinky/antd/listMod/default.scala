package typingsSlinky.antd.listMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.listItemMod.ListItemTypeProps
import typingsSlinky.antd.paginationPaginationMod.PaginationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/list", JSImport.Default)
@js.native
object default extends js.Object {
  var Item: ListItemTypeProps = js.native
  def apply[T](hasPaginationProps: ListProps[T]): ReactElement = js.native
  @js.native
  object defaultProps extends js.Object {
    var bordered: Boolean = js.native
    var dataSource: js.Array[scala.Nothing] = js.native
    var loading: Boolean = js.native
    var pagination: js.UndefOr[`false` | PaginationConfig] = js.native
    var split: Boolean = js.native
  }
  
}

