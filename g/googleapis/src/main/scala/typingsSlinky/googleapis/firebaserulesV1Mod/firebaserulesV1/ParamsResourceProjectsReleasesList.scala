package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsReleasesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * `Release` filter. The list method supports filters with restrictions on
    * the `Release.name`, `Release.ruleset_name`, and
    * `Release.test_suite_name`.  Example 1: A filter of 'name=prod*' might
    * return `Release`s with names within 'projects/foo' prefixed with 'prod':
    * Name                          | Ruleset Name
    * ------------------------------|------------- projects/foo/releases/prod
    * | projects/foo/rulesets/uuid1234 projects/foo/releases/prod/v1 |
    * projects/foo/rulesets/uuid1234 projects/foo/releases/prod/v2 |
    * projects/foo/rulesets/uuid8888  Example 2: A filter of `name=prod*
    * ruleset_name=uuid1234` would return only `Release` instances for
    * 'projects/foo' with names prefixed with 'prod' referring to the same
    * `Ruleset` name of 'uuid1234':  Name                          | Ruleset
    * Name ------------------------------|-------------
    * projects/foo/releases/prod    | projects/foo/rulesets/1234
    * projects/foo/releases/prod/v1 | projects/foo/rulesets/1234  In the
    * examples, the filter parameters refer to the search filters are relative
    * to the project. Fully qualified prefixed may also be used. e.g.
    * `test_suite_name=projects/foo/testsuites/uuid1`
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Resource name for the project.  Format: `projects/{project_id}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is
    * just a hint and the service may choose to load fewer than `page_size`
    * results due to the size of the output. To traverse all of the releases,
    * the caller should iterate until the `page_token` on the response is
    * empty.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Next page token for the next batch of `Release` instances.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsReleasesList {
  @scala.inline
  def apply(): ParamsResourceProjectsReleasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsReleasesList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsReleasesListOps[Self <: ParamsResourceProjectsReleasesList] (val x: Self) extends AnyVal {
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
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
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
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

