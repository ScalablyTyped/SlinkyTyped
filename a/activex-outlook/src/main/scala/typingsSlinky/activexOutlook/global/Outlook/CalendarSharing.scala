package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlCalendarDetail
import typingsSlinky.activexOutlook.Outlook.OlCalendarMailFormat
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CalendarSharing")
@js.native
class CalendarSharing protected ()
  extends typingsSlinky.activexOutlook.Outlook.CalendarSharing {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override var CalendarDetail: OlCalendarDetail = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var EndDate: VarDate = js.native
  /* CompleteClass */
  override val Folder: typingsSlinky.activexOutlook.Outlook.Folder = js.native
  /* CompleteClass */
  override var IncludeAttachments: Boolean = js.native
  /* CompleteClass */
  override var IncludePrivateDetails: Boolean = js.native
  /* CompleteClass */
  override var IncludeWholeCalendar: Boolean = js.native
  /* CompleteClass */
  @JSName("Outlook.CalendarSharing_typekey")
  override var OutlookDotCalendarSharing_typekey: typingsSlinky.activexOutlook.Outlook.CalendarSharing = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var RestrictToWorkingHours: Boolean = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var StartDate: VarDate = js.native
  /* CompleteClass */
  override def ForwardAsICal(MailFormat: OlCalendarMailFormat): typingsSlinky.activexOutlook.Outlook.MailItem = js.native
  /* CompleteClass */
  override def SaveAsICal(Path: String): Unit = js.native
}

