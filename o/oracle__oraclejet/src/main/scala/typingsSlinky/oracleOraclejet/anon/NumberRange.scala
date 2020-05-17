package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberRange extends js.Object {
  var numberRange: js.UndefOr[HintMessageDetail] = js.native
  var required: js.UndefOr[Hint] = js.native
  var tooltipDecrement: js.UndefOr[String] = js.native
  var tooltipIncrement: js.UndefOr[String] = js.native
}

object NumberRange {
  @scala.inline
  def apply(): NumberRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberRange]
  }
  @scala.inline
  implicit class NumberRangeOps[Self <: NumberRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberRange(value: HintMessageDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberRange")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Hint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipDecrement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDecrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipDecrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDecrement")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipIncrement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipIncrement")(js.undefined)
        ret
    }
  }
  
}

