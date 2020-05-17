package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarView extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val AutoFormatRules: typingsSlinky.activexOutlook.Outlook.AutoFormatRules = js.native
  var BoldDatesWithItems: Boolean = js.native
  var BoldSubjects: Boolean = js.native
  var CalendarViewMode: OlCalendarViewMode = js.native
  val Class: OlObjectClass = js.native
  val DayWeekFont: ViewFont = js.native
  val DayWeekTimeFont: ViewFont = js.native
  var DayWeekTimeScale: OlDayWeekTimeScale = js.native
  var DaysInMultiDayMode: Double = js.native
  val DisplayedDates: js.Any = js.native
  var EndField: String = js.native
  var Filter: String = js.native
  var Language: String = js.native
  var LockUserChanges: Boolean = js.native
  val MonthFont: ViewFont = js.native
  var MonthShowEndTime: Boolean = js.native
  var Name: String = js.native
  @JSName("Outlook.CalendarView_typekey")
  var OutlookDotCalendarView_typekey: CalendarView = js.native
  val Parent: js.Any = js.native
  val SaveOption: OlViewSaveOption = js.native
  val SelectedEndTime: VarDate = js.native
  val SelectedStartTime: VarDate = js.native
  val Session: NameSpace = js.native
  val Standard: Boolean = js.native
  var StartField: String = js.native
  val ViewType: OlViewType = js.native
  var XML: String = js.native
  def Apply(): Unit = js.native
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): Unit = js.native
  def GoToDate(Date: VarDate): Unit = js.native
  def Reset(): Unit = js.native
  def Save(): Unit = js.native
}

object CalendarView {
  @scala.inline
  def apply(
    Application: Application,
    Apply: () => Unit,
    AutoFormatRules: AutoFormatRules,
    BoldDatesWithItems: Boolean,
    BoldSubjects: Boolean,
    CalendarViewMode: OlCalendarViewMode,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    DayWeekFont: ViewFont,
    DayWeekTimeFont: ViewFont,
    DayWeekTimeScale: OlDayWeekTimeScale,
    DaysInMultiDayMode: Double,
    Delete: () => Unit,
    DisplayedDates: js.Any,
    EndField: String,
    Filter: String,
    GoToDate: VarDate => Unit,
    Language: String,
    LockUserChanges: Boolean,
    MonthFont: ViewFont,
    MonthShowEndTime: Boolean,
    Name: String,
    OutlookDotCalendarView_typekey: CalendarView,
    Parent: js.Any,
    Reset: () => Unit,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    SelectedEndTime: VarDate,
    SelectedStartTime: VarDate,
    Session: NameSpace,
    Standard: Boolean,
    StartField: String,
    ViewType: OlViewType,
    XML: String
  ): CalendarView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), AutoFormatRules = AutoFormatRules.asInstanceOf[js.Any], BoldDatesWithItems = BoldDatesWithItems.asInstanceOf[js.Any], BoldSubjects = BoldSubjects.asInstanceOf[js.Any], CalendarViewMode = CalendarViewMode.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), DayWeekFont = DayWeekFont.asInstanceOf[js.Any], DayWeekTimeFont = DayWeekTimeFont.asInstanceOf[js.Any], DayWeekTimeScale = DayWeekTimeScale.asInstanceOf[js.Any], DaysInMultiDayMode = DaysInMultiDayMode.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayedDates = DisplayedDates.asInstanceOf[js.Any], EndField = EndField.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1(GoToDate), Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], MonthFont = MonthFont.asInstanceOf[js.Any], MonthShowEndTime = MonthShowEndTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], SelectedEndTime = SelectedEndTime.asInstanceOf[js.Any], SelectedStartTime = SelectedStartTime.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], StartField = StartField.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.CalendarView_typekey")(OutlookDotCalendarView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarView]
  }
  @scala.inline
  implicit class CalendarViewOps[Self <: CalendarView] (val x: Self) extends AnyVal {
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
    def withApply(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Apply")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAutoFormatRules(value: AutoFormatRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFormatRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoldDatesWithItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BoldDatesWithItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoldSubjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BoldSubjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarViewMode(value: OlCalendarViewMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalendarViewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: (String, OlViewSaveOption) => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDayWeekFont(value: ViewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayWeekFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayWeekTimeFont(value: ViewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayWeekTimeFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayWeekTimeScale(value: OlDayWeekTimeScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayWeekTimeScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysInMultiDayMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaysInMultiDayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayedDates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayedDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToDate(value: VarDate => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GoToDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockUserChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockUserChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthFont(value: ViewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthShowEndTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthShowEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotCalendarView_typekey(value: CalendarView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.CalendarView_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSaveOption(value: OlViewSaveOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedEndTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedStartTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Standard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewType(value: OlViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XML")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

