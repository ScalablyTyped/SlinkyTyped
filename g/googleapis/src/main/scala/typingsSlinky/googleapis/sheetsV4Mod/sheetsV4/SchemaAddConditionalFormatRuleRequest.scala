package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a new conditional format rule at the given index. All subsequent
  * rules&#39; indexes are incremented.
  */
@js.native
trait SchemaAddConditionalFormatRuleRequest extends js.Object {
  /**
    * The zero-based index where the rule should be inserted.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The rule to add.
    */
  var rule: js.UndefOr[SchemaConditionalFormatRule] = js.native
}

object SchemaAddConditionalFormatRuleRequest {
  @scala.inline
  def apply(): SchemaAddConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddConditionalFormatRuleRequest]
  }
  @scala.inline
  implicit class SchemaAddConditionalFormatRuleRequestOps[Self <: SchemaAddConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
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

