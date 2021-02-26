package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for `SetIamPolicy` method.
  */
@js.native
trait SchemaSetIamPolicyRequest extends StObject {
  
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size
    * of the policy is limited to a few 10s of KB. An empty policy is a valid
    * policy but certain Cloud Platform services (such as Projects) might
    * reject them.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.native
  
  /**
    * OPTIONAL: A FieldMask specifying which fields of the policy to modify.
    * Only the fields in the mask will be modified. If no mask is provided, the
    * following default mask is used: paths: &quot;bindings, etag&quot; This
    * field is only used by Cloud IAM.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaSetIamPolicyRequest {
  
  @scala.inline
  def apply(): SchemaSetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetIamPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaSetIamPolicyRequestMutableBuilder[Self <: SchemaSetIamPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
