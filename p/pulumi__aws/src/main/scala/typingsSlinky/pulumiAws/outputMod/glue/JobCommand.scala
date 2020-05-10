package typingsSlinky.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobCommand extends js.Object {
  /**
    * The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, `maxCapacity` needs to be set if `pythonshell` is chosen.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var pythonVersion: String = js.native
  /**
    * Specifies the S3 path to a script that executes a job.
    */
  var scriptLocation: String = js.native
}

object JobCommand {
  @scala.inline
  def apply(pythonVersion: String, scriptLocation: String): JobCommand = {
    val __obj = js.Dynamic.literal(pythonVersion = pythonVersion.asInstanceOf[js.Any], scriptLocation = scriptLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCommand]
  }
  @scala.inline
  implicit class JobCommandOps[Self <: JobCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPythonVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pythonVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
  }
  
}

