package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdStrings.AM
import typingsSlinky.antd.antdStrings.PM
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.libTimeDashPickerMod.TimePickerLocale
import typingsSlinky.antd.libTimeDashPickerMod.TimePickerProps
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TimePickerProps_721348724[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, defaultValue, disabled, open, placeholder */
  def apply(
    addon: js.Function = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    clearIcon: TagMod[Any] = null,
    clearText: String = null,
    defaultOpenValue: Moment = null,
    disabledHours: () => js.Array[Double] = null,
    disabledMinutes: /* selectedHour */ Double => js.Array[Double] = null,
    disabledSeconds: (/* selectedHour */ Double, /* selectedMinute */ Double) => js.Array[Double] = null,
    focusOnOpen: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    hourStep: Int | Double = null,
    inputReadOnly: js.UndefOr[Boolean] = js.undefined,
    locale: TimePickerLocale = null,
    minuteStep: Int | Double = null,
    onAmPmChange: /* ampm */ AM | PM => Unit = null,
    onChange: (/* time */ Moment, /* timeString */ String) => Unit = null,
    onOpenChange: /* open */ Boolean => Unit = null,
    popupClassName: String = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    secondStep: Int | Double = null,
    size: large | default | small = null,
    style: CSSProperties = null,
    suffixIcon: TagMod[Any] = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: Moment = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (addon != null) __obj.updateDynamic("addon")(addon.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (clearText != null) __obj.updateDynamic("clearText")(clearText.asInstanceOf[js.Any])
    if (defaultOpenValue != null) __obj.updateDynamic("defaultOpenValue")(defaultOpenValue.asInstanceOf[js.Any])
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(js.Any.fromFunction0(disabledHours))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1(disabledMinutes))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2(disabledSeconds))
    if (!js.isUndefined(focusOnOpen)) __obj.updateDynamic("focusOnOpen")(focusOnOpen.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (!js.isUndefined(inputReadOnly)) __obj.updateDynamic("inputReadOnly")(inputReadOnly.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (onAmPmChange != null) __obj.updateDynamic("onAmPmChange")(js.Any.fromFunction1(onAmPmChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TimePickerProps
}

