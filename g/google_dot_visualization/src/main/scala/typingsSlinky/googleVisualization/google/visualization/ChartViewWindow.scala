package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartViewWindow extends js.Object {
  var max: js.UndefOr[Double | js.Date | js.Array[Double]] = js.native
  var min: js.UndefOr[Double | js.Date | js.Array[Double]] = js.native
}

object ChartViewWindow {
  @scala.inline
  def apply(): ChartViewWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartViewWindow]
  }
  @scala.inline
  implicit class ChartViewWindowOps[Self <: ChartViewWindow] (val x: Self) extends AnyVal {
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
    def setMaxVarargs(value: Double*): Self = this.set("max", js.Array(value :_*))
    @scala.inline
    def setMaxDate(value: js.Date): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double | js.Date | js.Array[Double]): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMinVarargs(value: Double*): Self = this.set("min", js.Array(value :_*))
    @scala.inline
    def setMinDate(value: js.Date): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double | js.Date | js.Array[Double]): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

