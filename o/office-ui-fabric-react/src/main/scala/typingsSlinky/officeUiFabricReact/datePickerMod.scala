package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.datePickerTypesMod.IDatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DatePicker", JSImport.Namespace)
@js.native
object datePickerMod extends js.Object {
  @js.native
  class DatePickerBase protected ()
    extends typingsSlinky.officeUiFabricReact.datePickerBaseMod.DatePickerBase {
    def this(props: IDatePickerProps) = this()
  }
  
  val DatePicker: ReactComponentClass[IDatePickerProps] = js.native
  /* static members */
  @js.native
  object DatePickerBase extends js.Object {
    var defaultProps: IDatePickerProps = js.native
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

