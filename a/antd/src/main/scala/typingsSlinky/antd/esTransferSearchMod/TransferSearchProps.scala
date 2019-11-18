package typingsSlinky.antd.esTransferSearchMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferSearchProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var handleClear: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TransferSearchProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    handleClear: /* e */ SyntheticMouseEvent[HTMLElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit = null,
    placeholder: String = null,
    prefixCls: String = null,
    value: String = null
  ): TransferSearchProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (handleClear != null) __obj.updateDynamic("handleClear")(js.Any.fromFunction1(handleClear))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferSearchProps]
  }
}

