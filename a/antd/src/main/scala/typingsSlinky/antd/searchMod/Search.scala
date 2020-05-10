package typingsSlinky.antd.searchMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends Component[SearchProps, js.Any, js.Any] {
  var input: js.Any = js.native
  var onMouseDown: MouseEventHandler[HTMLElement] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def onSearch(e: SyntheticKeyboardEvent[HTMLInputElement]): Unit = js.native
  def onSearch(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderAddonAfter(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def renderLoading(prefixCls: String): ReactElement = js.native
  def renderSearch(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def renderSuffix(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def saveInput(node: typingsSlinky.antd.inputInputMod.default): Unit = js.native
}

