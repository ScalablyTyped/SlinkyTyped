package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationHeader extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConversationID: String = js.native
  val ConversationTopic: String = js.native
  @JSName("Outlook.ConversationHeader_typekey")
  var OutlookDotConversationHeader_typekey: ConversationHeader = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def GetConversation(): Conversation = js.native
  def GetItems(): SimpleItems = js.native
}

object ConversationHeader {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConversationID: String,
    ConversationTopic: String,
    GetConversation: () => Conversation,
    GetItems: () => SimpleItems,
    OutlookDotConversationHeader_typekey: ConversationHeader,
    Parent: js.Any,
    Session: NameSpace
  ): ConversationHeader = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConversationID = ConversationID.asInstanceOf[js.Any], ConversationTopic = ConversationTopic.asInstanceOf[js.Any], GetConversation = js.Any.fromFunction0(GetConversation), GetItems = js.Any.fromFunction0(GetItems), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ConversationHeader_typekey")(OutlookDotConversationHeader_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationHeader]
  }
  @scala.inline
  implicit class ConversationHeaderOps[Self <: ConversationHeader] (val x: Self) extends AnyVal {
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
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConversationID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConversationID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConversationTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConversationTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetConversation(value: () => Conversation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetConversation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItems(value: () => SimpleItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOutlookDotConversationHeader_typekey(value: ConversationHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.ConversationHeader_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

