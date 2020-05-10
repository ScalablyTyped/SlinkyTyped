package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypicalBasedOnEventUIParam extends js.Object {
  /**
  	 * Used to specify which columns changing will invalidate the series and cause it to be recalculated.
  	 */
  var basedOn: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get the number of positions that should be calculated from the start.
  	 */
  var count: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get the data to use for the calculation.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get the beginning position that should be calculated from.
  	 */
  var position: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to current series object.
  	 */
  var series: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get the supporting calculations to use in the calculation.
  	 */
  var supportingCalculations: js.UndefOr[js.Any] = js.native
}

object TypicalBasedOnEventUIParam {
  @scala.inline
  def apply(): TypicalBasedOnEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypicalBasedOnEventUIParam]
  }
  @scala.inline
  implicit class TypicalBasedOnEventUIParamOps[Self <: TypicalBasedOnEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasedOn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withChart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: js.Any): Self = {
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
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportingCalculations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingCalculations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportingCalculations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingCalculations")(js.undefined)
        ret
    }
  }
  
}

