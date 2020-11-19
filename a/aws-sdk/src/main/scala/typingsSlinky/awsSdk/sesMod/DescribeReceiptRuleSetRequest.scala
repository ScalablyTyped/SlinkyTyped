package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReceiptRuleSetRequest extends js.Object {
  
  /**
    * The name of the receipt rule set to describe.
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}
object DescribeReceiptRuleSetRequest {
  
  @scala.inline
  def apply(RuleSetName: ReceiptRuleSetName): DescribeReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReceiptRuleSetRequest]
  }
  
  @scala.inline
  implicit class DescribeReceiptRuleSetRequestOps[Self <: DescribeReceiptRuleSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = this.set("RuleSetName", value.asInstanceOf[js.Any])
  }
}
