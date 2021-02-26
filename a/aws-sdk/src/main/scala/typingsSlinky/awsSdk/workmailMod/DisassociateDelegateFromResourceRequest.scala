package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateDelegateFromResourceRequest extends StObject {
  
  /**
    * The identifier for the member (user, group) to be removed from the resource's delegates.
    */
  var EntityId: WorkMailIdentifier = js.native
  
  /**
    * The identifier for the organization under which the resource exists.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The identifier of the resource from which delegates' set members are removed. 
    */
  var ResourceId: typingsSlinky.awsSdk.workmailMod.ResourceId = js.native
}
object DisassociateDelegateFromResourceRequest {
  
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId, ResourceId: ResourceId): DisassociateDelegateFromResourceRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDelegateFromResourceRequest]
  }
  
  @scala.inline
  implicit class DisassociateDelegateFromResourceRequestMutableBuilder[Self <: DisassociateDelegateFromResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
