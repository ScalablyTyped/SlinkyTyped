package typingsSlinky.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolExecution extends js.Object {
  
  /**
    * The full tokenized command line including the program name (equivalent to argv in a C program). - In response: present if set by create request - In create request: optional - In
    * update request: never set
    */
  var commandLineArguments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Tool execution exit code. This field will be set once the tool has exited. - In response: present if set by create/update request - In create request: optional - In update request:
    * optional, a FAILED_PRECONDITION error will be returned if an exit_code is already set.
    */
  var exitCode: js.UndefOr[ToolExitCode] = js.native
  
  /**
    * References to any plain text logs output the tool execution. This field can be set before the tool has exited in order to be able to have access to a live view of the logs while the
    * tool is running. The maximum allowed number of tool logs per step is 1000. - In response: present if set by create/update request - In create request: optional - In update request:
    * optional, any value provided will be appended to the existing list
    */
  var toolLogs: js.UndefOr[js.Array[FileReference]] = js.native
  
  /**
    * References to opaque files of any format output by the tool execution. The maximum allowed number of tool outputs per step is 1000. - In response: present if set by create/update
    * request - In create request: optional - In update request: optional, any value provided will be appended to the existing list
    */
  var toolOutputs: js.UndefOr[js.Array[ToolOutputReference]] = js.native
}
object ToolExecution {
  
  @scala.inline
  def apply(): ToolExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolExecution]
  }
  
  @scala.inline
  implicit class ToolExecutionOps[Self <: ToolExecution] (val x: Self) extends AnyVal {
    
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
    def setCommandLineArgumentsVarargs(value: String*): Self = this.set("commandLineArguments", js.Array(value :_*))
    
    @scala.inline
    def setCommandLineArguments(value: js.Array[String]): Self = this.set("commandLineArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandLineArguments: Self = this.set("commandLineArguments", js.undefined)
    
    @scala.inline
    def setExitCode(value: ToolExitCode): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    
    @scala.inline
    def setToolLogsVarargs(value: FileReference*): Self = this.set("toolLogs", js.Array(value :_*))
    
    @scala.inline
    def setToolLogs(value: js.Array[FileReference]): Self = this.set("toolLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolLogs: Self = this.set("toolLogs", js.undefined)
    
    @scala.inline
    def setToolOutputsVarargs(value: ToolOutputReference*): Self = this.set("toolOutputs", js.Array(value :_*))
    
    @scala.inline
    def setToolOutputs(value: js.Array[ToolOutputReference]): Self = this.set("toolOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolOutputs: Self = this.set("toolOutputs", js.undefined)
  }
}
