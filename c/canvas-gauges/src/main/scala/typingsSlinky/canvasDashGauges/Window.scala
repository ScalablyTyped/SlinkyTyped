package typingsSlinky.canvasDashGauges

import typingsSlinky.canvasDashGauges.CanvasGauges.BaseGauge
import typingsSlinky.canvasDashGauges.CanvasGauges.LinearGauge
import typingsSlinky.canvasDashGauges.CanvasGauges.RadialGauge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var BaseGauge: typingsSlinky.canvasDashGauges.CanvasGauges.BaseGauge
  var LinearGauge: typingsSlinky.canvasDashGauges.CanvasGauges.LinearGauge
  var RadialGauge: typingsSlinky.canvasDashGauges.CanvasGauges.RadialGauge
}

object Window {
  @scala.inline
  def apply(BaseGauge: BaseGauge, LinearGauge: LinearGauge, RadialGauge: RadialGauge): Window = {
    val __obj = js.Dynamic.literal(BaseGauge = BaseGauge.asInstanceOf[js.Any], LinearGauge = LinearGauge.asInstanceOf[js.Any], RadialGauge = RadialGauge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

