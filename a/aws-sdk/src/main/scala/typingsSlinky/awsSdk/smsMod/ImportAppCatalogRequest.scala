package typingsSlinky.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAppCatalogRequest extends StObject {
  
  /**
    * The name of the service role. If you omit this parameter, we create a service-linked role for AWS Migration Hub in your account. Otherwise, the role that you provide must have the policy and trust policy described in the AWS Migration Hub User Guide.
    */
  var roleName: js.UndefOr[RoleName] = js.native
}
object ImportAppCatalogRequest {
  
  @scala.inline
  def apply(): ImportAppCatalogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportAppCatalogRequest]
  }
  
  @scala.inline
  implicit class ImportAppCatalogRequestMutableBuilder[Self <: ImportAppCatalogRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleName(value: RoleName): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
  }
}
