package typingsSlinky.activexDashOutlook

import typingsSlinky.activexDashOutlook.Outlook.AccountSelector
import typingsSlinky.activexDashOutlook.Outlook.Accounts
import typingsSlinky.activexDashOutlook.Outlook.Application
import typingsSlinky.activexDashOutlook.Outlook.AppointmentItem
import typingsSlinky.activexDashOutlook.Outlook.ContactItem
import typingsSlinky.activexDashOutlook.Outlook.DistListItem
import typingsSlinky.activexDashOutlook.Outlook.DocumentItem
import typingsSlinky.activexDashOutlook.Outlook.Explorer
import typingsSlinky.activexDashOutlook.Outlook.Explorers
import typingsSlinky.activexDashOutlook.Outlook.Folders
import typingsSlinky.activexDashOutlook.Outlook.FormRegion
import typingsSlinky.activexDashOutlook.Outlook.Inspector
import typingsSlinky.activexDashOutlook.Outlook.Inspectors
import typingsSlinky.activexDashOutlook.Outlook.Items
import typingsSlinky.activexDashOutlook.Outlook.JournalItem
import typingsSlinky.activexDashOutlook.Outlook.MailItem
import typingsSlinky.activexDashOutlook.Outlook.MeetingItem
import typingsSlinky.activexDashOutlook.Outlook.MobileItem
import typingsSlinky.activexDashOutlook.Outlook.NameSpace
import typingsSlinky.activexDashOutlook.Outlook.NavigationGroups
import typingsSlinky.activexDashOutlook.Outlook.NavigationPane
import typingsSlinky.activexDashOutlook.Outlook.OlkBusinessCardControl
import typingsSlinky.activexDashOutlook.Outlook.OlkCategory
import typingsSlinky.activexDashOutlook.Outlook.OlkCheckBox
import typingsSlinky.activexDashOutlook.Outlook.OlkComboBox
import typingsSlinky.activexDashOutlook.Outlook.OlkCommandButton
import typingsSlinky.activexDashOutlook.Outlook.OlkContactPhoto
import typingsSlinky.activexDashOutlook.Outlook.OlkDateControl
import typingsSlinky.activexDashOutlook.Outlook.OlkInfoBar
import typingsSlinky.activexDashOutlook.Outlook.OlkLabel
import typingsSlinky.activexDashOutlook.Outlook.OlkListBox
import typingsSlinky.activexDashOutlook.Outlook.OlkOptionButton
import typingsSlinky.activexDashOutlook.Outlook.OlkSenderPhoto
import typingsSlinky.activexDashOutlook.Outlook.OlkTextBox
import typingsSlinky.activexDashOutlook.Outlook.OlkTimeControl
import typingsSlinky.activexDashOutlook.Outlook.OlkTimeZoneControl
import typingsSlinky.activexDashOutlook.Outlook.OutlookBarGroups
import typingsSlinky.activexDashOutlook.Outlook.OutlookBarPane
import typingsSlinky.activexDashOutlook.Outlook.OutlookBarShortcuts
import typingsSlinky.activexDashOutlook.Outlook.PostItem
import typingsSlinky.activexDashOutlook.Outlook.Reminders
import typingsSlinky.activexDashOutlook.Outlook.RemoteItem
import typingsSlinky.activexDashOutlook.Outlook.ReportItem
import typingsSlinky.activexDashOutlook.Outlook.Results
import typingsSlinky.activexDashOutlook.Outlook.SharingItem
import typingsSlinky.activexDashOutlook.Outlook.Stores
import typingsSlinky.activexDashOutlook.Outlook.SyncObject
import typingsSlinky.activexDashOutlook.Outlook.TaskItem
import typingsSlinky.activexDashOutlook.Outlook.TaskRequestAcceptItem
import typingsSlinky.activexDashOutlook.Outlook.TaskRequestDeclineItem
import typingsSlinky.activexDashOutlook.Outlook.TaskRequestItem
import typingsSlinky.activexDashOutlook.Outlook.TaskRequestUpdateItem
import typingsSlinky.activexDashOutlook.Outlook.Views
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Account
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Action
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Activate
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ActivePageName
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.AdvancedSearchComplete
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.AdvancedSearchStopped
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.AfterUpdate
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.AfterWrite
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Attachment
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.AttachmentAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.AttachmentContextMenuDisplay
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.AttachmentRead
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.AttachmentRemove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.AttachmentSelectionChange
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Attachments
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.AutoDiscoverComplete
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeAttachmentAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeAttachmentPreview
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeAttachmentRead
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeAttachmentSave
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeAttachmentWriteToTempFile
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeAutoSave
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeCheckNames
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeDelete
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeFolderMove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeFolderSharingDialog
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeFolderSwitch
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeGroupAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeGroupRemove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeGroupSwitch
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeItemCopy
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeItemCut
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeItemMove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeItemPaste
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeMaximize
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeMinimize
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeMove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeNavigate
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeRead
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeReminderShow
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeShortcutAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeShortcutRemove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeSize
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeStoreRemove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeUpdate
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.BeforeViewSwitch
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Button
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Cancel
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Change
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Click
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ClipboardContent
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Close
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Code
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.CommandBar
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ContextMenu
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ContextMenuClose
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.CurrentModule
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.CustomAction
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.CustomPropertyChange
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Deactivate
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Description
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.DoubleClick
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.DropButtonClick
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Enter
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.EntryIDCollection
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Exit
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Expand
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Expanded
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Folder
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.FolderAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.FolderChange
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.FolderContextMenuDisplay
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.FolderRemove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.FolderSwitch
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.FolderToShare
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Forward
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Group
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.GroupAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Item
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ItemAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ItemChange
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ItemContextMenuDisplay
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ItemLoad
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ItemRemove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ItemSend
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.KeyAscii
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.KeyCode
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.KeyDown
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.KeyPress
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.KeyUp
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.MAPILogonComplete
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Max
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ModuleSwitch
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.MouseDown
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.MouseMove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.MouseUp
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.MoveTo
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Name
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NavigationFolder
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NavigationFolderAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NavigationFolderRemove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NewExplorer
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NewFolder
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NewGroup
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NewInspector
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NewMail
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NewMailEx
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NewShortcut
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.NewView
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.OnError
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Open
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.OptionsPagesAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.PageChange
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Pages
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Progress
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.PropertyChange
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Quit
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Read
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Reminder
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ReminderAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ReminderChange
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ReminderFire
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ReminderObject
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ReminderRemove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Reply
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ReplyAll
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Response
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.SearchObject
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.SelectedAccount
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.SelectedAccountChange
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.SelectedChange
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Selection
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.SelectionChange
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Send
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Shift
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Shortcut
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ShortcutAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ShortcutContextMenuDisplay
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Snooze
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Startup
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.State
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Store
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.StoreAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.StoreContextMenuDisplay
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.SyncEnd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.SyncStart
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Target
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ToGroup
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Unload
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Value
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.View
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ViewAdd
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ViewContextMenuDisplay
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ViewRemove
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.ViewSwitch
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Write
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.X
import typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: AccountSelector,
    event: SelectedAccountChange,
    argNames: js.Array[SelectedAccount],
    handler: js.ThisFunction1[/* this */ AccountSelector, /* parameter */ Anon_SelectedAccount, Unit]
  ): Unit = js.native
  def on(
    obj: Accounts,
    event: AutoDiscoverComplete,
    argNames: js.Array[Account],
    handler: js.ThisFunction1[/* this */ Accounts, /* parameter */ Anon_Account, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AdvancedSearchComplete,
    argNames: js.Array[SearchObject],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_SearchObject, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AdvancedSearchStopped,
    argNames: js.Array[SearchObject],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_SearchObject, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AttachmentContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Attachments],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Attachments, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: BeforeFolderSharingDialog,
    argNames: js.Tuple2[FolderToShare, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ContextMenuClose,
    argNames: js.Array[ContextMenu],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ContextMenu, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: FolderContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Folder],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CommandBar, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Selection],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CommandBarSelection, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemLoad,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Item, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemSend,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewMailEx,
    argNames: js.Array[EntryIDCollection],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_EntryIDCollection, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: OptionsPagesAdd,
    argNames: js.Array[Pages],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pages, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: Reminder,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Item, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ShortcutContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Shortcut],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CommandBarShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: StoreContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Store],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CommandBarStore, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ViewContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, View],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CommandBarView, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeFolderSwitch,
    argNames: js.Tuple2[NewFolder, Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ Anon_CancelNewFolder, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemCopy,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemCut,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemPaste,
    argNames: js.Tuple3[ClipboardContent, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ Anon_CancelClipboardContent, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeMaximize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeMinimize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeMove,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeSize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeViewSwitch,
    argNames: js.Tuple2[NewView, Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ Anon_CancelNewView, Unit]
  ): Unit = js.native
  def on(
    obj: Explorers,
    event: NewExplorer,
    argNames: js.Array[typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Explorer],
    handler: js.ThisFunction1[/* this */ Explorers, /* parameter */ Anon_Explorer, Unit]
  ): Unit = js.native
  def on(
    obj: typingsSlinky.activexDashOutlook.Outlook.Folder,
    event: BeforeFolderMove,
    argNames: js.Tuple2[MoveTo, Cancel],
    handler: js.ThisFunction1[
      /* this */ typingsSlinky.activexDashOutlook.Outlook.Folder, 
      /* parameter */ Anon_CancelMoveTo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsSlinky.activexDashOutlook.Outlook.Folder,
    event: BeforeItemMove,
    argNames: js.Tuple3[Item, MoveTo, Cancel],
    handler: js.ThisFunction1[
      /* this */ typingsSlinky.activexDashOutlook.Outlook.Folder, 
      /* parameter */ Anon_CancelItemMoveTo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Folders,
    event: FolderAdd,
    argNames: js.Array[Folder],
    handler: js.ThisFunction1[/* this */ Folders, /* parameter */ Anon_Folder, Unit]
  ): Unit = js.native
  def on(
    obj: Folders,
    event: FolderChange,
    argNames: js.Array[Folder],
    handler: js.ThisFunction1[/* this */ Folders, /* parameter */ Anon_Folder, Unit]
  ): Unit = js.native
  def on(
    obj: FormRegion,
    event: Expanded,
    argNames: js.Array[Expand],
    handler: js.ThisFunction1[/* this */ FormRegion, /* parameter */ Anon_Expand, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeMaximize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeMinimize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeMove,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeSize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: PageChange,
    argNames: js.Array[ActivePageName],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ Anon_ActivePageName, Unit]
  ): Unit = js.native
  def on(
    obj: Inspectors,
    event: NewInspector,
    argNames: js.Array[typingsSlinky.activexDashOutlook.activexDashOutlookStrings.Inspector],
    handler: js.ThisFunction1[/* this */ Inspectors, /* parameter */ Anon_Inspector, Unit]
  ): Unit = js.native
  def on(
    obj: Items,
    event: ItemAdd,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Items, /* parameter */ Anon_Item, Unit]
  ): Unit = js.native
  def on(
    obj: Items,
    event: ItemChange,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Items, /* parameter */ Anon_Item, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: NameSpace,
    event: OptionsPagesAdd,
    argNames: js.Tuple2[Pages, Folder],
    handler: js.ThisFunction1[/* this */ NameSpace, /* parameter */ Anon_FolderPages, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationGroups,
    event: NavigationFolderAdd,
    argNames: js.Array[NavigationFolder],
    handler: js.ThisFunction1[/* this */ NavigationGroups, /* parameter */ Anon_NavigationFolder, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationGroups,
    event: SelectedChange,
    argNames: js.Array[NavigationFolder],
    handler: js.ThisFunction1[/* this */ NavigationGroups, /* parameter */ Anon_NavigationFolder, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationPane,
    event: ModuleSwitch,
    argNames: js.Array[CurrentModule],
    handler: js.ThisFunction1[/* this */ NavigationPane, /* parameter */ Anon_CurrentModule, Unit]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ Anon_CancelBooleanReadOnly, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ Anon_KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ Anon_KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: BeforeGroupAdd,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarGroups, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: BeforeGroupRemove,
    argNames: js.Tuple2[Group, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarGroups, /* parameter */ Anon_CancelGroup, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: GroupAdd,
    argNames: js.Array[NewGroup],
    handler: js.ThisFunction1[/* this */ OutlookBarGroups, /* parameter */ Anon_NewGroup, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarPane,
    event: BeforeGroupSwitch,
    argNames: js.Tuple2[ToGroup, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarPane, /* parameter */ Anon_CancelToGroup, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarPane,
    event: BeforeNavigate,
    argNames: js.Tuple2[Shortcut, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarPane, /* parameter */ Anon_CancelShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: BeforeShortcutAdd,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarShortcuts, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: BeforeShortcutRemove,
    argNames: js.Tuple2[Shortcut, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarShortcuts, /* parameter */ Anon_CancelShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: ShortcutAdd,
    argNames: js.Array[NewShortcut],
    handler: js.ThisFunction1[/* this */ OutlookBarShortcuts, /* parameter */ Anon_NewShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: BeforeReminderShow,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: ReminderAdd,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ Anon_ReminderObject, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: ReminderChange,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ Anon_ReminderObject, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: ReminderFire,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ Anon_ReminderObject, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: Snooze,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ Anon_ReminderObject, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Results,
    event: ItemAdd,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Results, /* parameter */ Anon_Item, Unit]
  ): Unit = js.native
  def on(
    obj: Results,
    event: ItemChange,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Results, /* parameter */ Anon_Item, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Stores,
    event: BeforeStoreRemove,
    argNames: js.Tuple2[Store, Cancel],
    handler: js.ThisFunction1[/* this */ Stores, /* parameter */ Anon_CancelStore, Unit]
  ): Unit = js.native
  def on(
    obj: Stores,
    event: StoreAdd,
    argNames: js.Array[Store],
    handler: js.ThisFunction1[/* this */ Stores, /* parameter */ Anon_Store, Unit]
  ): Unit = js.native
  def on(
    obj: SyncObject,
    event: OnError,
    argNames: js.Tuple2[Code, Description],
    handler: js.ThisFunction1[/* this */ SyncObject, /* parameter */ Anon_Code, Unit]
  ): Unit = js.native
  def on(
    obj: SyncObject,
    event: Progress,
    argNames: js.Tuple4[State, Description, Value, Max],
    handler: js.ThisFunction1[/* this */ SyncObject, /* parameter */ Anon_Description, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_Attachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_Action, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_CancelForward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_CancelResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Views,
    event: ViewAdd,
    argNames: js.Array[View],
    handler: js.ThisFunction1[/* this */ Views, /* parameter */ Anon_View, Unit]
  ): Unit = js.native
  def on(
    obj: Views,
    event: ViewRemove,
    argNames: js.Array[View],
    handler: js.ThisFunction1[/* this */ Views, /* parameter */ Anon_View, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Explorer,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Inspector,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkCheckBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkComboBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkCommandButton,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkDateControl,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkListBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkOptionButton,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkTextBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkTimeControl,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkTimeZoneControl,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: AppointmentItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: ContactItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: DistListItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: DocumentItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: JournalItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: MailItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: MeetingItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: MobileItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: PostItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: RemoteItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: ReportItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: SharingItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: TaskItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: TaskRequestAcceptItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: TaskRequestDeclineItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: TaskRequestItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: TaskRequestUpdateItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AttachmentSelectionChange(
    obj: Explorer,
    event: AttachmentSelectionChange,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AttachmentSelectionChange(
    obj: Inspector,
    event: AttachmentSelectionChange,
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AutoDiscoverComplete(
    obj: NameSpace,
    event: AutoDiscoverComplete,
    handler: js.ThisFunction1[/* this */ NameSpace, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: AppointmentItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: ContactItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: DistListItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: DocumentItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: JournalItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: MailItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: MeetingItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: MobileItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: PostItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: RemoteItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: ReportItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: SharingItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: TaskItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: TaskRequestAcceptItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: TaskRequestDeclineItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: TaskRequestItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: TaskRequestUpdateItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkCategory,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkCheckBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkComboBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkContactPhoto,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkDateControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkListBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkOptionButton,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkSenderPhoto,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkTextBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkTimeControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkTimeZoneControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkBusinessCardControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkCategory,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkCheckBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkComboBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkCommandButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkContactPhoto,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkDateControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkInfoBar,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkLabel,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkListBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkOptionButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkSenderPhoto,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkTextBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkTimeControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkTimeZoneControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Close(
    obj: Explorer,
    event: Close,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Close(
    obj: FormRegion,
    event: Close,
    handler: js.ThisFunction1[/* this */ FormRegion, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Close(
    obj: Inspector,
    event: Close,
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Explorer,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Inspector,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkBusinessCardControl,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkCategory,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkCheckBox,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkComboBox,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkCommandButton,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkContactPhoto,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkDateControl,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkInfoBar,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkLabel,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkListBox,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkOptionButton,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkSenderPhoto,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkTextBox,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkTimeControl,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkTimeZoneControl,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: OlkComboBox,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: OlkDateControl,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: OlkTimeControl,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: OlkTimeZoneControl,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkCategory,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkCheckBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkComboBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkCommandButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkContactPhoto,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkDateControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkListBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkOptionButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkTextBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkTimeControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkTimeZoneControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FolderRemove(
    obj: Folders,
    event: FolderRemove,
    handler: js.ThisFunction1[/* this */ Folders, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FolderSwitch(
    obj: Explorer,
    event: FolderSwitch,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ItemRemove(
    obj: Items,
    event: ItemRemove,
    handler: js.ThisFunction1[/* this */ Items, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ItemRemove(
    obj: Results,
    event: ItemRemove,
    handler: js.ThisFunction1[/* this */ Results, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_MAPILogonComplete(
    obj: Application,
    event: MAPILogonComplete,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_NavigationFolderRemove(
    obj: NavigationGroups,
    event: NavigationFolderRemove,
    handler: js.ThisFunction1[/* this */ NavigationGroups, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_NewMail(
    obj: Application,
    event: NewMail,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Quit(
    obj: Application,
    event: Quit,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: AppointmentItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: ContactItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: DistListItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: DocumentItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: JournalItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: MailItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: MeetingItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: MobileItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: PostItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: RemoteItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: ReportItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: SharingItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: TaskItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: TaskRequestAcceptItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: TaskRequestDeclineItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: TaskRequestItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: TaskRequestUpdateItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ReminderRemove(
    obj: Reminders,
    event: ReminderRemove,
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SelectionChange(
    obj: Explorer,
    event: SelectionChange,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Startup(
    obj: Application,
    event: Startup,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SyncEnd(
    obj: SyncObject,
    event: SyncEnd,
    handler: js.ThisFunction1[/* this */ SyncObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SyncStart(
    obj: SyncObject,
    event: SyncStart,
    handler: js.ThisFunction1[/* this */ SyncObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: AppointmentItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: ContactItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: DistListItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: DocumentItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: JournalItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: MailItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: MeetingItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: MobileItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: PostItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: RemoteItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: ReportItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: SharingItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: TaskItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: TaskRequestAcceptItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: TaskRequestDeclineItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: TaskRequestItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: TaskRequestUpdateItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ViewSwitch(
    obj: Explorer,
    event: ViewSwitch,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

