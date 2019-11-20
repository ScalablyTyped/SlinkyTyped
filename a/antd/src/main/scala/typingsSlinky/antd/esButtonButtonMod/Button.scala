package typingsSlinky.antd.esButtonButtonMod

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.MouseEventHandler
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button
  extends Component[ButtonProps, ButtonState, js.Any] {
  var buttonNode: js.Any = js.native
  var delayTimeout: js.Any = js.native
  var handleClick: MouseEventHandler[HTMLButtonElement | HTMLAnchorElement] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MButton(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MButton(prevProps: ButtonProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MButton(): Unit = js.native
  def fixTwoCNChar(): Unit = js.native
  def isNeedInserted(): Boolean = js.native
  def renderButton(hasGetPrefixClsAutoInsertSpaceInButton: ConfigConsumerProps): Element = js.native
  def saveButtonRef(): Unit = js.native
  def saveButtonRef(node: HTMLElement): Unit = js.native
}

