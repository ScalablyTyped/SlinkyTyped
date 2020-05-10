package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileOutput extends js.Object {
  /**
    * The blob ID removed from the tree as part of deleting the file.
    */
  var blobId: ObjectId = js.native
  /**
    * The full commit ID of the commit that contains the change that deletes the file.
    */
  var commitId: ObjectId = js.native
  /**
    * The fully qualified path to the file to be deleted, including the full name and extension of that file.
    */
  var filePath: Path = js.native
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
    */
  var treeId: ObjectId = js.native
}

object DeleteFileOutput {
  @scala.inline
  def apply(blobId: ObjectId, commitId: ObjectId, filePath: Path, treeId: ObjectId): DeleteFileOutput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileOutput]
  }
  @scala.inline
  implicit class DeleteFileOutputOps[Self <: DeleteFileOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlobId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

