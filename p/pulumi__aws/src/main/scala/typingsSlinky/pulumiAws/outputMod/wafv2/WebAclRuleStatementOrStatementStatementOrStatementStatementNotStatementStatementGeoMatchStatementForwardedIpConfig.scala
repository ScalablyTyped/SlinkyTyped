package typingsSlinky.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig extends js.Object {
  
  /**
    * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
    */
  var fallbackBehavior: String = js.native
  
  /**
    * - The name of the HTTP header to use for the IP address.
    */
  var headerName: String = js.native
}
object WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig {
  
  @scala.inline
  def apply(fallbackBehavior: String, headerName: String): WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig = {
    val __obj = js.Dynamic.literal(fallbackBehavior = fallbackBehavior.asInstanceOf[js.Any], headerName = headerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigOps[Self <: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig] (val x: Self) extends AnyVal {
    
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
    def setFallbackBehavior(value: String): Self = this.set("fallbackBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderName(value: String): Self = this.set("headerName", value.asInstanceOf[js.Any])
  }
}
