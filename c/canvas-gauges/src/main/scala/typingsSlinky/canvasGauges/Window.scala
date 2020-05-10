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
    def withBaseGauge(value: BaseGauge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseGauge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinearGauge(value: LinearGauge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinearGauge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadialGauge(value: RadialGauge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadialGauge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

