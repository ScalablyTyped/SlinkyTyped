package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An execution of an arbitrary tool. It could be a test runner or a tool
  * copying artifacts or deploying code.
  */
@js.native
trait SchemaToolExecution extends js.Object {
  /**
    * The full tokenized command line including the program name (equivalent to
    * argv in a C program).  - In response: present if set by create request -
    * In create request: optional - In update request: never set
    */
  var commandLineArguments: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tool execution exit code. This field will be set once the tool has
    * exited.  - In response: present if set by create/update request - In
    * create request: optional - In update request: optional, a
    * FAILED_PRECONDITION error will be returned if an exit_code is already
    * set.
    */
  var exitCode: js.UndefOr[SchemaToolExitCode] = js.native
  /**
    * References to any plain text logs output the tool execution.  This field
    * can be set before the tool has exited in order to be able to have access
    * to a live view of the logs while the tool is running.  The maximum
    * allowed number of tool logs per step is 1000.  - In response: present if
    * set by create/update request - In create request: optional - In update
    * request: optional, any value provided will be appended to the existing
    * list
    */
  var toolLogs: js.UndefOr[js.Array[SchemaFileReference]] = js.native
  /**
    * References to opaque files of any format output by the tool execution.
    * The maximum allowed number of tool outputs per step is 1000.  - In
    * response: present if set by create/update request - In create request:
    * optional - In update request: optional, any value provided will be
    * appended to the existing list
    */
  var toolOutputs: js.UndefOr[js.Array[SchemaToolOutputReference]] = js.native
}

object SchemaToolExecution {
  @scala.inline
  def apply(): SchemaToolExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolExecution]
  }
  @scala.inline
  implicit class SchemaToolExecutionOps[Self <: SchemaToolExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandLineArguments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLineArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandLineArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLineArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withExitCode(value: SchemaToolExitCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(js.undefined)
        ret
    }
    @scala.inline
    def withToolLogs(value: js.Array[SchemaFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withToolOutputs(value: js.Array[SchemaToolOutputReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolOutputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolOutputs")(js.undefined)
        ret
    }
  }
  
}

