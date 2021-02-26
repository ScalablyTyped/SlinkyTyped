package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemoteworkersV1test2CommandTaskInputs extends StObject {
  
  /**
    * The command itself to run (e.g., argv). This field should be passed directly to the underlying operating system, and so it must be sensible to that operating system. For example, on
    * Windows, the first argument might be "C:\Windows\System32\ping.exe" - that is, using drive letters and backslashes. A command for a *nix system, on the other hand, would use forward
    * slashes. All other fields in the RWAPI must consistently use forward slashes, since those fields may be interpretted by both the service and the bot.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.native
  
  /** All environment variables required by the task. */
  var environmentVariables: js.UndefOr[js.Array[GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable]] = js.native
  
  /**
    * The input filesystem to be set up prior to the task beginning. The contents should be a repeated set of FileMetadata messages though other formats are allowed if better for the
    * implementation (eg, a LUCI-style .isolated file). This field is repeated since implementations might want to cache the metadata, in which case it may be useful to break up portions
    * of the filesystem that change frequently (eg, specific input files) from those that don't (eg, standard header files).
    */
  var files: js.UndefOr[js.Array[GoogleDevtoolsRemoteworkersV1test2Digest]] = js.native
  
  /**
    * Inline contents for blobs expected to be needed by the bot to execute the task. For example, contents of entries in `files` or blobs that are indirectly referenced by an entry
    * there. The bot should check against this list before downloading required task inputs to reduce the number of communications between itself and the remote CAS server.
    */
  var inlineBlobs: js.UndefOr[js.Array[GoogleDevtoolsRemoteworkersV1test2Blob]] = js.native
  
  /**
    * Directory from which a command is executed. It is a relative directory with respect to the bot's working directory (i.e., "./"). If it is non-empty, then it must exist under "./".
    * Otherwise, "./" will be used.
    */
  var workingDirectory: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemoteworkersV1test2CommandTaskInputs {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemoteworkersV1test2CommandTaskInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2CommandTaskInputs]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsMutableBuilder[Self <: GoogleDevtoolsRemoteworkersV1test2CommandTaskInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentVariables(value: js.Array[GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesVarargs(value: GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable*): Self = StObject.set(x, "environmentVariables", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[GoogleDevtoolsRemoteworkersV1test2Digest]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: GoogleDevtoolsRemoteworkersV1test2Digest*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setInlineBlobs(value: js.Array[GoogleDevtoolsRemoteworkersV1test2Blob]): Self = StObject.set(x, "inlineBlobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineBlobsUndefined: Self = StObject.set(x, "inlineBlobs", js.undefined)
    
    @scala.inline
    def setInlineBlobsVarargs(value: GoogleDevtoolsRemoteworkersV1test2Blob*): Self = StObject.set(x, "inlineBlobs", js.Array(value :_*))
    
    @scala.inline
    def setWorkingDirectory(value: String): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
