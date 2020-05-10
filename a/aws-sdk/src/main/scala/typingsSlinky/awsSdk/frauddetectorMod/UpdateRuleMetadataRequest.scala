package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuleMetadataRequest extends js.Object {
  /**
    * The rule description.
    */
  var description: typingsSlinky.awsSdk.frauddetectorMod.description = js.native
  /**
    * The rule to update.
    */
  var rule: Rule = js.native
}

object UpdateRuleMetadataRequest {
  @scala.inline
  def apply(description: description, rule: Rule): UpdateRuleMetadataRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleMetadataRequest]
  }
  @scala.inline
  implicit class UpdateRuleMetadataRequestOps[Self <: UpdateRuleMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRule(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

