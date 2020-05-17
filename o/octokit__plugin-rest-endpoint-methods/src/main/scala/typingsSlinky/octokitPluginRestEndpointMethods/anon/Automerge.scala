package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Automerge extends js.Object {
  var auto_merge: Type = js.native
  var description: Type = js.native
  var environment: Type = js.native
  var owner: Required = js.native
  var payload: Type = js.native
  var production_environment: Type = js.native
  var ref: Required = js.native
  var repo: Required = js.native
  var required_contexts: Type = js.native
  var task: Type = js.native
  var transient_environment: Type = js.native
}

object Automerge {
  @scala.inline
  def apply(
    auto_merge: Type,
    description: Type,
    environment: Type,
    owner: Required,
    payload: Type,
    production_environment: Type,
    ref: Required,
    repo: Required,
    required_contexts: Type,
    task: Type,
    transient_environment: Type
  ): Automerge = {
    val __obj = js.Dynamic.literal(auto_merge = auto_merge.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], production_environment = production_environment.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], required_contexts = required_contexts.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], transient_environment = transient_environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automerge]
  }
  @scala.inline
  implicit class AutomergeOps[Self <: Automerge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_merge(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduction_environment(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production_environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_contexts(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransient_environment(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient_environment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

