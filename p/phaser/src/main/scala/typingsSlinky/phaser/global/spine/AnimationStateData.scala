package typingsSlinky.phaser.global.spine

import typingsSlinky.phaser.spine.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.AnimationStateData")
@js.native
class AnimationStateData protected ()
  extends typingsSlinky.phaser.spine.AnimationStateData {
  def this(skeletonData: typingsSlinky.phaser.spine.SkeletonData) = this()
  /* CompleteClass */
  override var animationToMixTime: Map[Double] = js.native
  /* CompleteClass */
  override var defaultMix: Double = js.native
  /* CompleteClass */
  override var skeletonData: typingsSlinky.phaser.spine.SkeletonData = js.native
  /* CompleteClass */
  override def getMix(from: typingsSlinky.phaser.spine.Animation, to: typingsSlinky.phaser.spine.Animation): Double = js.native
  /* CompleteClass */
  override def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  /* CompleteClass */
  override def setMixWith(
    from: typingsSlinky.phaser.spine.Animation,
    to: typingsSlinky.phaser.spine.Animation,
    duration: Double
  ): Unit = js.native
}

