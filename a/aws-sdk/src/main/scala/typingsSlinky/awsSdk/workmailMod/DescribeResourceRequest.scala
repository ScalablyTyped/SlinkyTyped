package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeResourceRequest extends StObject {
  
  /**
    * The identifier associated with the organization for which the resource is described.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The identifier of the resource to be described.
    */
  var ResourceId: typingsSlinky.awsSdk.workmailMod.ResourceId = js.native
}
object DescribeResourceRequest {
  
  @scala.inline
  def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): DescribeResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceRequest]
  }
  
  @scala.inline
  implicit class DescribeResourceRequestMutableBuilder[Self <: DescribeResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
