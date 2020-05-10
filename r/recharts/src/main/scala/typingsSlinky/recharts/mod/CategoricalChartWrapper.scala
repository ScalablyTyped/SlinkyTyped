package typingsSlinky.recharts.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.recharts.PartialMargin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoricalChartWrapper[L] extends js.Object {
  var barCategoryGap: js.UndefOr[Double | String] = js.native
  var barGap: js.UndefOr[Double | String] = js.native
  var barSize: js.UndefOr[Double | String] = js.native
  var baseValue: js.UndefOr[BaseValueType] = js.native
  var children: js.UndefOr[TagMod[Any] | js.Array[TagMod[Any]]] = js.native
  var className: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[js.Array[js.Object]] = js.native
  var height: js.UndefOr[Double] = js.native
  var layout: js.UndefOr[L] = js.native
  var margin: js.UndefOr[PartialMargin] = js.native
  var maxBarSize: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[RechartsFunction] = js.native
  var onMouseDown: js.UndefOr[RechartsFunction] = js.native
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.native
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.native
  var onMouseMove: js.UndefOr[RechartsFunction] = js.native
  var onMouseUp: js.UndefOr[RechartsFunction] = js.native
  var reverseStackOrder: js.UndefOr[Boolean] = js.native
  var stackOffset: js.UndefOr[StackOffsetType] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var syncId: js.UndefOr[String | Double] = js.native
  var throttleDelay: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object CategoricalChartWrapper {
  @scala.inline
  def apply[L](): CategoricalChartWrapper[L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoricalChartWrapper[L]]
  }
  @scala.inline
  implicit class CategoricalChartWrapperOps[Self[l] <: CategoricalChartWrapper[l], L] (val x: Self[L]) extends AnyVal {
    @scala.inline
    def duplicate: Self[L] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[L]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[L] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[L] with Other]
    @scala.inline
    def withBarCategoryGap(value: Double | String): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCategoryGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarCategoryGap: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCategoryGap")(js.undefined)
        ret
    }
    @scala.inline
    def withBarGap(value: Double | String): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarGap: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGap")(js.undefined)
        ret
    }
    @scala.inline
    def withBarSize(value: Double | String): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarSize: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseValue(value: BaseValueType): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseValue: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseValue")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any] | js.Array[TagMod[Any]]): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.Object]): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: L): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: PartialMargin): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBarSize(value: Double): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBarSize: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBarSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* repeated */ js.Any => Unit): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: /* repeated */ js.Any => Unit): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: /* repeated */ js.Any => Unit): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: /* repeated */ js.Any => Unit): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* repeated */ js.Any => Unit): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: /* repeated */ js.Any => Unit): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseStackOrder(value: Boolean): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseStackOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseStackOrder: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseStackOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStackOffset(value: StackOffsetType): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackOffset: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncId(value: String | Double): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncId: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncId")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottleDelay(value: Double): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleDelay: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

