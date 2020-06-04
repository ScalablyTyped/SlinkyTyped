package typingsSlinky.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait argThresholdOpts extends js.Object {
  var M: js.UndefOr[Double] = js.undefined
  var d: js.UndefOr[Double] = js.undefined
  var h: js.UndefOr[Double] = js.undefined
  var m: js.UndefOr[Double] = js.undefined
  var s: js.UndefOr[Double] = js.undefined
  var ss: js.UndefOr[Double] = js.undefined
  var w: js.UndefOr[Double | Null] = js.undefined
}

object argThresholdOpts {
  @scala.inline
  def apply(): argThresholdOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[argThresholdOpts]
  }
  @scala.inline
  implicit class argThresholdOptsOps[Self <: argThresholdOpts] (val x: Self) extends AnyVal {
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
    def setM(value: Double): Self = this.set("M", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("M", js.undefined)
    @scala.inline
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setSs(value: Double): Self = this.set("ss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSs: Self = this.set("ss", js.undefined)
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    @scala.inline
    def setWNull: Self = this.set("w", null)
  }
  
}

