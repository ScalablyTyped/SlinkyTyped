package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.GRADIENT_ANGULAR
import typingsSlinky.figma.figmaStrings.GRADIENT_DIAMOND
import typingsSlinky.figma.figmaStrings.GRADIENT_LINEAR
import typingsSlinky.figma.figmaStrings.GRADIENT_RADIAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientPaint extends Paint {
  val blendMode: js.UndefOr[BlendMode] = js.native
  val gradientStops: js.Array[ColorStop] = js.native
  val gradientTransform: Transform = js.native
  val opacity: js.UndefOr[Double] = js.native
  val `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND = js.native
  val visible: js.UndefOr[Boolean] = js.native
}

object GradientPaint {
  @scala.inline
  def apply(
    gradientStops: js.Array[ColorStop],
    gradientTransform: Transform,
    `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND
  ): GradientPaint = {
    val __obj = js.Dynamic.literal(gradientStops = gradientStops.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientPaint]
  }
  @scala.inline
  implicit class GradientPaintOps[Self <: GradientPaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradientStops(value: js.Array[ColorStop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientTransform(value: Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMode(value: BlendMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

