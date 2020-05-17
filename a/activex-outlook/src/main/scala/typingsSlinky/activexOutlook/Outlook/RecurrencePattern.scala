package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurrencePattern extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var DayOfMonth: Double = js.native
  var DayOfWeekMask: OlDaysOfWeek = js.native
  var Duration: Double = js.native
  var EndTime: VarDate = js.native
  val Exceptions: typingsSlinky.activexOutlook.Outlook.Exceptions = js.native
  var Instance: Double = js.native
  var Interval: Double = js.native
  var MonthOfYear: Double = js.native
  var NoEndDate: Boolean = js.native
  var Occurrences: Double = js.native
  @JSName("Outlook.RecurrencePattern_typekey")
  var OutlookDotRecurrencePattern_typekey: RecurrencePattern = js.native
  val Parent: js.Any = js.native
  var PatternEndDate: VarDate = js.native
  var PatternStartDate: VarDate = js.native
  var RecurrenceType: OlRecurrenceType = js.native
  var Regenerate: Boolean = js.native
  val Session: NameSpace = js.native
  var StartTime: VarDate = js.native
  def GetOccurrence(StartDate: VarDate): AppointmentItem = js.native
}

object RecurrencePattern {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    DayOfMonth: Double,
    DayOfWeekMask: OlDaysOfWeek,
    Duration: Double,
    EndTime: VarDate,
    Exceptions: Exceptions,
    GetOccurrence: VarDate => AppointmentItem,
    Instance: Double,
    Interval: Double,
    MonthOfYear: Double,
    NoEndDate: Boolean,
    Occurrences: Double,
    OutlookDotRecurrencePattern_typekey: RecurrencePattern,
    Parent: js.Any,
    PatternEndDate: VarDate,
    PatternStartDate: VarDate,
    RecurrenceType: OlRecurrenceType,
    Regenerate: Boolean,
    Session: NameSpace,
    StartTime: VarDate
  ): RecurrencePattern = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DayOfMonth = DayOfMonth.asInstanceOf[js.Any], DayOfWeekMask = DayOfWeekMask.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], EndTime = EndTime.asInstanceOf[js.Any], Exceptions = Exceptions.asInstanceOf[js.Any], GetOccurrence = js.Any.fromFunction1(GetOccurrence), Instance = Instance.asInstanceOf[js.Any], Interval = Interval.asInstanceOf[js.Any], MonthOfYear = MonthOfYear.asInstanceOf[js.Any], NoEndDate = NoEndDate.asInstanceOf[js.Any], Occurrences = Occurrences.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PatternEndDate = PatternEndDate.asInstanceOf[js.Any], PatternStartDate = PatternStartDate.asInstanceOf[js.Any], RecurrenceType = RecurrenceType.asInstanceOf[js.Any], Regenerate = Regenerate.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.RecurrencePattern_typekey")(OutlookDotRecurrencePattern_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrencePattern]
  }
  @scala.inline
  implicit class RecurrencePatternOps[Self <: RecurrencePattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayOfMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayOfMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayOfWeekMask(value: OlDaysOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayOfWeekMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptions(value: Exceptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOccurrence(value: VarDate => AppointmentItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetOccurrence")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInstance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthOfYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthOfYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoEndDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccurrences(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Occurrences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotRecurrencePattern_typekey(value: RecurrencePattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.RecurrencePattern_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternEndDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternStartDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecurrenceType(value: OlRecurrenceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurrenceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegenerate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Regenerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

