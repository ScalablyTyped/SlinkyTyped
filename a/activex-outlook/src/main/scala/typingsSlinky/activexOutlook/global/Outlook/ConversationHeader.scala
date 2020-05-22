package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ConversationHeader")
@js.native
class ConversationHeader protected ()
  extends typingsSlinky.activexOutlook.Outlook.ConversationHeader {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ConversationID: String = js.native
  /* CompleteClass */
  override val ConversationTopic: String = js.native
  /* CompleteClass */
  @JSName("Outlook.ConversationHeader_typekey")
  override var OutlookDotConversationHeader_typekey: typingsSlinky.activexOutlook.Outlook.ConversationHeader = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def GetConversation(): typingsSlinky.activexOutlook.Outlook.Conversation = js.native
  /* CompleteClass */
  override def GetItems(): typingsSlinky.activexOutlook.Outlook.SimpleItems = js.native
}

