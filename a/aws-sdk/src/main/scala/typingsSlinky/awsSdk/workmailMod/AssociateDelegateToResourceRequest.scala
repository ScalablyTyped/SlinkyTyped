package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateDelegateToResourceRequest extends StObject {
  
  /**
    * The member (user or group) to associate to the resource.
    */
  var EntityId: WorkMailIdentifier = js.native
  
  /**
    * The organization under which the resource exists.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The resource for which members (users or groups) are associated.
    */
  var ResourceId: typingsSlinky.awsSdk.workmailMod.ResourceId = js.native
}
object AssociateDelegateToResourceRequest {
  
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId, ResourceId: ResourceId): AssociateDelegateToResourceRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDelegateToResourceRequest]
  }
  
  @scala.inline
  implicit class AssociateDelegateToResourceRequestMutableBuilder[Self <: AssociateDelegateToResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
