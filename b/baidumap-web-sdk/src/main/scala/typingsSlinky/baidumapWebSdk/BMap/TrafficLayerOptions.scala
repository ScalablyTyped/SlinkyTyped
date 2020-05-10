package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficLayerOptions extends js.Object {
  var predictDate: js.UndefOr[PredictDate] = js.native
}

object TrafficLayerOptions {
  @scala.inline
  def apply(): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficLayerOptions]
  }
  @scala.inline
  implicit class TrafficLayerOptionsOps[Self <: TrafficLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredictDate(value: PredictDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictDate")(js.undefined)
        ret
    }
  }
  
}

