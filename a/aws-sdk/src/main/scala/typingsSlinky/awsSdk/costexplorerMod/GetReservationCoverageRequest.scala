package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservationCoverageRequest extends js.Object {
  /**
    * Filters utilization data by dimensions. You can filter by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY    GetReservationCoverage uses the same Expression object as the other operations, but only AND is supported among each dimension. You can nest only one level deep. If there are multiple values for a dimension, they are OR'd together. If you don't provide a SERVICE filter, Cost Explorer defaults to EC2.
    */
  var Filter: js.UndefOr[Expression] = js.native
  /**
    * The granularity of the AWS cost data for the reservation. Valid values are MONTHLY and DAILY. If GroupBy is set, Granularity can't be set. If Granularity isn't set, the response object doesn't include Granularity, either MONTHLY or DAILY. The GetReservationCoverage operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Granularity] = js.native
  /**
    * You can group the data by the following attributes:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   TENANCY  
    */
  var GroupBy: js.UndefOr[GroupDefinitions] = js.native
  /**
    * The measurement that you want your reservation coverage reported in. Valid values are Hour, Unit, and Cost. You can use multiple values in a request.
    */
  var Metrics: js.UndefOr[MetricNames] = js.native
  /**
    * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The start and end dates of the period that you want to retrieve data about reservation coverage for. You can retrieve data for a maximum of 13 months: the last 12 months and the current month. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01. 
    */
  var TimePeriod: DateInterval = js.native
}

object GetReservationCoverageRequest {
  @scala.inline
  def apply(TimePeriod: DateInterval): GetReservationCoverageRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationCoverageRequest]
  }
  @scala.inline
  implicit class GetReservationCoverageRequestOps[Self <: GetReservationCoverageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimePeriod(value: DateInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGranularity(value: Granularity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Granularity")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupBy(value: GroupDefinitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: MetricNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: NextPageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
  }
  
}

