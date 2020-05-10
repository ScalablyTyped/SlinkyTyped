package typingsSlinky.recharts.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.recharts.PartialMargin
import typingsSlinky.recharts.rechartsStrings.centric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.recharts.mod.CategoricalChartWrapper because var conflicts: onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseUp. Inlined syncId, compact, width, height, data, layout, stackOffset, throttleDelay, margin, barCategoryGap, barGap, barSize, baseValue, maxBarSize, style, className, children, reverseStackOrder */ @js.native
trait RadarChartProps extends EventAttributes {
  var barCategoryGap: js.UndefOr[Double | String] = js.native
  var barGap: js.UndefOr[Double | String] = js.native
  var barSize: js.UndefOr[Double | String] = js.native
  var baseValue: js.UndefOr[BaseValueType] = js.native
  var children: js.UndefOr[TagMod[Any] | js.Array[TagMod[Any]]] = js.native
  var className: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var cx: js.UndefOr[Double | String] = js.native
  var cy: js.UndefOr[Double | String] = js.native
  var data: js.UndefOr[js.Array[js.Object]] = js.native
  var endAngle: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var innerRadius: js.UndefOr[Double | String] = js.native
  var layout: js.UndefOr[centric] = js.native
  var margin: js.UndefOr[PartialMargin] = js.native
  var maxBarSize: js.UndefOr[Double] = js.native
  var outerRadius: js.UndefOr[Double | String] = js.native
  var reverseStackOrder: js.UndefOr[Boolean] = js.native
  var stackOffset: js.UndefOr[StackOffsetType] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var syncId: js.UndefOr[String | Double] = js.native
  var throttleDelay: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object RadarChartProps {
  @scala.inline
  def apply(): RadarChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartProps]
  }
  @scala.inline
  implicit class RadarChartPropsOps[Self <: RadarChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarCategoryGap(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCategoryGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarCategoryGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCategoryGap")(js.undefined)
        ret
    }
    @scala.inline
    def withBarGap(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGap")(js.undefined)
        ret
    }
    @scala.inline
    def withBarSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseValue(value: BaseValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseValue")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any] | js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withCx(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(js.undefined)
        ret
    }
    @scala.inline
    def withCy(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: centric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: PartialMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBarSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBarSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRadius(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseStackOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseStackOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseStackOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseStackOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStackOffset(value: StackOffsetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackOffset")(js.undefined)
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
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncId")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottleDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

