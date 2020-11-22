package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemoteworkersV1test2CommandResult extends js.Object {
  
  /**
    * The elapsed time between calling Accept and Complete. The server will also have its own idea of what this should be, but this excludes the overhead of the RPCs and the bot response
    * time.
    */
  var duration: js.UndefOr[String] = js.native
  
  /** The exit code of the process. An exit code of "0" should only be trusted if `status` has a code of OK (otherwise it may simply be unset). */
  var exitCode: js.UndefOr[Double] = js.native
  
  /**
    * Implementation-dependent metadata about the task. Both servers and bots may define messages which can be encoded here; bots are free to provide metadata in multiple formats, and
    * servers are free to choose one or more of the values to process and ignore others. In particular, it is *not* considered an error for the bot to provide the server with a field that
    * it doesn't know about.
    */
  var metadata: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.GoogleDevtoolsRemoteworkersV1test2CommandResult with TopLevel[js.Any]
    ]
  ] = js.native
  
  /**
    * The output files. The blob referenced by the digest should contain one of the following (implementation-dependent): * A marshalled DirectoryMetadata of the returned filesystem * A
    * LUCI-style .isolated file
    */
  var outputs: js.UndefOr[GoogleDevtoolsRemoteworkersV1test2Digest] = js.native
  
  /** The amount of time *not* spent executing the command (ie uploading/downloading files). */
  var overhead: js.UndefOr[String] = js.native
  
  /**
    * An overall status for the command. For example, if the command timed out, this might have a code of DEADLINE_EXCEEDED; if it was killed by the OS for memory exhaustion, it might
    * have a code of RESOURCE_EXHAUSTED.
    */
  var status: js.UndefOr[GoogleRpcStatus] = js.native
}
object GoogleDevtoolsRemoteworkersV1test2CommandResult {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemoteworkersV1test2CommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2CommandResult]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemoteworkersV1test2CommandResultOps[Self <: GoogleDevtoolsRemoteworkersV1test2CommandResult] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    
    @scala.inline
    def setMetadataVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.GoogleDevtoolsRemoteworkersV1test2CommandResult with TopLevel[js.Any])*
    ): Self = this.set("metadata", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.GoogleDevtoolsRemoteworkersV1test2CommandResult with TopLevel[js.Any]
        ]
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOutputs(value: GoogleDevtoolsRemoteworkersV1test2Digest): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    
    @scala.inline
    def setOverhead(value: String): Self = this.set("overhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverhead: Self = this.set("overhead", js.undefined)
    
    @scala.inline
    def setStatus(value: GoogleRpcStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
