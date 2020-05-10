package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsRevisionsDelete extends StandardParameters {
  /**
    * Cloud Run currently ignores this parameter.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Cloud Run currently ignores this parameter.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the revision being deleted. If needed, replace {namespace_id}
    * with the project ID.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. Specifies the cascade behavior on delete. Cloud Run only
    * supports cascading behavior, so this must be false. This attribute is
    * deprecated, and is now replaced with PropagationPolicy See
    * https://github.com/kubernetes/kubernetes/issues/46659 for more info.
    */
  var orphanDependents: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the propagation policy of delete. Cloud Run currently ignores
    * this setting, and deletes in the background. Please see
    * kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for
    * more information.
    */
  var propagationPolicy: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsRevisionsDelete {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsRevisionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRevisionsDelete]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsRevisionsDeleteOps[Self <: ParamsResourceProjectsLocationsRevisionsDelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrphanDependents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphanDependents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrphanDependents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphanDependents")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagationPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagationPolicy")(js.undefined)
        ret
    }
  }
  
}

