package typingsSlinky.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SwirlEffect")
@js.native
class SwirlEffect protected ()
  extends typingsSlinky.phaser.spine.SwirlEffect {
  def this(radius: Double) = this()
  /* CompleteClass */
  override var angle: Double = js.native
  /* CompleteClass */
  override var centerX: Double = js.native
  /* CompleteClass */
  override var centerY: Double = js.native
  /* CompleteClass */
  override var radius: Double = js.native
  /* CompleteClass */
  override var worldX: js.Any = js.native
  /* CompleteClass */
  override var worldY: js.Any = js.native
  /* CompleteClass */
  override def begin(skeleton: typingsSlinky.phaser.spine.Skeleton): Unit = js.native
  /* CompleteClass */
  override def end(): Unit = js.native
  /* CompleteClass */
  override def transform(
    position: typingsSlinky.phaser.spine.Vector2,
    uv: typingsSlinky.phaser.spine.Vector2,
    light: typingsSlinky.phaser.spine.Color,
    dark: typingsSlinky.phaser.spine.Color
  ): Unit = js.native
}

/* static members */
@JSGlobal("spine.SwirlEffect")
@js.native
object SwirlEffect extends js.Object {
  var interpolation: typingsSlinky.phaser.spine.PowOut = js.native
}

