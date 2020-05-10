package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of deleting a conditional format rule.
  */
@js.native
trait SchemaDeleteConditionalFormatRuleResponse extends js.Object {
  /**
    * The rule that was deleted.
    */
  var rule: js.UndefOr[SchemaConditionalFormatRule] = js.native
}

object SchemaDeleteConditionalFormatRuleResponse {
  @scala.inline
  def apply(): SchemaDeleteConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteConditionalFormatRuleResponse]
  }
  @scala.inline
  implicit class SchemaDeleteConditionalFormatRuleResponseOps[Self <: SchemaDeleteConditionalFormatRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: SchemaConditionalFormatRule): Self = {
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

