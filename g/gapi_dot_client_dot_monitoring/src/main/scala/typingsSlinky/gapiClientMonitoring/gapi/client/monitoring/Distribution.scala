package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends js.Object {
  /**
    * Required in the Stackdriver Monitoring API v3. The values for each bucket specified in bucket_options. The sum of the values in bucketCounts must equal
    * the value in the count field of the Distribution object. The order of the bucket counts follows the numbering schemes described for the three bucket
    * types. The underflow bucket has number 0; the finite buckets, if any, have numbers 1 through N-2; and the overflow bucket has number N-1. The size of
    * bucket_counts must not be greater than N. If the size is less than N, then the remaining buckets are assigned values of zero.
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.native
  /** Required in the Stackdriver Monitoring API v3. Defines the histogram bucket boundaries. */
  var bucketOptions: js.UndefOr[BucketOptions] = js.native
  /** The number of values in the population. Must be non-negative. This value must equal the sum of the values in bucket_counts if a histogram is provided. */
  var count: js.UndefOr[String] = js.native
  /** The arithmetic mean of the values in the population. If count is zero then this field must be zero. */
  var mean: js.UndefOr[Double] = js.native
  /**
    * If specified, contains the range of the population values. The field must not be present if the count is zero. This field is presently ignored by the
    * Stackdriver Monitoring API v3.
    */
  var range: js.UndefOr[Range] = js.native
  /**
    * The sum of squared deviations from the mean of the values in the population. For values x_i this is:
    * Sum[i=1..n]((x_i - mean)^2)
    * Knuth, "The Art of Computer Programming", Vol. 2, page 323, 3rd edition describes Welford's method for accumulating this sum in one pass.If count is
    * zero then this field must be zero.
    */
  var sumOfSquaredDeviation: js.UndefOr[Double] = js.native
}

object Distribution {
  @scala.inline
  def apply(): Distribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketCounts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketOptions(value: BucketOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withMean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withSumOfSquaredDeviation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumOfSquaredDeviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSumOfSquaredDeviation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumOfSquaredDeviation")(js.undefined)
        ret
    }
  }
  
}

