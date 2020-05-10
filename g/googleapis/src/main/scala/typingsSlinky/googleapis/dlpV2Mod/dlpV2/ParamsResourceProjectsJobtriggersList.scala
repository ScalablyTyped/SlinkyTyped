package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsJobtriggersList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. Allows filtering.  Supported syntax:  * Filter expressions are
    * made up of one or more restrictions. * Restrictions can be combined by
    * `AND` or `OR` logical operators. A sequence of restrictions implicitly
    * uses `AND`. * A restriction has the form of `<field> <operator> <value>`.
    * * Supported fields/values for inspect jobs:     - `status` -
    * HEALTHY|PAUSED|CANCELLED     - `inspected_storage` -
    * DATASTORE|CLOUD_STORAGE|BIGQUERY     - 'last_run_time` - RFC 3339
    * formatted timestamp, surrounded by     quotation marks. Nanoseconds are
    * ignored.     - 'error_count' - Number of errors that have occurred while
    * running. * The operator must be `=` or `!=` for status and
    * inspected_storage.  Examples:  * inspected_storage = cloud_storage AND
    * status = HEALTHY * inspected_storage = cloud_storage OR inspected_storage
    * = bigquery * inspected_storage = cloud_storage AND (state = PAUSED OR
    * state = HEALTHY) * last_run_time > \"2017-12-12T00:00:00+00:00\"  The
    * length of this field should be no more than 500 characters.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional comma separated list of triggeredJob fields to order by,
    * followed by `asc` or `desc` postfix. This list is case-insensitive,
    * default sorting order is ascending, redundant space characters are
    * insignificant.  Example: `name asc,update_time, create_time desc`
    * Supported fields are:  - `create_time`: corresponds to time the
    * JobTrigger was created. - `update_time`: corresponds to time the
    * JobTrigger was last updated. - `last_run_time`: corresponds to the last
    * time the JobTrigger ran. - `name`: corresponds to JobTrigger's name. -
    * `display_name`: corresponds to JobTrigger's display name. - `status`:
    * corresponds to JobTrigger's status.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Optional size of the page, can be limited by a server.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional page token to continue retrieval. Comes from previous call to
    * ListJobTriggers. `order_by` field must not change for subsequent calls.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The parent resource name, for example `projects/my-project-id`.
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsJobtriggersList {
  @scala.inline
  def apply(): ParamsResourceProjectsJobtriggersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobtriggersList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsJobtriggersListOps[Self <: ParamsResourceProjectsJobtriggersList] (val x: Self) extends AnyVal {
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
    def withOrderBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
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
  }
  
}

