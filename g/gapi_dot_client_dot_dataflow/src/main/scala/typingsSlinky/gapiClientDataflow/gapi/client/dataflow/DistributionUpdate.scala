package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionUpdate extends js.Object {
  /** The count of the number of elements present in the distribution. */
  var count: js.UndefOr[SplitInt64] = js.native
  /** (Optional) Histogram of value counts for the distribution. */
  var histogram: js.UndefOr[Histogram] = js.native
  /** The maximum value present in the distribution. */
  var max: js.UndefOr[SplitInt64] = js.native
  /** The minimum value present in the distribution. */
  var min: js.UndefOr[SplitInt64] = js.native
  /**
    * Use an int64 since we'd prefer the added precision. If overflow is a common
    * problem we can detect it and use an additional int64 or a double.
    */
  var sum: js.UndefOr[SplitInt64] = js.native
  /** Use a double since the sum of squares is likely to overflow int64. */
  var sumOfSquares: js.UndefOr[Double] = js.native
}

object DistributionUpdate {
  @scala.inline
  def apply(): DistributionUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionUpdate]
  }
  @scala.inline
  implicit class DistributionUpdateOps[Self <: DistributionUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: SplitInt64): Self = {
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
    def withHistogram(value: Histogram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistogram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogram")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: SplitInt64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: SplitInt64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: SplitInt64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.undefined)
        ret
    }
    @scala.inline
    def withSumOfSquares(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumOfSquares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSumOfSquares: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumOfSquares")(js.undefined)
        ret
    }
  }
  
}

