package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest extends js.Object {
  
  /** The raw binary data. */
  var data: js.UndefOr[String] = js.native
  
  /** The digest of the blob. This MUST be the digest of `data`. */
  var digest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
}
object BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequestOps[Self <: BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDigest(value: BuildBazelRemoteExecutionV2Digest): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
  }
}
