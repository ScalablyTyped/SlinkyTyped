package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionConfiguration extends js.Object {
  /**
    * The expected encoding type of the input payload for the function. The default is ''json''.
    */
  var EncodingType: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.EncodingType] = js.native
  /**
    * The environment configuration of the function.
    */
  var Environment: js.UndefOr[FunctionConfigurationEnvironment] = js.native
  /**
    * The execution arguments.
    */
  var ExecArgs: js.UndefOr[string] = js.native
  /**
    * The name of the function executable.
    */
  var Executable: js.UndefOr[string] = js.native
  /**
    * The memory size, in KB, which the function requires. This setting is not applicable and should be cleared when you run the Lambda function without containerization.
    */
  var MemorySize: js.UndefOr[integer] = js.native
  /**
    * True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
    */
  var Pinned: js.UndefOr[boolean] = js.native
  /**
    * The allowed function execution time, after which Lambda should terminate the function. This timeout still applies to pinned Lambda functions for each request.
    */
  var Timeout: js.UndefOr[integer] = js.native
}

object FunctionConfiguration {
  @scala.inline
  def apply(): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfiguration]
  }
  @scala.inline
  implicit class FunctionConfigurationOps[Self <: FunctionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncodingType(value: EncodingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodingType")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: FunctionConfigurationEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(js.undefined)
        ret
    }
    @scala.inline
    def withExecArgs(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutable(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Executable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Executable")(js.undefined)
        ret
    }
    @scala.inline
    def withMemorySize(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemorySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemorySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemorySize")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(js.undefined)
        ret
    }
  }
  
}

