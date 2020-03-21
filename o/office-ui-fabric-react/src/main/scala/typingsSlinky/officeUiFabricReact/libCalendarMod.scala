package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Calendar", JSImport.Namespace)
@js.native
object libCalendarMod extends js.Object {
  @js.native
  class Calendar protected ()
    extends typingsSlinky.officeUiFabricReact.calendarMod.Calendar {
    def this(props: ICalendarProps) = this()
  }
  
  /* static members */
  @js.native
  object Calendar extends js.Object {
    var defaultProps: ICalendarProps = js.native
  }
  
  @js.native
  object DateRangeType extends js.Object {
    /* 0 */ val Day: typingsSlinky.officeUiFabricReact.dateValuesMod.DateRangeType.Day with Double = js.native
    /* 2 */ val Month: typingsSlinky.officeUiFabricReact.dateValuesMod.DateRangeType.Month with Double = js.native
    /* 1 */ val Week: typingsSlinky.officeUiFabricReact.dateValuesMod.DateRangeType.Week with Double = js.native
    /* 3 */ val WorkWeek: typingsSlinky.officeUiFabricReact.dateValuesMod.DateRangeType.WorkWeek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.dateValuesMod.DateRangeType with Double] = js.native
  }
  
  @js.native
  object DayOfWeek extends js.Object {
    /* 5 */ val Friday: typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek.Friday with Double = js.native
    /* 1 */ val Monday: typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek.Monday with Double = js.native
    /* 6 */ val Saturday: typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek.Saturday with Double = js.native
    /* 0 */ val Sunday: typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek.Sunday with Double = js.native
    /* 4 */ val Thursday: typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek.Thursday with Double = js.native
    /* 2 */ val Tuesday: typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek.Tuesday with Double = js.native
    /* 3 */ val Wednesday: typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek.Wednesday with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek with Double] = js.native
  }
  
  @js.native
  object FirstWeekOfYear extends js.Object {
    /* 0 */ val FirstDay: typingsSlinky.officeUiFabricReact.dateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
    /* 2 */ val FirstFourDayWeek: typingsSlinky.officeUiFabricReact.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
    /* 1 */ val FirstFullWeek: typingsSlinky.officeUiFabricReact.dateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.dateValuesMod.FirstWeekOfYear with Double] = js.native
  }
  
}

