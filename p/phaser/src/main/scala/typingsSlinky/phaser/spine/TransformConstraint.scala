package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformConstraint extends Updatable {
  var active: Boolean = js.native
  var bones: js.Array[Bone] = js.native
  var data: TransformConstraintData = js.native
  var rotateMix: Double = js.native
  var scaleMix: Double = js.native
  var shearMix: Double = js.native
  var target: Bone = js.native
  var temp: Vector2 = js.native
  var translateMix: Double = js.native
  @JSName("apply")
  def apply(): Unit = js.native
  def applyAbsoluteLocal(): Unit = js.native
  def applyAbsoluteWorld(): Unit = js.native
  def applyRelativeLocal(): Unit = js.native
  def applyRelativeWorld(): Unit = js.native
}

object TransformConstraint {
  @scala.inline
  def apply(
    active: Boolean,
    apply: () => Unit,
    applyAbsoluteLocal: () => Unit,
    applyAbsoluteWorld: () => Unit,
    applyRelativeLocal: () => Unit,
    applyRelativeWorld: () => Unit,
    bones: js.Array[Bone],
    data: TransformConstraintData,
    isActive: () => Boolean,
    rotateMix: Double,
    scaleMix: Double,
    shearMix: Double,
    target: Bone,
    temp: Vector2,
    translateMix: Double,
    update: () => Unit
  ): TransformConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], apply = js.Any.fromFunction0(apply), applyAbsoluteLocal = js.Any.fromFunction0(applyAbsoluteLocal), applyAbsoluteWorld = js.Any.fromFunction0(applyAbsoluteWorld), applyRelativeLocal = js.Any.fromFunction0(applyRelativeLocal), applyRelativeWorld = js.Any.fromFunction0(applyRelativeWorld), bones = bones.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), rotateMix = rotateMix.asInstanceOf[js.Any], scaleMix = scaleMix.asInstanceOf[js.Any], shearMix = shearMix.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], temp = temp.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TransformConstraint]
  }
  @scala.inline
  implicit class TransformConstraintOps[Self <: TransformConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApply(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withApplyAbsoluteLocal(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyAbsoluteLocal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withApplyAbsoluteWorld(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyAbsoluteWorld")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withApplyRelativeLocal(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyRelativeLocal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withApplyRelativeWorld(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyRelativeWorld")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBones(value: js.Array[Bone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: TransformConstraintData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateMix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateMix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleMix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShearMix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shearMix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Bone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemp(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateMix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateMix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

