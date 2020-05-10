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
  @scala.inline
  implicit class DeleteTagsRequestOps[Self <: DeleteTagsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
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

