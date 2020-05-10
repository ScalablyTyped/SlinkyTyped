package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeTagsForResourceRequest extends js.Object {
  /**
    * A complex type that contains a list of the tags that you want to add to the specified health check or hosted zone and/or the tags that you want to edit Value for. You can add a maximum of 10 tags to a health check or a hosted zone.
    */
  var AddTags: js.UndefOr[TagList] = js.native
  /**
    * A complex type that contains a list of the tags that you want to delete from the specified health check or hosted zone. You can specify up to 10 keys.
    */
  var RemoveTagKeys: js.UndefOr[TagKeyList] = js.native
  /**
    * The ID of the resource for which you want to add, change, or delete tags.
    */
  var ResourceId: TagResourceId = js.native
  /**
    * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: TagResourceType = js.native
}

object ChangeTagsForResourceRequest {
  @scala.inline
  def apply(ResourceId: TagResourceId, ResourceType: TagResourceType): ChangeTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTagsForResourceRequest]
  }
  @scala.inline
  implicit class ChangeTagsForResourceRequestOps[Self <: ChangeTagsForResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: TagResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: TagResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveTagKeys(value: TagKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveTagKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveTagKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveTagKeys")(js.undefined)
        ret
    }
  }
  
}

