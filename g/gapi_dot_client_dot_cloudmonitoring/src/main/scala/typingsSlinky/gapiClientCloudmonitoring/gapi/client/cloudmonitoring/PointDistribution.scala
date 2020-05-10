package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDistribution extends js.Object {
  /** The finite buckets. */
  var buckets: js.UndefOr[js.Array[PointDistributionBucket]] = js.native
  /** The overflow bucket. */
  var overflowBucket: js.UndefOr[PointDistributionOverflowBucket] = js.native
  /** The underflow bucket. */
  var underflowBucket: js.UndefOr[PointDistributionUnderflowBucket] = js.native
}

object PointDistribution {
  @scala.inline
  def apply(): PointDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointDistribution]
  }
  @scala.inline
  implicit class PointDistributionOps[Self <: PointDistribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[PointDistributionBucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowBucket(value: PointDistributionOverflowBucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderflowBucket(value: PointDistributionUnderflowBucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underflowBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderflowBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underflowBucket")(js.undefined)
        ret
    }
  }
  
}

