package typingsSlinky.antd.passwordMod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.FunctionComponentElement
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Password
  extends Component[PasswordProps, PasswordState, js.Any] {
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getIcon(): FunctionComponentElement[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
  ] = js.native
  def onVisibleChange(): Unit = js.native
  def saveInput(instance: typingsSlinky.antd.inputInputMod.default): Unit = js.native
  def select(): Unit = js.native
}

