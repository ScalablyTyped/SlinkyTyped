package typingsSlinky.fluentuiDateTimeUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateValuesMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DAYS_IN_WEEK")
  @js.native
  val DAYS_IN_WEEK: /* 7 */ Double = js.native
  
  @js.native
  sealed trait DateRangeType extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DateRangeType with Double] = js.native
    
    @js.native
    sealed trait Day extends DateRangeType
    /* 0 */ val Day: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Day with Double = js.native
    
    @js.native
    sealed trait Month extends DateRangeType
    /* 2 */ val Month: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Month with Double = js.native
    
    @js.native
    sealed trait Week extends DateRangeType
    /* 1 */ val Week: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Week with Double = js.native
    
    @js.native
    sealed trait WorkWeek extends DateRangeType
    /* 3 */ val WorkWeek: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.WorkWeek with Double = js.native
  }
  
  @js.native
  sealed trait DayOfWeek extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
    
    @js.native
    sealed trait Friday extends DayOfWeek
    /* 5 */ val Friday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Friday with Double = js.native
    
    @js.native
    sealed trait Monday extends DayOfWeek
    /* 1 */ val Monday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Monday with Double = js.native
    
    @js.native
    sealed trait Saturday extends DayOfWeek
    /* 6 */ val Saturday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Saturday with Double = js.native
    
    @js.native
    sealed trait Sunday extends DayOfWeek
    /* 0 */ val Sunday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Sunday with Double = js.native
    
    @js.native
    sealed trait Thursday extends DayOfWeek
    /* 4 */ val Thursday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Thursday with Double = js.native
    
    @js.native
    sealed trait Tuesday extends DayOfWeek
    /* 2 */ val Tuesday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Tuesday with Double = js.native
    
    @js.native
    sealed trait Wednesday extends DayOfWeek
    /* 3 */ val Wednesday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Wednesday with Double = js.native
  }
  
  @js.native
  sealed trait FirstWeekOfYear extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FirstWeekOfYear with Double] = js.native
    
    @js.native
    sealed trait FirstDay extends FirstWeekOfYear
    /* 0 */ val FirstDay: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
    
    @js.native
    sealed trait FirstFourDayWeek extends FirstWeekOfYear
    /* 2 */ val FirstFourDayWeek: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
    
    @js.native
    sealed trait FirstFullWeek extends FirstWeekOfYear
    /* 1 */ val FirstFullWeek: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
  }
  
  @js.native
  sealed trait MonthOfYear extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "MonthOfYear")
  @js.native
  object MonthOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MonthOfYear with Double] = js.native
    
    @js.native
    sealed trait April extends MonthOfYear
    /* 3 */ val April: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.April with Double = js.native
    
    @js.native
    sealed trait August extends MonthOfYear
    /* 7 */ val August: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.August with Double = js.native
    
    @js.native
    sealed trait December extends MonthOfYear
    /* 11 */ val December: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.December with Double = js.native
    
    @js.native
    sealed trait February extends MonthOfYear
    /* 1 */ val February: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.February with Double = js.native
    
    @js.native
    sealed trait January extends MonthOfYear
    /* 0 */ val January: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.January with Double = js.native
    
    @js.native
    sealed trait July extends MonthOfYear
    /* 6 */ val July: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.July with Double = js.native
    
    @js.native
    sealed trait June extends MonthOfYear
    /* 5 */ val June: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.June with Double = js.native
    
    @js.native
    sealed trait March extends MonthOfYear
    /* 2 */ val March: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.March with Double = js.native
    
    @js.native
    sealed trait May extends MonthOfYear
    /* 4 */ val May: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.May with Double = js.native
    
    @js.native
    sealed trait November extends MonthOfYear
    /* 10 */ val November: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.November with Double = js.native
    
    @js.native
    sealed trait October extends MonthOfYear
    /* 9 */ val October: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.October with Double = js.native
    
    @js.native
    sealed trait September extends MonthOfYear
    /* 8 */ val September: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.September with Double = js.native
  }
}
