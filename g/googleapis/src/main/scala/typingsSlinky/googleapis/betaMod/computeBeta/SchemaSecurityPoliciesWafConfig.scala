package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSecurityPoliciesWafConfig extends StObject {
  
  var wafRules: js.UndefOr[SchemaPreconfiguredWafSet] = js.native
}
object SchemaSecurityPoliciesWafConfig {
  
  @scala.inline
  def apply(): SchemaSecurityPoliciesWafConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPoliciesWafConfig]
  }
  
  @scala.inline
  implicit class SchemaSecurityPoliciesWafConfigMutableBuilder[Self <: SchemaSecurityPoliciesWafConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWafRules(value: SchemaPreconfiguredWafSet): Self = StObject.set(x, "wafRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWafRulesUndefined: Self = StObject.set(x, "wafRules", js.undefined)
  }
}
