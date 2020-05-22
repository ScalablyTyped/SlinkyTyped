package typingsSlinky.antd.transButtonMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransButton
  extends Component[TransButtonProps, js.Object, js.Any] {
  var div: js.UndefOr[HTMLDivElement] = js.native
  var lastKeyCode: js.UndefOr[Double] = js.native
  var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  var onKeyUp: KeyboardEventHandler[HTMLDivElement] = js.native
  def blur(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTransButton(): Unit = js.native
  def focus(): Unit = js.native
  def setRef(btn: HTMLDivElement): Unit = js.native
}

