package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends js.Object {
  /**
    * The number of samples in each histogram bucket. `bucket_counts` are
    * optional. If present, they must sum to the `count` value.
    *
    * The buckets are defined below in `bucket_option`. There are N buckets.
    * `bucket_counts[0]` is the number of samples in the underflow bucket.
    * `bucket_counts[1]` to `bucket_counts[N-1]` are the numbers of samples
    * in each of the finite buckets. And `bucket_counts[N] is the number
    * of samples in the overflow bucket. See the comments of `bucket_option`
    * below for more details.
    *
    * Any suffix of trailing zeros may be omitted.
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.native
  /** The total number of samples in the distribution. Must be >= 0. */
  var count: js.UndefOr[String] = js.native
  /** Buckets with arbitrary user-provided width. */
  var explicitBuckets: js.UndefOr[ExplicitBuckets] = js.native
  /** Buckets with exponentially growing width. */
  var exponentialBuckets: js.UndefOr[ExponentialBuckets] = js.native
  /** Buckets with constant width. */
  var linearBuckets: js.UndefOr[LinearBuckets] = js.native
  /** The maximum of the population of values. Ignored if `count` is zero. */
  var maximum: js.UndefOr[Double] = js.native
  /**
    * The arithmetic mean of the samples in the distribution. If `count` is
    * zero then this field must be zero.
    */
  var mean: js.UndefOr[Double] = js.native
  /** The minimum of the population of values. Ignored if `count` is zero. */
  var minimum: js.UndefOr[Double] = js.native
  /**
    * The sum of squared deviations from the mean:
    * Sum[i=1..count]((x_i - mean)^2)
    * where each x_i is a sample values. If `count` is zero then this field
    * must be zero, otherwise validation of the request fails.
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
    def withExplicitBuckets(value: ExplicitBuckets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withExponentialBuckets(value: ExponentialBuckets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentialBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponentialBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentialBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withLinearBuckets(value: LinearBuckets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
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
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
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

