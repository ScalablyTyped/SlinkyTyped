package typingsSlinky.antd.esInputSearchMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.KeyboardEvent
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends Component[SearchProps, js.Any, js.Any] {
  var input: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def onSearch(e: KeyboardEvent[typingsSlinky.std.HTMLInputElement]): Unit = js.native
  def onSearch(e: typingsSlinky.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def renderAddonAfter(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def renderLoading(prefixCls: String): Element = js.native
  def renderSearch(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderSuffix(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def saveInput(node: typingsSlinky.antd.esInputInputMod.default): Unit = js.native
}

