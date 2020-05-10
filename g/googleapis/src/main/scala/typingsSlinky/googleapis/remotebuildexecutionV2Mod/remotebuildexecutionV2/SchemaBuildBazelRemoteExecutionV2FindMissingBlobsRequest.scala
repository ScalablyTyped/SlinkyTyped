package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for ContentAddressableStorage.FindMissingBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest extends js.Object {
  /**
    * A list of the blobs to check.
    */
  var blobDigests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequestOps[Self <: SchemaBuildBazelRemoteExecutionV2FindMissingBlobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlobDigests(value: js.Array[SchemaBuildBazelRemoteExecutionV2Digest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobDigests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobDigests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobDigests")(js.undefined)
        ret
    }
  }
  
}

