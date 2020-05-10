package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for ContentAddressableStorage.BatchUpdateBlobs.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest extends js.Object {
  /**
    * The individual upload requests.
    */
  var requests: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestOps[Self <: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequests(value: js.Array[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
  }
  
}

