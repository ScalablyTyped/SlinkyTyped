package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaySoundRuleAction extends js.Object {
  val ActionType: OlRuleActionType = js.native
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Enabled: Boolean = js.native
  var FilePath: String = js.native
  @JSName("Outlook.PlaySoundRuleAction_typekey")
  var OutlookDotPlaySoundRuleAction_typekey: PlaySoundRuleAction = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object PlaySoundRuleAction {
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    FilePath: String,
    OutlookDotPlaySoundRuleAction_typekey: PlaySoundRuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): PlaySoundRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FilePath = FilePath.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.PlaySoundRuleAction_typekey")(OutlookDotPlaySoundRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaySoundRuleAction]
  }
  @scala.inline
  implicit class PlaySoundRuleActionOps[Self <: PlaySoundRuleAction] (val x: Self) extends AnyVal {
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
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotPlaySoundRuleAction_typekey(value: PlaySoundRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.PlaySoundRuleAction_typekey")(value.asInstanceOf[js.Any])
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

