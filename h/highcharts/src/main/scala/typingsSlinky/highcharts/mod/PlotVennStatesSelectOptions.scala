package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVennStatesSelectOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[Boolean | PlotVennStatesSelectAnimationOptions] = js.undefined
  /**
    * (Highmaps) The border color of the point in this state.
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) The border width of the point in this state
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The color of the shape in this state.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Enable separate styles for the hovered series to visualize
    * that the user hovers either the series itself or the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) Pixel width of the graph line. By default this
    * property is undefined, and the `lineWidthPlus` property dictates how much
    * to increase the linewidth from normal state.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The additional line width for the graph of a
    * hovered series.
    */
  var lineWidthPlus: js.UndefOr[Double] = js.undefined
}

object PlotVennStatesSelectOptions {
  @scala.inline
  def apply(
    animation: Boolean | PlotVennStatesSelectAnimationOptions = null,
    borderColor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    color: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    lineWidthPlus: js.UndefOr[Double] = js.undefined
  ): PlotVennStatesSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidthPlus)) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVennStatesSelectOptions]
  }
}

