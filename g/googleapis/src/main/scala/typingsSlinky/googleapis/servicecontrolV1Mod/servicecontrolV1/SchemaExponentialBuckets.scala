package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describing buckets with exponentially growing width.
  */
@js.native
trait SchemaExponentialBuckets extends js.Object {
  /**
    * The i&#39;th exponential bucket covers the interval   [scale *
    * growth_factor^(i-1), scale * growth_factor^i) where i ranges from 1 to
    * num_finite_buckets inclusive. Must be larger than 1.0.
    */
  var growthFactor: js.UndefOr[Double] = js.native
  /**
    * The number of finite buckets. With the underflow and overflow buckets,
    * the total number of buckets is `num_finite_buckets` + 2. See comments on
    * `bucket_options` for details.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * The i&#39;th exponential bucket covers the interval   [scale *
    * growth_factor^(i-1), scale * growth_factor^i) where i ranges from 1 to
    * num_finite_buckets inclusive. Must be &gt; 0.
    */
  var scale: js.UndefOr[Double] = js.native
}

object SchemaExponentialBuckets {
  @scala.inline
  def apply(): SchemaExponentialBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExponentialBuckets]
  }
  @scala.inline
  implicit class SchemaExponentialBucketsOps[Self <: SchemaExponentialBuckets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrowthFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growthFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowthFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growthFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFiniteBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFiniteBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFiniteBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFiniteBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
  }
  
}

