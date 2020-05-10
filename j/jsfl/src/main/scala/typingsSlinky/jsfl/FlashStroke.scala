package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashStroke extends js.Object {
  /// A Boolean value, same as the Sharp Corners setting in the custom Stroke Style dialog box.
  var breakAtCorners: Boolean = js.native
  /// A string that specifies the type of cap for the stroke.
  var capType: String = js.native
  /// A string, hexadecimal value, or integer that represents the stroke color.
  var color: js.Any = js.native
  /// A string that specifies the type of hatching for the stroke.
  var curve: String = js.native
  /// An integer that specifies the lengths of the solid part of a dashed line.
  var dash1: Double = js.native
  /// An integer that specifies the lengths of the blank part of a dashed line.
  var dash2: Double = js.native
  /// A string that specifies the density of a stippled line.
  var density: String = js.native
  /// A string that specifies the dot size of a stippled line.
  var dotSize: String = js.native
  /// An integer that specifies the spacing between dots in a dotted line.
  var dotSpace: Double = js.native
  /// A string that specifies the thickness of a hatch line.
  var hatchThickness: String = js.native
  /// A string that specifies the jiggle property of a hatched line.
  var jiggle: String = js.native
  /// A string that specifies the type of join for the stroke.
  var joinType: String = js.native
  /// A string that specifies the length of a hatch line.
  var length: String = js.native
  /// A float value that specifies the angle above which the tip of the miter will be truncated by a segment.
  var miterLimit: Double = js.native
  /// A string that specifies the pattern of a ragged line.
  var pattern: String = js.native
  /// A string that specifies the rotation of a hatch line.
  var rotate: String = js.native
  /// A string that specifies the type of scale to be applied to the stroke.
  var scaleType: String = js.native
  /// A Fill object that represents the fill settings of the stroke.
  var shapeFill: FlashFill = js.native
  /// A string that specifies the spacing of a hatched line.
  var space: String = js.native
  /// A Boolean value that specifies whether stroke hinting is set on the stroke.
  var strokeHinting: Boolean = js.native
  /// A string that describes the stroke style.
  var style: String = js.native
  /// An integer that specifies the stroke size.
  var thickness: Double = js.native
  /// A string that specifies the variation of a stippled line.
  var variation: String = js.native
  /// A string that specifies the wave height of a ragged line.
  var waveHeight: String = js.native
  /// A string that specifies the wave length of a ragged line.
  var waveLength: String = js.native
}

object FlashStroke {
  @scala.inline
  def apply(
    breakAtCorners: Boolean,
    capType: String,
    color: js.Any,
    curve: String,
    dash1: Double,
    dash2: Double,
    density: String,
    dotSize: String,
    dotSpace: Double,
    hatchThickness: String,
    jiggle: String,
    joinType: String,
    length: String,
    miterLimit: Double,
    pattern: String,
    rotate: String,
    scaleType: String,
    shapeFill: FlashFill,
    space: String,
    strokeHinting: Boolean,
    style: String,
    thickness: Double,
    variation: String,
    waveHeight: String,
    waveLength: String
  ): FlashStroke = {
    val __obj = js.Dynamic.literal(breakAtCorners = breakAtCorners.asInstanceOf[js.Any], capType = capType.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], dash1 = dash1.asInstanceOf[js.Any], dash2 = dash2.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], dotSpace = dotSpace.asInstanceOf[js.Any], hatchThickness = hatchThickness.asInstanceOf[js.Any], jiggle = jiggle.asInstanceOf[js.Any], joinType = joinType.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any], shapeFill = shapeFill.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], strokeHinting = strokeHinting.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], waveHeight = waveHeight.asInstanceOf[js.Any], waveLength = waveLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashStroke]
  }
  @scala.inline
  implicit class FlashStrokeOps[Self <: FlashStroke] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakAtCorners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakAtCorners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurve(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDash1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dash1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDash2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dash2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDensity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHatchThickness(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hatchThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJiggle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jiggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoinType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeFill(value: FlashFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeHinting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeHinting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaveHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaveLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

