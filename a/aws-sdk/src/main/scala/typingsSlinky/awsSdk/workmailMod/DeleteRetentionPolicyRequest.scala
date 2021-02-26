package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRetentionPolicyRequest extends StObject {
  
  /**
    * The retention policy ID.
    */
  var Id: ShortString = js.native
  
  /**
    * The organization ID.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
}
object DeleteRetentionPolicyRequest {
  
  @scala.inline
  def apply(Id: ShortString, OrganizationId: OrganizationId): DeleteRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRetentionPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteRetentionPolicyRequestMutableBuilder[Self <: DeleteRetentionPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ShortString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
