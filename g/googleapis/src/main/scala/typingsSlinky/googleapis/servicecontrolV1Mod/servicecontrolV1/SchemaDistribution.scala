package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Distribution represents a frequency distribution of double-valued sample
  * points. It contains the size of the population of sample points plus
  * additional optional information:    - the arithmetic mean of the samples -
  * the minimum and maximum of the samples   - the sum-squared-deviation of the
  * samples, used to compute variance   - a histogram of the values of the
  * sample points
  */
@js.native
trait SchemaDistribution extends js.Object {
  /**
    * The number of samples in each histogram bucket. `bucket_counts` are
    * optional. If present, they must sum to the `count` value.  The buckets
    * are defined below in `bucket_option`. There are N buckets.
    * `bucket_counts[0]` is the number of samples in the underflow bucket.
    * `bucket_counts[1]` to `bucket_counts[N-1]` are the numbers of samples in
    * each of the finite buckets. And `bucket_counts[N] is the number of
    * samples in the overflow bucket. See the comments of `bucket_option` below
    * for more details.  Any suffix of trailing zeros may be omitted.
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The total number of samples in the distribution. Must be &gt;= 0.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Buckets with arbitrary user-provided width.
    */
  var explicitBuckets: js.UndefOr[SchemaExplicitBuckets] = js.native
  /**
    * Buckets with exponentially growing width.
    */
  var exponentialBuckets: js.UndefOr[SchemaExponentialBuckets] = js.native
  /**
    * Buckets with constant width.
    */
  var linearBuckets: js.UndefOr[SchemaLinearBuckets] = js.native
  /**
    * The maximum of the population of values. Ignored if `count` is zero.
    */
  var maximum: js.UndefOr[Double] = js.native
  /**
    * The arithmetic mean of the samples in the distribution. If `count` is
    * zero then this field must be zero.
    */
  var mean: js.UndefOr[Double] = js.native
  /**
    * The minimum of the population of values. Ignored if `count` is zero.
    */
  var minimum: js.UndefOr[Double] = js.native
  /**
    * The sum of squared deviations from the mean:   Sum[i=1..count]((x_i -
    * mean)^2) where each x_i is a sample values. If `count` is zero then this
    * field must be zero, otherwise validation of the request fails.
    */
  var sumOfSquaredDeviation: js.UndefOr[Double] = js.native
}

object SchemaDistribution {
  @scala.inline
  def apply(): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistribution]
  }
  @scala.inline
  implicit class SchemaDistributionOps[Self <: SchemaDistribution] (val x: Self) extends AnyVal {
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
    def withExplicitBuckets(value: SchemaExplicitBuckets): Self = {
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
    def withExponentialBuckets(value: SchemaExponentialBuckets): Self = {
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
    def withLinearBuckets(value: SchemaLinearBuckets): Self = {
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

