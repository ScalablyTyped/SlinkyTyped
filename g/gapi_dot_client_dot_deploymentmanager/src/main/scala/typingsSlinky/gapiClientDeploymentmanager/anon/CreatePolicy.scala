package typingsSlinky.gapiClientDeploymentmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicy extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Sets the policy to use for creating new resources. */
  var createPolicy: js.UndefOr[String] = js.native
  /** Sets the policy to use for deleting resources. */
  var deletePolicy: js.UndefOr[String] = js.native
  /** The name of the deployment for this request. */
  var deployment: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, updates the deployment and creates and updates the "shell" resources but does not actually alter or instantiate these resources. This
    * allows you to preview what your deployment will look like. You can use this intent to preview how an update would affect your deployment. You must
    * provide a target.config with a configuration if this is set to true. After previewing a deployment, you can deploy your resources by making a request
    * with the update() or you can cancelPreview() to remove the preview altogether. Note that the deployment will still exist after you cancel the preview
    * and you must separately delete this deployment if you want to remove it.
    */
  var preview: js.UndefOr[Boolean] = js.native
  /** The project ID for this request. */
  var project: String = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object CreatePolicy {
  @scala.inline
  def apply(deployment: String, project: String): CreatePolicy = {
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicy]
  }
  @scala.inline
  implicit class CreatePolicyOps[Self <: CreatePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatePolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletePolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(js.undefined)
        ret
    }
  }
  
}

