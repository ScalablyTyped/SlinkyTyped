package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for ContentAddressableStorage.BatchReadBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest extends js.Object {
  /**
    * The individual blob digests.
    */
  var digests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Digest]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequestOps[Self <: SchemaBuildBazelRemoteExecutionV2BatchReadBlobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigests(value: js.Array[SchemaBuildBazelRemoteExecutionV2Digest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digests")(js.undefined)
        ret
    }
  }
  
}

