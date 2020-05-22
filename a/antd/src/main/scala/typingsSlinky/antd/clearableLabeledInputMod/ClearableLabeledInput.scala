package typingsSlinky.antd.clearableLabeledInputMod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearableLabeledInput
  extends Component[ClearableInputProps, js.Object, js.Any] {
  /** @private Do not use out of this class. We do not promise this is always keep. */
  var containerRef: js.Any = js.native
  var onInputMouseUp: MouseEventHandler[Element] = js.native
  def renderClearIcon(prefixCls: String): ReactElement | Null = js.native
  def renderInputWithLabel(prefixCls: String, labeledElement: ReactElement): ReactElement = js.native
  def renderLabeledIcon(prefixCls: String, element: ReactElement): ReactElement = js.native
  def renderSuffix(prefixCls: String): ReactElement | Null = js.native
  def renderTextAreaWithClearIcon(prefixCls: String, element: ReactElement): ReactElement = js.native
}

