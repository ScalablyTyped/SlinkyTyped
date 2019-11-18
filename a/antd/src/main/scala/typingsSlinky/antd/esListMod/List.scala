package typingsSlinky.antd.esListMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.Anon_CurrentTotal
import typingsSlinky.antd.Anon_GridHorizontal
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T]
  extends Component[ListProps[T], ListState, js.Any] {
  var defaultPaginationProps: Anon_CurrentTotal = js.native
  var keys: js.Any = js.native
  var onPaginationChange: js.Any = js.native
  var onPaginationShowSizeChange: js.Any = js.native
  def getChildContext(): Anon_GridHorizontal = js.native
  def isSomethingAfterLastItem(): Boolean = js.native
  def renderEmpty(prefixCls: String, renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], TagMod[Any]]): ReactElement = js.native
  def renderItem(item: js.Any, index: Double): js.UndefOr[js.Object | Null] = js.native
  def renderList(hasGetPrefixClsRenderEmpty: ConfigConsumerProps): ReactElement = js.native
  def triggerPaginationEvent(eventName: String): js.Function2[/* page */ Double, /* pageSize */ Double, Unit] = js.native
}

