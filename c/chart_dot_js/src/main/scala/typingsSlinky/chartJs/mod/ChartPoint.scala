package typingsSlinky.chartJs.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartPoint extends js.Object {
  var r: js.UndefOr[Double] = js.native
  var t: js.UndefOr[Double | String | js.Date | Moment] = js.native
  var x: js.UndefOr[Double | String | js.Date | Moment] = js.native
  var y: js.UndefOr[Double | String | js.Date | Moment] = js.native
}

object ChartPoint {
  @scala.inline
  def apply(): ChartPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPoint]
  }
  @scala.inline
  implicit class ChartPointOps[Self <: ChartPoint] (val x: Self) extends AnyVal {
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
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setTDate(value: js.Date): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def setT(value: Double | String | js.Date | Moment): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteT: Self = this.set("t", js.undefined)
    @scala.inline
    def setXDate(value: js.Date): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double | String | js.Date | Moment): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setYDate(value: js.Date): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double | String | js.Date | Moment): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

