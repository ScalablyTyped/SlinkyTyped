package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authorization configuration provides service-level and method-level access
  * control for a service.
  */
@js.native
trait SchemaAuthorizationConfig extends StObject {
  
  /**
    * List of RbacPolicies.
    */
  var policies: js.UndefOr[js.Array[SchemaRbacPolicy]] = js.native
}
object SchemaAuthorizationConfig {
  
  @scala.inline
  def apply(): SchemaAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationConfig]
  }
  
  @scala.inline
  implicit class SchemaAuthorizationConfigMutableBuilder[Self <: SchemaAuthorizationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicies(value: js.Array[SchemaRbacPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: SchemaRbacPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
