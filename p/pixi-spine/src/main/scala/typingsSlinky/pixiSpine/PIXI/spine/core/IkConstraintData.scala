package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IkConstraintData extends ConstraintData {
  var bendDirection: Double = js.native
  var bones: js.Array[BoneData] = js.native
  var compress: Boolean = js.native
  var mix: Double = js.native
  var softness: Double = js.native
  var stretch: Boolean = js.native
  var target: BoneData = js.native
  var uniform: Boolean = js.native
}

object IkConstraintData {
  @scala.inline
  def apply(
    bendDirection: Double,
    bones: js.Array[BoneData],
    compress: Boolean,
    mix: Double,
    name: String,
    order: Double,
    skinRequired: Boolean,
    softness: Double,
    stretch: Boolean,
    target: BoneData,
    uniform: Boolean
  ): IkConstraintData = {
    val __obj = js.Dynamic.literal(bendDirection = bendDirection.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any], softness = softness.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], uniform = uniform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IkConstraintData]
  }
  @scala.inline
  implicit class IkConstraintDataOps[Self <: IkConstraintData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBendDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bendDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBones(value: js.Array[BoneData]): Self = {
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
    def withTarget(value: BoneData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

