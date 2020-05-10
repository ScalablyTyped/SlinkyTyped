package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a single script process execution that was started from
  * the script editor, a trigger, an application, or using the Apps Script API.
  * This is distinct from the `Operation` resource, which only represents
  * executions started via the Apps Script API.
  */
@js.native
trait SchemaGoogleAppsScriptTypeProcess extends js.Object {
  /**
    * Duration the execution spent executing.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Name of the function the started the execution.
    */
  var functionName: js.UndefOr[String] = js.native
  /**
    * The executions status.
    */
  var processStatus: js.UndefOr[String] = js.native
  /**
    * The executions type.
    */
  var processType: js.UndefOr[String] = js.native
  /**
    * Name of the script being executed.
    */
  var projectName: js.UndefOr[String] = js.native
  /**
    * Time the execution started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The executing users access level to the script.
    */
  var userAccessLevel: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeProcess {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeProcess]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeProcessOps[Self <: SchemaGoogleAppsScriptTypeProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processType")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAccessLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAccessLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAccessLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAccessLevel")(js.undefined)
        ret
    }
  }
  
}

