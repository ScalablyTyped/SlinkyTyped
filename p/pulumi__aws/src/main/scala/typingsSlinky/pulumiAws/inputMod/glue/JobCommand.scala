package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobCommand extends js.Object {
  /**
    * The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, `maxCapacity` needs to be set if `pythonshell` is chosen.
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var pythonVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the S3 path to a script that executes a job.
    */
  var scriptLocation: Input[String] = js.native
}

object JobCommand {
  @scala.inline
  def apply(scriptLocation: Input[String]): JobCommand = {
    val __obj = js.Dynamic.literal(scriptLocation = scriptLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCommand]
  }
  @scala.inline
  implicit class JobCommandOps[Self <: JobCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScriptLocation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPythonVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pythonVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPythonVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pythonVersion")(js.undefined)
        ret
    }
  }
  
}

