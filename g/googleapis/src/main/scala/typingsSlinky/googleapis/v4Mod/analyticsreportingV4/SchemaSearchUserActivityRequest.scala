package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to fetch User Report from Reporting API `userActivity:get`
  * call.
  */
@js.native
trait SchemaSearchUserActivityRequest extends js.Object {
  /**
    * Set of all activity types being requested. Only acvities matching these
    * types will be returned in the response. If empty, all activies will be
    * returned.
    */
  var activityTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Date range for which to retrieve the user activity. If a date range is
    * not provided, the default date range is (startDate: current date - 7
    * days, endDate: current date - 1 day).
    */
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  /**
    * Page size is for paging and specifies the maximum number of returned
    * rows. Page size should be &gt; 0. If the value is 0 or if the field
    * isn&#39;t specified, the request returns the default of 1000 rows per
    * page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A continuation token to get the next page of the results. Adding this to
    * the request will return the rows after the pageToken. The pageToken
    * should be the value returned in the nextPageToken parameter in the
    * response to the [SearchUserActivityRequest](#SearchUserActivityRequest)
    * request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. Unique user Id to query for. Every
    * [SearchUserActivityRequest](#SearchUserActivityRequest) must contain this
    * field.
    */
  var user: js.UndefOr[SchemaUser] = js.native
  /**
    * Required. The Analytics [view
    * ID](https://support.google.com/analytics/answer/1009618) from which to
    * retrieve data. Every
    * [SearchUserActivityRequest](#SearchUserActivityRequest) must contain the
    * `viewId`.
    */
  var viewId: js.UndefOr[String] = js.native
}

object SchemaSearchUserActivityRequest {
  @scala.inline
  def apply(): SchemaSearchUserActivityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchUserActivityRequest]
  }
  @scala.inline
  implicit class SchemaSearchUserActivityRequestOps[Self <: SchemaSearchUserActivityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRange(value: SchemaDateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(js.undefined)
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
    def withUser(value: SchemaUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withViewId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewId")(js.undefined)
        ret
    }
  }
  
}

