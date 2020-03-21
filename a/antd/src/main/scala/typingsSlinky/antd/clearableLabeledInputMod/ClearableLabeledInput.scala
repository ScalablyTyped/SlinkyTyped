package typingsSlinky.antd.clearableLabeledInputMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearableLabeledInput
  extends Component[ClearableInputProps, js.Object, js.Any] {
  def renderClearIcon(prefixCls: String): ReactElement | Null = js.native
  def renderClearableLabeledInput(): ReactElement = js.native
  def renderInputWithLabel(prefixCls: String, labeledElement: ReactElement): ReactElement = js.native
  def renderLabeledIcon(prefixCls: String, element: ReactElement): ReactElement = js.native
  def renderSuffix(prefixCls: String): ReactElement | Null = js.native
  def renderTextAreaWithClearIcon(prefixCls: String, element: ReactElement): ReactElement = js.native
}

