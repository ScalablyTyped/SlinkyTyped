package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  var AllowedChildProcesses: js.Array[js.Object] = js.native
  var AppPackages: js.Array[String] = js.native
  var Description: js.UndefOr[String] = js.native
  var HostApplication: js.UndefOr[String] = js.native
  var Id: String = js.native
  var Instruction: js.Object = js.native
  var IsPublic: Boolean = js.native
  var Parameters: js.Object = js.native
  var RequiredEngineVersion: String = js.native
  var Version: Double = js.native
}

object Activity {
  @scala.inline
  def apply(
    AllowedChildProcesses: js.Array[js.Object],
    AppPackages: js.Array[String],
    Id: String,
    Instruction: js.Object,
    IsPublic: Boolean,
    Parameters: js.Object,
    RequiredEngineVersion: String,
    Version: Double
  ): Activity = {
    val __obj = js.Dynamic.literal(AllowedChildProcesses = AllowedChildProcesses.asInstanceOf[js.Any], AppPackages = AppPackages.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Instruction = Instruction.asInstanceOf[js.Any], IsPublic = IsPublic.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], RequiredEngineVersion = RequiredEngineVersion.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedChildProcesses(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedChildProcesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppPackages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppPackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstruction(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiredEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withHostApplication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostApplication")(js.undefined)
        ret
    }
  }
  
}

