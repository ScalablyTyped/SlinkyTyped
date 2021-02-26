package typingsSlinky.atlaskitCalendar

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticFocusEvent
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.down
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.left
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.next
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.prev
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.right
import typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.up
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/calendar", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.left
    - typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.up
    - typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.right
    - typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.down
  */
  trait ArrowKeys extends StObject
  object ArrowKeys {
    
    @scala.inline
    def down: typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.down = "down".asInstanceOf[typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.down]
    
    @scala.inline
    def left: typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.left = "left".asInstanceOf[typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.left]
    
    @scala.inline
    def right: typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.right = "right".asInstanceOf[typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.right]
    
    @scala.inline
    def up: typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.up = "up".asInstanceOf[typingsSlinky.atlaskitCalendar.atlaskitCalendarStrings.up]
  }
  
  type Calendar = ReactComponentClass[Props]
  
  @js.native
  trait ChangeEvent extends DateObj {
    
    var iso: String = js.native
    
    var `type`: left | up | right | down | prev | next = js.native
  }
  object ChangeEvent {
    
    @scala.inline
    def apply(
      day: Double,
      iso: String,
      month: Double,
      `type`: left | up | right | down | prev | next,
      year: Double
    ): ChangeEvent = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent]
    }
    
    @scala.inline
    implicit class ChangeEventMutableBuilder[Self <: ChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: left | up | right | down | prev | next): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DateObj extends StObject {
    
    var day: Double = js.native
    
    var month: Double = js.native
    
    var year: Double = js.native
  }
  object DateObj {
    
    @scala.inline
    def apply(day: Double, month: Double, year: Double): DateObj = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateObj]
    }
    
    @scala.inline
    implicit class DateObjMutableBuilder[Self <: DateObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Props extends StObject {
    
    /** The number of the day currently focused. Places border around the date. 0 highlights no date. */
    var day: js.UndefOr[Double] = js.native
    
    /** Default for `day`. */
    var defaultDay: js.UndefOr[Double] = js.native
    
    /** Default for `disabled`. */
    var defaultDisabled: js.UndefOr[js.Array[String]] = js.native
    
    /** Default for `month`. */
    var defaultMonth: js.UndefOr[Double] = js.native
    
    /** Default for `previouslySelected`. */
    var defaultPreviouslySelected: js.UndefOr[js.Array[String]] = js.native
    
    /** Default for `selected`. */
    var defaultSelected: js.UndefOr[js.Array[String]] = js.native
    
    /** Default for `year`. */
    var defaultYear: js.UndefOr[Double] = js.native
    
    /**
      * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates provided are greyed out.
      * This does not prevent these dates being selected.
      */
    var disabled: js.UndefOr[js.Array[String]] = js.native
    
    /** Props to apply to the container. */
    var innerProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
    
    /** The number of the month (from 1 to 12) which the calendar should be on. */
    var month: js.UndefOr[Double] = js.native
    
    /** Function which is called when the calendar is no longer focused. */
    var onBlur: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]], Unit]] = js.native
    
    /**
      * Called when the calendar is navigated. This can be triggered by the keyboard, or by clicking the navigational buttons.
      * The 'type' property indicates the the direction the calendar was navigated whereas the 'iso' property is a string of the format YYYY-MM-DD.
      */
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent, Unit]] = js.native
    
    /** Called when the calendar receives focus. This could be from a mouse event on the container by tabbing into it. */
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]], Unit]] = js.native
    
    /**
      * Function called when a day is clicked on. Calls with an object that has
      * a day, month and week property as numbers, representing the date just clicked.
      * It also has an 'iso' property, which is a string of the selected date in the
      * format YYYY-MM-DD.
      */
    var onSelect: js.UndefOr[js.Function1[/* e */ SelectEvent, Unit]] = js.native
    
    /**
      * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates
      * provided are given a background color.
      */
    var previouslySelected: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates
      * provided are given a background color.
      */
    var selected: js.UndefOr[js.Array[String]] = js.native
    
    /** Value of current day, as a string in the format 'YYYY-MM-DD'. */
    var today: js.UndefOr[String] = js.native
    
    /** Year to display the calendar for. */
    var year: js.UndefOr[Double] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setDefaultDay(value: Double): Self = StObject.set(x, "defaultDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDayUndefined: Self = StObject.set(x, "defaultDay", js.undefined)
      
      @scala.inline
      def setDefaultDisabled(value: js.Array[String]): Self = StObject.set(x, "defaultDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDisabledUndefined: Self = StObject.set(x, "defaultDisabled", js.undefined)
      
      @scala.inline
      def setDefaultDisabledVarargs(value: String*): Self = StObject.set(x, "defaultDisabled", js.Array(value :_*))
      
      @scala.inline
      def setDefaultMonth(value: Double): Self = StObject.set(x, "defaultMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMonthUndefined: Self = StObject.set(x, "defaultMonth", js.undefined)
      
      @scala.inline
      def setDefaultPreviouslySelected(value: js.Array[String]): Self = StObject.set(x, "defaultPreviouslySelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPreviouslySelectedUndefined: Self = StObject.set(x, "defaultPreviouslySelected", js.undefined)
      
      @scala.inline
      def setDefaultPreviouslySelectedVarargs(value: String*): Self = StObject.set(x, "defaultPreviouslySelected", js.Array(value :_*))
      
      @scala.inline
      def setDefaultSelected(value: js.Array[String]): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
      
      @scala.inline
      def setDefaultSelectedVarargs(value: String*): Self = StObject.set(x, "defaultSelected", js.Array(value :_*))
      
      @scala.inline
      def setDefaultYear(value: Double): Self = StObject.set(x, "defaultYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultYearUndefined: Self = StObject.set(x, "defaultYear", js.undefined)
      
      @scala.inline
      def setDisabled(value: js.Array[String]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisabledVarargs(value: String*): Self = StObject.set(x, "disabled", js.Array(value :_*))
      
      @scala.inline
      def setInnerProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "innerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerPropsUndefined: Self = StObject.set(x, "innerProps", js.undefined)
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ ChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* e */ SelectEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPreviouslySelected(value: js.Array[String]): Self = StObject.set(x, "previouslySelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviouslySelectedUndefined: Self = StObject.set(x, "previouslySelected", js.undefined)
      
      @scala.inline
      def setPreviouslySelectedVarargs(value: String*): Self = StObject.set(x, "previouslySelected", js.Array(value :_*))
      
      @scala.inline
      def setSelected(value: js.Array[String]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSelectedVarargs(value: String*): Self = StObject.set(x, "selected", js.Array(value :_*))
      
      @scala.inline
      def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  @js.native
  trait SelectEvent extends DateObj {
    
    var iso: String = js.native
  }
  object SelectEvent {
    
    @scala.inline
    def apply(day: Double, iso: String, month: Double, year: Double): SelectEvent = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectEvent]
    }
    
    @scala.inline
    implicit class SelectEventMutableBuilder[Self <: SelectEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    }
  }
}
