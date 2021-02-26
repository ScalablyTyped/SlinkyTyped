package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar", "Calendar")
  @js.native
  class Calendar protected ()
    extends typingsSlinky.officeUiFabricReact.calendarCalendarMod.Calendar {
    def this(props: ICalendarProps) = this()
  }
  /* static members */
  object Calendar {
    
    @JSImport("office-ui-fabric-react/lib/components/Calendar", "Calendar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Calendar", "Calendar.defaultProps")
    @js.native
    def defaultProps: ICalendarProps = js.native
    @scala.inline
    def defaultProps_=(x: ICalendarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType with Double] = js.native
    
    /* 0 */ val Day: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Day with Double = js.native
    
    /* 2 */ val Month: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Month with Double = js.native
    
    /* 1 */ val Week: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Week with Double = js.native
    
    /* 3 */ val WorkWeek: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.WorkWeek with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek with Double] = js.native
    
    /* 5 */ val Friday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Friday with Double = js.native
    
    /* 1 */ val Monday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Monday with Double = js.native
    
    /* 6 */ val Saturday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Saturday with Double = js.native
    
    /* 0 */ val Sunday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Sunday with Double = js.native
    
    /* 4 */ val Thursday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Thursday with Double = js.native
    
    /* 2 */ val Tuesday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Tuesday with Double = js.native
    
    /* 3 */ val Wednesday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Wednesday with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear with Double
      ] = js.native
    
    /* 0 */ val FirstDay: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
    
    /* 2 */ val FirstFourDayWeek: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
    
    /* 1 */ val FirstFullWeek: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
  }
}
