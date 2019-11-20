package typingsSlinky.antd.libInputPasswordMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Password
  extends Component[PasswordProps, PasswordState, js.Any] {
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getIcon(): Element = js.native
  def onChange(): Unit = js.native
  def saveInput(instance: typingsSlinky.antd.libInputInputMod.default): Unit = js.native
  def select(): Unit = js.native
}

