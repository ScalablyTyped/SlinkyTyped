package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoinactive extends js.Object {
  var auto_inactive: AnonType = js.native
  var deployment_id: AnonRequired = js.native
  var description: AnonType = js.native
  var environment: AnonEnum = js.native
  var environment_url: AnonType = js.native
  var log_url: AnonType = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var state: AnonEnumRequired = js.native
  var target_url: AnonType = js.native
}

object AnonAutoinactive {
  @scala.inline
  def apply(
    auto_inactive: AnonType,
    deployment_id: AnonRequired,
    description: AnonType,
    environment: AnonEnum,
    environment_url: AnonType,
    log_url: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    state: AnonEnumRequired,
    target_url: AnonType
  ): AnonAutoinactive = {
    val __obj = js.Dynamic.literal(auto_inactive = auto_inactive.asInstanceOf[js.Any], deployment_id = deployment_id.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environment_url = environment_url.asInstanceOf[js.Any], log_url = log_url.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoinactive]
  }
  @scala.inline
  implicit class AnonAutoinactiveOps[Self <: AnonAutoinactive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_inactive(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployment_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment_url(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog_url(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: AnonEnumRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_url(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

