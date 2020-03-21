package typingsSlinky.rmcCalendar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rmcCalendar.calendarMod.default
import typingsSlinky.rmcCalendar.calendarPropsMod.SelectDateType
import typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.headerMod.PropsType
import typingsSlinky.rmcCalendar.rmcCalendarStrings.horizontal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.normal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.one
import typingsSlinky.rmcCalendar.rmcCalendarStrings.range
import typingsSlinky.rmcCalendar.rmcCalendarStrings.vertical
import typingsSlinky.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rmc-calendar/lib/Calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style, title */
  def apply(
    defaultDate: js.Date = null,
    defaultTimeValue: js.Date = null,
    defaultValue: SelectDateType = null,
    enterDirection: horizontal | vertical = null,
    getDateExtra: /* date */ js.Date => ExtraData = null,
    infiniteOpt: js.UndefOr[Boolean] = js.undefined,
    initalMonths: Int | Double = null,
    locale: Locale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onCancel: () => Unit = null,
    onClear: () => Unit = null,
    onConfirm: (/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date]) => Unit = null,
    onSelect: (/* date */ js.Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => SelectDateType | Unit = null,
    onSelectHasDisableDate: /* date */ js.Array[js.Date] => Unit = null,
    pickTime: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    renderHeader: /* prop */ PropsType => TagMod[Any] = null,
    renderShortcut: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit] => TagMod[Any] = null,
    rowSize: normal | xl = null,
    showShortcut: js.UndefOr[Boolean] = js.undefined,
    timePickerPickerPrefixCls: String = null,
    timePickerPrefixCls: String = null,
    `type`: one | range = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultTimeValue != null) __obj.updateDynamic("defaultTimeValue")(defaultTimeValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (enterDirection != null) __obj.updateDynamic("enterDirection")(enterDirection.asInstanceOf[js.Any])
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1(getDateExtra))
    if (!js.isUndefined(infiniteOpt)) __obj.updateDynamic("infiniteOpt")(infiniteOpt.asInstanceOf[js.Any])
    if (initalMonths != null) __obj.updateDynamic("initalMonths")(initalMonths.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction2(onConfirm))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (onSelectHasDisableDate != null) __obj.updateDynamic("onSelectHasDisableDate")(js.Any.fromFunction1(onSelectHasDisableDate))
    if (!js.isUndefined(pickTime)) __obj.updateDynamic("pickTime")(pickTime.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction1(renderHeader))
    if (renderShortcut != null) __obj.updateDynamic("renderShortcut")(js.Any.fromFunction1(renderShortcut))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showShortcut)) __obj.updateDynamic("showShortcut")(showShortcut.asInstanceOf[js.Any])
    if (timePickerPickerPrefixCls != null) __obj.updateDynamic("timePickerPickerPrefixCls")(timePickerPickerPrefixCls.asInstanceOf[js.Any])
    if (timePickerPrefixCls != null) __obj.updateDynamic("timePickerPrefixCls")(timePickerPrefixCls.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rmcCalendar.calendarMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.rmcCalendar.calendarPropsMod.PropsType
}

