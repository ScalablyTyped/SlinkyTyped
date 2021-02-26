package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReceiptRuleResponse extends StObject {
  
  /**
    * A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled status, scan status, and Transport Layer Security (TLS) policy.
    */
  var Rule: js.UndefOr[ReceiptRule] = js.native
}
object DescribeReceiptRuleResponse {
  
  @scala.inline
  def apply(): DescribeReceiptRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReceiptRuleResponse]
  }
  
  @scala.inline
  implicit class DescribeReceiptRuleResponseMutableBuilder[Self <: DescribeReceiptRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: ReceiptRule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
