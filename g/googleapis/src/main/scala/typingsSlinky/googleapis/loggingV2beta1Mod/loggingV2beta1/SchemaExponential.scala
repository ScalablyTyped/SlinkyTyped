package typingsSlinky.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies an exponential sequence of buckets that have a width that is
  * proportional to the value of the lower bound. Each bucket represents a
  * constant relative uncertainty on a specific value in the bucket.There are
  * num_finite_buckets + 2 (= N) buckets. Bucket i has the following
  * boundaries:Upper bound (0 &lt;= i &lt; N-1): scale * (growth_factor ^ i).
  * Lower bound (1 &lt;= i &lt; N): scale * (growth_factor ^ (i - 1)).
  */
@js.native
trait SchemaExponential extends js.Object {
  /**
    * Must be greater than 1.
    */
  var growthFactor: js.UndefOr[Double] = js.native
  /**
    * Must be greater than 0.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * Must be greater than 0.
    */
  var scale: js.UndefOr[Double] = js.native
}

object SchemaExponential {
  @scala.inline
  def apply(): SchemaExponential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExponential]
  }
  @scala.inline
  implicit class SchemaExponentialOps[Self <: SchemaExponential] (val x: Self) extends AnyVal {
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

