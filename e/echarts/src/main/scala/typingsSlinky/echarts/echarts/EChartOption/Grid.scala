package typingsSlinky.echarts.echarts.EChartOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drawing grid in rectangular coordinate.
  * In a single grid, at most two X and Y axes each is allowed.
  * Line chart, bar chart, and scatter chart (bubble chart) can be drawn in grid.
  *
  * @see https://echarts.apache.org/en/option.html#grid
  */
@js.native
trait Grid extends js.Object {
  /**
    * Background color of grid, which is transparent by default.
    * Attention: Works only if show: true is set.
    *
    * @default 'transparent'
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Border color of grid. Support the same color format as backgroundColor.
    * Attention: Works only if show: true is set.
    *
    * @default '#ccc'
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * Border width of grid.
    * Attention: Works only if show: true is set.
    *
    * @default 1
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * Distance between grid component and the bottom side of the container.
    * bottom value can be instant pixel value like 20; it can also be percentage value relative to container width like '20%'.
    *
    * @default 60
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * Whether the grid region contains axis tick label of axis.
    * When containLabel is false:
    * grid.left grid.right grid.top grid.bottom grid.width grid.height decide the location
    * and size of the rectangle that is made of by xAxis and yAxis.
    * Setting to false will help when multiple grids need to be aligned at their axes.
    * When containLabel is true:
    * grid.left grid.right grid.top grid.bottom grid.width grid.height decide the location
    * and size of the rectangle that contains the axes and the labels of the axes.
    * Setting to true will help when the length of axis labels is dynamic and is hard to approximate.
    * This will avoid labels from overflowing the container or overlapping other components.
    *
    * @default false
    */
  var containLabel: js.UndefOr[Boolean] = js.native
  /**
    * Height of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Distance between grid component and the left side of the container.
    * left value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'left', 'center', or 'right'.
    * If the left value is set to be 'left', 'center', or 'right',
    * then the component will be aligned automatically based on position.
    *
    * @default '10%'
    */
  var left: js.UndefOr[Double | String] = js.native
  /**
    * Distance between grid component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    *
    * @default '10%'
    */
  var right: js.UndefOr[Double | String] = js.native
  /**
    * Size of shadow blur. This attribute should be used along with
    * shadowColor,shadowOffsetX, shadowOffsetY to set shadow to component.
    * Attention:
    * This property works only if show: true is configured and
    * backgroundColor is defined other than transparent.
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color. Support same format as color.
    * Attention: This property works only if show: true configured.
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    * Attention: This property works only if show: true configured.
    *
    * @default 0
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    * Attention: This property works only if show: true configured.
    *
    * @default 0
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /**
    * Whether to show the grid in rectangular coordinate.
    *
    * @default false
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in the coordinate system component.
    * @see https://echarts.apache.org/en/option.html#grid.tooltip
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  /**
    * Distance between grid component and the top side of the container.
    * top value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'top', 'middle', or 'bottom'.
    *
    * @default 60
    */
  var top: js.UndefOr[Double | String] = js.native
  /**
    * Width of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * z value of all graphical elements in , which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @default 2
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * zlevel value of all graphical elements in.
    * zlevel is used to make layers with Canvas.
    * Graphical elements with different zlevel values will be placed in different Canvases,
    * which is a common optimization technique.
    * We can put those frequently changed elements (like those with animations) to a seperate zlevel.
    * Notice that too many Canvases will increase memory cost, and should be used carefully on mobile phones to avoid crash.
    * Canvases with bigger zlevel will be placed on Canvases with smaller zlevel.
    *
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object Grid {
  @scala.inline
  def apply(): Grid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grid]
  }
  @scala.inline
  implicit class GridOps[Self <: Grid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: Double | String): Self = {
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
    def withContainLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double | String): Self = {
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
    def withRight(value: Double | String): Self = {
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
    def withShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(js.undefined)
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
    def withTooltip(value: Tooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double | String): Self = {
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
    def withWidth(value: Double | String): Self = {
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
    @scala.inline
    def withZlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(js.undefined)
        ret
    }
  }
  
}

