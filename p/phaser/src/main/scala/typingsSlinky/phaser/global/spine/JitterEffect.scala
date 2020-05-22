package typingsSlinky.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.JitterEffect")
@js.native
class JitterEffect protected ()
  extends typingsSlinky.phaser.spine.JitterEffect {
  def this(jitterX: Double, jitterY: Double) = this()
  /* CompleteClass */
  override var jitterX: Double = js.native
  /* CompleteClass */
  override var jitterY: Double = js.native
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

