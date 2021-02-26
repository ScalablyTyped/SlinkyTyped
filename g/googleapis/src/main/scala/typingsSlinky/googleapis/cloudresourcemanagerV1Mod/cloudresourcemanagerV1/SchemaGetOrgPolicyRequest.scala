package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request sent to the GetOrgPolicy method.
  */
@js.native
trait SchemaGetOrgPolicyRequest extends StObject {
  
  /**
    * Name of the `Constraint` to get the `Policy`.
    */
  var constraint: js.UndefOr[String] = js.native
}
object SchemaGetOrgPolicyRequest {
  
  @scala.inline
  def apply(): SchemaGetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOrgPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaGetOrgPolicyRequestMutableBuilder[Self <: SchemaGetOrgPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
  }
}
