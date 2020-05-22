package typingsSlinky.phaser.global.spine

import typingsSlinky.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.EventTimeline")
@js.native
class EventTimeline protected ()
  extends typingsSlinky.phaser.spine.EventTimeline {
  def this(frameCount: Double) = this()
  /* CompleteClass */
  override var events: js.Array[typingsSlinky.phaser.spine.Event] = js.native
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
  override def setFrame(frameIndex: Double, event: typingsSlinky.phaser.spine.Event): Unit = js.native
}

