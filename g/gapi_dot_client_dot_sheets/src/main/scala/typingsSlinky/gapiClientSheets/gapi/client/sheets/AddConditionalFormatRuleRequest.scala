package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddConditionalFormatRuleRequest extends js.Object {
  /** The zero-based index where the rule should be inserted. */
  var index: js.UndefOr[Double] = js.native
  /** The rule to add. */
  var rule: js.UndefOr[ConditionalFormatRule] = js.native
}

object AddConditionalFormatRuleRequest {
  @scala.inline
  def apply(): AddConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddConditionalFormatRuleRequest]
  }
  @scala.inline
  implicit class AddConditionalFormatRuleRequestOps[Self <: AddConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: ConditionalFormatRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
  }
  
}

