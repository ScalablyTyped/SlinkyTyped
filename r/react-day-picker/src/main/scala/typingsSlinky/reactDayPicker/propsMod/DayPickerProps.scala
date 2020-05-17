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
import typingsSlinky.reactDayPicker.commonMod.ClassNames
import typingsSlinky.reactDayPicker.commonMod.DayModifiers
import typingsSlinky.reactDayPicker.commonMod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayPickerProps extends js.Object {
  var canChangeMonth: js.UndefOr[Boolean] = js.native
  var captionElement: js.UndefOr[ReactElement | ReactComponentClass[CaptionElementProps]] = js.native
  var className: js.UndefOr[String] = js.native
  var classNames: js.UndefOr[ClassNames] = js.native
  var containerProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.native
  var dir: js.UndefOr[String] = js.native
  var disabledDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.native
  var enableOutsideDaysClick: js.UndefOr[Boolean] = js.native
  var firstDayOfWeek: js.UndefOr[Double] = js.native
  var fixedWeeks: js.UndefOr[Boolean] = js.native
  var fromMonth: js.UndefOr[js.Date] = js.native
  var initialMonth: js.UndefOr[js.Date] = js.native
  var labels: js.UndefOr[NextMonth] = js.native
  var locale: js.UndefOr[String] = js.native
  var localeUtils: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any
  ] = js.native
  var modifiers: js.UndefOr[PartialModifiers] = js.native
  var modifiersStyles: js.UndefOr[js.Object] = js.native
  var month: js.UndefOr[js.Date] = js.native
  var months: js.UndefOr[js.Array[String]] = js.native
  var navbarElement: js.UndefOr[ReactElement | ReactComponentClass[NavbarElementProps]] = js.native
  var numberOfMonths: js.UndefOr[Double] = js.native
  var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
  var onCaptionClick: js.UndefOr[
    js.Function2[/* month */ js.Date, /* e */ SyntheticMouseEvent[HTMLDivElement], Unit]
  ] = js.native
  var onDayClick: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.native
  var onDayKeyDown: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticKeyboardEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.native
  var onDayMouseDown: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.native
  var onDayMouseEnter: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.native
  var onDayMouseLeave: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.native
  var onDayMouseUp: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.native
  var onDayTouchEnd: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticTouchEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.native
  var onDayTouchStart: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticTouchEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.native
  var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLDivElement], Unit]] = js.native
  var onMonthChange: js.UndefOr[js.Function1[/* month */ js.Date, Unit]] = js.native
  var onTodayButtonClick: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* modifiers */ DayModifiers, 
      /* e */ SyntheticMouseEvent[HTMLButtonElement], 
      Unit
    ]
  ] = js.native
  var onWeekClick: js.UndefOr[
    js.Function3[
      /* weekNumber */ Double, 
      /* days */ js.Array[js.Date], 
      /* e */ SyntheticMouseEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.native
  var pagedNavigation: js.UndefOr[Boolean] = js.native
  var renderDay: js.UndefOr[js.Function2[/* date */ js.Date, /* modifiers */ DayModifiers, TagMod[Any]]] = js.native
  var renderWeek: js.UndefOr[
    js.Function3[
      /* weekNumber */ Double, 
      /* week */ js.Array[js.Date], 
      /* month */ js.Date, 
      TagMod[Any]
    ]
  ] = js.native
  var reverseMonths: js.UndefOr[Boolean] = js.native
  var selectedDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.native
  var showOutsideDays: js.UndefOr[Boolean] = js.native
  var showWeekDays: js.UndefOr[Boolean] = js.native
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var toMonth: js.UndefOr[js.Date] = js.native
  var todayButton: js.UndefOr[String] = js.native
  var weekdayElement: js.UndefOr[ReactElement | ReactComponentClass[WeekdayElementProps]] = js.native
  var weekdaysLong: js.UndefOr[js.Array[String]] = js.native
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
}

object DayPickerProps {
  @scala.inline
  def apply(): DayPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerProps]
  }
  @scala.inline
  implicit class DayPickerPropsOps[Self <: DayPickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanChangeMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanChangeMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptionElementFunctionComponent(value: ReactComponentClass[CaptionElementProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptionElementComponentClass(value: ReactComponentClass[CaptionElementProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptionElement(value: ReactElement | ReactComponentClass[CaptionElementProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionElement")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNames(value: ClassNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDaysDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledDaysFunction1(value: /* date */ js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDays")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisabledDays(value: Modifier | js.Array[Modifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDays")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOutsideDaysClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOutsideDaysClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOutsideDaysClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOutsideDaysClick")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedWeeks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWeeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWeeks")(js.undefined)
        ret
    }
    @scala.inline
    def withFromMonth(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialMonth(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: NextMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleUtils(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeUtils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleUtils: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeUtils")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: PartialModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiersStyles(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiersStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiersStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiersStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.undefined)
        ret
    }
    @scala.inline
    def withNavbarElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbarElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavbarElementFunctionComponent(value: ReactComponentClass[NavbarElementProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbarElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavbarElementComponentClass(value: ReactComponentClass[NavbarElementProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbarElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavbarElement(value: ReactElement | ReactComponentClass[NavbarElementProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbarElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavbarElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbarElement")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCaptionClick(value: (/* month */ js.Date, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaptionClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCaptionClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaptionClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayClick(
      value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayKeyDown(
      value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticKeyboardEvent[HTMLDivElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayKeyDown")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDayKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayMouseDown(
      value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseDown")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDayMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayMouseEnter(
      value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDayMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayMouseLeave(
      value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDayMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayMouseUp(
      value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseUp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDayMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayTouchEnd(
      value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticTouchEvent[HTMLDivElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayTouchEnd")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDayTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayTouchStart(
      value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticTouchEvent[HTMLDivElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayTouchStart")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDayTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* e */ SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMonthChange(value: /* month */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMonthChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTodayButtonClick(
      value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLButtonElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTodayButtonClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTodayButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTodayButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWeekClick(
      value: (/* weekNumber */ Double, /* days */ js.Array[js.Date], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWeekClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnWeekClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWeekClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPagedNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagedNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagedNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagedNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderDay(value: (/* date */ js.Date, /* modifiers */ DayModifiers) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDay")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderWeek(value: (/* weekNumber */ Double, /* week */ js.Array[js.Date], /* month */ js.Date) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWeek")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDaysDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedDaysFunction1(value: /* date */ js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDays")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectedDays(value: Modifier | js.Array[Modifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDays")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOutsideDays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOutsideDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOutsideDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOutsideDays")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekDays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekDays")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withToMonth(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButton")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdayElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdayElementFunctionComponent(value: ReactComponentClass[WeekdayElementProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdayElementComponentClass(value: ReactComponentClass[WeekdayElementProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdayElement(value: ReactElement | ReactComponentClass[WeekdayElementProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdayElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayElement")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdaysLong(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdaysLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysLong")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdaysShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdaysShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(js.undefined)
        ret
    }
  }
  
}

