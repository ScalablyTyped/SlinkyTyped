package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotOrganizationStatesHoverOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotOrganizationStatesHoverAnimationOptions] = js.undefined
  /**
    * (Highcharts, Gantt) A specific border color for the hovered point.
    * Defaults to inherit the normal state border color.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) The border width of the point in this state
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) How much to brighten the point on
    * interaction. Requires the main color to be defined in hex or rgb(a)
    * format.
    *
    * In styled mode, the hover brightening is by default replaced with a
    * fill-opacity set in the `.highcharts-point:hover` rule.
    */
  var brightness: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Gantt) A specific color for the hovered point.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Enable separate styles for the hovered
    * series to visualize that the user hovers either the series itself or the
    * legend.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Opacity for the links between nodes in the
    * sankey diagram in hover mode.
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined
}

object PlotOrganizationStatesHoverOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotOrganizationStatesHoverAnimationOptions = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    brightness: js.UndefOr[Double] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    linkOpacity: js.UndefOr[Double] = js.undefined
  ): PlotOrganizationStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(brightness)) __obj.updateDynamic("brightness")(brightness.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkOpacity)) __obj.updateDynamic("linkOpacity")(linkOpacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotOrganizationStatesHoverOptions]
  }
}

