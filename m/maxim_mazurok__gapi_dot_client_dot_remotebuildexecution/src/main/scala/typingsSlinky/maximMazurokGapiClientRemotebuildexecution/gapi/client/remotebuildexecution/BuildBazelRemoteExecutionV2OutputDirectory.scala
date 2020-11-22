package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2OutputDirectory extends js.Object {
  
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
  implicit class BuildBazelRemoteExecutionV2OutputDirectoryOps[Self <: BuildBazelRemoteExecutionV2OutputDirectory] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTreeDigest(value: BuildBazelRemoteExecutionV2Digest): Self = this.set("treeDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeDigest: Self = this.set("treeDigest", js.undefined)
  }
}
