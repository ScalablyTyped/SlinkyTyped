package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleActions extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val AssignToCategory: AssignToCategoryRuleAction = js.native
  
  val CC: SendRuleAction = js.native
  
  val Class: OlObjectClass = js.native
  
  val ClearCategories: RuleAction = js.native
  
  val CopyToFolder: MoveOrCopyRuleAction = js.native
  
  val Count: Double = js.native
  
  val Delete: RuleAction = js.native
  
  val DeletePermanently: RuleAction = js.native
  
  val DesktopAlert: RuleAction = js.native
  
  val Forward: SendRuleAction = js.native
  
  val ForwardAsAttachment: SendRuleAction = js.native
  
  def Item(Index: Double): RuleAction = js.native
  
  val MarkAsTask: MarkAsTaskRuleAction = js.native
  
  val MoveToFolder: MoveOrCopyRuleAction = js.native
  
  val NewItemAlert: NewItemAlertRuleAction = js.native
  
  val NotifyDelivery: RuleAction = js.native
  
  val NotifyRead: RuleAction = js.native
  
  @JSName("Outlook.RuleActions_typekey")
  var OutlookDotRuleActions_typekey: RuleActions = js.native
  
  val Parent: js.Any = js.native
  
  val PlaySound: PlaySoundRuleAction = js.native
  
  val Redirect: SendRuleAction = js.native
  
  val Session: NameSpace = js.native
  
  val Stop: RuleAction = js.native
}
object RuleActions {
  
  @scala.inline
  def apply(
    Application: Application,
    AssignToCategory: AssignToCategoryRuleAction,
    CC: SendRuleAction,
    Class: OlObjectClass,
    ClearCategories: RuleAction,
    CopyToFolder: MoveOrCopyRuleAction,
    Count: Double,
    Delete: RuleAction,
    DeletePermanently: RuleAction,
    DesktopAlert: RuleAction,
    Forward: SendRuleAction,
    ForwardAsAttachment: SendRuleAction,
    Item: Double => RuleAction,
    MarkAsTask: MarkAsTaskRuleAction,
    MoveToFolder: MoveOrCopyRuleAction,
    NewItemAlert: NewItemAlertRuleAction,
    NotifyDelivery: RuleAction,
    NotifyRead: RuleAction,
    OutlookDotRuleActions_typekey: RuleActions,
    Parent: js.Any,
    PlaySound: PlaySoundRuleAction,
    Redirect: SendRuleAction,
    Session: NameSpace,
    Stop: RuleAction
  ): RuleActions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AssignToCategory = AssignToCategory.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ClearCategories = ClearCategories.asInstanceOf[js.Any], CopyToFolder = CopyToFolder.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any], DeletePermanently = DeletePermanently.asInstanceOf[js.Any], DesktopAlert = DesktopAlert.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any], ForwardAsAttachment = ForwardAsAttachment.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MarkAsTask = MarkAsTask.asInstanceOf[js.Any], MoveToFolder = MoveToFolder.asInstanceOf[js.Any], NewItemAlert = NewItemAlert.asInstanceOf[js.Any], NotifyDelivery = NotifyDelivery.asInstanceOf[js.Any], NotifyRead = NotifyRead.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlaySound = PlaySound.asInstanceOf[js.Any], Redirect = Redirect.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Stop = Stop.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.RuleActions_typekey")(OutlookDotRuleActions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleActions]
  }
  
  @scala.inline
  implicit class RuleActionsMutableBuilder[Self <: RuleActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignToCategory(value: AssignToCategoryRuleAction): Self = StObject.set(x, "AssignToCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCC(value: SendRuleAction): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearCategories(value: RuleAction): Self = StObject.set(x, "ClearCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyToFolder(value: MoveOrCopyRuleAction): Self = StObject.set(x, "CopyToFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: RuleAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePermanently(value: RuleAction): Self = StObject.set(x, "DeletePermanently", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopAlert(value: RuleAction): Self = StObject.set(x, "DesktopAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: SendRuleAction): Self = StObject.set(x, "Forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardAsAttachment(value: SendRuleAction): Self = StObject.set(x, "ForwardAsAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => RuleAction): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarkAsTask(value: MarkAsTaskRuleAction): Self = StObject.set(x, "MarkAsTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveToFolder(value: MoveOrCopyRuleAction): Self = StObject.set(x, "MoveToFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewItemAlert(value: NewItemAlertRuleAction): Self = StObject.set(x, "NewItemAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyDelivery(value: RuleAction): Self = StObject.set(x, "NotifyDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyRead(value: RuleAction): Self = StObject.set(x, "NotifyRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotRuleActions_typekey(value: RuleActions): Self = StObject.set(x, "Outlook.RuleActions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaySound(value: PlaySoundRuleAction): Self = StObject.set(x, "PlaySound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect(value: SendRuleAction): Self = StObject.set(x, "Redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: RuleAction): Self = StObject.set(x, "Stop", value.asInstanceOf[js.Any])
  }
}
