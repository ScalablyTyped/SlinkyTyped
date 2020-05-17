package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineView extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  var EndField: String = js.native
  var Filter: String = js.native
  val GroupByFields: OrderFields = js.native
  val ItemFont: ViewFont = js.native
  var Language: String = js.native
  var LockUserChanges: Boolean = js.native
  val LowerScaleFont: ViewFont = js.native
  var MaxLabelWidth: Double = js.native
  var Name: String = js.native
  @JSName("Outlook.TimelineView_typekey")
  var OutlookDotTimelineView_typekey: TimelineView = js.native
  val Parent: js.Any = js.native
  val SaveOption: OlViewSaveOption = js.native
  val Session: NameSpace = js.native
  var ShowLabelWhenViewingByMonth: Boolean = js.native
  var ShowWeekNumbers: Boolean = js.native
  val Standard: Boolean = js.native
  var StartField: String = js.native
  var TimelineViewMode: OlTimelineViewMode = js.native
  val UpperScaleFont: ViewFont = js.native
  val ViewType: OlViewType = js.native
  var XML: String = js.native
  def Apply(): Unit = js.native
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): Unit = js.native
  def GoToDate(Date: VarDate): Unit = js.native
  def Reset(): Unit = js.native
  def Save(): Unit = js.native
}

object TimelineView {
  @scala.inline
  def apply(
    Application: Application,
    Apply: () => Unit,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting,
    Delete: () => Unit,
    EndField: String,
    Filter: String,
    GoToDate: VarDate => Unit,
    GroupByFields: OrderFields,
    ItemFont: ViewFont,
    Language: String,
    LockUserChanges: Boolean,
    LowerScaleFont: ViewFont,
    MaxLabelWidth: Double,
    Name: String,
    OutlookDotTimelineView_typekey: TimelineView,
    Parent: js.Any,
    Reset: () => Unit,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    ShowLabelWhenViewingByMonth: Boolean,
    ShowWeekNumbers: Boolean,
    Standard: Boolean,
    StartField: String,
    TimelineViewMode: OlTimelineViewMode,
    UpperScaleFont: ViewFont,
    ViewType: OlViewType,
    XML: String
  ): TimelineView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), DefaultExpandCollapseSetting = DefaultExpandCollapseSetting.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EndField = EndField.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1(GoToDate), GroupByFields = GroupByFields.asInstanceOf[js.Any], ItemFont = ItemFont.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], LowerScaleFont = LowerScaleFont.asInstanceOf[js.Any], MaxLabelWidth = MaxLabelWidth.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowLabelWhenViewingByMonth = ShowLabelWhenViewingByMonth.asInstanceOf[js.Any], ShowWeekNumbers = ShowWeekNumbers.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], StartField = StartField.asInstanceOf[js.Any], TimelineViewMode = TimelineViewMode.asInstanceOf[js.Any], UpperScaleFont = UpperScaleFont.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimelineView_typekey")(OutlookDotTimelineView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineView]
  }
  @scala.inline
  implicit class TimelineViewOps[Self <: TimelineView] (val x: Self) extends AnyVal {
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
    def withDefaultExpandCollapseSetting(value: OlDefaultExpandCollapseSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultExpandCollapseSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
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
    def withGroupByFields(value: OrderFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupByFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemFont(value: ViewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemFont")(value.asInstanceOf[js.Any])
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
    def withLowerScaleFont(value: ViewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LowerScaleFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLabelWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLabelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotTimelineView_typekey(value: TimelineView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.TimelineView_typekey")(value.asInstanceOf[js.Any])
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
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowLabelWhenViewingByMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowLabelWhenViewingByMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowWeekNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowWeekNumbers")(value.asInstanceOf[js.Any])
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
    def withTimelineViewMode(value: OlTimelineViewMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimelineViewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpperScaleFont(value: ViewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpperScaleFont")(value.asInstanceOf[js.Any])
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

