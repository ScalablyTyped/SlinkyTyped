package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathConstraintData extends ConstraintData {
  var bones: js.Array[BoneData] = js.native
  var offsetRotation: Double = js.native
  var position: Double = js.native
  var positionMode: PositionMode = js.native
  var rotateMix: Double = js.native
  var rotateMode: RotateMode = js.native
  var spacing: Double = js.native
  var spacingMode: SpacingMode = js.native
  var target: SlotData = js.native
  var translateMix: Double = js.native
}

object PathConstraintData {
  @scala.inline
  def apply(
    bones: js.Array[BoneData],
    name: String,
    offsetRotation: Double,
    order: Double,
    position: Double,
    positionMode: PositionMode,
    rotateMix: Double,
    rotateMode: RotateMode,
    skinRequired: Boolean,
    spacing: Double,
    spacingMode: SpacingMode,
    target: SlotData,
    translateMix: Double
  ): PathConstraintData = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetRotation = offsetRotation.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionMode = positionMode.asInstanceOf[js.Any], rotateMix = rotateMix.asInstanceOf[js.Any], rotateMode = rotateMode.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], spacingMode = spacingMode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathConstraintData]
  }
  @scala.inline
  implicit class PathConstraintDataOps[Self <: PathConstraintData] (val x: Self) extends AnyVal {
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
    def withOffsetRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionMode(value: PositionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateMix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateMix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateMode(value: RotateMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacingMode(value: SpacingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: SlotData): Self = {
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

