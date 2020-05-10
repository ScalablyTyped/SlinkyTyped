package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for ContentAddressableStorage.FindMissingBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse extends js.Object {
  /**
    * A list of the blobs requested *not* present in the storage.
    */
  var missingBlobDigests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponseOps[Self <: SchemaBuildBazelRemoteExecutionV2FindMissingBlobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissingBlobDigests(value: js.Array[SchemaBuildBazelRemoteExecutionV2Digest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingBlobDigests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingBlobDigests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingBlobDigests")(js.undefined)
        ret
    }
  }
  
}

