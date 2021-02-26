package typingsSlinky.reactDayPicker

import typingsSlinky.reactDayPicker.modifiersMod.RangeModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  @js.native
  trait DateUtils extends StObject {
    
    def addDayToRange(day: js.Date, range: RangeModifier): RangeModifier = js.native
    
    def addMonths(d: js.Date, n: Double): js.Date = js.native
    
    def clone(d: js.Date): js.Date = js.native
    
    def isDate(d: js.Date): Boolean = js.native
    
    def isDayAfter(day1: js.Date, day2: js.Date): Boolean = js.native
    
    def isDayBefore(day1: js.Date, day2: js.Date): Boolean = js.native
    
    def isDayBetween(day: js.Date, begin: js.Date, end: js.Date): Boolean = js.native
    
    def isDayInRange(day: js.Date, range: RangeModifier): Boolean = js.native
    
    def isFutureDay(day: js.Date): Boolean = js.native
    
    def isPastDay(day: js.Date): Boolean = js.native
    
    def isSameDay(day1: js.Date, day2: js.Date): Boolean = js.native
    
    def isSameMonth(day1: js.Date, day2: js.Date): Boolean = js.native
  }
  object DateUtils {
    
    @scala.inline
    def apply(
      addDayToRange: (js.Date, RangeModifier) => RangeModifier,
      addMonths: (js.Date, Double) => js.Date,
      clone_ : js.Date => js.Date,
      isDate: js.Date => Boolean,
      isDayAfter: (js.Date, js.Date) => Boolean,
      isDayBefore: (js.Date, js.Date) => Boolean,
      isDayBetween: (js.Date, js.Date, js.Date) => Boolean,
      isDayInRange: (js.Date, RangeModifier) => Boolean,
      isFutureDay: js.Date => Boolean,
      isPastDay: js.Date => Boolean,
      isSameDay: (js.Date, js.Date) => Boolean,
      isSameMonth: (js.Date, js.Date) => Boolean
    ): DateUtils = {
      val __obj = js.Dynamic.literal(addDayToRange = js.Any.fromFunction2(addDayToRange), addMonths = js.Any.fromFunction2(addMonths), isDate = js.Any.fromFunction1(isDate), isDayAfter = js.Any.fromFunction2(isDayAfter), isDayBefore = js.Any.fromFunction2(isDayBefore), isDayBetween = js.Any.fromFunction3(isDayBetween), isDayInRange = js.Any.fromFunction2(isDayInRange), isFutureDay = js.Any.fromFunction1(isFutureDay), isPastDay = js.Any.fromFunction1(isPastDay), isSameDay = js.Any.fromFunction2(isSameDay), isSameMonth = js.Any.fromFunction2(isSameMonth))
      __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
      __obj.asInstanceOf[DateUtils]
    }
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.addDayToRange")
    @js.native
    def addDayToRange(day: js.Date, range: RangeModifier): RangeModifier = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.addMonths")
    @js.native
    def addMonths(d: js.Date, n: Double): js.Date = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.clone")
    @js.native
    def clone_(d: js.Date): js.Date = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isDate")
    @js.native
    def isDate(d: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isDayAfter")
    @js.native
    def isDayAfter(day1: js.Date, day2: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isDayBefore")
    @js.native
    def isDayBefore(day1: js.Date, day2: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isDayBetween")
    @js.native
    def isDayBetween(day: js.Date, begin: js.Date, end: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isDayInRange")
    @js.native
    def isDayInRange(day: js.Date, range: RangeModifier): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isFutureDay")
    @js.native
    def isFutureDay(day: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isPastDay")
    @js.native
    def isPastDay(day: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isSameDay")
    @js.native
    def isSameDay(day1: js.Date, day2: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker/types/DateUtils", "DateUtils.isSameMonth")
    @js.native
    def isSameMonth(day1: js.Date, day2: js.Date): Boolean = js.native
    
    @scala.inline
    implicit class DateUtilsMutableBuilder[Self <: DateUtils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDayToRange(value: (js.Date, RangeModifier) => RangeModifier): Self = StObject.set(x, "addDayToRange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddMonths(value: (js.Date, Double) => js.Date): Self = StObject.set(x, "addMonths", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClone_(value: js.Date => js.Date): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDate(value: js.Date => Boolean): Self = StObject.set(x, "isDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDayAfter(value: (js.Date, js.Date) => Boolean): Self = StObject.set(x, "isDayAfter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsDayBefore(value: (js.Date, js.Date) => Boolean): Self = StObject.set(x, "isDayBefore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsDayBetween(value: (js.Date, js.Date, js.Date) => Boolean): Self = StObject.set(x, "isDayBetween", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIsDayInRange(value: (js.Date, RangeModifier) => Boolean): Self = StObject.set(x, "isDayInRange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsFutureDay(value: js.Date => Boolean): Self = StObject.set(x, "isFutureDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsPastDay(value: js.Date => Boolean): Self = StObject.set(x, "isPastDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSameDay(value: (js.Date, js.Date) => Boolean): Self = StObject.set(x, "isSameDay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsSameMonth(value: (js.Date, js.Date) => Boolean): Self = StObject.set(x, "isSameMonth", js.Any.fromFunction2(value))
    }
  }
}
