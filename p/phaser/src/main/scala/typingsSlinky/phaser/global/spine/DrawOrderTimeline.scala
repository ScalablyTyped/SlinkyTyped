package typingsSlinky.phaser.global.spine

import typingsSlinky.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.DrawOrderTimeline")
@js.native
class DrawOrderTimeline protected ()
  extends typingsSlinky.phaser.spine.DrawOrderTimeline {
  def this(frameCount: Double) = this()
  /* CompleteClass */
  override var drawOrders: js.Array[js.Array[Double]] = js.native
  /* CompleteClass */
  override var frames: ArrayLike[Double] = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typingsSlinky.phaser.spine.Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[typingsSlinky.phaser.spine.Event],
    alpha: Double,
    blend: typingsSlinky.phaser.spine.MixBlend,
    direction: typingsSlinky.phaser.spine.MixDirection
  ): Unit = js.native
  /* CompleteClass */
  override def getFrameCount(): Double = js.native
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  /* CompleteClass */
  override def setFrame(frameIndex: Double, time: Double, drawOrder: js.Array[Double]): Unit = js.native
}

