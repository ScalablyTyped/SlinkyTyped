package typingsSlinky.pixiSpine.global.PIXI.spine.core

import typingsSlinky.pixiSpine.PIXI.spine.core.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.EventTimeline")
@js.native
class EventTimeline protected ()
  extends typingsSlinky.pixiSpine.PIXI.spine.core.EventTimeline {
  def this(frameCount: Double) = this()
  /* CompleteClass */
  override var events: js.Array[typingsSlinky.pixiSpine.PIXI.spine.core.Event] = js.native
  /* CompleteClass */
  override var frames: ArrayLike[Double] = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typingsSlinky.pixiSpine.PIXI.spine.core.Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[typingsSlinky.pixiSpine.PIXI.spine.core.Event],
    alpha: Double,
    blend: typingsSlinky.pixiSpine.PIXI.spine.core.MixBlend,
    direction: typingsSlinky.pixiSpine.PIXI.spine.core.MixDirection
  ): Unit = js.native
  /* CompleteClass */
  override def getFrameCount(): Double = js.native
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  /* CompleteClass */
  override def setFrame(frameIndex: Double, event: typingsSlinky.pixiSpine.PIXI.spine.core.Event): Unit = js.native
}

