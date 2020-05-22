package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlDaysOfWeek
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlRecurrenceType
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.RecurrencePattern")
@js.native
class RecurrencePattern protected ()
  extends typingsSlinky.activexOutlook.Outlook.RecurrencePattern {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var DayOfMonth: Double = js.native
  /* CompleteClass */
  override var DayOfWeekMask: OlDaysOfWeek = js.native
  /* CompleteClass */
  override var Duration: Double = js.native
  /* CompleteClass */
  override var EndTime: VarDate = js.native
  /* CompleteClass */
  override val Exceptions: typingsSlinky.activexOutlook.Outlook.Exceptions = js.native
  /* CompleteClass */
  override var Instance: Double = js.native
  /* CompleteClass */
  override var Interval: Double = js.native
  /* CompleteClass */
  override var MonthOfYear: Double = js.native
  /* CompleteClass */
  override var NoEndDate: Boolean = js.native
  /* CompleteClass */
  override var Occurrences: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.RecurrencePattern_typekey")
  override var OutlookDotRecurrencePattern_typekey: typingsSlinky.activexOutlook.Outlook.RecurrencePattern = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var PatternEndDate: VarDate = js.native
  /* CompleteClass */
  override var PatternStartDate: VarDate = js.native
  /* CompleteClass */
  override var RecurrenceType: OlRecurrenceType = js.native
  /* CompleteClass */
  override var Regenerate: Boolean = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var StartTime: VarDate = js.native
  /* CompleteClass */
  override def GetOccurrence(StartDate: VarDate): typingsSlinky.activexOutlook.Outlook.AppointmentItem = js.native
}

