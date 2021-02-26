package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatement extends StObject {
  
  /**
    * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
    */
  var countryCodes: js.Array[String] = js.native
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See Forwarded IP Config below for details.
    */
  var forwardedIpConfig: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig
  ] = js.native
}
object RuleGroupRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatement {
  
  @scala.inline
  def apply(countryCodes: js.Array[String]): RuleGroupRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatement = {
    val __obj = js.Dynamic.literal(countryCodes = countryCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatementMutableBuilder[Self <: RuleGroupRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCodes(value: js.Array[String]): Self = StObject.set(x, "countryCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodesVarargs(value: String*): Self = StObject.set(x, "countryCodes", js.Array(value :_*))
    
    @scala.inline
    def setForwardedIpConfig(
      value: RuleGroupRuleStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig
    ): Self = StObject.set(x, "forwardedIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedIpConfigUndefined: Self = StObject.set(x, "forwardedIpConfig", js.undefined)
  }
}
