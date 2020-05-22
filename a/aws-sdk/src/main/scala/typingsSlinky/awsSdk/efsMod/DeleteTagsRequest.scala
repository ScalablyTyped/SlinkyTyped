package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsRequest extends js.Object {
  /**
    * The ID of the file system whose tags you want to delete (String).
    */
  var FileSystemId: typingsSlinky.awsSdk.efsMod.FileSystemId = js.native
  /**
    * A list of tag keys to delete.
    */
  var TagKeys: typingsSlinky.awsSdk.efsMod.TagKeys = js.native
}

object DeleteTagsRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, TagKeys: TagKeys): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsRequest]
  }
}

