package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.all
import typingsSlinky.plotlyJs.plotlyJsStrings.backward
import typingsSlinky.plotlyJs.plotlyJsStrings.day
import typingsSlinky.plotlyJs.plotlyJsStrings.hour
import typingsSlinky.plotlyJs.plotlyJsStrings.minute
import typingsSlinky.plotlyJs.plotlyJsStrings.month
import typingsSlinky.plotlyJs.plotlyJsStrings.second
import typingsSlinky.plotlyJs.plotlyJsStrings.todate
import typingsSlinky.plotlyJs.plotlyJsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.RangeSelectorButton> */
@js.native
trait PartialRangeSelectorButto extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var label: js.UndefOr[String] = js.native
  var step: js.UndefOr[second | minute | hour | day | month | year | all] = js.native
  var stepmode: js.UndefOr[backward | todate] = js.native
}

object PartialRangeSelectorButto {
  @scala.inline
  def apply(): PartialRangeSelectorButto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRangeSelectorButto]
  }
  @scala.inline
  implicit class PartialRangeSelectorButtoOps[Self <: PartialRangeSelectorButto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: second | minute | hour | day | month | year | all): Self = {
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
    def withStepmode(value: backward | todate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepmode")(js.undefined)
        ret
    }
  }
  
}

