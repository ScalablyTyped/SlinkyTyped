package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig extends StObject {
  
  /**
    * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
    */
  var fallbackBehavior: String = js.native
  
  /**
    * - The name of the HTTP header to use for the IP address.
    */
  var headerName: String = js.native
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig {
  
  @scala.inline
  def apply(fallbackBehavior: String, headerName: String): WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig = {
    val __obj = js.Dynamic.literal(fallbackBehavior = fallbackBehavior.asInstanceOf[js.Any], headerName = headerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfigMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackBehavior(value: String): Self = StObject.set(x, "fallbackBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
  }
}
