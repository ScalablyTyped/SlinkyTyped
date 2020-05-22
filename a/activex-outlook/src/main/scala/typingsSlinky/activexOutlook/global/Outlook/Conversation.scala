package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlAlwaysDeleteConversation
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Conversation")
@js.native
class Conversation protected ()
  extends typingsSlinky.activexOutlook.Outlook.Conversation {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ConversationID: String = js.native
  /* CompleteClass */
  @JSName("Outlook.Conversation_typekey")
  override var OutlookDotConversation_typekey: typingsSlinky.activexOutlook.Outlook.Conversation = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def ClearAlwaysAssignCategories(Store: typingsSlinky.activexOutlook.Outlook.Store): Unit = js.native
  /* CompleteClass */
  override def GetAlwaysAssignCategories(Store: typingsSlinky.activexOutlook.Outlook.Store): String = js.native
  /* CompleteClass */
  override def GetAlwaysDelete(Store: typingsSlinky.activexOutlook.Outlook.Store): OlAlwaysDeleteConversation = js.native
  /* CompleteClass */
  override def GetAlwaysMoveToFolder(Store: typingsSlinky.activexOutlook.Outlook.Store): typingsSlinky.activexOutlook.Outlook.Folder = js.native
  /* CompleteClass */
  override def GetChildren(Item: js.Any): typingsSlinky.activexOutlook.Outlook.SimpleItems = js.native
  /* CompleteClass */
  override def GetParent(Item: js.Any): js.Any = js.native
  /* CompleteClass */
  override def GetRootItems(): typingsSlinky.activexOutlook.Outlook.SimpleItems = js.native
  /* CompleteClass */
  override def GetTable(): typingsSlinky.activexOutlook.Outlook.Table = js.native
  /* CompleteClass */
  override def MarkAsRead(): Unit = js.native
  /* CompleteClass */
  override def MarkAsUnread(): Unit = js.native
  /* CompleteClass */
  override def SetAlwaysAssignCategories(Categories: String, Store: typingsSlinky.activexOutlook.Outlook.Store): Unit = js.native
  /* CompleteClass */
  override def SetAlwaysDelete(AlwaysDelete: OlAlwaysDeleteConversation, Store: typingsSlinky.activexOutlook.Outlook.Store): Unit = js.native
  /* CompleteClass */
  override def SetAlwaysMoveToFolder(
    MoveToFolder: typingsSlinky.activexOutlook.Outlook.Folder,
    Store: typingsSlinky.activexOutlook.Outlook.Store
  ): Unit = js.native
  /* CompleteClass */
  override def StopAlwaysDelete(Store: typingsSlinky.activexOutlook.Outlook.Store): Unit = js.native
  /* CompleteClass */
  override def StopAlwaysMoveToFolder(Store: typingsSlinky.activexOutlook.Outlook.Store): Unit = js.native
}

