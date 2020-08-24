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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setStep(value: second | minute | hour | day | month | year | all): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStepmode(value: backward | todate): Self = this.set("stepmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepmode: Self = this.set("stepmode", js.undefined)
  }
  
}

