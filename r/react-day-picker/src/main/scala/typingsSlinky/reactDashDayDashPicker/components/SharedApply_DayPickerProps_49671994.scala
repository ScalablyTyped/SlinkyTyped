package typingsSlinky.reactDashDayDashPicker.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.div.tag
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.reactDashDayDashPicker.Anon_NextMonth
import typingsSlinky.reactDashDayDashPicker.typesCommonMod.ClassNames
import typingsSlinky.reactDashDayDashPicker.typesCommonMod.DayModifiers
import typingsSlinky.reactDashDayDashPicker.typesCommonMod.Modifier
import typingsSlinky.reactDashDayDashPicker.typesCommonMod.Modifiers
import typingsSlinky.reactDashDayDashPicker.typesPropsMod.CaptionElementProps
import typingsSlinky.reactDashDayDashPicker.typesPropsMod.DayPickerProps
import typingsSlinky.reactDashDayDashPicker.typesPropsMod.NavbarElementProps
import typingsSlinky.reactDashDayDashPicker.typesPropsMod.WeekdayElementProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_DayPickerProps_49671994[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, dir, onBlur, onFocus, onKeyDown, tabIndex */
  def apply(
    canChangeMonth: js.UndefOr[Boolean] = js.undefined,
    captionElement: ReactElement | ReactComponentClass[CaptionElementProps] = null,
    classNames: ClassNames = null,
    containerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = null,
    disabledDays: Modifier | js.Array[Modifier] = null,
    enableOutsideDaysClick: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: Int | Double = null,
    fixedWeeks: js.UndefOr[Boolean] = js.undefined,
    fromMonth: js.Date = null,
    initialMonth: js.Date = null,
    labels: Anon_NextMonth = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    modifiers: Partial[Modifiers] = null,
    modifiersStyles: js.Object = null,
    month: js.Date = null,
    months: js.Array[String] = null,
    navbarElement: ReactElement | ReactComponentClass[NavbarElementProps] = null,
    numberOfMonths: Int | Double = null,
    onCaptionClick: (/* month */ js.Date, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayClick: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayKeyDown: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticKeyboardEvent[HTMLDivElement]) => Unit = null,
    onDayMouseDown: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayMouseEnter: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayMouseLeave: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayMouseUp: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayTouchEnd: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticTouchEvent[HTMLDivElement]) => Unit = null,
    onDayTouchStart: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticTouchEvent[HTMLDivElement]) => Unit = null,
    onMonthChange: /* month */ js.Date => Unit = null,
    onTodayButtonClick: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLButtonElement]) => Unit = null,
    onWeekClick: (/* weekNumber */ Double, /* days */ js.Array[js.Date], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    pagedNavigation: js.UndefOr[Boolean] = js.undefined,
    renderDay: (/* date */ js.Date, /* modifiers */ DayModifiers) => TagMod[Any] = null,
    renderWeek: (/* weekNumber */ Double, /* week */ js.Array[js.Date], /* month */ js.Date) => TagMod[Any] = null,
    reverseMonths: js.UndefOr[Boolean] = js.undefined,
    selectedDays: Modifier | js.Array[Modifier] = null,
    showOutsideDays: js.UndefOr[Boolean] = js.undefined,
    showWeekDays: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    toMonth: js.Date = null,
    todayButton: String = null,
    weekdayElement: ReactElement | ReactComponentClass[WeekdayElementProps] = null,
    weekdaysLong: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canChangeMonth)) __obj.updateDynamic("canChangeMonth")(canChangeMonth.asInstanceOf[js.Any])
    if (captionElement != null) __obj.updateDynamic("captionElement")(captionElement.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDaysClick)) __obj.updateDynamic("enableOutsideDaysClick")(enableOutsideDaysClick.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWeeks)) __obj.updateDynamic("fixedWeeks")(fixedWeeks.asInstanceOf[js.Any])
    if (fromMonth != null) __obj.updateDynamic("fromMonth")(fromMonth.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (modifiersStyles != null) __obj.updateDynamic("modifiersStyles")(modifiersStyles.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (navbarElement != null) __obj.updateDynamic("navbarElement")(navbarElement.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onCaptionClick != null) __obj.updateDynamic("onCaptionClick")(js.Any.fromFunction2(onCaptionClick))
    if (onDayClick != null) __obj.updateDynamic("onDayClick")(js.Any.fromFunction3(onDayClick))
    if (onDayKeyDown != null) __obj.updateDynamic("onDayKeyDown")(js.Any.fromFunction3(onDayKeyDown))
    if (onDayMouseDown != null) __obj.updateDynamic("onDayMouseDown")(js.Any.fromFunction3(onDayMouseDown))
    if (onDayMouseEnter != null) __obj.updateDynamic("onDayMouseEnter")(js.Any.fromFunction3(onDayMouseEnter))
    if (onDayMouseLeave != null) __obj.updateDynamic("onDayMouseLeave")(js.Any.fromFunction3(onDayMouseLeave))
    if (onDayMouseUp != null) __obj.updateDynamic("onDayMouseUp")(js.Any.fromFunction3(onDayMouseUp))
    if (onDayTouchEnd != null) __obj.updateDynamic("onDayTouchEnd")(js.Any.fromFunction3(onDayTouchEnd))
    if (onDayTouchStart != null) __obj.updateDynamic("onDayTouchStart")(js.Any.fromFunction3(onDayTouchStart))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onTodayButtonClick != null) __obj.updateDynamic("onTodayButtonClick")(js.Any.fromFunction3(onTodayButtonClick))
    if (onWeekClick != null) __obj.updateDynamic("onWeekClick")(js.Any.fromFunction3(onWeekClick))
    if (!js.isUndefined(pagedNavigation)) __obj.updateDynamic("pagedNavigation")(pagedNavigation.asInstanceOf[js.Any])
    if (renderDay != null) __obj.updateDynamic("renderDay")(js.Any.fromFunction2(renderDay))
    if (renderWeek != null) __obj.updateDynamic("renderWeek")(js.Any.fromFunction3(renderWeek))
    if (!js.isUndefined(reverseMonths)) __obj.updateDynamic("reverseMonths")(reverseMonths.asInstanceOf[js.Any])
    if (selectedDays != null) __obj.updateDynamic("selectedDays")(selectedDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekDays)) __obj.updateDynamic("showWeekDays")(showWeekDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (toMonth != null) __obj.updateDynamic("toMonth")(toMonth.asInstanceOf[js.Any])
    if (todayButton != null) __obj.updateDynamic("todayButton")(todayButton.asInstanceOf[js.Any])
    if (weekdayElement != null) __obj.updateDynamic("weekdayElement")(weekdayElement.asInstanceOf[js.Any])
    if (weekdaysLong != null) __obj.updateDynamic("weekdaysLong")(weekdaysLong.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DayPickerProps
}

