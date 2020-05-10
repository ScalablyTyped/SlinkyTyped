package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDistributionOverflowBucket extends js.Object {
  /** The number of events whose values are in the interval defined by this bucket. */
  var count: js.UndefOr[String] = js.native
  /** The lower bound of the value interval of this bucket (inclusive). */
  var lowerBound: js.UndefOr[Double] = js.native
}

object PointDistributionOverflowBucket {
  @scala.inline
  def apply(): PointDistributionOverflowBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointDistributionOverflowBucket]
  }
  @scala.inline
  implicit class PointDistributionOverflowBucketOps[Self <: PointDistributionOverflowBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLowerBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(js.undefined)
        ret
    }
  }
  
}

