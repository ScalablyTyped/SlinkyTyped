package typingsSlinky.activexDashOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.DistListItem")
@js.native
class DistListItem protected () extends js.Object {
  val Actions: typingsSlinky.activexDashOutlook.Outlook.Actions = js.native
  val Application: typingsSlinky.activexDashOutlook.Outlook.Application = js.native
  val Attachments: typingsSlinky.activexDashOutlook.Outlook.Attachments = js.native
  val AutoResolvedWinner: Boolean = js.native
  var BillingInformation: String = js.native
  var Body: String = js.native
  var Categories: String = js.native
  val CheckSum: Double = js.native
  val Class: OlObjectClass = js.native
  var Companies: String = js.native
  val Conflicts: typingsSlinky.activexDashOutlook.Outlook.Conflicts = js.native
  val ConversationID: String = js.native
  val ConversationIndex: String = js.native
  val ConversationTopic: String = js.native
  val CreationTime: VarDate = js.native
  var DLName: String = js.native
  val DownloadState: OlDownloadState = js.native
  val EntryID: String = js.native
  val FormDescription: typingsSlinky.activexDashOutlook.Outlook.FormDescription = js.native
  val GetInspector: Inspector = js.native
  var Importance: OlImportance = js.native
  val IsConflict: Boolean = js.native
  val IsMarkedAsTask: Boolean = js.native
  val ItemProperties: typingsSlinky.activexDashOutlook.Outlook.ItemProperties = js.native
  val LastModificationTime: VarDate = js.native
  val Links: typingsSlinky.activexDashOutlook.Outlook.Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  val MemberCount: Double = js.native
  var Members: js.Any = js.native
  var MessageClass: String = js.native
  var Mileage: String = js.native
  var NoAging: Boolean = js.native
  var OneOffMembers: js.Any = js.native
  var `Outlook.DistListItem_typekey`: DistListItem = js.native
  val OutlookInternalVersion: Double = js.native
  val OutlookVersion: String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typingsSlinky.activexDashOutlook.Outlook.PropertyAccessor = js.native
  var RTFBody: js.Any = js.native
  var ReminderOverrideDefault: Boolean = js.native
  var ReminderPlaySound: Boolean = js.native
  var ReminderSet: Boolean = js.native
  var ReminderSoundFile: String = js.native
  var ReminderTime: VarDate = js.native
  val Saved: Boolean = js.native
  var Sensitivity: OlSensitivity = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  var Subject: String = js.native
  var TaskCompletedDate: VarDate = js.native
  var TaskDueDate: VarDate = js.native
  var TaskStartDate: VarDate = js.native
  var TaskSubject: String = js.native
  var ToDoTaskOrdinal: VarDate = js.native
  var UnRead: Boolean = js.native
  val UserProperties: typingsSlinky.activexDashOutlook.Outlook.UserProperties = js.native
  def AddMember(Recipient: Recipient): Unit = js.native
  def AddMembers(Recipients: Recipients): Unit = js.native
  def ClearTaskFlag(): Unit = js.native
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): Unit = js.native
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  def GetConversation(): Conversation = js.native
  def GetMember(Index: Double): Recipient = js.native
  def MarkAsTask(MarkInterval: OlMarkInterval): Unit = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): Unit = js.native
  def RemoveMember(Recipient: Recipient): Unit = js.native
  def RemoveMembers(Recipients: Recipients): Unit = js.native
  def Save(): Unit = js.native
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
  def ShowCategoriesDialog(): Unit = js.native
}

