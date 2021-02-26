package typingsSlinky.dayzed

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.dayzed.anon.Calendars
import typingsSlinky.dayzed.anon.OmitPropschildrenrender
import typingsSlinky.dayzed.dayzedNumbers.`0`
import typingsSlinky.dayzed.dayzedNumbers.`10`
import typingsSlinky.dayzed.dayzedNumbers.`11`
import typingsSlinky.dayzed.dayzedNumbers.`1`
import typingsSlinky.dayzed.dayzedNumbers.`2`
import typingsSlinky.dayzed.dayzedNumbers.`3`
import typingsSlinky.dayzed.dayzedNumbers.`4`
import typingsSlinky.dayzed.dayzedNumbers.`5`
import typingsSlinky.dayzed.dayzedNumbers.`6`
import typingsSlinky.dayzed.dayzedNumbers.`7`
import typingsSlinky.dayzed.dayzedNumbers.`8`
import typingsSlinky.dayzed.dayzedNumbers.`9`
import typingsSlinky.dayzed.dayzedStrings._empty
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dayzed", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  @JSImport("dayzed", "useDayzed")
  @js.native
  def useDayzed(props: OmitPropschildrenrender): RenderProps = js.native
  
  @js.native
  trait Calendar extends StObject {
    
    var firstDayOfMonth: js.Date = js.native
    
    var lastDayOfMonth: js.Date = js.native
    
    var month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` = js.native
    
    var weeks: js.Array[js.Array[DateObj | _empty]] = js.native
    
    var year: Double = js.native
  }
  object Calendar {
    
    @scala.inline
    def apply(
      firstDayOfMonth: js.Date,
      lastDayOfMonth: js.Date,
      month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`,
      weeks: js.Array[js.Array[DateObj | _empty]],
      year: Double
    ): Calendar = {
      val __obj = js.Dynamic.literal(firstDayOfMonth = firstDayOfMonth.asInstanceOf[js.Any], lastDayOfMonth = lastDayOfMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calendar]
    }
    
    @scala.inline
    implicit class CalendarMutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstDayOfMonth(value: js.Date): Self = StObject.set(x, "firstDayOfMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastDayOfMonth(value: js.Date): Self = StObject.set(x, "lastDayOfMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeks(value: js.Array[js.Array[DateObj | _empty]]): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeksVarargs(value: (js.Array[DateObj | _empty])*): Self = StObject.set(x, "weeks", js.Array(value :_*))
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DateObj extends StObject {
    
    var date: js.Date = js.native
    
    var nextMonth: Boolean = js.native
    
    var prevMonth: Boolean = js.native
    
    var selectable: Boolean = js.native
    
    var selected: Boolean = js.native
    
    var today: Boolean = js.native
  }
  object DateObj {
    
    @scala.inline
    def apply(
      date: js.Date,
      nextMonth: Boolean,
      prevMonth: Boolean,
      selectable: Boolean,
      selected: Boolean,
      today: Boolean
    ): DateObj = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], prevMonth = prevMonth.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateObj]
    }
    
    @scala.inline
    implicit class DateObjMutableBuilder[Self <: DateObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonth(value: Boolean): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMonth(value: Boolean): Self = StObject.set(x, "prevMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToday(value: Boolean): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    }
  }
  
  type Dayzed = ReactComponentClass[Props]
  
  @js.native
  trait Props extends StObject {
    
    var children: js.UndefOr[RenderFn] = js.native
    
    var date: js.UndefOr[js.Date] = js.native
    
    var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
    
    var maxDate: js.UndefOr[js.Date] = js.native
    
    var minDate: js.UndefOr[js.Date] = js.native
    
    var monthsToDisplay: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    def onDateSelected(selectedDate: DateObj): Unit = js.native
    
    var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.native
    
    var render: js.UndefOr[RenderFn] = js.native
    
    var selected: js.UndefOr[js.Date | js.Array[js.Date]] = js.native
    
    var showOutsideDays: js.UndefOr[Boolean] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(onDateSelected: DateObj => Unit): Props = {
      val __obj = js.Dynamic.literal(onDateSelected = js.Any.fromFunction1(onDateSelected))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* renderProps */ RenderProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMonthsToDisplay(value: Double): Self = StObject.set(x, "monthsToDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsToDisplayUndefined: Self = StObject.set(x, "monthsToDisplay", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnDateSelected(value: DateObj => Unit): Self = StObject.set(x, "onDateSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOffsetChanged(value: /* offset */ Double => Unit): Self = StObject.set(x, "onOffsetChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOffsetChangedUndefined: Self = StObject.set(x, "onOffsetChanged", js.undefined)
      
      @scala.inline
      def setRender(value: /* renderProps */ RenderProps => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSelected(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDate(value: js.Date): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSelectedVarargs(value: js.Date*): Self = StObject.set(x, "selected", js.Array(value :_*))
      
      @scala.inline
      def setShowOutsideDays(value: Boolean): Self = StObject.set(x, "showOutsideDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOutsideDaysUndefined: Self = StObject.set(x, "showOutsideDays", js.undefined)
    }
  }
  
  type RenderFn = js.Function1[/* renderProps */ RenderProps, ReactElement]
  
  @js.native
  trait RenderProps extends StObject {
    
    var calendars: js.Array[Calendar] = js.native
    
    def getBackProps(data: Calendars): Record[String, _] = js.native
    
    def getDateProps(data: typingsSlinky.dayzed.anon.DateObj): Record[String, _] = js.native
    
    def getForwardProps(data: Calendars): Record[String, _] = js.native
  }
  object RenderProps {
    
    @scala.inline
    def apply(
      calendars: js.Array[Calendar],
      getBackProps: Calendars => Record[String, _],
      getDateProps: typingsSlinky.dayzed.anon.DateObj => Record[String, _],
      getForwardProps: Calendars => Record[String, _]
    ): RenderProps = {
      val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], getBackProps = js.Any.fromFunction1(getBackProps), getDateProps = js.Any.fromFunction1(getDateProps), getForwardProps = js.Any.fromFunction1(getForwardProps))
      __obj.asInstanceOf[RenderProps]
    }
    
    @scala.inline
    implicit class RenderPropsMutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendars(value: js.Array[Calendar]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarsVarargs(value: Calendar*): Self = StObject.set(x, "calendars", js.Array(value :_*))
      
      @scala.inline
      def setGetBackProps(value: Calendars => Record[String, _]): Self = StObject.set(x, "getBackProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDateProps(value: typingsSlinky.dayzed.anon.DateObj => Record[String, _]): Self = StObject.set(x, "getDateProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetForwardProps(value: Calendars => Record[String, _]): Self = StObject.set(x, "getForwardProps", js.Any.fromFunction1(value))
    }
  }
}
