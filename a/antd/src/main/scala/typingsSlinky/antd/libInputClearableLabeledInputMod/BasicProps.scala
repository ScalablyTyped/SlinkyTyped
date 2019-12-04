package typingsSlinky.antd.libInputClearableLabeledInputMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.input
import typingsSlinky.antd.antdStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This basic props required for input and textarea.
  */
trait BasicProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var element: ReactElement
  var inputType: text | input
  var prefixCls: String
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  def handleReset(event: SyntheticMouseEvent[HTMLElement]): Unit
}

object BasicProps {
  @scala.inline
  def apply(
    element: ReactElement,
    handleReset: SyntheticMouseEvent[HTMLElement] => Unit,
    inputType: text | input,
    prefixCls: String,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    value: js.Any = null
  ): BasicProps = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicProps]
  }
}

