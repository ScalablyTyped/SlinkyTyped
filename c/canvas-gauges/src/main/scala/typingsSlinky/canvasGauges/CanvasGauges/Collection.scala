package typingsSlinky.canvasGauges.CanvasGauges

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends Array[BaseGauge] {
  def get(id: String): BaseGauge = js.native
  def get(id: Double): BaseGauge = js.native
}

