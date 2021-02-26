package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig extends StObject {
  
  /**
    * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
    */
  var fallbackBehavior: Input[String] = js.native
  
  /**
    * - The name of the HTTP header to use for the IP address.
    */
  var headerName: Input[String] = js.native
}
object WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig {
  
  @scala.inline
  def apply(fallbackBehavior: Input[String], headerName: Input[String]): WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig = {
    val __obj = js.Dynamic.literal(fallbackBehavior = fallbackBehavior.asInstanceOf[js.Any], headerName = headerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfigMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackBehavior(value: Input[String]): Self = StObject.set(x, "fallbackBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderName(value: Input[String]): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
  }
}
