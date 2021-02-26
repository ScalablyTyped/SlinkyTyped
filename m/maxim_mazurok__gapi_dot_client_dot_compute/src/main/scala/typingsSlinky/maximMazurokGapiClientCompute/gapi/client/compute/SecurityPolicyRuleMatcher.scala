package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPolicyRuleMatcher extends StObject {
  
  /**
    * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not
    * specified.
    */
  var config: js.UndefOr[SecurityPolicyRuleMatcherConfig] = js.native
  
  /** User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header. */
  var expr: js.UndefOr[Expr] = js.native
  
  /**
    * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 -
    * must specify the corresponding src_ip_range field in config.
    */
  var versionedExpr: js.UndefOr[String] = js.native
}
object SecurityPolicyRuleMatcher {
  
  @scala.inline
  def apply(): SecurityPolicyRuleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyRuleMatcher]
  }
  
  @scala.inline
  implicit class SecurityPolicyRuleMatcherMutableBuilder[Self <: SecurityPolicyRuleMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: SecurityPolicyRuleMatcherConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setExpr(value: Expr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    @scala.inline
    def setVersionedExpr(value: String): Self = StObject.set(x, "versionedExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionedExprUndefined: Self = StObject.set(x, "versionedExpr", js.undefined)
  }
}
