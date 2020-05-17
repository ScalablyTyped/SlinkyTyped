package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarSharing extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  var CalendarDetail: OlCalendarDetail = js.native
  val Class: OlObjectClass = js.native
  var EndDate: VarDate = js.native
  val Folder: typingsSlinky.activexOutlook.Outlook.Folder = js.native
  var IncludeAttachments: Boolean = js.native
  var IncludePrivateDetails: Boolean = js.native
  var IncludeWholeCalendar: Boolean = js.native
  @JSName("Outlook.CalendarSharing_typekey")
  var OutlookDotCalendarSharing_typekey: CalendarSharing = js.native
  val Parent: js.Any = js.native
  var RestrictToWorkingHours: Boolean = js.native
  val Session: NameSpace = js.native
  var StartDate: VarDate = js.native
  def ForwardAsICal(MailFormat: OlCalendarMailFormat): MailItem = js.native
  def SaveAsICal(Path: String): Unit = js.native
}

object CalendarSharing {
  @scala.inline
  def apply(
    Application: Application,
    CalendarDetail: OlCalendarDetail,
    Class: OlObjectClass,
    EndDate: VarDate,
    Folder: Folder,
    ForwardAsICal: OlCalendarMailFormat => MailItem,
    IncludeAttachments: Boolean,
    IncludePrivateDetails: Boolean,
    IncludeWholeCalendar: Boolean,
    OutlookDotCalendarSharing_typekey: CalendarSharing,
    Parent: js.Any,
    RestrictToWorkingHours: Boolean,
    SaveAsICal: String => Unit,
    Session: NameSpace,
    StartDate: VarDate
  ): CalendarSharing = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CalendarDetail = CalendarDetail.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], EndDate = EndDate.asInstanceOf[js.Any], Folder = Folder.asInstanceOf[js.Any], ForwardAsICal = js.Any.fromFunction1(ForwardAsICal), IncludeAttachments = IncludeAttachments.asInstanceOf[js.Any], IncludePrivateDetails = IncludePrivateDetails.asInstanceOf[js.Any], IncludeWholeCalendar = IncludeWholeCalendar.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RestrictToWorkingHours = RestrictToWorkingHours.asInstanceOf[js.Any], SaveAsICal = js.Any.fromFunction1(SaveAsICal), Session = Session.asInstanceOf[js.Any], StartDate = StartDate.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.CalendarSharing_typekey")(OutlookDotCalendarSharing_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarSharing]
  }
  @scala.inline
  implicit class CalendarSharingOps[Self <: CalendarSharing] (val x: Self) extends AnyVal {
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
    def withCalendarDetail(value: OlCalendarDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalendarDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolder(value: Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardAsICal(value: OlCalendarMailFormat => MailItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardAsICal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludeAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludePrivateDetails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludePrivateDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeWholeCalendar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeWholeCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotCalendarSharing_typekey(value: CalendarSharing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.CalendarSharing_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictToWorkingHours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestrictToWorkingHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveAsICal(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveAsICal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

