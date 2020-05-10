package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConditionalFormatRuleResponse extends js.Object {
  /** The index of the new rule. */
  var newIndex: js.UndefOr[Double] = js.native
  /**
    * The new rule that replaced the old rule (if replacing),
    * or the rule that was moved (if moved)
    */
  var newRule: js.UndefOr[ConditionalFormatRule] = js.native
  /**
    * The old index of the rule. Not set if a rule was replaced
    * (because it is the same as new_index).
    */
  var oldIndex: js.UndefOr[Double] = js.native
  /**
    * The old (deleted) rule. Not set if a rule was moved
    * (because it is the same as new_rule).
    */
  var oldRule: js.UndefOr[ConditionalFormatRule] = js.native
}

object UpdateConditionalFormatRuleResponse {
  @scala.inline
  def apply(): UpdateConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConditionalFormatRuleResponse]
  }
  @scala.inline
  implicit class UpdateConditionalFormatRuleResponseOps[Self <: UpdateConditionalFormatRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNewRule(value: ConditionalFormatRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRule")(js.undefined)
        ret
    }
    @scala.inline
    def withOldIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withOldRule(value: ConditionalFormatRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldRule")(js.undefined)
        ret
    }
  }
  
}

