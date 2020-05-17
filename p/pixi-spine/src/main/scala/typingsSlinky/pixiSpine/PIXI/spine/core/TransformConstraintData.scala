package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformConstraintData extends ConstraintData {
  var bones: js.Array[BoneData] = js.native
  var local: Boolean = js.native
  var offsetRotation: Double = js.native
  var offsetScaleX: Double = js.native
  var offsetScaleY: Double = js.native
  var offsetShearY: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var relative: Boolean = js.native
  var rotateMix: Double = js.native
  var scaleMix: Double = js.native
  var shearMix: Double = js.native
  var target: BoneData = js.native
  var translateMix: Double = js.native
}

object TransformConstraintData {
  @scala.inline
  def apply(
    bones: js.Array[BoneData],
    local: Boolean,
    name: String,
    offsetRotation: Double,
    offsetScaleX: Double,
    offsetScaleY: Double,
    offsetShearY: Double,
    offsetX: Double,
    offsetY: Double,
    order: Double,
    relative: Boolean,
    rotateMix: Double,
    scaleMix: Double,
    shearMix: Double,
    skinRequired: Boolean,
    target: BoneData,
    translateMix: Double
  ): TransformConstraintData = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetRotation = offsetRotation.asInstanceOf[js.Any], offsetScaleX = offsetScaleX.asInstanceOf[js.Any], offsetScaleY = offsetScaleY.asInstanceOf[js.Any], offsetShearY = offsetShearY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], rotateMix = rotateMix.asInstanceOf[js.Any], scaleMix = scaleMix.asInstanceOf[js.Any], shearMix = shearMix.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformConstraintData]
  }
  @scala.inline
  implicit class TransformConstraintDataOps[Self <: TransformConstraintData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBones(value: js.Array[BoneData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetScaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetScaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetShearY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetShearY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
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
    def withTarget(value: BoneData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
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

