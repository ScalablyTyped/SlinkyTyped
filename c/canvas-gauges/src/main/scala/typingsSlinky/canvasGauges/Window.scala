package typingsSlinky.canvasGauges

import typingsSlinky.canvasGauges.CanvasGauges.BaseGauge
import typingsSlinky.canvasGauges.CanvasGauges.LinearGauge
import typingsSlinky.canvasGauges.CanvasGauges.RadialGauge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var BaseGauge: typingsSlinky.canvasGauges.CanvasGauges.BaseGauge = js.native
  var LinearGauge: typingsSlinky.canvasGauges.CanvasGauges.LinearGauge = js.native
  var RadialGauge: typingsSlinky.canvasGauges.CanvasGauges.RadialGauge = js.native
}

object Window {
  @scala.inline
  def apply(BaseGauge: BaseGauge, LinearGauge: LinearGauge, RadialGauge: RadialGauge): Window = {
    val __obj = js.Dynamic.literal(BaseGauge = BaseGauge.asInstanceOf[js.Any], LinearGauge = LinearGauge.asInstanceOf[js.Any], RadialGauge = RadialGauge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setBaseGauge(value: BaseGauge): Self = this.set("BaseGauge", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinearGauge(value: LinearGauge): Self = this.set("LinearGauge", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadialGauge(value: RadialGauge): Self = this.set("RadialGauge", value.asInstanceOf[js.Any])
  }
  
}

