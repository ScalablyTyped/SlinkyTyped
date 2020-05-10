package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFileOutput extends js.Object {
  /**
    * The ID of the blob, which is its SHA-1 pointer.
    */
  var blobId: ObjectId = js.native
  /**
    * The full SHA ID of the commit that contains this file change.
    */
  var commitId: ObjectId = js.native
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains this file change.
    */
  var treeId: ObjectId = js.native
}

object PutFileOutput {
  @scala.inline
  def apply(blobId: ObjectId, commitId: ObjectId, treeId: ObjectId): PutFileOutput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileOutput]
  }
  @scala.inline
  implicit class PutFileOutputOps[Self <: PutFileOutput] (val x: Self) extends AnyVal {
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
    def withTreeId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

