package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteResourceRequest extends StObject {
  
  /**
    * The identifier associated with the organization from which the resource is deleted.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The identifier of the resource to be deleted.
    */
  var ResourceId: typingsSlinky.awsSdk.workmailMod.ResourceId = js.native
}
object DeleteResourceRequest {
  
  @scala.inline
  def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): DeleteResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceRequest]
  }
  
  @scala.inline
  implicit class DeleteResourceRequestMutableBuilder[Self <: DeleteResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
