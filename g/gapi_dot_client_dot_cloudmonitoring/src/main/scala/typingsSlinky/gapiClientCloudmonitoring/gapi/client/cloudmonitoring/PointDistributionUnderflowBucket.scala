package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDistributionUnderflowBucket extends js.Object {
  /** The number of events whose values are in the interval defined by this bucket. */
  var count: js.UndefOr[String] = js.native
  /** The upper bound of the value interval of this bucket (exclusive). */
  var upperBound: js.UndefOr[Double] = js.native
}

object PointDistributionUnderflowBucket {
  @scala.inline
  def apply(): PointDistributionUnderflowBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointDistributionUnderflowBucket]
  }
  @scala.inline
  implicit class PointDistributionUnderflowBucketOps[Self <: PointDistributionUnderflowBucket] (val x: Self) extends AnyVal {
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
    def withUpperBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(js.undefined)
        ret
    }
  }
  
}

