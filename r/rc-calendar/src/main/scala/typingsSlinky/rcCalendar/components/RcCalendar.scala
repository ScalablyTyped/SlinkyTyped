package typingsSlinky.rcCalendar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.moment.mod.Moment
import typingsSlinky.rcCalendar.mod.Mode
import typingsSlinky.rcCalendar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcCalendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    dateInputPlaceholder: String = null,
    dateRender: (/* current */ Moment, /* value */ Moment) => TagMod[Any] = null,
    defaultValue: Moment = null,
    disabledDate: /* current */ js.UndefOr[Moment] => Boolean = null,
    disabledTime: /* current */ js.UndefOr[Moment] => js.Object = null,
    format: String | js.Array[String] = null,
    inputMode: String = null,
    locale: js.Object = null,
    mode: Mode = null,
    monthCellContentRender: (/* current */ Moment, /* locale */ js.Object) => TagMod[Any] = null,
    monthCellRender: (/* current */ Moment, /* locale */ js.Object) => String = null,
    onChange: /* date */ Moment | Null => Unit = null,
    onClear: () => Unit = null,
    onKeyDown: () => Unit = null,
    onOk: () => Unit = null,
    onPanelChange: (/* date */ Moment | Null, /* mode */ Mode) => Unit = null,
    onSelect: /* date */ Moment => Unit = null,
    prefixCls: String = null,
    renderFooter: () => TagMod[Any] = null,
    renderSidebar: () => TagMod[Any] = null,
    selectedValue: Moment = null,
    showDateInput: js.UndefOr[Boolean] = js.undefined,
    showOk: js.UndefOr[Boolean] = js.undefined,
    showToday: js.UndefOr[Boolean] = js.undefined,
    showWeekNumber: js.UndefOr[Boolean] = js.undefined,
    timePicker: TagMod[Any] = null,
    value: Moment = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (dateInputPlaceholder != null) __obj.updateDynamic("dateInputPlaceholder")(dateInputPlaceholder.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1(disabledTime))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellContentRender != null) __obj.updateDynamic("monthCellContentRender")(js.Any.fromFunction2(monthCellContentRender))
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction2(monthCellRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction0(onKeyDown))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction0(onOk))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderSidebar != null) __obj.updateDynamic("renderSidebar")(js.Any.fromFunction0(renderSidebar))
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(showDateInput)) __obj.updateDynamic("showDateInput")(showDateInput.asInstanceOf[js.Any])
    if (!js.isUndefined(showOk)) __obj.updateDynamic("showOk")(showOk.asInstanceOf[js.Any])
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumber)) __obj.updateDynamic("showWeekNumber")(showWeekNumber.asInstanceOf[js.Any])
    if (timePicker != null) __obj.updateDynamic("timePicker")(timePicker.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcCalendar.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.rcCalendar.mod.Props
}

