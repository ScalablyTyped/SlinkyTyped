package typingsSlinky.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourceRequest extends js.Object {
  /**
    * The identifier associated with the organization for which the resource is described.
    */
  var OrganizationId: typingsSlinky.awsDashSdk.clientsWorkmailMod.OrganizationId = js.native
  /**
    * The identifier of the resource to be described.
    */
  var ResourceId: typingsSlinky.awsDashSdk.clientsWorkmailMod.ResourceId = js.native
}

object DescribeResourceRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): DescribeResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeResourceRequest]
  }
}

