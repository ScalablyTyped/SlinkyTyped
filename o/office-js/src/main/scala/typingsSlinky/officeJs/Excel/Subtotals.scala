package typingsSlinky.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Subtotals for the Pivot Field.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait Subtotals extends js.Object {
  /**
    *
    * If Automatic is set to true, then all other values will be ignored when setting the Subtotals.
    *
    * [Api set: ExcelApi 1.8]
    */
  var automatic: js.UndefOr[Boolean] = js.native
  var average: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Boolean] = js.native
  var countNumbers: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Boolean] = js.native
  var min: js.UndefOr[Boolean] = js.native
  var product: js.UndefOr[Boolean] = js.native
  var standardDeviation: js.UndefOr[Boolean] = js.native
  var standardDeviationP: js.UndefOr[Boolean] = js.native
  var sum: js.UndefOr[Boolean] = js.native
  var variance: js.UndefOr[Boolean] = js.native
  var varianceP: js.UndefOr[Boolean] = js.native
}

object Subtotals {
  @scala.inline
  def apply(): Subtotals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subtotals]
  }
  @scala.inline
  implicit class SubtotalsOps[Self <: Subtotals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatic")(js.undefined)
        ret
    }
    @scala.inline
    def withAverage(value: Boolean): Self = {
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
    def withCount(value: Boolean): Self = {
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
    def withCountNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Boolean): Self = {
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
    def withMin(value: Boolean): Self = {
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
    def withProduct(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardDeviation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardDeviation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviation")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardDeviationP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviationP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardDeviationP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviationP")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: Boolean): Self = {
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
    def withVariance(value: Boolean): Self = {
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
    @scala.inline
    def withVarianceP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varianceP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVarianceP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varianceP")(js.undefined)
        ret
    }
  }
  
}

