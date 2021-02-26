package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultRetentionPolicyRequest extends StObject {
  
  /**
    * The organization ID.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
}
object GetDefaultRetentionPolicyRequest {
  
  @scala.inline
  def apply(OrganizationId: OrganizationId): GetDefaultRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultRetentionPolicyRequest]
  }
  
  @scala.inline
  implicit class GetDefaultRetentionPolicyRequestMutableBuilder[Self <: GetDefaultRetentionPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
