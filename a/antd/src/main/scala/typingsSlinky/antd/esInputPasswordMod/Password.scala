package typingsSlinky.antd.esInputPasswordMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Password
  extends Component[PasswordProps, PasswordState, js.Any] {
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getIcon(): ReactElement = js.native
  def onChange(): Unit = js.native
  def saveInput(instance: typingsSlinky.antd.esInputInputMod.default): Unit = js.native
  def select(): Unit = js.native
}

