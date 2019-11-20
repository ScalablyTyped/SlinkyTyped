package typingsSlinky.antd.esRateMod

import slinky.core.TagMod
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rate
  extends Component[RateProps, js.Any, js.Any] {
  var rcRate: js.Any = js.native
  def blur(): Unit = js.native
  def characterRender(node: TagMod[Any], hasIndex: RateNodeProps): js.UndefOr[js.Object | Null] = js.native
  def focus(): Unit = js.native
  def renderRate(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveRate(node: js.Any): Unit = js.native
}

