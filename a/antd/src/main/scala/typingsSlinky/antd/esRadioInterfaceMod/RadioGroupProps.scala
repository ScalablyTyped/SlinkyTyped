package typingsSlinky.antd.esRadioInterfaceMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.esCheckboxGroupMod.AbstractCheckboxGroupProps
import typingsSlinky.antd.esCheckboxGroupMod.CheckboxOptionType
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupProps extends AbstractCheckboxGroupProps {
  var buttonStyle: js.UndefOr[RadioGroupButtonStyle] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ RadioChangeEvent, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var size: js.UndefOr[large | default | small] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object RadioGroupProps {
  @scala.inline
  def apply(
    buttonStyle: RadioGroupButtonStyle = null,
    children: TagMod[Any] = null,
    className: String = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    onChange: /* e */ RadioChangeEvent => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    options: js.Array[CheckboxOptionType | String] = null,
    prefixCls: String = null,
    size: large | default | small = null,
    style: CSSProperties = null,
    value: js.Any = null
  ): RadioGroupProps = {
    val __obj = js.Dynamic.literal()
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupProps]
  }
}

