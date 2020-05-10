package typingsSlinky.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateRequest extends js.Object {
  /**
    * The specification of data to be aggregated. At least one aggregateBy spec must be provided. All data that is specified will be aggregated using the
    * same bucketing criteria. There will be one dataset in the response for every aggregateBy spec.
    */
  var aggregateBy: js.UndefOr[js.Array[AggregateBy]] = js.native
  /**
    * Specifies that data be aggregated each activity segment recored for a user. Similar to bucketByActivitySegment, but bucketing is done for each activity
    * segment rather than all segments of the same type. Mutually exclusive of other bucketing specifications.
    */
  var bucketByActivitySegment: js.UndefOr[BucketByActivity] = js.native
  /**
    * Specifies that data be aggregated by the type of activity being performed when the data was recorded. All data that was recorded during a certain
    * activity type (for the given time range) will be aggregated into the same bucket. Data that was recorded while the user was not active will not be
    * included in the response. Mutually exclusive of other bucketing specifications.
    */
  var bucketByActivityType: js.UndefOr[BucketByActivity] = js.native
  /**
    * Specifies that data be aggregated by user sessions. Data that does not fall within the time range of a session will not be included in the response.
    * Mutually exclusive of other bucketing specifications.
    */
  var bucketBySession: js.UndefOr[BucketBySession] = js.native
  /** Specifies that data be aggregated by a single time interval. Mutually exclusive of other bucketing specifications. */
  var bucketByTime: js.UndefOr[BucketByTime] = js.native
  /** The end of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive. */
  var endTimeMillis: js.UndefOr[String] = js.native
  /**
    * A list of acceptable data quality standards. Only data points which conform to at least one of the specified data quality standards will be returned.
    * If the list is empty, all data points are returned.
    */
  var filteredDataQualityStandard: js.UndefOr[js.Array[String]] = js.native
  /** The start of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive. */
  var startTimeMillis: js.UndefOr[String] = js.native
}

object AggregateRequest {
  @scala.inline
  def apply(): AggregateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateRequest]
  }
  @scala.inline
  implicit class AggregateRequestOps[Self <: AggregateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateBy(value: js.Array[AggregateBy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateBy")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketByActivitySegment(value: BucketByActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketByActivitySegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketByActivitySegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketByActivitySegment")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketByActivityType(value: BucketByActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketByActivityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketByActivityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketByActivityType")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketBySession(value: BucketBySession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketBySession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketBySession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketBySession")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketByTime(value: BucketByTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketByTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketByTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketByTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredDataQualityStandard(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredDataQualityStandard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredDataQualityStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredDataQualityStandard")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeMillis")(js.undefined)
        ret
    }
  }
  
}

