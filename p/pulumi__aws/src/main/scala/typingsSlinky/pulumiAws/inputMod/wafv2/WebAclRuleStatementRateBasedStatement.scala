package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRateBasedStatement extends StObject {
  
  /**
    * Setting that indicates how to aggregate the request counts. Valid values include: `FORWARDED_IP` or `IP`. Default: `IP`.
    */
  var aggregateKeyType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. If `aggregateKeyType` is set to `FORWARDED_IP`, this block is required. See Forwarded IP Config below for details.
    */
  var forwardedIpConfig: js.UndefOr[Input[WebAclRuleStatementRateBasedStatementForwardedIpConfig]] = js.native
  
  /**
    * The limit on requests per 5-minute period for a single originating IP address.
    */
  var limit: Input[Double] = js.native
  
  /**
    * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See Statement above for details.
    */
  var scopeDownStatement: js.UndefOr[Input[WebAclRuleStatementRateBasedStatementScopeDownStatement]] = js.native
}
object WebAclRuleStatementRateBasedStatement {
  
  @scala.inline
  def apply(limit: Input[Double]): WebAclRuleStatementRateBasedStatement = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateKeyType(value: Input[String]): Self = StObject.set(x, "aggregateKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateKeyTypeUndefined: Self = StObject.set(x, "aggregateKeyType", js.undefined)
    
    @scala.inline
    def setForwardedIpConfig(value: Input[WebAclRuleStatementRateBasedStatementForwardedIpConfig]): Self = StObject.set(x, "forwardedIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedIpConfigUndefined: Self = StObject.set(x, "forwardedIpConfig", js.undefined)
    
    @scala.inline
    def setLimit(value: Input[Double]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDownStatement(value: Input[WebAclRuleStatementRateBasedStatementScopeDownStatement]): Self = StObject.set(x, "scopeDownStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDownStatementUndefined: Self = StObject.set(x, "scopeDownStatement", js.undefined)
  }
}
