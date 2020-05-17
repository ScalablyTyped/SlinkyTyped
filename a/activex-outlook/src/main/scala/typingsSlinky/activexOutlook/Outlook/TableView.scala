package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableView extends js.Object {
  var AllowInCellEditing: Boolean = js.native
  var AlwaysExpandConversation: Boolean = js.native
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val AutoFormatRules: typingsSlinky.activexOutlook.Outlook.AutoFormatRules = js.native
  var AutoPreview: OlAutoPreview = js.native
  val AutoPreviewFont: ViewFont = js.native
  var AutomaticColumnSizing: Boolean = js.native
  var AutomaticGrouping: Boolean = js.native
  val Class: OlObjectClass = js.native
  val ColumnFont: ViewFont = js.native
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  var Filter: String = js.native
  var GridLineStyle: OlGridLineStyle = js.native
  val GroupByFields: OrderFields = js.native
  var HideReadingPaneHeaderInfo: Boolean = js.native
  var Language: String = js.native
  var LockUserChanges: Boolean = js.native
  var MaxLinesInMultiLineView: Double = js.native
  var MultiLine: OlMultiLine = js.native
  var MultiLineWidth: Double = js.native
  var Name: String = js.native
  @JSName("Outlook.TableView_typekey")
  var OutlookDotTableView_typekey: TableView = js.native
  val Parent: js.Any = js.native
  val RowFont: ViewFont = js.native
  val SaveOption: OlViewSaveOption = js.native
  val Session: NameSpace = js.native
  var ShowConversationByDate: Boolean = js.native
  var ShowConversationSendersAboveSubject: Boolean = js.native
  var ShowFullConversations: Boolean = js.native
  var ShowItemsInGroups: Boolean = js.native
  var ShowNewItemRow: Boolean = js.native
  var ShowReadingPane: Boolean = js.native
  var ShowUnreadAndFlaggedMessages: Boolean = js.native
  val SortFields: OrderFields = js.native
  val Standard: Boolean = js.native
  val ViewFields: typingsSlinky.activexOutlook.Outlook.ViewFields = js.native
  val ViewType: OlViewType = js.native
  var XML: String = js.native
  def Apply(): Unit = js.native
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): Unit = js.native
  def GetTable(): Table = js.native
  def GoToDate(Date: VarDate): Unit = js.native
  def Reset(): Unit = js.native
  def Save(): Unit = js.native
}

object TableView {
  @scala.inline
  def apply(
    AllowInCellEditing: Boolean,
    AlwaysExpandConversation: Boolean,
    Application: Application,
    Apply: () => Unit,
    AutoFormatRules: AutoFormatRules,
    AutoPreview: OlAutoPreview,
    AutoPreviewFont: ViewFont,
    AutomaticColumnSizing: Boolean,
    AutomaticGrouping: Boolean,
    Class: OlObjectClass,
    ColumnFont: ViewFont,
    Copy: (String, OlViewSaveOption) => View,
    DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting,
    Delete: () => Unit,
    Filter: String,
    GetTable: () => Table,
    GoToDate: VarDate => Unit,
    GridLineStyle: OlGridLineStyle,
    GroupByFields: OrderFields,
    HideReadingPaneHeaderInfo: Boolean,
    Language: String,
    LockUserChanges: Boolean,
    MaxLinesInMultiLineView: Double,
    MultiLine: OlMultiLine,
    MultiLineWidth: Double,
    Name: String,
    OutlookDotTableView_typekey: TableView,
    Parent: js.Any,
    Reset: () => Unit,
    RowFont: ViewFont,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    ShowConversationByDate: Boolean,
    ShowConversationSendersAboveSubject: Boolean,
    ShowFullConversations: Boolean,
    ShowItemsInGroups: Boolean,
    ShowNewItemRow: Boolean,
    ShowReadingPane: Boolean,
    ShowUnreadAndFlaggedMessages: Boolean,
    SortFields: OrderFields,
    Standard: Boolean,
    ViewFields: ViewFields,
    ViewType: OlViewType,
    XML: String
  ): TableView = {
    val __obj = js.Dynamic.literal(AllowInCellEditing = AllowInCellEditing.asInstanceOf[js.Any], AlwaysExpandConversation = AlwaysExpandConversation.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), AutoFormatRules = AutoFormatRules.asInstanceOf[js.Any], AutoPreview = AutoPreview.asInstanceOf[js.Any], AutoPreviewFont = AutoPreviewFont.asInstanceOf[js.Any], AutomaticColumnSizing = AutomaticColumnSizing.asInstanceOf[js.Any], AutomaticGrouping = AutomaticGrouping.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ColumnFont = ColumnFont.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), DefaultExpandCollapseSetting = DefaultExpandCollapseSetting.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Filter = Filter.asInstanceOf[js.Any], GetTable = js.Any.fromFunction0(GetTable), GoToDate = js.Any.fromFunction1(GoToDate), GridLineStyle = GridLineStyle.asInstanceOf[js.Any], GroupByFields = GroupByFields.asInstanceOf[js.Any], HideReadingPaneHeaderInfo = HideReadingPaneHeaderInfo.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], MaxLinesInMultiLineView = MaxLinesInMultiLineView.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], MultiLineWidth = MultiLineWidth.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), RowFont = RowFont.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowConversationByDate = ShowConversationByDate.asInstanceOf[js.Any], ShowConversationSendersAboveSubject = ShowConversationSendersAboveSubject.asInstanceOf[js.Any], ShowFullConversations = ShowFullConversations.asInstanceOf[js.Any], ShowItemsInGroups = ShowItemsInGroups.asInstanceOf[js.Any], ShowNewItemRow = ShowNewItemRow.asInstanceOf[js.Any], ShowReadingPane = ShowReadingPane.asInstanceOf[js.Any], ShowUnreadAndFlaggedMessages = ShowUnreadAndFlaggedMessages.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], ViewFields = ViewFields.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TableView_typekey")(OutlookDotTableView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableView]
  }
  @scala.inline
  implicit class TableViewOps[Self <: TableView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInCellEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowInCellEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysExpandConversation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlwaysExpandConversation")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withAutoPreview(value: OlAutoPreview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoPreviewFont(value: ViewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoPreviewFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomaticColumnSizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticColumnSizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomaticGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnFont(value: ViewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnFont")(value.asInstanceOf[js.Any])
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
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTable(value: () => Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGoToDate(value: VarDate => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GoToDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGridLineStyle(value: OlGridLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupByFields(value: OrderFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupByFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideReadingPaneHeaderInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideReadingPaneHeaderInfo")(value.asInstanceOf[js.Any])
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
    def withMaxLinesInMultiLineView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLinesInMultiLineView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiLine(value: OlMultiLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotTableView_typekey(value: TableView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.TableView_typekey")(value.asInstanceOf[js.Any])
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
    def withRowFont(value: ViewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowFont")(value.asInstanceOf[js.Any])
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
    def withShowConversationByDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowConversationByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowConversationSendersAboveSubject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowConversationSendersAboveSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowFullConversations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowFullConversations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowItemsInGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowItemsInGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNewItemRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowNewItemRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowReadingPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowReadingPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowUnreadAndFlaggedMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowUnreadAndFlaggedMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortFields(value: OrderFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Standard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewFields(value: ViewFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewFields")(value.asInstanceOf[js.Any])
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

