package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Explorer extends js.Object {
  val AccountSelector: typingsSlinky.activexOutlook.Outlook.AccountSelector = js.native
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val AttachmentSelection: typingsSlinky.activexOutlook.Outlook.AttachmentSelection = js.native
  val Caption: String = js.native
  val Class: OlObjectClass = js.native
  val CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ js.Any = js.native
  var CurrentFolder: Folder = js.native
  var CurrentView: js.Any = js.native
  val HTMLDocument: js.Any = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  val NavigationPane: typingsSlinky.activexOutlook.Outlook.NavigationPane = js.native
  @JSName("Outlook.Explorer_typekey")
  var OutlookDotExplorer_typekey: Explorer = js.native
  val Panes: typingsSlinky.activexOutlook.Outlook.Panes = js.native
  val Parent: js.Any = js.native
  val Selection: typingsSlinky.activexOutlook.Outlook.Selection = js.native
  val Session: NameSpace = js.native
  var Top: Double = js.native
  val Views: js.Any = js.native
  var Width: Double = js.native
  var WindowState: OlWindowState = js.native
  def Activate(): Unit = js.native
  def AddToSelection(Item: js.Any): Unit = js.native
  def ClearSearch(): Unit = js.native
  def ClearSelection(): Unit = js.native
  def Close(): Unit = js.native
  def DeselectFolder(Folder: Folder): Unit = js.native
  def Display(): Unit = js.native
  def IsFolderSelected(Folder: Folder): Boolean = js.native
  def IsItemSelectableInView(Item: js.Any): Boolean = js.native
  def IsPaneVisible(Pane: OlPane): Boolean = js.native
  def RemoveFromSelection(Item: js.Any): Unit = js.native
  def Search(Query: String, SearchScope: OlSearchScope): Unit = js.native
  def SelectAllItems(): Unit = js.native
  def SelectFolder(Folder: Folder): Unit = js.native
  def ShowPane(Pane: OlPane, Visible: Boolean): Unit = js.native
}

object Explorer {
  @scala.inline
  def apply(
    AccountSelector: AccountSelector,
    Activate: () => Unit,
    AddToSelection: js.Any => Unit,
    Application: Application,
    AttachmentSelection: AttachmentSelection,
    Caption: String,
    Class: OlObjectClass,
    ClearSearch: () => Unit,
    ClearSelection: () => Unit,
    Close: () => Unit,
    CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ js.Any,
    CurrentFolder: Folder,
    CurrentView: js.Any,
    DeselectFolder: Folder => Unit,
    Display: () => Unit,
    HTMLDocument: js.Any,
    Height: Double,
    IsFolderSelected: Folder => Boolean,
    IsItemSelectableInView: js.Any => Boolean,
    IsPaneVisible: OlPane => Boolean,
    Left: Double,
    NavigationPane: NavigationPane,
    OutlookDotExplorer_typekey: Explorer,
    Panes: Panes,
    Parent: js.Any,
    RemoveFromSelection: js.Any => Unit,
    Search: (String, OlSearchScope) => Unit,
    SelectAllItems: () => Unit,
    SelectFolder: Folder => Unit,
    Selection: Selection,
    Session: NameSpace,
    ShowPane: (OlPane, Boolean) => Unit,
    Top: Double,
    Views: js.Any,
    Width: Double,
    WindowState: OlWindowState
  ): Explorer = {
    val __obj = js.Dynamic.literal(AccountSelector = AccountSelector.asInstanceOf[js.Any], Activate = js.Any.fromFunction0(Activate), AddToSelection = js.Any.fromFunction1(AddToSelection), Application = Application.asInstanceOf[js.Any], AttachmentSelection = AttachmentSelection.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ClearSearch = js.Any.fromFunction0(ClearSearch), ClearSelection = js.Any.fromFunction0(ClearSelection), Close = js.Any.fromFunction0(Close), CommandBars = CommandBars.asInstanceOf[js.Any], CurrentFolder = CurrentFolder.asInstanceOf[js.Any], CurrentView = CurrentView.asInstanceOf[js.Any], DeselectFolder = js.Any.fromFunction1(DeselectFolder), Display = js.Any.fromFunction0(Display), HTMLDocument = HTMLDocument.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFolderSelected = js.Any.fromFunction1(IsFolderSelected), IsItemSelectableInView = js.Any.fromFunction1(IsItemSelectableInView), IsPaneVisible = js.Any.fromFunction1(IsPaneVisible), Left = Left.asInstanceOf[js.Any], NavigationPane = NavigationPane.asInstanceOf[js.Any], Panes = Panes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RemoveFromSelection = js.Any.fromFunction1(RemoveFromSelection), Search = js.Any.fromFunction2(Search), SelectAllItems = js.Any.fromFunction0(SelectAllItems), SelectFolder = js.Any.fromFunction1(SelectFolder), Selection = Selection.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowPane = js.Any.fromFunction2(ShowPane), Top = Top.asInstanceOf[js.Any], Views = Views.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WindowState = WindowState.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Explorer_typekey")(OutlookDotExplorer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorer]
  }
  @scala.inline
  implicit class ExplorerOps[Self <: Explorer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountSelector(value: AccountSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddToSelection(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddToSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentSelection(value: AttachmentSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearSearch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearSearch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearSelection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCommandBars(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFolder(value: Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeselectFolder(value: Folder => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeselectFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Display")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHTMLDocument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFolderSelected(value: Folder => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFolderSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsItemSelectableInView(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsItemSelectableInView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsPaneVisible(value: OlPane => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPaneVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationPane(value: NavigationPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NavigationPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotExplorer_typekey(value: Explorer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Explorer_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanes(value: Panes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Panes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveFromSelection(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveFromSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: (String, OlSearchScope) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Search")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectAllItems(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectAllItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectFolder(value: Folder => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelection(value: Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPane(value: (OlPane, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowPane")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViews(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowState(value: OlWindowState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

