package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a match condition that incoming traffic is evaluated against.
  * Exactly one field must be specified.
  */
@js.native
trait SchemaSecurityPolicyRuleMatcher extends StObject {
  
  /**
    * The configuration options available when specifying versioned_expr. This
    * field must be specified if versioned_expr is specified and cannot be
    * specified if versioned_expr is not specified.
    */
  var config: js.UndefOr[SchemaSecurityPolicyRuleMatcherConfig] = js.native
  
  /**
    * User defined CEVAL expression. A CEVAL expression is used to specify
    * match criteria such as origin.ip, source.region_code and contents in the
    * request header.
    */
  var expr: js.UndefOr[SchemaExpr] = js.native
  
  /**
    * Preconfigured versioned expression. If this field is specified, config
    * must also be specified. Available preconfigured expressions along with
    * their requirements are: SRC_IPS_V1 - must specify the corresponding
    * src_ip_range field in config.
    */
  var versionedExpr: js.UndefOr[String] = js.native
}
object SchemaSecurityPolicyRuleMatcher {
  
  @scala.inline
  def apply(): SchemaSecurityPolicyRuleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleMatcher]
  }
  
  @scala.inline
  implicit class SchemaSecurityPolicyRuleMatcherMutableBuilder[Self <: SchemaSecurityPolicyRuleMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: SchemaSecurityPolicyRuleMatcherConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setExpr(value: SchemaExpr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    @scala.inline
    def setVersionedExpr(value: String): Self = StObject.set(x, "versionedExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionedExprUndefined: Self = StObject.set(x, "versionedExpr", js.undefined)
  }
}
