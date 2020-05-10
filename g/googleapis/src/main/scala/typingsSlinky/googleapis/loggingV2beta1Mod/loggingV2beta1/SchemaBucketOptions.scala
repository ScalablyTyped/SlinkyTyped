package typingsSlinky.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BucketOptions describes the bucket boundaries used to create a histogram
  * for the distribution. The buckets can be in a linear sequence, an
  * exponential sequence, or each bucket can be specified explicitly.
  * BucketOptions does not include the number of values in each bucket.A bucket
  * has an inclusive lower bound and exclusive upper bound for the values that
  * are counted for that bucket. The upper bound of a bucket must be strictly
  * greater than the lower bound. The sequence of N buckets for a distribution
  * consists of an underflow bucket (number 0), zero or more finite buckets
  * (number 1 through N - 2) and an overflow bucket (number N - 1). The buckets
  * are contiguous: the lower bound of bucket i (i &gt; 0) is the same as the
  * upper bound of bucket i - 1. The buckets span the whole range of finite
  * values: lower bound of the underflow bucket is -infinity and the upper
  * bound of the overflow bucket is +infinity. The finite buckets are so-called
  * because both bounds are finite.
  */
@js.native
trait SchemaBucketOptions extends js.Object {
  /**
    * The explicit buckets.
    */
  var explicitBuckets: js.UndefOr[SchemaExplicit] = js.native
  /**
    * The exponential buckets.
    */
  var exponentialBuckets: js.UndefOr[SchemaExponential] = js.native
  /**
    * The linear bucket.
    */
  var linearBuckets: js.UndefOr[SchemaLinear] = js.native
}

object SchemaBucketOptions {
  @scala.inline
  def apply(): SchemaBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketOptions]
  }
  @scala.inline
  implicit class SchemaBucketOptionsOps[Self <: SchemaBucketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplicitBuckets(value: SchemaExplicit): Self = {
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
    def withExponentialBuckets(value: SchemaExponential): Self = {
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
    def withLinearBuckets(value: SchemaLinear): Self = {
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
  }
  
}

