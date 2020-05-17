package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IkConstraint extends Updatable {
  var active: Boolean = js.native
  var bendDirection: Double = js.native
  var bones: js.Array[Bone] = js.native
  var compress: Boolean = js.native
  var data: IkConstraintData = js.native
  var mix: Double = js.native
  var softness: Double = js.native
  var stretch: Boolean = js.native
  var target: Bone = js.native
  @JSName("apply")
  def apply(): Unit = js.native
  def apply1(
    bone: Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit = js.native
  def apply2(
    parent: Bone,
    child: Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    softness: Double,
    alpha: Double
  ): Unit = js.native
}

object IkConstraint {
  @scala.inline
  def apply(
    active: Boolean,
    apply: () => Unit,
    apply1: (Bone, Double, Double, Boolean, Boolean, Boolean, Double) => Unit,
    apply2: (Bone, Bone, Double, Double, Double, Boolean, Double, Double) => Unit,
    bendDirection: Double,
    bones: js.Array[Bone],
    compress: Boolean,
    data: IkConstraintData,
    isActive: () => Boolean,
    mix: Double,
    softness: Double,
    stretch: Boolean,
    target: Bone,
    update: () => Unit
  ): IkConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], apply = js.Any.fromFunction0(apply), apply1 = js.Any.fromFunction7(apply1), apply2 = js.Any.fromFunction8(apply2), bendDirection = bendDirection.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), mix = mix.asInstanceOf[js.Any], softness = softness.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[IkConstraint]
  }
  @scala.inline
  implicit class IkConstraintOps[Self <: IkConstraint] (val x: Self) extends AnyVal {
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
    def withApply1(value: (Bone, Double, Double, Boolean, Boolean, Boolean, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply1")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withApply2(value: (Bone, Bone, Double, Double, Double, Boolean, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply2")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withBendDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bendDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBones(value: js.Array[Bone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: IkConstraintData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStretch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Bone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

