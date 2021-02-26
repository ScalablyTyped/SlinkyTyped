package typingsSlinky.angularBootstrapCalendar

import typingsSlinky.angularBootstrapCalendar.mod.bootstrap.calendar.IFormats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Angular extends StObject {
    
    var angular: IFormats = js.native
    
    var moment: IFormats = js.native
  }
  object Angular {
    
    @scala.inline
    def apply(angular: IFormats, moment: IFormats): Angular = {
      val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], moment = moment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Angular]
    }
    
    @scala.inline
    implicit class AngularMutableBuilder[Self <: Angular] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngular(value: IFormats): Self = StObject.set(x, "angular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoment(value: IFormats): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CalendarDayView extends StObject {
    
    var calendarDayView: String = js.native
    
    var calendarHourList: String = js.native
    
    var calendarMonthCell: String = js.native
    
    var calendarMonthCellEvents: String = js.native
    
    var calendarMonthView: String = js.native
    
    var calendarSlideBox: String = js.native
    
    var calendarWeekView: String = js.native
    
    var calendarYearView: String = js.native
  }
  object CalendarDayView {
    
    @scala.inline
    def apply(
      calendarDayView: String,
      calendarHourList: String,
      calendarMonthCell: String,
      calendarMonthCellEvents: String,
      calendarMonthView: String,
      calendarSlideBox: String,
      calendarWeekView: String,
      calendarYearView: String
    ): CalendarDayView = {
      val __obj = js.Dynamic.literal(calendarDayView = calendarDayView.asInstanceOf[js.Any], calendarHourList = calendarHourList.asInstanceOf[js.Any], calendarMonthCell = calendarMonthCell.asInstanceOf[js.Any], calendarMonthCellEvents = calendarMonthCellEvents.asInstanceOf[js.Any], calendarMonthView = calendarMonthView.asInstanceOf[js.Any], calendarSlideBox = calendarSlideBox.asInstanceOf[js.Any], calendarWeekView = calendarWeekView.asInstanceOf[js.Any], calendarYearView = calendarYearView.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarDayView]
    }
    
    @scala.inline
    implicit class CalendarDayViewMutableBuilder[Self <: CalendarDayView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendarDayView(value: String): Self = StObject.set(x, "calendarDayView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarHourList(value: String): Self = StObject.set(x, "calendarHourList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarMonthCell(value: String): Self = StObject.set(x, "calendarMonthCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarMonthCellEvents(value: String): Self = StObject.set(x, "calendarMonthCellEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarMonthView(value: String): Self = StObject.set(x, "calendarMonthView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarSlideBox(value: String): Self = StObject.set(x, "calendarSlideBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarWeekView(value: String): Self = StObject.set(x, "calendarWeekView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarYearView(value: String): Self = StObject.set(x, "calendarYearView", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WeekNumber extends StObject {
    
    var weekNumber: String = js.native
  }
  object WeekNumber {
    
    @scala.inline
    def apply(weekNumber: String): WeekNumber = {
      val __obj = js.Dynamic.literal(weekNumber = weekNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekNumber]
    }
    
    @scala.inline
    implicit class WeekNumberMutableBuilder[Self <: WeekNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWeekNumber(value: String): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    }
  }
}
