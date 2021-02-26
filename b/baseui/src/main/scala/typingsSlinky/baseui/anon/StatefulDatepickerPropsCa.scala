package typingsSlinky.baseui.anon

import slinky.core.facade.ReactElement
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/datepicker.StatefulDatepickerProps<baseui.baseui/datepicker.CalendarProps> */
@js.native
trait StatefulDatepickerPropsCa extends StObject {
  
  var autoFocusCalendar: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[js.Function1[/* args */ CalendarProps, ReactElement]] = js.native
  
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
  implicit class StatefulDatepickerPropsCaMutableBuilder[Self <: StatefulDatepickerPropsCa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocusCalendar(value: Boolean): Self = StObject.set(x, "autoFocusCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusCalendarUndefined: Self = StObject.set(x, "autoFocusCalendar", js.undefined)
    
    @scala.inline
    def setChildren(value: /* args */ CalendarProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setExcludeDates(value: js.Array[js.Date]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
    
    @scala.inline
    def setExcludeDatesVarargs(value: js.Date*): Self = StObject.set(x, "excludeDates", js.Array(value :_*))
    
    @scala.inline
    def setFilterDate(value: /* day */ js.Date => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
    
    @scala.inline
    def setHighlightedDate(value: js.Date): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedDateUndefined: Self = StObject.set(x, "highlightedDate", js.undefined)
    
    @scala.inline
    def setIncludeDates(value: js.Array[js.Date]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    @scala.inline
    def setIncludeDatesVarargs(value: js.Date*): Self = StObject.set(x, "includeDates", js.Array(value :_*))
    
    @scala.inline
    def setInitialState(value: ContainerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMonthsShown(value: Double): Self = StObject.set(x, "monthsShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsShownUndefined: Self = StObject.set(x, "monthsShown", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ Date => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnDayClick(value: /* args */ DateEvent => _): Self = StObject.set(x, "onDayClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    @scala.inline
    def setOnDayMouseLeave(value: /* args */ DateEvent => _): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
    
    @scala.inline
    def setOnDayMouseOver(value: /* args */ DateEvent => _): Self = StObject.set(x, "onDayMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayMouseOverUndefined: Self = StObject.set(x, "onDayMouseOver", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* args */ DateDate => _): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    @scala.inline
    def setOnYearChange(value: /* args */ DateDate => _): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setOverrides(value: DatepickerOverrides[SharedStylePropsT]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeekNextMonthUndefined: Self = StObject.set(x, "peekNextMonth", js.undefined)
    
    @scala.inline
    def setQuickSelect(value: Boolean): Self = StObject.set(x, "quickSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickSelectOptions(value: js.Array[BeginDate]): Self = StObject.set(x, "quickSelectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickSelectOptionsUndefined: Self = StObject.set(x, "quickSelectOptions", js.undefined)
    
    @scala.inline
    def setQuickSelectOptionsVarargs(value: BeginDate*): Self = StObject.set(x, "quickSelectOptions", js.Array(value :_*))
    
    @scala.inline
    def setQuickSelectUndefined: Self = StObject.set(x, "quickSelect", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* stateType */ mouseLeave | moveRight | moveDown | moveUp | mouseOver | change_ | moveLeft, /* nextState */ ContainerState, /* currentState */ ContainerState) => ContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    
    @scala.inline
    def setTimeSelectEnd(value: Boolean): Self = StObject.set(x, "timeSelectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSelectEndUndefined: Self = StObject.set(x, "timeSelectEnd", js.undefined)
    
    @scala.inline
    def setTimeSelectStart(value: Boolean): Self = StObject.set(x, "timeSelectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSelectStartUndefined: Self = StObject.set(x, "timeSelectStart", js.undefined)
    
    @scala.inline
    def setTrapTabbing(value: Boolean): Self = StObject.set(x, "trapTabbing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrapTabbingUndefined: Self = StObject.set(x, "trapTabbing", js.undefined)
    
    @scala.inline
    def setValue(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDate(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Date*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
