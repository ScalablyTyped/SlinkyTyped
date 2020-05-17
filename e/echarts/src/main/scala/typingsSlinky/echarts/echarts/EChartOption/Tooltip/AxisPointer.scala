package typingsSlinky.echarts.echarts.EChartOption.Tooltip

import typingsSlinky.echarts.anon.Opacity
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.PointerLabel
import typingsSlinky.echarts.echarts.EChartOption.LineStyle
import typingsSlinky.echarts.echartsStrings.angle
import typingsSlinky.echarts.echartsStrings.auto
import typingsSlinky.echarts.echartsStrings.cross
import typingsSlinky.echarts.echartsStrings.line
import typingsSlinky.echarts.echartsStrings.none
import typingsSlinky.echarts.echartsStrings.radius
import typingsSlinky.echarts.echartsStrings.shadow
import typingsSlinky.echarts.echartsStrings.x
import typingsSlinky.echarts.echartsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisPointer extends js.Object {
  var animation: js.UndefOr[Boolean] = js.native
  var animationDelay: js.UndefOr[Double | js.Function] = js.native
  var animationDelayUpdate: js.UndefOr[Double | js.Function] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var animationDurationUpdate: js.UndefOr[Double | js.Function] = js.native
  var animationEasing: js.UndefOr[String] = js.native
  var animationEasingUpdate: js.UndefOr[String] = js.native
  var animationThreshold: js.UndefOr[Double] = js.native
  var axis: js.UndefOr[auto | x | y | radius | angle] = js.native
  // It is valid when axisPointer.type is 'cross'.
  var crossStyle: js.UndefOr[LineStyle] = js.native
  var label: js.UndefOr[PointerLabel] = js.native
  var lineStyle: js.UndefOr[LineStyle] = js.native
  var shadowStyle: js.UndefOr[Opacity] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var snap: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[line | shadow | none | cross] = js.native
  var z: js.UndefOr[Double] = js.native
}

object AxisPointer {
  @scala.inline
  def apply(): AxisPointer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisPointer]
  }
  @scala.inline
  implicit class AxisPointerOps[Self <: AxisPointer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDelay(value: Double | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDelayUpdate(value: Double | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelayUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelayUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelayUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDurationUpdate(value: Double | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasingUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasingUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: auto | typingsSlinky.echarts.echartsStrings.x | y | radius | angle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossStyle(value: LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: PointerLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLineStyle(value: LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowStyle(value: Opacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSnap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: line | shadow | none | cross): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
  }
  
}

