package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2FindMissingBlobsResponse extends StObject {
  
  /** A list of the blobs requested *not* present in the storage. */
  var missingBlobDigests: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2Digest]] = js.native
}
object BuildBazelRemoteExecutionV2FindMissingBlobsResponse {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2FindMissingBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2FindMissingBlobsResponseMutableBuilder[Self <: BuildBazelRemoteExecutionV2FindMissingBlobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissingBlobDigests(value: js.Array[BuildBazelRemoteExecutionV2Digest]): Self = StObject.set(x, "missingBlobDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingBlobDigestsUndefined: Self = StObject.set(x, "missingBlobDigests", js.undefined)
    
    @scala.inline
    def setMissingBlobDigestsVarargs(value: BuildBazelRemoteExecutionV2Digest*): Self = StObject.set(x, "missingBlobDigests", js.Array(value :_*))
  }
}
