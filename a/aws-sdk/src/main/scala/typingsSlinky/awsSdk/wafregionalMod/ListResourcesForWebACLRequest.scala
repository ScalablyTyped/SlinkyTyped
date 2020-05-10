package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesForWebACLRequest extends js.Object {
  /**
    * The type of resource to list, either an application load balancer or Amazon API Gateway.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ResourceType] = js.native
  /**
    * The unique identifier (ID) of the web ACL for which to list the associated resources.
    */
  var WebACLId: ResourceId = js.native
}

object ListResourcesForWebACLRequest {
  @scala.inline
  def apply(WebACLId: ResourceId): ListResourcesForWebACLRequest = {
    val __obj = js.Dynamic.literal(WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForWebACLRequest]
  }
  @scala.inline
  implicit class ListResourcesForWebACLRequestOps[Self <: ListResourcesForWebACLRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebACLId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACLId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

