package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2OutputFile extends StObject {
  
  /**
    * The contents of the file if inlining was requested. The server SHOULD NOT inline file contents unless requested by the client in the GetActionResultRequest message. The server MAY
    * omit inlining, even if requested, and MUST do so if inlining would cause the response to exceed message size limits.
    */
  var contents: js.UndefOr[String] = js.native
  
  /** The digest of the file's content. */
  var digest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
  
  /** True if file is executable, false otherwise. */
  var isExecutable: js.UndefOr[Boolean] = js.native
  
  /** The supported node properties of the OutputFile, if requested by the Action. */
  var nodeProperties: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2NodeProperty]] = js.native
  
  /**
    * The full path of the file relative to the working directory, including the filename. The path separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin with
    * a leading forward slash.
    */
  var path: js.UndefOr[String] = js.native
}
object BuildBazelRemoteExecutionV2OutputFile {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2OutputFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2OutputFile]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2OutputFileMutableBuilder[Self <: BuildBazelRemoteExecutionV2OutputFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setIsExecutable(value: Boolean): Self = StObject.set(x, "isExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExecutableUndefined: Self = StObject.set(x, "isExecutable", js.undefined)
    
    @scala.inline
    def setNodeProperties(value: js.Array[BuildBazelRemoteExecutionV2NodeProperty]): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    @scala.inline
    def setNodePropertiesVarargs(value: BuildBazelRemoteExecutionV2NodeProperty*): Self = StObject.set(x, "nodeProperties", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
