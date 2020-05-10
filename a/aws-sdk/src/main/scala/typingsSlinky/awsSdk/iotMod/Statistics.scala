package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statistics extends js.Object {
  /**
    * The average of the aggregated field values.
    */
  var average: js.UndefOr[Average] = js.native
  /**
    * The count of things that match the query.
    */
  var count: js.UndefOr[Count] = js.native
  /**
    * The maximum aggregated field value.
    */
  var maximum: js.UndefOr[Maximum] = js.native
  /**
    * The minimum aggregated field value.
    */
  var minimum: js.UndefOr[Minimum] = js.native
  /**
    * The standard deviation of the aggregated field values.
    */
  var stdDeviation: js.UndefOr[StdDeviation] = js.native
  /**
    * The sum of the aggregated field values.
    */
  var sum: js.UndefOr[Sum] = js.native
  /**
    * The sum of the squares of the aggregated field values.
    */
  var sumOfSquares: js.UndefOr[SumOfSquares] = js.native
  /**
    * The variance of the aggregated field values.
    */
  var variance: js.UndefOr[Variance] = js.native
}

object Statistics {
  @scala.inline
  def apply(): Statistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statistics]
  }
  @scala.inline
  implicit class StatisticsOps[Self <: Statistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverage(value: Average): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Count): Self = {
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
    def withMaximum(value: Maximum): Self = {
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
    def withMinimum(value: Minimum): Self = {
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
    def withStdDeviation(value: StdDeviation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdDeviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdDeviation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdDeviation")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: Sum): Self = {
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
    def withSumOfSquares(value: SumOfSquares): Self = {
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
    @scala.inline
    def withVariance(value: Variance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(js.undefined)
        ret
    }
  }
  
}

