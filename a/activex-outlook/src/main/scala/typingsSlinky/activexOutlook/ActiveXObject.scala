package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.AccountSelector
import typingsSlinky.activexOutlook.Outlook.Accounts
import typingsSlinky.activexOutlook.Outlook.Application
import typingsSlinky.activexOutlook.Outlook.AppointmentItem
import typingsSlinky.activexOutlook.Outlook.ContactItem
import typingsSlinky.activexOutlook.Outlook.DistListItem
import typingsSlinky.activexOutlook.Outlook.DocumentItem
import typingsSlinky.activexOutlook.Outlook.Explorer
import typingsSlinky.activexOutlook.Outlook.Explorers
import typingsSlinky.activexOutlook.Outlook.Folders
import typingsSlinky.activexOutlook.Outlook.FormRegion
import typingsSlinky.activexOutlook.Outlook.Inspector
import typingsSlinky.activexOutlook.Outlook.Inspectors
import typingsSlinky.activexOutlook.Outlook.Items
import typingsSlinky.activexOutlook.Outlook.JournalItem
import typingsSlinky.activexOutlook.Outlook.MailItem
import typingsSlinky.activexOutlook.Outlook.MeetingItem
import typingsSlinky.activexOutlook.Outlook.MobileItem
import typingsSlinky.activexOutlook.Outlook.NameSpace
import typingsSlinky.activexOutlook.Outlook.NavigationGroups
import typingsSlinky.activexOutlook.Outlook.NavigationPane
import typingsSlinky.activexOutlook.Outlook.OlkBusinessCardControl
import typingsSlinky.activexOutlook.Outlook.OlkCategory
import typingsSlinky.activexOutlook.Outlook.OlkCheckBox
import typingsSlinky.activexOutlook.Outlook.OlkComboBox
import typingsSlinky.activexOutlook.Outlook.OlkCommandButton
import typingsSlinky.activexOutlook.Outlook.OlkContactPhoto
import typingsSlinky.activexOutlook.Outlook.OlkDateControl
import typingsSlinky.activexOutlook.Outlook.OlkInfoBar
import typingsSlinky.activexOutlook.Outlook.OlkLabel
import typingsSlinky.activexOutlook.Outlook.OlkListBox
import typingsSlinky.activexOutlook.Outlook.OlkOptionButton
import typingsSlinky.activexOutlook.Outlook.OlkSenderPhoto
import typingsSlinky.activexOutlook.Outlook.OlkTextBox
import typingsSlinky.activexOutlook.Outlook.OlkTimeControl
import typingsSlinky.activexOutlook.Outlook.OlkTimeZoneControl
import typingsSlinky.activexOutlook.Outlook.OutlookBarGroups
import typingsSlinky.activexOutlook.Outlook.OutlookBarPane
import typingsSlinky.activexOutlook.Outlook.OutlookBarShortcuts
import typingsSlinky.activexOutlook.Outlook.PostItem
import typingsSlinky.activexOutlook.Outlook.Reminders
import typingsSlinky.activexOutlook.Outlook.RemoteItem
import typingsSlinky.activexOutlook.Outlook.ReportItem
import typingsSlinky.activexOutlook.Outlook.Results
import typingsSlinky.activexOutlook.Outlook.SharingItem
import typingsSlinky.activexOutlook.Outlook.Stores
import typingsSlinky.activexOutlook.Outlook.SyncObject
import typingsSlinky.activexOutlook.Outlook.TaskItem
import typingsSlinky.activexOutlook.Outlook.TaskRequestAcceptItem
import typingsSlinky.activexOutlook.Outlook.TaskRequestDeclineItem
import typingsSlinky.activexOutlook.Outlook.TaskRequestItem
import typingsSlinky.activexOutlook.Outlook.TaskRequestUpdateItem
import typingsSlinky.activexOutlook.Outlook.Views
import typingsSlinky.activexOutlook.activexOutlookStrings.Account
import typingsSlinky.activexOutlook.activexOutlookStrings.Action
import typingsSlinky.activexOutlook.activexOutlookStrings.Activate
import typingsSlinky.activexOutlook.activexOutlookStrings.ActivePageName
import typingsSlinky.activexOutlook.activexOutlookStrings.AdvancedSearchComplete
import typingsSlinky.activexOutlook.activexOutlookStrings.AdvancedSearchStopped
import typingsSlinky.activexOutlook.activexOutlookStrings.AfterUpdate
import typingsSlinky.activexOutlook.activexOutlookStrings.AfterWrite
import typingsSlinky.activexOutlook.activexOutlookStrings.Attachment
import typingsSlinky.activexOutlook.activexOutlookStrings.AttachmentAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.AttachmentContextMenuDisplay
import typingsSlinky.activexOutlook.activexOutlookStrings.AttachmentRead
import typingsSlinky.activexOutlook.activexOutlookStrings.AttachmentRemove
import typingsSlinky.activexOutlook.activexOutlookStrings.AttachmentSelectionChange
import typingsSlinky.activexOutlook.activexOutlookStrings.Attachments
import typingsSlinky.activexOutlook.activexOutlookStrings.AutoDiscoverComplete
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeAttachmentAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeAttachmentPreview
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeAttachmentRead
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeAttachmentSave
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeAttachmentWriteToTempFile
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeAutoSave
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeCheckNames
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeDelete
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeFolderMove
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeFolderSharingDialog
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeFolderSwitch
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeGroupAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeGroupRemove
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeGroupSwitch
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeItemCopy
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeItemCut
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeItemMove
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeItemPaste
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeMaximize
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeMinimize
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeMove
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeNavigate
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeRead
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeReminderShow
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeShortcutAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeShortcutRemove
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeSize
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeStoreRemove
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeUpdate
import typingsSlinky.activexOutlook.activexOutlookStrings.BeforeViewSwitch
import typingsSlinky.activexOutlook.activexOutlookStrings.Button
import typingsSlinky.activexOutlook.activexOutlookStrings.Cancel
import typingsSlinky.activexOutlook.activexOutlookStrings.Change
import typingsSlinky.activexOutlook.activexOutlookStrings.Click
import typingsSlinky.activexOutlook.activexOutlookStrings.ClipboardContent
import typingsSlinky.activexOutlook.activexOutlookStrings.Close
import typingsSlinky.activexOutlook.activexOutlookStrings.Code
import typingsSlinky.activexOutlook.activexOutlookStrings.CommandBar
import typingsSlinky.activexOutlook.activexOutlookStrings.ContextMenu
import typingsSlinky.activexOutlook.activexOutlookStrings.ContextMenuClose
import typingsSlinky.activexOutlook.activexOutlookStrings.CurrentModule
import typingsSlinky.activexOutlook.activexOutlookStrings.CustomAction
import typingsSlinky.activexOutlook.activexOutlookStrings.CustomPropertyChange
import typingsSlinky.activexOutlook.activexOutlookStrings.Deactivate
import typingsSlinky.activexOutlook.activexOutlookStrings.Description
import typingsSlinky.activexOutlook.activexOutlookStrings.DoubleClick
import typingsSlinky.activexOutlook.activexOutlookStrings.DropButtonClick
import typingsSlinky.activexOutlook.activexOutlookStrings.Enter
import typingsSlinky.activexOutlook.activexOutlookStrings.EntryIDCollection
import typingsSlinky.activexOutlook.activexOutlookStrings.Exit
import typingsSlinky.activexOutlook.activexOutlookStrings.Expand
import typingsSlinky.activexOutlook.activexOutlookStrings.Expanded
import typingsSlinky.activexOutlook.activexOutlookStrings.Folder
import typingsSlinky.activexOutlook.activexOutlookStrings.FolderAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.FolderChange
import typingsSlinky.activexOutlook.activexOutlookStrings.FolderContextMenuDisplay
import typingsSlinky.activexOutlook.activexOutlookStrings.FolderRemove
import typingsSlinky.activexOutlook.activexOutlookStrings.FolderSwitch
import typingsSlinky.activexOutlook.activexOutlookStrings.FolderToShare
import typingsSlinky.activexOutlook.activexOutlookStrings.Forward
import typingsSlinky.activexOutlook.activexOutlookStrings.Group
import typingsSlinky.activexOutlook.activexOutlookStrings.GroupAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.Item
import typingsSlinky.activexOutlook.activexOutlookStrings.ItemAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.ItemChange
import typingsSlinky.activexOutlook.activexOutlookStrings.ItemContextMenuDisplay
import typingsSlinky.activexOutlook.activexOutlookStrings.ItemLoad
import typingsSlinky.activexOutlook.activexOutlookStrings.ItemRemove
import typingsSlinky.activexOutlook.activexOutlookStrings.ItemSend
import typingsSlinky.activexOutlook.activexOutlookStrings.KeyAscii
import typingsSlinky.activexOutlook.activexOutlookStrings.KeyCode
import typingsSlinky.activexOutlook.activexOutlookStrings.KeyDown
import typingsSlinky.activexOutlook.activexOutlookStrings.KeyPress
import typingsSlinky.activexOutlook.activexOutlookStrings.KeyUp
import typingsSlinky.activexOutlook.activexOutlookStrings.MAPILogonComplete
import typingsSlinky.activexOutlook.activexOutlookStrings.Max
import typingsSlinky.activexOutlook.activexOutlookStrings.ModuleSwitch
import typingsSlinky.activexOutlook.activexOutlookStrings.MouseDown
import typingsSlinky.activexOutlook.activexOutlookStrings.MouseMove
import typingsSlinky.activexOutlook.activexOutlookStrings.MouseUp
import typingsSlinky.activexOutlook.activexOutlookStrings.MoveTo
import typingsSlinky.activexOutlook.activexOutlookStrings.Name
import typingsSlinky.activexOutlook.activexOutlookStrings.NavigationFolder
import typingsSlinky.activexOutlook.activexOutlookStrings.NavigationFolderAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.NavigationFolderRemove
import typingsSlinky.activexOutlook.activexOutlookStrings.NewExplorer
import typingsSlinky.activexOutlook.activexOutlookStrings.NewFolder
import typingsSlinky.activexOutlook.activexOutlookStrings.NewGroup
import typingsSlinky.activexOutlook.activexOutlookStrings.NewInspector
import typingsSlinky.activexOutlook.activexOutlookStrings.NewMail
import typingsSlinky.activexOutlook.activexOutlookStrings.NewMailEx
import typingsSlinky.activexOutlook.activexOutlookStrings.NewShortcut
import typingsSlinky.activexOutlook.activexOutlookStrings.NewView
import typingsSlinky.activexOutlook.activexOutlookStrings.OnError
import typingsSlinky.activexOutlook.activexOutlookStrings.Open
import typingsSlinky.activexOutlook.activexOutlookStrings.OptionsPagesAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.PageChange
import typingsSlinky.activexOutlook.activexOutlookStrings.Pages
import typingsSlinky.activexOutlook.activexOutlookStrings.Progress
import typingsSlinky.activexOutlook.activexOutlookStrings.PropertyChange
import typingsSlinky.activexOutlook.activexOutlookStrings.Quit
import typingsSlinky.activexOutlook.activexOutlookStrings.Read
import typingsSlinky.activexOutlook.activexOutlookStrings.Reminder
import typingsSlinky.activexOutlook.activexOutlookStrings.ReminderAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.ReminderChange
import typingsSlinky.activexOutlook.activexOutlookStrings.ReminderFire
import typingsSlinky.activexOutlook.activexOutlookStrings.ReminderObject
import typingsSlinky.activexOutlook.activexOutlookStrings.ReminderRemove
import typingsSlinky.activexOutlook.activexOutlookStrings.Reply
import typingsSlinky.activexOutlook.activexOutlookStrings.ReplyAll
import typingsSlinky.activexOutlook.activexOutlookStrings.Response
import typingsSlinky.activexOutlook.activexOutlookStrings.SearchObject
import typingsSlinky.activexOutlook.activexOutlookStrings.SelectedAccount
import typingsSlinky.activexOutlook.activexOutlookStrings.SelectedAccountChange
import typingsSlinky.activexOutlook.activexOutlookStrings.SelectedChange
import typingsSlinky.activexOutlook.activexOutlookStrings.Selection
import typingsSlinky.activexOutlook.activexOutlookStrings.SelectionChange
import typingsSlinky.activexOutlook.activexOutlookStrings.Send
import typingsSlinky.activexOutlook.activexOutlookStrings.Shift
import typingsSlinky.activexOutlook.activexOutlookStrings.Shortcut
import typingsSlinky.activexOutlook.activexOutlookStrings.ShortcutAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.ShortcutContextMenuDisplay
import typingsSlinky.activexOutlook.activexOutlookStrings.Snooze
import typingsSlinky.activexOutlook.activexOutlookStrings.Startup
import typingsSlinky.activexOutlook.activexOutlookStrings.State
import typingsSlinky.activexOutlook.activexOutlookStrings.Store
import typingsSlinky.activexOutlook.activexOutlookStrings.StoreAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.StoreContextMenuDisplay
import typingsSlinky.activexOutlook.activexOutlookStrings.SyncEnd
import typingsSlinky.activexOutlook.activexOutlookStrings.SyncStart
import typingsSlinky.activexOutlook.activexOutlookStrings.Target
import typingsSlinky.activexOutlook.activexOutlookStrings.ToGroup
import typingsSlinky.activexOutlook.activexOutlookStrings.Unload
import typingsSlinky.activexOutlook.activexOutlookStrings.Value
import typingsSlinky.activexOutlook.activexOutlookStrings.View
import typingsSlinky.activexOutlook.activexOutlookStrings.ViewAdd
import typingsSlinky.activexOutlook.activexOutlookStrings.ViewContextMenuDisplay
import typingsSlinky.activexOutlook.activexOutlookStrings.ViewRemove
import typingsSlinky.activexOutlook.activexOutlookStrings.ViewSwitch
import typingsSlinky.activexOutlook.activexOutlookStrings.Write
import typingsSlinky.activexOutlook.activexOutlookStrings.X
import typingsSlinky.activexOutlook.activexOutlookStrings.Y
import typingsSlinky.activexOutlook.anon.AttachmentCancel
import typingsSlinky.activexOutlook.anon.CancelBoolean
import typingsSlinky.activexOutlook.anon.CancelItem
import typingsSlinky.activexOutlook.anon.CancelShortcut
import typingsSlinky.activexOutlook.anon.CancelStore
import typingsSlinky.activexOutlook.anon.FolderPages
import typingsSlinky.activexOutlook.anon.ItemMoveTo
import typingsSlinky.activexOutlook.anon.StoreStore
import typingsSlinky.activexOutlook.anon.ViewView
import typingsSlinky.activexOutlook.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: AccountSelector,
    event: SelectedAccountChange,
    argNames: js.Array[SelectedAccount],
    handler: js.ThisFunction1[
      /* this */ AccountSelector, 
      /* parameter */ typingsSlinky.activexOutlook.anon.SelectedAccount, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Accounts,
    event: AutoDiscoverComplete,
    argNames: js.Array[Account],
    handler: js.ThisFunction1[/* this */ Accounts, /* parameter */ typingsSlinky.activexOutlook.anon.Account, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AdvancedSearchComplete,
    argNames: js.Array[SearchObject],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.SearchObject, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AdvancedSearchStopped,
    argNames: js.Array[SearchObject],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.SearchObject, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AttachmentContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Attachments],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachments, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: BeforeFolderSharingDialog,
    argNames: js.Tuple2[FolderToShare, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ContextMenuClose,
    argNames: js.Array[ContextMenu],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.ContextMenu, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: FolderContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Folder],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.CommandBar, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Selection],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Selection, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemLoad,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexOutlook.anon.Item, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemSend,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewMailEx,
    argNames: js.Array[EntryIDCollection],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.EntryIDCollection, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: OptionsPagesAdd,
    argNames: js.Array[Pages],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Pages, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: Reminder,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexOutlook.anon.Item, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ShortcutContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Shortcut],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Shortcut, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: StoreContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Store],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Store, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ViewContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, View],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexOutlook.anon.View, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeFolderSwitch,
    argNames: js.Tuple2[NewFolder, Cancel],
    handler: js.ThisFunction1[
      /* this */ Explorer, 
      /* parameter */ typingsSlinky.activexOutlook.anon.NewFolder, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemCopy,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemCut,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemPaste,
    argNames: js.Tuple3[ClipboardContent, Target, Cancel],
    handler: js.ThisFunction1[
      /* this */ Explorer, 
      /* parameter */ typingsSlinky.activexOutlook.anon.ClipboardContent, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeMaximize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeMinimize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeMove,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeSize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeViewSwitch,
    argNames: js.Tuple2[NewView, Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ typingsSlinky.activexOutlook.anon.NewView, Unit]
  ): Unit = js.native
  def on(
    obj: Explorers,
    event: NewExplorer,
    argNames: js.Array[typingsSlinky.activexOutlook.activexOutlookStrings.Explorer],
    handler: js.ThisFunction1[
      /* this */ Explorers, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Explorer, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsSlinky.activexOutlook.Outlook.Folder,
    event: BeforeFolderMove,
    argNames: js.Tuple2[MoveTo, Cancel],
    handler: js.ThisFunction1[
      /* this */ typingsSlinky.activexOutlook.Outlook.Folder, 
      /* parameter */ typingsSlinky.activexOutlook.anon.MoveTo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsSlinky.activexOutlook.Outlook.Folder,
    event: BeforeItemMove,
    argNames: js.Tuple3[Item, MoveTo, Cancel],
    handler: js.ThisFunction1[
      /* this */ typingsSlinky.activexOutlook.Outlook.Folder, 
      /* parameter */ ItemMoveTo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Folders,
    event: FolderAdd,
    argNames: js.Array[Folder],
    handler: js.ThisFunction1[/* this */ Folders, /* parameter */ typingsSlinky.activexOutlook.anon.Folder, Unit]
  ): Unit = js.native
  def on(
    obj: Folders,
    event: FolderChange,
    argNames: js.Array[Folder],
    handler: js.ThisFunction1[/* this */ Folders, /* parameter */ typingsSlinky.activexOutlook.anon.Folder, Unit]
  ): Unit = js.native
  def on(
    obj: FormRegion,
    event: Expanded,
    argNames: js.Array[Expand],
    handler: js.ThisFunction1[
      /* this */ FormRegion, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Expand, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeMaximize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeMinimize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeMove,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeSize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: PageChange,
    argNames: js.Array[ActivePageName],
    handler: js.ThisFunction1[
      /* this */ Inspector, 
      /* parameter */ typingsSlinky.activexOutlook.anon.ActivePageName, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Inspectors,
    event: NewInspector,
    argNames: js.Array[typingsSlinky.activexOutlook.activexOutlookStrings.Inspector],
    handler: js.ThisFunction1[
      /* this */ Inspectors, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Inspector, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Items,
    event: ItemAdd,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Items, /* parameter */ typingsSlinky.activexOutlook.anon.Item, Unit]
  ): Unit = js.native
  def on(
    obj: Items,
    event: ItemChange,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Items, /* parameter */ typingsSlinky.activexOutlook.anon.Item, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ MailItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ MailItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ MailItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ typingsSlinky.activexOutlook.anon.Action, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ typingsSlinky.activexOutlook.anon.Forward, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MailItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MailItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: NameSpace,
    event: OptionsPagesAdd,
    argNames: js.Tuple2[Pages, Folder],
    handler: js.ThisFunction1[/* this */ NameSpace, /* parameter */ FolderPages, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationGroups,
    event: NavigationFolderAdd,
    argNames: js.Array[NavigationFolder],
    handler: js.ThisFunction1[
      /* this */ NavigationGroups, 
      /* parameter */ typingsSlinky.activexOutlook.anon.NavigationFolder, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationGroups,
    event: SelectedChange,
    argNames: js.Array[NavigationFolder],
    handler: js.ThisFunction1[
      /* this */ NavigationGroups, 
      /* parameter */ typingsSlinky.activexOutlook.anon.NavigationFolder, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationPane,
    event: ModuleSwitch,
    argNames: js.Array[CurrentModule],
    handler: js.ThisFunction1[
      /* this */ NavigationPane, 
      /* parameter */ typingsSlinky.activexOutlook.anon.CurrentModule, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkBusinessCardControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkBusinessCardControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkBusinessCardControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkCategory, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkCategory, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkCategory, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCategory, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCategory, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCategory, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkCheckBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkCheckBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkCheckBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCheckBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCheckBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCheckBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkComboBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkComboBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkComboBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkComboBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkComboBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkComboBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkCommandButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkCommandButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkCommandButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCommandButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCommandButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCommandButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkContactPhoto, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkContactPhoto, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkContactPhoto, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkContactPhoto, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkContactPhoto, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkContactPhoto, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkDateControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkDateControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkDateControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkDateControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkDateControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkDateControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkInfoBar, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkInfoBar, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkInfoBar, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ typingsSlinky.activexOutlook.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ typingsSlinky.activexOutlook.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ typingsSlinky.activexOutlook.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkListBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkListBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkListBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkListBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkListBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkListBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkOptionButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkOptionButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkOptionButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkOptionButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkOptionButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkOptionButton, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkSenderPhoto, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkSenderPhoto, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkSenderPhoto, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkTextBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkTextBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkTextBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTextBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTextBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTextBox, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkTimeControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkTimeControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkTimeControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTimeControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTimeControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTimeControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkTimeZoneControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkTimeZoneControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkTimeZoneControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTimeZoneControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTimeZoneControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTimeZoneControl, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: BeforeGroupAdd,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarGroups, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: BeforeGroupRemove,
    argNames: js.Tuple2[Group, Cancel],
    handler: js.ThisFunction1[
      /* this */ OutlookBarGroups, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Group, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: GroupAdd,
    argNames: js.Array[NewGroup],
    handler: js.ThisFunction1[
      /* this */ OutlookBarGroups, 
      /* parameter */ typingsSlinky.activexOutlook.anon.NewGroup, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OutlookBarPane,
    event: BeforeGroupSwitch,
    argNames: js.Tuple2[ToGroup, Cancel],
    handler: js.ThisFunction1[
      /* this */ OutlookBarPane, 
      /* parameter */ typingsSlinky.activexOutlook.anon.ToGroup, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OutlookBarPane,
    event: BeforeNavigate,
    argNames: js.Tuple2[Shortcut, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarPane, /* parameter */ CancelShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: BeforeShortcutAdd,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarShortcuts, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: BeforeShortcutRemove,
    argNames: js.Tuple2[Shortcut, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarShortcuts, /* parameter */ CancelShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: ShortcutAdd,
    argNames: js.Array[NewShortcut],
    handler: js.ThisFunction1[
      /* this */ OutlookBarShortcuts, 
      /* parameter */ typingsSlinky.activexOutlook.anon.NewShortcut, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ PostItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ PostItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ PostItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ typingsSlinky.activexOutlook.anon.Action, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ typingsSlinky.activexOutlook.anon.Forward, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ PostItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ PostItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: BeforeReminderShow,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: ReminderAdd,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[
      /* this */ Reminders, 
      /* parameter */ typingsSlinky.activexOutlook.anon.ReminderObject, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: ReminderChange,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[
      /* this */ Reminders, 
      /* parameter */ typingsSlinky.activexOutlook.anon.ReminderObject, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: ReminderFire,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[
      /* this */ Reminders, 
      /* parameter */ typingsSlinky.activexOutlook.anon.ReminderObject, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: Snooze,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[
      /* this */ Reminders, 
      /* parameter */ typingsSlinky.activexOutlook.anon.ReminderObject, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Results,
    event: ItemAdd,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Results, /* parameter */ typingsSlinky.activexOutlook.anon.Item, Unit]
  ): Unit = js.native
  def on(
    obj: Results,
    event: ItemChange,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Results, /* parameter */ typingsSlinky.activexOutlook.anon.Item, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Stores,
    event: BeforeStoreRemove,
    argNames: js.Tuple2[Store, Cancel],
    handler: js.ThisFunction1[/* this */ Stores, /* parameter */ CancelStore, Unit]
  ): Unit = js.native
  def on(
    obj: Stores,
    event: StoreAdd,
    argNames: js.Array[Store],
    handler: js.ThisFunction1[/* this */ Stores, /* parameter */ StoreStore, Unit]
  ): Unit = js.native
  def on(
    obj: SyncObject,
    event: OnError,
    argNames: js.Tuple2[Code, Description],
    handler: js.ThisFunction1[/* this */ SyncObject, /* parameter */ typingsSlinky.activexOutlook.anon.Code, Unit]
  ): Unit = js.native
  def on(
    obj: SyncObject,
    event: Progress,
    argNames: js.Tuple4[State, Description, Value, Max],
    handler: js.ThisFunction1[
      /* this */ SyncObject, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Description, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ typingsSlinky.activexOutlook.anon.Action, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ typingsSlinky.activexOutlook.anon.Forward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ typingsSlinky.activexOutlook.anon.Name, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Attachment, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Name, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsSlinky.activexOutlook.anon.Response, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Views,
    event: ViewAdd,
    argNames: js.Array[View],
    handler: js.ThisFunction1[/* this */ Views, /* parameter */ ViewView, Unit]
  ): Unit = js.native
  def on(
    obj: Views,
    event: ViewRemove,
    argNames: js.Array[View],
    handler: js.ThisFunction1[/* this */ Views, /* parameter */ ViewView, Unit]
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
