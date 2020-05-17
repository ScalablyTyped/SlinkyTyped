package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkAsTaskRuleAction extends js.Object {
  val ActionType: OlRuleActionType = js.native
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Enabled: Boolean = js.native
  var FlagTo: String = js.native
  var MarkInterval: OlMarkInterval = js.native
  @JSName("Outlook.MarkAsTaskRuleAction_typekey")
  var OutlookDotMarkAsTaskRuleAction_typekey: MarkAsTaskRuleAction = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object MarkAsTaskRuleAction {
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    FlagTo: String,
    MarkInterval: OlMarkInterval,
    OutlookDotMarkAsTaskRuleAction_typekey: MarkAsTaskRuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): MarkAsTaskRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FlagTo = FlagTo.asInstanceOf[js.Any], MarkInterval = MarkInterval.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.MarkAsTaskRuleAction_typekey")(OutlookDotMarkAsTaskRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkAsTaskRuleAction]
  }
  @scala.inline
  implicit class MarkAsTaskRuleActionOps[Self <: MarkAsTaskRuleAction] (val x: Self) extends AnyVal {
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
    def withFlagTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlagTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkInterval(value: OlMarkInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotMarkAsTaskRuleAction_typekey(value: MarkAsTaskRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.MarkAsTaskRuleAction_typekey")(value.asInstanceOf[js.Any])
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

