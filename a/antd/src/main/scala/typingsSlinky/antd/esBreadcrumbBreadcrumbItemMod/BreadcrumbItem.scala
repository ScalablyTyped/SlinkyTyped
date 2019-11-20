package typingsSlinky.antd.esBreadcrumbBreadcrumbItemMod

import slinky.core.TagMod
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbItem
  extends Component[BreadcrumbItemProps, js.Any, js.Any] {
  def renderBreadcrumbItem(hasGetPrefixCls: ConfigConsumerProps): Element | Null = js.native
  /**
    * if overlay is have
    * Wrap a DropDown
    */
  def renderBreadcrumbNode(breadcrumbItem: TagMod[Any], prefixCls: String): js.UndefOr[js.Object | Null] = js.native
}

