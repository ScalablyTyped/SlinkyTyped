package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autoinactive extends js.Object {
  var auto_inactive: Type = js.native
  var deployment_id: Required = js.native
  var description: Type = js.native
  var environment: Enum = js.native
  var environment_url: Type = js.native
  var log_url: Type = js.native
  var owner: Required = js.native
  var repo: Required = js.native
  var state: EnumRequired = js.native
  var target_url: Type = js.native
}

object Autoinactive {
  @scala.inline
  def apply(
    auto_inactive: Type,
    deployment_id: Required,
    description: Type,
    environment: Enum,
    environment_url: Type,
    log_url: Type,
    owner: Required,
    repo: Required,
    state: EnumRequired,
    target_url: Type
  ): Autoinactive = {
    val __obj = js.Dynamic.literal(auto_inactive = auto_inactive.asInstanceOf[js.Any], deployment_id = deployment_id.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environment_url = environment_url.asInstanceOf[js.Any], log_url = log_url.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoinactive]
  }
  @scala.inline
  implicit class AutoinactiveOps[Self <: Autoinactive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_inactive(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployment_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment_url(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog_url(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: EnumRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_url(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

