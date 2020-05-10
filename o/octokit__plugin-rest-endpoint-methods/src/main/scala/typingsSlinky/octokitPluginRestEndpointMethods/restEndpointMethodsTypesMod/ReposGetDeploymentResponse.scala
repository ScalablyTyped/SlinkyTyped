package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetDeploymentResponse extends js.Object {
  var created_at: String = js.native
  var creator: ReposGetDeploymentResponseCreator = js.native
  var description: String = js.native
  var environment: String = js.native
  var id: Double = js.native
  var node_id: String = js.native
  var original_environment: String = js.native
  var payload: ReposGetDeploymentResponsePayload = js.native
  var production_environment: Boolean = js.native
  var ref: String = js.native
  var repository_url: String = js.native
  var sha: String = js.native
  var statuses_url: String = js.native
  var task: String = js.native
  var transient_environment: Boolean = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object ReposGetDeploymentResponse {
  @scala.inline
  def apply(
    created_at: String,
    creator: ReposGetDeploymentResponseCreator,
    description: String,
    environment: String,
    id: Double,
    node_id: String,
    original_environment: String,
    payload: ReposGetDeploymentResponsePayload,
    production_environment: Boolean,
    ref: String,
    repository_url: String,
    sha: String,
    statuses_url: String,
    task: String,
    transient_environment: Boolean,
    updated_at: String,
    url: String
  ): ReposGetDeploymentResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], original_environment = original_environment.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], production_environment = production_environment.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], transient_environment = transient_environment.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetDeploymentResponse]
  }
  @scala.inline
  implicit class ReposGetDeploymentResponseOps[Self <: ReposGetDeploymentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: ReposGetDeploymentResponseCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_environment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: ReposGetDeploymentResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduction_environment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production_environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransient_environment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient_environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

