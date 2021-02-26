package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2OutputDirectory extends StObject {
  
  /**
    * The full path of the directory relative to the working directory. The path separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin with a leading forward
    * slash. The empty string value is allowed, and it denotes the entire working directory.
    */
  var path: js.UndefOr[String] = js.native
  
  /** The digest of the encoded Tree proto containing the directory's contents. */
  var treeDigest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
}
object BuildBazelRemoteExecutionV2OutputDirectory {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2OutputDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2OutputDirectory]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2OutputDirectoryMutableBuilder[Self <: BuildBazelRemoteExecutionV2OutputDirectory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTreeDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "treeDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDigestUndefined: Self = StObject.set(x, "treeDigest", js.undefined)
  }
}
