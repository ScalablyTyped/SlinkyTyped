package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceNamespacesRoutesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional encoded string to continue paging.
    */
  var continue: js.UndefOr[String] = js.native
  /**
    * Allows to filter resources based on a specific value for a field name.
    * Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not
    * currently used by Cloud Run.
    */
  var fieldSelector: js.UndefOr[String] = js.native
  /**
    * Not currently used by Cloud Run.
    */
  var includeUninitialized: js.UndefOr[Boolean] = js.native
  /**
    * Allows to filter resources based on a label. Supported operations are =,
    * !=, exists, in, and notIn.
    */
  var labelSelector: js.UndefOr[String] = js.native
  /**
    * The maximum number of records that should be returned.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The project ID or project number from which the routes should be listed.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The baseline resource version from which the list or watch operation
    * should start. Not currently used by Cloud Run.
    */
  var resourceVersion: js.UndefOr[String] = js.native
  /**
    * Flag that indicates that the client expects to watch this resource as
    * well. Not currently used by Cloud Run.
    */
  var watch: js.UndefOr[Boolean] = js.native
}

object ParamsResourceNamespacesRoutesList {
  @scala.inline
  def apply(): ParamsResourceNamespacesRoutesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNamespacesRoutesList]
  }
  @scala.inline
  implicit class ParamsResourceNamespacesRoutesListOps[Self <: ParamsResourceNamespacesRoutesList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withContinue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continue")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUninitialized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUninitialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUninitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUninitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

