package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConditionalFormatRuleResponse extends js.Object {
  var newIndex: js.UndefOr[Double] = js.native
  var newRule: js.UndefOr[ConditionalFormatRule] = js.native
  var oldIndex: js.UndefOr[Double] = js.native
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

