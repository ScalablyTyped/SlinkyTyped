package typingsSlinky.extjs.Ext.chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumericAxis
  extends typingsSlinky.extjs.Ext.chart.axis.IAxis {
  /** [Config Option] (Boolean) */
  var adjustMaximumByMajorUnit: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var adjustMinimumByMajorUnit: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var decimals: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[Double] = js.native
}

object INumericAxis {
  @scala.inline
  def apply(): INumericAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumericAxis]
  }
  @scala.inline
  implicit class INumericAxisOps[Self <: INumericAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustMaximumByMajorUnit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustMaximumByMajorUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustMaximumByMajorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustMaximumByMajorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withAdjustMinimumByMajorUnit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustMinimumByMajorUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustMinimumByMajorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustMinimumByMajorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
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
    def withMinimum(value: Double): Self = {
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
  }
  
}

