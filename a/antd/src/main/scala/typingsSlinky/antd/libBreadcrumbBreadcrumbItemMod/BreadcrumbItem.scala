package typingsSlinky.antd.libBreadcrumbBreadcrumbItemMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbItem
  extends Component[BreadcrumbItemProps, js.Any, js.Any] {
  def renderBreadcrumbItem(hasGetPrefixCls: ConfigConsumerProps): ReactElement | Null = js.native
  /**
    * if overlay is have
    * Wrap a DropDown
    */
  def renderBreadcrumbNode(breadcrumbItem: TagMod[Any], prefixCls: String): js.UndefOr[js.Object | Null] = js.native
}

