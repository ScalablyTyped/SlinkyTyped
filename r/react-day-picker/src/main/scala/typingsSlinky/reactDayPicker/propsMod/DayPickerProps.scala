package typingsSlinky.reactDayPicker.propsMod

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactDayPicker.anon.NextMonth
import typingsSlinky.reactDayPicker.anon.PartialModifiers
import typingsSlinky.reactDayPicker.classNamesMod.ClassNames
import typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils
import typingsSlinky.reactDayPicker.modifiersMod.DayModifiers
import typingsSlinky.reactDayPicker.modifiersMod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPickerProps extends js.Object {
  var canChangeMonth: js.UndefOr[Boolean] = js.undefined
  var captionElement: js.UndefOr[ReactElement | ReactComponentClass[CaptionElementProps]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classNames: js.UndefOr[ClassNames] = js.undefined
  var containerProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabledDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.undefined
  var enableOutsideDaysClick: js.UndefOr[Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var fixedWeeks: js.UndefOr[Boolean] = js.undefined
  var fromMonth: js.UndefOr[js.Date] = js.undefined
  var initialMonth: js.UndefOr[js.Date] = js.undefined
  var labels: js.UndefOr[NextMonth] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var localeUtils: js.UndefOr[LocaleUtils] = js.undefined
  var modifiers: js.UndefOr[PartialModifiers] = js.undefined
  var modifiersStyles: js.UndefOr[js.Object] = js.undefined
  var month: js.UndefOr[js.Date] = js.undefined
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var navbarElement: js.UndefOr[ReactElement | ReactComponentClass[NavbarElementProps]] = js.undefined
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.undefined
  var onCaptionClick: js.UndefOr[
    js.Function2[/* month */ js.Date, /* e */ SyntheticMouseEvent[HTMLDivElement], Unit]
  ] = js.undefined
  var onDayClick: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.undefined
  var onDayKeyDown: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticKeyboardEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.undefined
  var onDayMouseDown: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.undefined
  var onDayMouseEnter: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.undefined
  var onDayMouseLeave: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.undefined
  var onDayMouseUp: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.undefined
  var onDayTouchEnd: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticTouchEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.undefined
  var onDayTouchStart: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticTouchEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLDivElement], Unit]] = js.undefined
  var onMonthChange: js.UndefOr[js.Function1[/* month */ js.Date, Unit]] = js.undefined
  var onTodayButtonClick: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLButtonElement], 
      Unit
    ]
  ] = js.undefined
  var onWeekClick: js.UndefOr[
    js.Function3[
      /* weekNumber */ Double, 
      /* days */ js.Array[js.Date], 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.undefined
  var pagedNavigation: js.UndefOr[Boolean] = js.undefined
  var renderDay: js.UndefOr[js.Function2[/* date */ js.Date, /* modifiers */ DayModifiers, TagMod[Any]]] = js.undefined
  var renderWeek: js.UndefOr[
    js.Function3[
      /* weekNumber */ Double, 
      /* week */ js.Array[js.Date], 
      /* month */ js.Date, 
      TagMod[Any]
    ]
  ] = js.undefined
  var reverseMonths: js.UndefOr[Boolean] = js.undefined
  var selectedDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.undefined
  var showOutsideDays: js.UndefOr[Boolean] = js.undefined
  var showWeekDays: js.UndefOr[Boolean] = js.undefined
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var toMonth: js.UndefOr[js.Date] = js.undefined
  var todayButton: js.UndefOr[String] = js.undefined
  var weekdayElement: js.UndefOr[ReactElement | ReactComponentClass[WeekdayElementProps]] = js.undefined
  var weekdaysLong: js.UndefOr[js.Array[String]] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}

object DayPickerProps {
  @scala.inline
  def apply(
    canChangeMonth: js.UndefOr[Boolean] = js.undefined,
    captionElement: ReactElement | ReactComponentClass[CaptionElementProps] = null,
    className: String = null,
    classNames: ClassNames = null,
    containerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = null,
    dir: String = null,
    disabledDays: Modifier | js.Array[Modifier] = null,
    enableOutsideDaysClick: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: js.UndefOr[Double] = js.undefined,
    fixedWeeks: js.UndefOr[Boolean] = js.undefined,
    fromMonth: js.Date = null,
    initialMonth: js.Date = null,
    labels: NextMonth = null,
    locale: String = null,
    localeUtils: LocaleUtils = null,
    modifiers: PartialModifiers = null,
    modifiersStyles: js.Object = null,
    month: js.Date = null,
    months: js.Array[String] = null,
    navbarElement: ReactElement | ReactComponentClass[NavbarElementProps] = null,
    numberOfMonths: js.UndefOr[Double] = js.undefined,
    onBlur: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit = null,
    onCaptionClick: (/* month */ js.Date, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayClick: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayKeyDown: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticKeyboardEvent[HTMLDivElement]) => Unit = null,
    onDayMouseDown: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayMouseEnter: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayMouseLeave: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayMouseUp: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit = null,
    onDayTouchEnd: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticTouchEvent[HTMLDivElement]) => Unit = null,
    onDayTouchStart: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticTouchEvent[HTMLDivElement]) => Unit = null,
    onFocus: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit = null,
    onKeyDown: /* e */ SyntheticKeyboardEvent[HTMLDivElement] => Unit = null,
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
    tabIndex: js.UndefOr[Double] = js.undefined,
    toMonth: js.Date = null,
    todayButton: String = null,
    weekdayElement: ReactElement | ReactComponentClass[WeekdayElementProps] = null,
    weekdaysLong: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null
  ): DayPickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canChangeMonth)) __obj.updateDynamic("canChangeMonth")(canChangeMonth.get.asInstanceOf[js.Any])
    if (captionElement != null) __obj.updateDynamic("captionElement")(captionElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDaysClick)) __obj.updateDynamic("enableOutsideDaysClick")(enableOutsideDaysClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstDayOfWeek)) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWeeks)) __obj.updateDynamic("fixedWeeks")(fixedWeeks.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(numberOfMonths)) __obj.updateDynamic("numberOfMonths")(numberOfMonths.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCaptionClick != null) __obj.updateDynamic("onCaptionClick")(js.Any.fromFunction2(onCaptionClick))
    if (onDayClick != null) __obj.updateDynamic("onDayClick")(js.Any.fromFunction3(onDayClick))
    if (onDayKeyDown != null) __obj.updateDynamic("onDayKeyDown")(js.Any.fromFunction3(onDayKeyDown))
    if (onDayMouseDown != null) __obj.updateDynamic("onDayMouseDown")(js.Any.fromFunction3(onDayMouseDown))
    if (onDayMouseEnter != null) __obj.updateDynamic("onDayMouseEnter")(js.Any.fromFunction3(onDayMouseEnter))
    if (onDayMouseLeave != null) __obj.updateDynamic("onDayMouseLeave")(js.Any.fromFunction3(onDayMouseLeave))
    if (onDayMouseUp != null) __obj.updateDynamic("onDayMouseUp")(js.Any.fromFunction3(onDayMouseUp))
    if (onDayTouchEnd != null) __obj.updateDynamic("onDayTouchEnd")(js.Any.fromFunction3(onDayTouchEnd))
    if (onDayTouchStart != null) __obj.updateDynamic("onDayTouchStart")(js.Any.fromFunction3(onDayTouchStart))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onTodayButtonClick != null) __obj.updateDynamic("onTodayButtonClick")(js.Any.fromFunction3(onTodayButtonClick))
    if (onWeekClick != null) __obj.updateDynamic("onWeekClick")(js.Any.fromFunction3(onWeekClick))
    if (!js.isUndefined(pagedNavigation)) __obj.updateDynamic("pagedNavigation")(pagedNavigation.get.asInstanceOf[js.Any])
    if (renderDay != null) __obj.updateDynamic("renderDay")(js.Any.fromFunction2(renderDay))
    if (renderWeek != null) __obj.updateDynamic("renderWeek")(js.Any.fromFunction3(renderWeek))
    if (!js.isUndefined(reverseMonths)) __obj.updateDynamic("reverseMonths")(reverseMonths.get.asInstanceOf[js.Any])
    if (selectedDays != null) __obj.updateDynamic("selectedDays")(selectedDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekDays)) __obj.updateDynamic("showWeekDays")(showWeekDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (toMonth != null) __obj.updateDynamic("toMonth")(toMonth.asInstanceOf[js.Any])
    if (todayButton != null) __obj.updateDynamic("todayButton")(todayButton.asInstanceOf[js.Any])
    if (weekdayElement != null) __obj.updateDynamic("weekdayElement")(weekdayElement.asInstanceOf[js.Any])
    if (weekdaysLong != null) __obj.updateDynamic("weekdaysLong")(weekdaysLong.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPickerProps]
  }
}

