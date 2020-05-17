package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveOrCopyRuleAction extends js.Object {
  val ActionType: OlRuleActionType = js.native
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Enabled: Boolean = js.native
  var Folder: typingsSlinky.activexOutlook.Outlook.Folder = js.native
  @JSName("Outlook.MoveOrCopyRuleAction_typekey")
  var OutlookDotMoveOrCopyRuleAction_typekey: MoveOrCopyRuleAction = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object MoveOrCopyRuleAction {
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    Folder: Folder,
    OutlookDotMoveOrCopyRuleAction_typekey: MoveOrCopyRuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): MoveOrCopyRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Folder = Folder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.MoveOrCopyRuleAction_typekey")(OutlookDotMoveOrCopyRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveOrCopyRuleAction]
  }
  @scala.inline
  implicit class MoveOrCopyRuleActionOps[Self <: MoveOrCopyRuleAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: OlRuleActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolder(value: Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotMoveOrCopyRuleAction_typekey(value: MoveOrCopyRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.MoveOrCopyRuleAction_typekey")(value.asInstanceOf[js.Any])
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

