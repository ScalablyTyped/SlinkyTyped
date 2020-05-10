package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SwirlEffect")
@js.native
class SwirlEffect protected () extends VertexEffect {
  def this(radius: Double) = this()
  var angle: Double = js.native
  var centerX: Double = js.native
  var centerY: Double = js.native
  var radius: Double = js.native
  var worldX: js.Any = js.native
  var worldY: js.Any = js.native
}

/* static members */
@JSGlobal("spine.SwirlEffect")
@js.native
object SwirlEffect extends js.Object {
  var interpolation: PowOut = js.native
}

