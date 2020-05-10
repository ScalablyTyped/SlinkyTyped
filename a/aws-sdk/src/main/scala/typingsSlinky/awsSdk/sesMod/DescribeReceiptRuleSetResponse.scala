package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReceiptRuleSetResponse extends js.Object {
  /**
    * The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the rule set was created.
    */
  var Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.native
  /**
    * A list of the receipt rules that belong to the specified receipt rule set.
    */
  var Rules: js.UndefOr[ReceiptRulesList] = js.native
}

object DescribeReceiptRuleSetResponse {
  @scala.inline
  def apply(): DescribeReceiptRuleSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReceiptRuleSetResponse]
  }
  @scala.inline
  implicit class DescribeReceiptRuleSetResponseOps[Self <: DescribeReceiptRuleSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: ReceiptRuleSetMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: ReceiptRulesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(js.undefined)
        ret
    }
  }
  
}

