package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobCommand extends js.Object {
  /**
    * The name of the job command. For an Apache Spark ETL job, this must be glueetl. For a Python shell job, it must be pythonshell.
    */
  var Name: js.UndefOr[GenericString] = js.native
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var PythonVersion: js.UndefOr[PythonVersionString] = js.native
  /**
    * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
    */
  var ScriptLocation: js.UndefOr[ScriptLocationString] = js.native
}

object JobCommand {
  @scala.inline
  def apply(): JobCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobCommand]
  }
  @scala.inline
  implicit class JobCommandOps[Self <: JobCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPythonVersion(value: PythonVersionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PythonVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPythonVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PythonVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptLocation(value: ScriptLocationString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptLocation")(js.undefined)
        ret
    }
  }
  
}

