package typingsSlinky.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.IkConstraint")
@js.native
class IkConstraint protected ()
  extends typingsSlinky.phaser.spine.IkConstraint {
  def this(data: typingsSlinky.phaser.spine.IkConstraintData, skeleton: typingsSlinky.phaser.spine.Skeleton) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var bendDirection: Double = js.native
  /* CompleteClass */
  override var bones: js.Array[typingsSlinky.phaser.spine.Bone] = js.native
  /* CompleteClass */
  override var compress: Boolean = js.native
  /* CompleteClass */
  override var data: typingsSlinky.phaser.spine.IkConstraintData = js.native
  /* CompleteClass */
  override var mix: Double = js.native
  /* CompleteClass */
  override var softness: Double = js.native
  /* CompleteClass */
  override var stretch: Boolean = js.native
  /* CompleteClass */
  override var target: typingsSlinky.phaser.spine.Bone = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  /* CompleteClass */
  override def apply1(
    bone: typingsSlinky.phaser.spine.Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit = js.native
  /* CompleteClass */
  override def apply2(
    parent: typingsSlinky.phaser.spine.Bone,
    child: typingsSlinky.phaser.spine.Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    softness: Double,
    alpha: Double
  ): Unit = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

