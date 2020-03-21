package typingsSlinky.antd.listMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.AnonItemLayout
import typingsSlinky.antd.AnonTotal
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T]
  extends Component[ListProps[T], ListState, js.Any] {
  var defaultPaginationProps: AnonTotal = js.native
  var keys: js.Any = js.native
  var onPaginationChange: js.Any = js.native
  var onPaginationShowSizeChange: js.Any = js.native
  def getChildContext(): AnonItemLayout = js.native
  def isSomethingAfterLastItem(): Boolean = js.native
  def renderEmpty(prefixCls: String, renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], TagMod[Any]]): ReactElement = js.native
  def renderItem(item: js.Any, index: Double): js.UndefOr[js.Object | Null] = js.native
  def renderList(hasGetPrefixClsRenderEmptyDirection: ConfigConsumerProps): ReactElement = js.native
  def triggerPaginationEvent(eventName: String): js.Function2[/* page */ Double, /* pageSize */ Double, Unit] = js.native
}

