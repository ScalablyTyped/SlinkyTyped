package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IP Set that this statement references.
    */
  var arn: String = js.native
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
    */
  var ipSetForwardedIpConfig: js.UndefOr[
    WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
  ] = js.native
}
object WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement {
  
  @scala.inline
  def apply(arn: String): WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetForwardedIpConfig(
      value: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
    ): Self = StObject.set(x, "ipSetForwardedIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetForwardedIpConfigUndefined: Self = StObject.set(x, "ipSetForwardedIpConfig", js.undefined)
  }
}
