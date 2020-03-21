package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonBeginDate
import typingsSlinky.baseui.AnonDate
import typingsSlinky.baseui.AnonDateDate
import typingsSlinky.baseui.AnonDateEvent
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.datepickerMod.DatepickerOverrides
import typingsSlinky.baseui.datepickerMod.DatepickerProps
import typingsSlinky.baseui.datepickerMod.SharedStylePropsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Datepicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.datepickerMod.Datepicker] {
  @JSImport("baseui/datepicker", "Datepicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, placeholder, required */
  def apply(
    `aria-describedby`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    autoFocusCalendar: js.UndefOr[Boolean] = js.undefined,
    clearable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    excludeDates: js.Array[js.Date] = null,
    filterDate: /* day */ js.Date => Boolean = null,
    formatDisplayValue: (/* date */ js.Date | js.Array[js.Date], /* formatString */ String) => String = null,
    formatString: String = null,
    highlightedDate: js.Date = null,
    includeDates: js.Array[js.Date] = null,
    locale: js.Any = null,
    mask: String = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    monthsShown: Int | Double = null,
    mountNode: HTMLElement = null,
    onChange: /* args */ AnonDate => js.Any = null,
    onClose: () => _ = null,
    onDayClick: /* args */ AnonDateEvent => _ = null,
    onDayMouseLeave: /* args */ AnonDateEvent => _ = null,
    onDayMouseOver: /* args */ AnonDateEvent => _ = null,
    onMonthChange: /* args */ AnonDateDate => _ = null,
    onYearChange: /* args */ AnonDateDate => _ = null,
    orientation: horizontal | vertical = null,
    overrides: DatepickerOverrides[SharedStylePropsT] = null,
    peekNextMonth: js.UndefOr[Boolean] = js.undefined,
    positive: js.UndefOr[Boolean] = js.undefined,
    quickSelect: js.UndefOr[Boolean] = js.undefined,
    quickSelectOptions: js.Array[AnonBeginDate] = null,
    range: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    timeSelectEnd: js.UndefOr[Boolean] = js.undefined,
    timeSelectStart: js.UndefOr[Boolean] = js.undefined,
    trapTabbing: js.UndefOr[Boolean] = js.undefined,
    value: js.Date | js.Array[js.Date] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.datepickerMod.Datepicker] = {
    val __obj = js.Dynamic.literal()
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocusCalendar)) __obj.updateDynamic("autoFocusCalendar")(autoFocusCalendar.asInstanceOf[js.Any])
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (excludeDates != null) __obj.updateDynamic("excludeDates")(excludeDates.asInstanceOf[js.Any])
    if (filterDate != null) __obj.updateDynamic("filterDate")(js.Any.fromFunction1(filterDate))
    if (formatDisplayValue != null) __obj.updateDynamic("formatDisplayValue")(js.Any.fromFunction2(formatDisplayValue))
    if (formatString != null) __obj.updateDynamic("formatString")(formatString.asInstanceOf[js.Any])
    if (highlightedDate != null) __obj.updateDynamic("highlightedDate")(highlightedDate.asInstanceOf[js.Any])
    if (includeDates != null) __obj.updateDynamic("includeDates")(includeDates.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthsShown != null) __obj.updateDynamic("monthsShown")(monthsShown.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onDayClick != null) __obj.updateDynamic("onDayClick")(js.Any.fromFunction1(onDayClick))
    if (onDayMouseLeave != null) __obj.updateDynamic("onDayMouseLeave")(js.Any.fromFunction1(onDayMouseLeave))
    if (onDayMouseOver != null) __obj.updateDynamic("onDayMouseOver")(js.Any.fromFunction1(onDayMouseOver))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1(onYearChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(peekNextMonth)) __obj.updateDynamic("peekNextMonth")(peekNextMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (!js.isUndefined(quickSelect)) __obj.updateDynamic("quickSelect")(quickSelect.asInstanceOf[js.Any])
    if (quickSelectOptions != null) __obj.updateDynamic("quickSelectOptions")(quickSelectOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(timeSelectEnd)) __obj.updateDynamic("timeSelectEnd")(timeSelectEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(timeSelectStart)) __obj.updateDynamic("timeSelectStart")(timeSelectStart.asInstanceOf[js.Any])
    if (!js.isUndefined(trapTabbing)) __obj.updateDynamic("trapTabbing")(trapTabbing.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.datepickerMod.Datepicker] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.datepickerMod.Datepicker](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DatepickerProps
}

