package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromRssFeedRuleCondition extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConditionType: OlRuleConditionType = js.native
  var Enabled: Boolean = js.native
  var FromRssFeed: js.Any = js.native
  @JSName("Outlook.FromRssFeedRuleCondition_typekey")
  var OutlookDotFromRssFeedRuleCondition_typekey: FromRssFeedRuleCondition = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object FromRssFeedRuleCondition {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    FromRssFeed: js.Any,
    OutlookDotFromRssFeedRuleCondition_typekey: FromRssFeedRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): FromRssFeedRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FromRssFeed = FromRssFeed.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.FromRssFeedRuleCondition_typekey")(OutlookDotFromRssFeedRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromRssFeedRuleCondition]
  }
  @scala.inline
  implicit class FromRssFeedRuleConditionOps[Self <: FromRssFeedRuleCondition] (val x: Self) extends AnyVal {
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
    def withConditionType(value: OlRuleConditionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromRssFeed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromRssFeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotFromRssFeedRuleCondition_typekey(value: FromRssFeedRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.FromRssFeedRuleCondition_typekey")(value.asInstanceOf[js.Any])
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

