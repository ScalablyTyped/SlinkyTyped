package typingsSlinky.baseui.anon

import slinky.core.TagMod
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.mouseLeave
import typingsSlinky.baseui.baseuiStrings.mouseOver
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveLeft
import typingsSlinky.baseui.baseuiStrings.moveRight
import typingsSlinky.baseui.baseuiStrings.moveUp
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.datepickerMod.CalendarProps
import typingsSlinky.baseui.datepickerMod.ContainerState
import typingsSlinky.baseui.datepickerMod.DatepickerOverrides
import typingsSlinky.baseui.datepickerMod.SharedStylePropsT
import typingsSlinky.baseui.datepickerMod.StateReducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/datepicker.StatefulDatepickerProps<baseui.baseui/datepicker.CalendarProps> */
@js.native
trait StatefulDatepickerPropsCa extends js.Object {
  var autoFocusCalendar: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[js.Function1[/* args */ CalendarProps, TagMod[Any]]] = js.native
  var excludeDates: js.UndefOr[js.Array[js.Date]] = js.native
  var filterDate: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.native
  var highlightedDate: js.UndefOr[js.Date] = js.native
  var includeDates: js.UndefOr[js.Array[js.Date]] = js.native
  var initialState: js.UndefOr[ContainerState] = js.native
  // see https://github.com/date-fns/date-fns/blob/master/src/locale/index.js.flow
  var locale: js.UndefOr[js.Any] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var monthsShown: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[typingsSlinky.baseui.datepickerMod.onChange] = js.native
  var onDayClick: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.native
  var onDayMouseLeave: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.native
  var onDayMouseOver: js.UndefOr[js.Function1[/* args */ DateEvent, _]] = js.native
  var onMonthChange: js.UndefOr[js.Function1[/* args */ DateDate, _]] = js.native
  var onYearChange: js.UndefOr[js.Function1[/* args */ DateDate, _]] = js.native
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  var overrides: js.UndefOr[DatepickerOverrides[SharedStylePropsT]] = js.native
  var peekNextMonth: js.UndefOr[Boolean] = js.native
  var quickSelect: js.UndefOr[Boolean] = js.native
  var quickSelectOptions: js.UndefOr[js.Array[BeginDate]] = js.native
  var range: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
  var timeSelectEnd: js.UndefOr[Boolean] = js.native
  var timeSelectStart: js.UndefOr[Boolean] = js.native
  var trapTabbing: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[js.Date | js.Array[js.Date] | Null] = js.native
}

object StatefulDatepickerPropsCa {
  @scala.inline
  def apply(): StatefulDatepickerPropsCa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulDatepickerPropsCa]
  }
  @scala.inline
  implicit class StatefulDatepickerPropsCaOps[Self <: StatefulDatepickerPropsCa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFocusCalendar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocusCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocusCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocusCalendar")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: /* args */ CalendarProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeDates")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDate(value: /* day */ js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilterDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDate")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDates")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: ContainerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
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
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthsShown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthsShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsShown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* args */ Date => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayClick(value: /* args */ DateEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayMouseLeave(value: /* args */ DateEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDayMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayMouseOver(value: /* args */ DateEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDayMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMonthChange(value: /* args */ DateDate => _): Self = {
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
    def withOnYearChange(value: /* args */ DateDate => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnYearChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: DatepickerOverrides[SharedStylePropsT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPeekNextMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekNextMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeekNextMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekNextMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickSelectOptions(value: js.Array[BeginDate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSelectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickSelectOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSelectOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReducer(
      value: (/* stateType */ mouseLeave | moveRight | moveDown | moveUp | mouseOver | change_ | moveLeft, /* nextState */ ContainerState, /* currentState */ ContainerState) => ContainerState
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStateReducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSelectEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSelectEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSelectEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSelectEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSelectStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSelectStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSelectStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSelectStart")(js.undefined)
        ret
    }
    @scala.inline
    def withTrapTabbing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapTabbing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrapTabbing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapTabbing")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Date | js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

