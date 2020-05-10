package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourcesRequest extends js.Object {
  /**
    * A complex type that contains the ResourceId element for each resource for which you want to get a list of tags.
    */
  var ResourceIds: TagResourceIdList = js.native
  /**
    * The type of the resources.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: TagResourceType = js.native
}

object ListTagsForResourcesRequest {
  @scala.inline
  def apply(ResourceIds: TagResourceIdList, ResourceType: TagResourceType): ListTagsForResourcesRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourcesRequest]
  }
  @scala.inline
  implicit class ListTagsForResourcesRequestOps[Self <: ListTagsForResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceIds(value: TagResourceIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: TagResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

