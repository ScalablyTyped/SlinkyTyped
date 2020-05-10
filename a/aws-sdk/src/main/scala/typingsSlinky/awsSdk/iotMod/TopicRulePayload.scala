package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRulePayload extends js.Object {
  /**
    * The actions associated with the rule.
    */
  var actions: ActionList = js.native
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.native
  /**
    * The description of the rule.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The action to take when an error occurs.
    */
  var errorAction: js.UndefOr[Action] = js.native
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.native
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference in the AWS IoT Developer Guide.
    */
  var sql: SQL = js.native
}

object TopicRulePayload {
  @scala.inline
  def apply(actions: ActionList, sql: SQL): TopicRulePayload = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRulePayload]
  }
  @scala.inline
  implicit class TopicRulePayloadOps[Self <: TopicRulePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: ActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSql(value: SQL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwsIotSqlVersion(value: AwsIotSqlVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIotSqlVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsIotSqlVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIotSqlVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorAction(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorAction")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleDisabled(value: IsDisabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleDisabled")(js.undefined)
        ret
    }
  }
  
}

