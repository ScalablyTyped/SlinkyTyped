package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleActions extends js.Object {
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
  def Item(Index: Double): RuleAction = js.native
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
  implicit class RuleActionsOps[Self <: RuleActions] (val x: Self) extends AnyVal {
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
    def withAssignToCategory(value: AssignToCategoryRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignToCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCC(value: SendRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearCategories(value: RuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyToFolder(value: MoveOrCopyRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyToFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: RuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletePermanently(value: RuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletePermanently")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesktopAlert(value: RuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesktopAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForward(value: SendRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardAsAttachment(value: SendRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardAsAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => RuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarkAsTask(value: MarkAsTaskRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkAsTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveToFolder(value: MoveOrCopyRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveToFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewItemAlert(value: NewItemAlertRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewItemAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifyDelivery(value: RuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyDelivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifyRead(value: RuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotRuleActions_typekey(value: RuleActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.RuleActions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaySound(value: PlaySoundRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaySound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirect(value: SendRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: RuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

