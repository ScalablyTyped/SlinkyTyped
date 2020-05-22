package typingsSlinky.phaser.global.spine

import typingsSlinky.phaser.spine.ArrayLike
import typingsSlinky.phaser.spine.Timeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Animation")
@js.native
class Animation protected ()
  extends typingsSlinky.phaser.spine.Animation {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
  /* CompleteClass */
  override var duration: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var timelineIds: js.Array[Boolean] = js.native
  /* CompleteClass */
  override var timelines: js.Array[Timeline] = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typingsSlinky.phaser.spine.Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[typingsSlinky.phaser.spine.Event],
    alpha: Double,
    blend: typingsSlinky.phaser.spine.MixBlend,
    direction: typingsSlinky.phaser.spine.MixDirection
  ): Unit = js.native
  /* CompleteClass */
  override def hasTimeline(id: Double): Boolean = js.native
}

/* static members */
@JSGlobal("spine.Animation")
@js.native
object Animation extends js.Object {
  def binarySearch(values: ArrayLike[Double], target: Double): Double = js.native
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
}

