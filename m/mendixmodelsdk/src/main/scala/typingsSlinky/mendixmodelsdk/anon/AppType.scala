package typingsSlinky.mendixmodelsdk.anon

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.Licensed
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.Sandbox
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.Unlicensed
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.success
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IBuildError
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IEnvironmentStatus
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IProblem
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.SuccessAppState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppType extends IEnvironmentStatus {
  var appType: js.UndefOr[Licensed | Unlicensed | Sandbox] = js.native
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.native
  var buildstatus: String | Null = js.native
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.native
  var disk: Double = js.native
  var endpoint: String = js.native
  var environmentId: String = js.native
  var instances: Double = js.native
  var memory: Double = js.native
  var message: js.UndefOr[String] = js.native
  var name: String = js.native
  var profile: String = js.native
  var state: SuccessAppState = js.native
  var `type`: success = js.native
  var url: String = js.native
}

object AppType {
  @scala.inline
  def apply(
    disk: Double,
    endpoint: String,
    environmentId: String,
    instances: Double,
    memory: Double,
    name: String,
    profile: String,
    state: SuccessAppState,
    `type`: success,
    url: String
  ): AppType = {
    val __obj = js.Dynamic.literal(disk = disk.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppType]
  }
  @scala.inline
  implicit class AppTypeOps[Self <: AppType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: SuccessAppState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppType(value: Licensed | Unlicensed | Sandbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appType")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildErrors(value: js.Array[IBuildError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildstatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildstatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildstatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildstatus")(null)
        ret
    }
    @scala.inline
    def withConsistencyErrors(value: js.Array[IProblem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistencyErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistencyErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistencyErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

