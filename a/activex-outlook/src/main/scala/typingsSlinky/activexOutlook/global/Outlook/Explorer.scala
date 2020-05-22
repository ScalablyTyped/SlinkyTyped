package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlPane
import typingsSlinky.activexOutlook.Outlook.OlSearchScope
import typingsSlinky.activexOutlook.Outlook.OlWindowState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Explorer")
@js.native
class Explorer protected ()
  extends typingsSlinky.activexOutlook.Outlook.Explorer {
  /* CompleteClass */
  override val AccountSelector: typingsSlinky.activexOutlook.Outlook.AccountSelector = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val AttachmentSelection: typingsSlinky.activexOutlook.Outlook.AttachmentSelection = js.native
  /* CompleteClass */
  override val Caption: String = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ js.Any = js.native
  /* CompleteClass */
  override var CurrentFolder: typingsSlinky.activexOutlook.Outlook.Folder = js.native
  /* CompleteClass */
  override var CurrentView: js.Any = js.native
  /* CompleteClass */
  override val HTMLDocument: js.Any = js.native
  /* CompleteClass */
  override var Height: Double = js.native
  /* CompleteClass */
  override var Left: Double = js.native
  /* CompleteClass */
  override val NavigationPane: typingsSlinky.activexOutlook.Outlook.NavigationPane = js.native
  /* CompleteClass */
  @JSName("Outlook.Explorer_typekey")
  override var OutlookDotExplorer_typekey: typingsSlinky.activexOutlook.Outlook.Explorer = js.native
  /* CompleteClass */
  override val Panes: typingsSlinky.activexOutlook.Outlook.Panes = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Selection: typingsSlinky.activexOutlook.Outlook.Selection = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var Top: Double = js.native
  /* CompleteClass */
  override val Views: js.Any = js.native
  /* CompleteClass */
  override var Width: Double = js.native
  /* CompleteClass */
  override var WindowState: OlWindowState = js.native
  /* CompleteClass */
  override def Activate(): Unit = js.native
  /* CompleteClass */
  override def AddToSelection(Item: js.Any): Unit = js.native
  /* CompleteClass */
  override def ClearSearch(): Unit = js.native
  /* CompleteClass */
  override def ClearSelection(): Unit = js.native
  /* CompleteClass */
  override def Close(): Unit = js.native
  /* CompleteClass */
  override def DeselectFolder(Folder: typingsSlinky.activexOutlook.Outlook.Folder): Unit = js.native
  /* CompleteClass */
  override def Display(): Unit = js.native
  /* CompleteClass */
  override def IsFolderSelected(Folder: typingsSlinky.activexOutlook.Outlook.Folder): Boolean = js.native
  /* CompleteClass */
  override def IsItemSelectableInView(Item: js.Any): Boolean = js.native
  /* CompleteClass */
  override def IsPaneVisible(Pane: OlPane): Boolean = js.native
  /* CompleteClass */
  override def RemoveFromSelection(Item: js.Any): Unit = js.native
  /* CompleteClass */
  override def Search(Query: String, SearchScope: OlSearchScope): Unit = js.native
  /* CompleteClass */
  override def SelectAllItems(): Unit = js.native
  /* CompleteClass */
  override def SelectFolder(Folder: typingsSlinky.activexOutlook.Outlook.Folder): Unit = js.native
  /* CompleteClass */
  override def ShowPane(Pane: OlPane, Visible: Boolean): Unit = js.native
}

