package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.span.tag
import typingsSlinky.antd.Anon_DisabledHours
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.libDateDashPickerInterfaceMod.RangePickerPresetRange
import typingsSlinky.antd.libDateDashPickerInterfaceMod.RangePickerProps
import typingsSlinky.antd.libDateDashPickerInterfaceMod.RangePickerValue
import typingsSlinky.antd.libDateDashPickerRangePickerMod.default
import typingsSlinky.antd.libTimeDashPickerMod.TimePickerProps
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RangePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/date-picker/RangePicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className, defaultValue, disabled, name, onBlur, onFocus, onMouseEnter, onMouseLeave, open, value */
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    dateRender: (/* current */ Moment, /* today */ Moment) => TagMod[Any] = null,
    defaultPickerValue: RangePickerValue = null,
    disabledDate: /* current */ Moment | Null => Boolean = null,
    disabledTime: (/* current */ RangePickerValue, /* type */ String) => Anon_DisabledHours = null,
    dropdownClassName: String = null,
    format: String | js.Array[String] = null,
    getCalendarContainer: /* triggerNode */ org.scalajs.dom.raw.Element => HTMLElement = null,
    id: Double | String = null,
    inputPrefixCls: String = null,
    locale: js.Any = null,
    mode: String | js.Array[String] = null,
    onCalendarChange: (/* dates */ RangePickerValue, /* dateStrings */ js.Tuple2[String, String]) => Unit = null,
    onChange: (/* dates */ RangePickerValue, /* dateStrings */ js.Tuple2[String, String]) => Unit = null,
    onOk: /* selectedTime */ RangePickerPresetRange => Unit = null,
    onOpenChange: /* status */ Boolean => Unit = null,
    onPanelChange: (/* value */ js.UndefOr[RangePickerValue], /* mode */ js.UndefOr[String | js.Array[String]]) => Unit = null,
    pickerClass: String = null,
    pickerInputClass: String = null,
    placeholder: js.Tuple2[String, String] = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    ranges: StringDictionary[RangePickerPresetRange] = null,
    renderExtraFooter: () => TagMod[Any] = null,
    separator: TagMod[Any] = null,
    showTime: TimePickerProps | Boolean = null,
    showToday: js.UndefOr[Boolean] = js.undefined,
    size: large | small | typingsSlinky.antd.antdStrings.default = null,
    style: CSSProperties = null,
    suffixIcon: TagMod[Any] = null,
    tagPrefixCls: String = null,
    timePicker: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction2(disabledTime))
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getCalendarContainer != null) __obj.updateDynamic("getCalendarContainer")(js.Any.fromFunction1(getCalendarContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onCalendarChange != null) __obj.updateDynamic("onCalendarChange")(js.Any.fromFunction2(onCalendarChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (pickerClass != null) __obj.updateDynamic("pickerClass")(pickerClass.asInstanceOf[js.Any])
    if (pickerInputClass != null) __obj.updateDynamic("pickerInputClass")(pickerInputClass.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction0(renderExtraFooter))
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (tagPrefixCls != null) __obj.updateDynamic("tagPrefixCls")(tagPrefixCls.asInstanceOf[js.Any])
    if (timePicker != null) __obj.updateDynamic("timePicker")(timePicker.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.span.tag.type, 
  typingsSlinky.antd.libDateDashPickerRangePickerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RangePickerProps
}

