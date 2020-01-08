package typingsSlinky.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceRequest extends js.Object {
  /**
    * Identifier (ID) of the directory from which to remove the tag.
    */
  var ResourceId: typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.ResourceId = js.native
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.TagKeys = js.native
}

object RemoveTagsFromResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, TagKeys: TagKeys): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
}

