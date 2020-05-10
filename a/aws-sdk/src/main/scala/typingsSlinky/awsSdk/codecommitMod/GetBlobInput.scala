package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlobInput extends js.Object {
  /**
    * The ID of the blob, which is its SHA-1 pointer.
    */
  var blobId: ObjectId = js.native
  /**
    * The name of the repository that contains the blob.
    */
  var repositoryName: RepositoryName = js.native
}

object GetBlobInput {
  @scala.inline
  def apply(blobId: ObjectId, repositoryName: RepositoryName): GetBlobInput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlobInput]
  }
  @scala.inline
  implicit class GetBlobInputOps[Self <: GetBlobInput] (val x: Self) extends AnyVal {
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
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

