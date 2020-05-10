package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetDeploymentStatusResponse extends js.Object {
  var created_at: String = js.native
  var creator: ReposGetDeploymentStatusResponseCreator = js.native
  var deployment_url: String = js.native
  var description: String = js.native
  var environment: String = js.native
  var environment_url: String = js.native
  var id: Double = js.native
  var log_url: String = js.native
  var node_id: String = js.native
  var repository_url: String = js.native
  var state: String = js.native
  var target_url: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object ReposGetDeploymentStatusResponse {
  @scala.inline
  def apply(
    created_at: String,
    creator: ReposGetDeploymentStatusResponseCreator,
    deployment_url: String,
    description: String,
    environment: String,
    environment_url: String,
    id: Double,
    log_url: String,
    node_id: String,
    repository_url: String,
    state: String,
    target_url: String,
    updated_at: String,
    url: String
  ): ReposGetDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], deployment_url = deployment_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environment_url = environment_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], log_url = log_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetDeploymentStatusResponse]
  }
  @scala.inline
  implicit class ReposGetDeploymentStatusResponseOps[Self <: ReposGetDeploymentStatusResponse] (val x: Self) extends AnyVal {
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
    def withCreator(value: ReposGetDeploymentStatusResponseCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployment_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment_url")(value.asInstanceOf[js.Any])
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
    def withEnvironment_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_url")(value.asInstanceOf[js.Any])
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

