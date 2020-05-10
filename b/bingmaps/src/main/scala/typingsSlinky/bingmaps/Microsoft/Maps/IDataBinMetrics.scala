package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataBinMetrics extends js.Object {
  /* The average value of the aggregation property of the pushpins in a data bin. */
  var average: js.UndefOr[Double] = js.native
  /* The number of pushpins in a data bin. */
  var count: js.UndefOr[Double] = js.native
  /* The number of pushpins in the data bin who's aggregation property has a value. */
  var countNotBlank: js.UndefOr[Double] = js.native
  /* The number of pushpins in the data bin who's aggregation property is a valid number. */
  var countNumbers: js.UndefOr[Double] = js.native
  /* The sum of the aggregation property of the pushpins in a data bin.  */
  var sum: js.UndefOr[Double] = js.native
}

object IDataBinMetrics {
  @scala.inline
  def apply(): IDataBinMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataBinMetrics]
  }
  @scala.inline
  implicit class IDataBinMetricsOps[Self <: IDataBinMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverage(value: Double): Self = {
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
    def withCount(value: Double): Self = {
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
    def withCountNotBlank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countNotBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountNotBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countNotBlank")(js.undefined)
        ret
    }
    @scala.inline
    def withCountNumbers(value: Double): Self = {
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
    def withSum(value: Double): Self = {
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
  }
  
}

