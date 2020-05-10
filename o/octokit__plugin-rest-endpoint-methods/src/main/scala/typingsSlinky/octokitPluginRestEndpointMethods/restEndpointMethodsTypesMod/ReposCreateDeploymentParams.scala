package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateDeploymentParams extends js.Object {
  /**
    * Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.
    */
  var auto_merge: js.UndefOr[Boolean] = js.native
  /**
    * Short description of the deployment.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
    */
  var environment: js.UndefOr[String] = js.native
  var owner: String = js.native
  /**
    * JSON payload with extra information about the deployment.
    */
  var payload: js.UndefOr[String] = js.native
  /**
    * Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise.
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var production_environment: js.UndefOr[Boolean] = js.native
  /**
    * The ref to deploy. This can be a branch, tag, or SHA.
    */
  var ref: String = js.native
  var repo: String = js.native
  /**
    * The [status](https://developer.github.com/v3/repos/statuses/) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts.
    */
  var required_contexts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
    */
  var task: js.UndefOr[String] = js.native
  /**
    * Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false`
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var transient_environment: js.UndefOr[Boolean] = js.native
}

object ReposCreateDeploymentParams {
  @scala.inline
  def apply(owner: String, ref: String, repo: String): ReposCreateDeploymentParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentParams]
  }
  @scala.inline
  implicit class ReposCreateDeploymentParamsOps[Self <: ReposCreateDeploymentParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuto_merge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_merge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_merge")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withProduction_environment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production_environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduction_environment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production_environment")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired_contexts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired_contexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_contexts")(js.undefined)
        ret
    }
    @scala.inline
    def withTask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(js.undefined)
        ret
    }
    @scala.inline
    def withTransient_environment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient_environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransient_environment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient_environment")(js.undefined)
        ret
    }
  }
  
}

