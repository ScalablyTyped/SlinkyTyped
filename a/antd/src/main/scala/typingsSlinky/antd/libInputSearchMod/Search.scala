package typingsSlinky.antd.libInputSearchMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.KeyboardEvent
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
  def renderLoading(prefixCls: String): ReactElement = js.native
  def renderSearch(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def renderSuffix(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def saveInput(node: typingsSlinky.antd.libInputInputMod.default): Unit = js.native
}

