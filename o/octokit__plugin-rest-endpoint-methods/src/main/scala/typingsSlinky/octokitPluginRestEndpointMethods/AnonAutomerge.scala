package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutomerge extends js.Object {
  var auto_merge: AnonType = js.native
  var description: AnonType = js.native
  var environment: AnonType = js.native
  var owner: AnonRequired = js.native
  var payload: AnonType = js.native
  var production_environment: AnonType = js.native
  var ref: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var required_contexts: AnonType = js.native
  var task: AnonType = js.native
  var transient_environment: AnonType = js.native
}

object AnonAutomerge {
  @scala.inline
  def apply(
    auto_merge: AnonType,
    description: AnonType,
    environment: AnonType,
    owner: AnonRequired,
    payload: AnonType,
    production_environment: AnonType,
    ref: AnonRequired,
    repo: AnonRequired,
    required_contexts: AnonType,
    task: AnonType,
    transient_environment: AnonType
  ): AnonAutomerge = {
    val __obj = js.Dynamic.literal(auto_merge = auto_merge.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], production_environment = production_environment.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], required_contexts = required_contexts.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], transient_environment = transient_environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutomerge]
  }
  @scala.inline
  implicit class AnonAutomergeOps[Self <: AnonAutomerge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_merge(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduction_environment(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production_environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_contexts(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransient_environment(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient_environment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

