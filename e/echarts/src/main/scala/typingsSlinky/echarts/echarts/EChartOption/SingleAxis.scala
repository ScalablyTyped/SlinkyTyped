package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Type
import typingsSlinky.echarts.echartsStrings.horizontal
import typingsSlinky.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An axis with a single dimension. It can be used to display data in one dimension
  *
  * @see https://echarts.apache.org/en/option.html#xAxis
  */
@js.native
trait SingleAxis extends CartesianAxis {
  /**
    * Distance between grid component and the bottom side of the container.
    * bottom value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    *
    * @default '5%'
    */
  var bottom: js.UndefOr[String | Double] = js.native
  /**
    * Height of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Distance between grid component and the left side of the container.
    * left value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'left', 'center', or 'right'.
    * If the left value is set to be 'left', 'center', or 'right',
    * then the component will be aligned automatically based on position.
    *
    * @default '5%'
    */
  var left: js.UndefOr[String | Double] = js.native
  /**
    * Orientation of the axis. By default, it's 'horizontal'.
    * You can set it to be 'vertical' to make a vertical axis.
    *
    * @default 'horizontal'
    */
  var orient: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Distance between grid component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    *
    * @default '5%'
    */
  var right: js.UndefOr[String | Double] = js.native
  /**
    * Distance between grid component and the top side of the container.
    * top value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'top', 'middle', or 'bottom'.
    * If the left value is set to be 'top', 'middle', or 'bottom',
    * then the component will be aligned automatically based on position.
    *
    * @default '5%'
    */
  var top: js.UndefOr[String | Double] = js.native
  /**
    * Options:
    * + 'value' - Numerical axis, suitable for continuous data.
    * + 'category' Category axis, suitable for discrete category data.
    *   Data should only be set via data for this type.
    * + 'time' Time axis, suitable for continuous time series data.
    *   As compared to value axis, it has a better formatting for time
    *   and a different tick calculation method.
    *   For example, it decides to use month, week, day or hour for tick
    *   based on the range of span.
    * + 'log' Log axis, suitable for log data.
    *
    * @default 'value'
    * @see https://echarts.apache.org/en/option.html#singleAxis.type
    */
  var `type`: js.UndefOr[Type] = js.native
  /**
    * Width of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var width: js.UndefOr[String | Double] = js.native
}

object SingleAxis {
  @scala.inline
  def apply(): SingleAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleAxis]
  }
  @scala.inline
  implicit class SingleAxisOps[Self <: SingleAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
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
    def withLeft(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withOrient(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
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
    def withWidth(value: String | Double): Self = {
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

