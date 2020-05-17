package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversation extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConversationID: String = js.native
  @JSName("Outlook.Conversation_typekey")
  var OutlookDotConversation_typekey: Conversation = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def ClearAlwaysAssignCategories(Store: Store): Unit = js.native
  def GetAlwaysAssignCategories(Store: Store): String = js.native
  def GetAlwaysDelete(Store: Store): OlAlwaysDeleteConversation = js.native
  def GetAlwaysMoveToFolder(Store: Store): Folder = js.native
  def GetChildren(Item: js.Any): SimpleItems = js.native
  def GetParent(Item: js.Any): js.Any = js.native
  def GetRootItems(): SimpleItems = js.native
  def GetTable(): Table = js.native
  def MarkAsRead(): Unit = js.native
  def MarkAsUnread(): Unit = js.native
  def SetAlwaysAssignCategories(Categories: String, Store: Store): Unit = js.native
  def SetAlwaysDelete(AlwaysDelete: OlAlwaysDeleteConversation, Store: Store): Unit = js.native
  def SetAlwaysMoveToFolder(MoveToFolder: Folder, Store: Store): Unit = js.native
  def StopAlwaysDelete(Store: Store): Unit = js.native
  def StopAlwaysMoveToFolder(Store: Store): Unit = js.native
}

object Conversation {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ClearAlwaysAssignCategories: Store => Unit,
    ConversationID: String,
    GetAlwaysAssignCategories: Store => String,
    GetAlwaysDelete: Store => OlAlwaysDeleteConversation,
    GetAlwaysMoveToFolder: Store => Folder,
    GetChildren: js.Any => SimpleItems,
    GetParent: js.Any => js.Any,
    GetRootItems: () => SimpleItems,
    GetTable: () => Table,
    MarkAsRead: () => Unit,
    MarkAsUnread: () => Unit,
    OutlookDotConversation_typekey: Conversation,
    Parent: js.Any,
    Session: NameSpace,
    SetAlwaysAssignCategories: (String, Store) => Unit,
    SetAlwaysDelete: (OlAlwaysDeleteConversation, Store) => Unit,
    SetAlwaysMoveToFolder: (Folder, Store) => Unit,
    StopAlwaysDelete: Store => Unit,
    StopAlwaysMoveToFolder: Store => Unit
  ): Conversation = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ClearAlwaysAssignCategories = js.Any.fromFunction1(ClearAlwaysAssignCategories), ConversationID = ConversationID.asInstanceOf[js.Any], GetAlwaysAssignCategories = js.Any.fromFunction1(GetAlwaysAssignCategories), GetAlwaysDelete = js.Any.fromFunction1(GetAlwaysDelete), GetAlwaysMoveToFolder = js.Any.fromFunction1(GetAlwaysMoveToFolder), GetChildren = js.Any.fromFunction1(GetChildren), GetParent = js.Any.fromFunction1(GetParent), GetRootItems = js.Any.fromFunction0(GetRootItems), GetTable = js.Any.fromFunction0(GetTable), MarkAsRead = js.Any.fromFunction0(MarkAsRead), MarkAsUnread = js.Any.fromFunction0(MarkAsUnread), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetAlwaysAssignCategories = js.Any.fromFunction2(SetAlwaysAssignCategories), SetAlwaysDelete = js.Any.fromFunction2(SetAlwaysDelete), SetAlwaysMoveToFolder = js.Any.fromFunction2(SetAlwaysMoveToFolder), StopAlwaysDelete = js.Any.fromFunction1(StopAlwaysDelete), StopAlwaysMoveToFolder = js.Any.fromFunction1(StopAlwaysMoveToFolder))
    __obj.updateDynamic("Outlook.Conversation_typekey")(OutlookDotConversation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
  @scala.inline
  implicit class ConversationOps[Self <: Conversation] (val x: Self) extends AnyVal {
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
    def withClearAlwaysAssignCategories(value: Store => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearAlwaysAssignCategories")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConversationID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConversationID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAlwaysAssignCategories(value: Store => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAlwaysAssignCategories")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAlwaysDelete(value: Store => OlAlwaysDeleteConversation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAlwaysDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAlwaysMoveToFolder(value: Store => Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAlwaysMoveToFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildren(value: js.Any => SimpleItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetChildren")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetParent(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRootItems(value: () => SimpleItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRootItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTable(value: () => Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkAsRead(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkAsRead")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkAsUnread(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkAsUnread")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOutlookDotConversation_typekey(value: Conversation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Conversation_typekey")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withSetAlwaysAssignCategories(value: (String, Store) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAlwaysAssignCategories")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAlwaysDelete(value: (OlAlwaysDeleteConversation, Store) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAlwaysDelete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAlwaysMoveToFolder(value: (Folder, Store) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAlwaysMoveToFolder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStopAlwaysDelete(value: Store => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopAlwaysDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopAlwaysMoveToFolder(value: Store => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopAlwaysMoveToFolder")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

