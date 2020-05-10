package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceInterconnectattachmentsAggregatedlist extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A filter expression that filters resources listed in the response. The
    * expression must specify the field name, a comparison operator, and the
    * value that you want to use for filtering. The value must be a string, a
    * number, or a boolean. The comparison operator must be either =, !=, >, or
    * <.  For example, if you are filtering Compute Engine instances, you can
    * exclude instances named example-instance by specifying name !=
    * example-instance.  You can also filter nested fields. For example, you
    * could specify scheduling.automaticRestart = false to include instances
    * only if they are not scheduled for automatic restarts. You can use
    * filtering on nested fields to filter based on resource labels.  To filter
    * on multiple expressions, provide each separate expression within
    * parentheses. For example, (scheduling.automaticRestart = true)
    * (cpuPlatform = "Intel Skylake"). By default, each expression is an AND
    * expression. However, you can include AND and OR expressions explicitly.
    * For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel
    * Broadwell") AND (scheduling.automaticRestart = true).
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The maximum number of results per page that should be returned. If the
    * number of available results is larger than maxResults, Compute Engine
    * returns a nextPageToken that can be used to get the next page of results
    * in subsequent list requests. Acceptable values are 0 to 500, inclusive.
    * (Default: 500)
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Sorts list results by a certain order. By default, results are returned
    * in alphanumerical order based on the resource name.  You can also sort
    * results in descending order based on the creation timestamp using
    * orderBy="creationTimestamp desc". This sorts results based on the
    * creationTimestamp field in reverse chronological order (newest result
    * first). Use this to sort resources like operations so that the newest
    * operation is returned first.  Currently, only sorting by name or
    * creationTimestamp desc is supported.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Specifies a page token to use. Set pageToken to the nextPageToken
    * returned by a previous list request to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
}

object ParamsResourceInterconnectattachmentsAggregatedlist {
  @scala.inline
  def apply(): ParamsResourceInterconnectattachmentsAggregatedlist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInterconnectattachmentsAggregatedlist]
  }
  @scala.inline
  implicit class ParamsResourceInterconnectattachmentsAggregatedlistOps[Self <: ParamsResourceInterconnectattachmentsAggregatedlist] (val x: Self) extends AnyVal {
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
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
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
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
  }
  
}

