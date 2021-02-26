package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conversation extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  def ClearAlwaysAssignCategories(Store: Store): Unit = js.native
  
  val ConversationID: String = js.native
  
  def GetAlwaysAssignCategories(Store: Store): String = js.native
  
  def GetAlwaysDelete(Store: Store): OlAlwaysDeleteConversation = js.native
  
  def GetAlwaysMoveToFolder(Store: Store): Folder = js.native
  
  def GetChildren(Item: js.Any): SimpleItems = js.native
  
  def GetParent(Item: js.Any): js.Any = js.native
  
  def GetRootItems(): SimpleItems = js.native
  
  def GetTable(): Table = js.native
  
  def MarkAsRead(): Unit = js.native
  
  def MarkAsUnread(): Unit = js.native
  
  @JSName("Outlook.Conversation_typekey")
  var OutlookDotConversation_typekey: Conversation = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
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
  implicit class ConversationMutableBuilder[Self <: Conversation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearAlwaysAssignCategories(value: Store => Unit): Self = StObject.set(x, "ClearAlwaysAssignCategories", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConversationID(value: String): Self = StObject.set(x, "ConversationID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAlwaysAssignCategories(value: Store => String): Self = StObject.set(x, "GetAlwaysAssignCategories", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAlwaysDelete(value: Store => OlAlwaysDeleteConversation): Self = StObject.set(x, "GetAlwaysDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAlwaysMoveToFolder(value: Store => Folder): Self = StObject.set(x, "GetAlwaysMoveToFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildren(value: js.Any => SimpleItems): Self = StObject.set(x, "GetChildren", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParent(value: js.Any => js.Any): Self = StObject.set(x, "GetParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRootItems(value: () => SimpleItems): Self = StObject.set(x, "GetRootItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTable(value: () => Table): Self = StObject.set(x, "GetTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkAsRead(value: () => Unit): Self = StObject.set(x, "MarkAsRead", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkAsUnread(value: () => Unit): Self = StObject.set(x, "MarkAsUnread", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOutlookDotConversation_typekey(value: Conversation): Self = StObject.set(x, "Outlook.Conversation_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAlwaysAssignCategories(value: (String, Store) => Unit): Self = StObject.set(x, "SetAlwaysAssignCategories", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAlwaysDelete(value: (OlAlwaysDeleteConversation, Store) => Unit): Self = StObject.set(x, "SetAlwaysDelete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAlwaysMoveToFolder(value: (Folder, Store) => Unit): Self = StObject.set(x, "SetAlwaysMoveToFolder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopAlwaysDelete(value: Store => Unit): Self = StObject.set(x, "StopAlwaysDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopAlwaysMoveToFolder(value: Store => Unit): Self = StObject.set(x, "StopAlwaysMoveToFolder", js.Any.fromFunction1(value))
  }
}
