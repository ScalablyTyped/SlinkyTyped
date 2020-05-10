package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceRequest extends js.Object {
  /**
    * Identifier (ID) of the directory from which to remove the tag.
    */
  var ResourceId: typingsSlinky.awsSdk.directoryserviceMod.ResourceId = js.native
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: typingsSlinky.awsSdk.directoryserviceMod.TagKeys = js.native
}

object RemoveTagsFromResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, TagKeys: TagKeys): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
  @scala.inline
  implicit class RemoveTagsFromResourceRequestOps[Self <: RemoveTagsFromResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagKeys(value: TagKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

