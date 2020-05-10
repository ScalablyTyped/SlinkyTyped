package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGroupRule extends js.Object {
  /** A DateTimeRule. */
  var dateTimeRule: js.UndefOr[DateTimeRule] = js.native
  /** A HistogramRule. */
  var histogramRule: js.UndefOr[HistogramRule] = js.native
  /** A ManualRule. */
  var manualRule: js.UndefOr[ManualRule] = js.native
}

object PivotGroupRule {
  @scala.inline
  def apply(): PivotGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroupRule]
  }
  @scala.inline
  implicit class PivotGroupRuleOps[Self <: PivotGroupRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTimeRule(value: DateTimeRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRule")(js.undefined)
        ret
    }
    @scala.inline
    def withHistogramRule(value: HistogramRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistogramRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramRule")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRule(value: ManualRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRule")(js.undefined)
        ret
    }
  }
  
}

