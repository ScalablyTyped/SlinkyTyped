package typingsSlinky.canvasGauges

import typingsSlinky.canvasGauges.CanvasGauges.BaseGauge
import typingsSlinky.canvasGauges.CanvasGauges.LinearGauge
import typingsSlinky.canvasGauges.CanvasGauges.RadialGauge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var BaseGauge: typingsSlinky.canvasGauges.CanvasGauges.BaseGauge
  var LinearGauge: typingsSlinky.canvasGauges.CanvasGauges.LinearGauge
  var RadialGauge: typingsSlinky.canvasGauges.CanvasGauges.RadialGauge
}

object Window {
  @scala.inline
  def apply(BaseGauge: BaseGauge, LinearGauge: LinearGauge, RadialGauge: RadialGauge): Window = {
    val __obj = js.Dynamic.literal(BaseGauge = BaseGauge.asInstanceOf[js.Any], LinearGauge = LinearGauge.asInstanceOf[js.Any], RadialGauge = RadialGauge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

