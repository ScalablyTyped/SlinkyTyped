package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRule extends Entity {
  // Actions to be taken on a message when the corresponding conditions are fulfilled.
  var actions: js.UndefOr[MessageRuleActions] = js.native
  // Conditions that when fulfilled, will trigger the corresponding actions for that rule.
  var conditions: js.UndefOr[MessageRulePredicates] = js.native
  // The display name of the rule.
  var displayName: js.UndefOr[String] = js.native
  // Exception conditions for the rule.
  var exceptions: js.UndefOr[MessageRulePredicates] = js.native
  // Indicates whether the rule is in an error condition. Read-only.
  var hasError: js.UndefOr[Boolean] = js.native
  // Indicates whether the rule is enabled to be applied to messages.
  var isEnabled: js.UndefOr[Boolean] = js.native
  // Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
  var isReadOnly: js.UndefOr[Boolean] = js.native
  // Indicates the order in which the rule is executed, among other rules.
  var sequence: js.UndefOr[Double] = js.native
}

object MessageRule {
  @scala.inline
  def apply(): MessageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRule]
  }
  @scala.inline
  implicit class MessageRuleOps[Self <: MessageRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: MessageRuleActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: MessageRulePredicates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withExceptions(value: MessageRulePredicates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHasError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSequence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
        ret
    }
  }
  
}

