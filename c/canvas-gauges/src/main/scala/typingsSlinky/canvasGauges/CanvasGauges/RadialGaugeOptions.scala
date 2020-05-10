package typingsSlinky.canvasGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadialGaugeOptions extends GenericOptions {
  var animationTarget: js.UndefOr[String] = js.native
  var colorNeedleCircleInner: js.UndefOr[String] = js.native
  var colorNeedleCircleInnerEnd: js.UndefOr[String] = js.native
  var colorNeedleCircleOuter: js.UndefOr[String] = js.native
  var colorNeedleCircleOuterEnd: js.UndefOr[String] = js.native
  var needleCircleInner: js.UndefOr[Boolean] = js.native
  var needleCircleOuter: js.UndefOr[Boolean] = js.native
  var needleCircleSize: js.UndefOr[Double] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var ticksAngle: js.UndefOr[Double] = js.native
  var useMinPath: js.UndefOr[Boolean] = js.native
}

object RadialGaugeOptions {
  @scala.inline
  def apply(renderTo: RenderTarget): RadialGaugeOptions = {
    val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugeOptions]
  }
  @scala.inline
  implicit class RadialGaugeOptionsOps[Self <: RadialGaugeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNeedleCircleInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleCircleInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorNeedleCircleInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleCircleInner")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNeedleCircleInnerEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleCircleInnerEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorNeedleCircleInnerEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleCircleInnerEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNeedleCircleOuter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleCircleOuter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorNeedleCircleOuter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleCircleOuter")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNeedleCircleOuterEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleCircleOuterEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorNeedleCircleOuterEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleCircleOuterEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleCircleInner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleCircleInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleCircleInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleCircleInner")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleCircleOuter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleCircleOuter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleCircleOuter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleCircleOuter")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleCircleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleCircleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleCircleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleCircleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTicksAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicksAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMinPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMinPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMinPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMinPath")(js.undefined)
        ret
    }
  }
  
}

