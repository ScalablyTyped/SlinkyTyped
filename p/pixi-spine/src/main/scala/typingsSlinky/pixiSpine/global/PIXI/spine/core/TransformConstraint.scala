package typingsSlinky.pixiSpine.global.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TransformConstraint")
@js.native
class TransformConstraint protected ()
  extends typingsSlinky.pixiSpine.PIXI.spine.core.TransformConstraint {
  def this(
    data: typingsSlinky.pixiSpine.PIXI.spine.core.TransformConstraintData,
    skeleton: typingsSlinky.pixiSpine.PIXI.spine.core.Skeleton
  ) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var bones: js.Array[typingsSlinky.pixiSpine.PIXI.spine.core.Bone] = js.native
  /* CompleteClass */
  override var data: typingsSlinky.pixiSpine.PIXI.spine.core.TransformConstraintData = js.native
  /* CompleteClass */
  override var rotateMix: Double = js.native
  /* CompleteClass */
  override var scaleMix: Double = js.native
  /* CompleteClass */
  override var shearMix: Double = js.native
  /* CompleteClass */
  override var target: typingsSlinky.pixiSpine.PIXI.spine.core.Bone = js.native
  /* CompleteClass */
  override var temp: typingsSlinky.pixiSpine.PIXI.spine.core.Vector2 = js.native
  /* CompleteClass */
  override var translateMix: Double = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  /* CompleteClass */
  override def applyAbsoluteLocal(): Unit = js.native
  /* CompleteClass */
  override def applyAbsoluteWorld(): Unit = js.native
  /* CompleteClass */
  override def applyRelativeLocal(): Unit = js.native
  /* CompleteClass */
  override def applyRelativeWorld(): Unit = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

