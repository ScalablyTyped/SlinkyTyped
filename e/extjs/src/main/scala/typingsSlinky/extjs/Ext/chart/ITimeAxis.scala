package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.chart.axis.INumeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeAxis extends INumeric {
  /** [Config Option] (String/Boolean) */
  var dateFormat: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Date) */
  var fromDate: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Array) */
  var step: js.UndefOr[Array] = js.native
  /** [Config Option] (Date) */
  var toDate: js.UndefOr[js.Any] = js.native
}

object ITimeAxis {
  @scala.inline
  def apply(): ITimeAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeAxis]
  }
  @scala.inline
  implicit class ITimeAxisOps[Self <: ITimeAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFromDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withToDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(js.undefined)
        ret
    }
  }
  
}

