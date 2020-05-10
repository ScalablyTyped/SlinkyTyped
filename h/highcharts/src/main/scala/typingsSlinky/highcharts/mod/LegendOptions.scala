package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
    * legend. Requires the Accessibility module.
    */
  var accessibility: js.UndefOr[js.Object | LegendAccessibilityOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
    * legend box within the chart area. Valid values are `left`, `center` and
    * `right`.
    *
    * In the case that the legend is aligned in a corner position, the `layout`
    * option will determine whether to place it above/below or on the side of
    * the plot area.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If the layout is `horizontal`
    * and the legend items span over two lines or more, whether to align the
    * items into vertical columns. Setting this to `false` makes room for more
    * items, but will look more messy.
    */
  var alignColumns: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
    * legend.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
    * around the legend.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border corner radius of the
    * legend.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the drawn border
    * around the legend.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The bubble legend is an additional
    * element in legend which presents the scale of the bubble series.
    * Individual bubble ranges can be defined by user or calculated from
    * series. In the case of automatically calculated ranges, a 1px margin of
    * error is permitted.
    */
  var bubbleLegend: js.UndefOr[LegendBubbleLegendOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the legend.
    * There is also a series-specific option, showInLegend, that can hide the
    * series from the legend. In some series types this is `false` by default,
    * so it must set to `true` in order to show the legend for the series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When the legend is floating, the
    * plot area ignores it and is allowed to be placed below it.
    */
  var floating: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Default styling for the checkbox
    * next to a legend item when `showCheckbox` is true.
    */
  var itemCheckboxStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In a legend with horizontal
    * layout, the itemDistance defines the pixel distance between each item.
    */
  var itemDistance: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
    * when the corresponding series or point is hidden. Only a subset of CSS is
    * supported, notably those options related to text. Properties are
    * inherited from `style` unless overridden here.
    */
  var itemHiddenStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
    * in hover mode. Only a subset of CSS is supported, notably those options
    * related to text. Properties are inherited from `style` unless overridden
    * here.
    */
  var itemHoverStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel bottom margin for each
    * legend item.
    */
  var itemMarginBottom: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel top margin for each
    * legend item.
    */
  var itemMarginTop: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item.
    * Only a subset of CSS is supported, notably those options related to text.
    * The default `textOverflow` property makes long texts truncate. Set it to
    * `undefined` to wrap text instead. A `width` property can be added to
    * control the text width.
    */
  var itemStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width for each legend item.
    * By default the items are laid out successively. In a horizontal layout,
    * if the items are laid out across two rows or more, they will be
    * vertically aligned depending on the legend.alignColumns option.
    */
  var itemWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A format string for each legend
    * label. Available variables relates to properties on the series, or the
    * point in case of pies.
    */
  var labelFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format each
    * of the series' labels. The `this` keyword refers to the series object, or
    * the point object in case of pie charts. By default the series or point
    * name is printed.
    */
  var labelFormatter: js.UndefOr[FormatterCallbackFunction[Point | Series]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The layout of the legend items.
    * Can be one of `horizontal` or `vertical` or `proximate`. When
    * `proximate`, the legend items will be placed as close as possible to the
    * graphs they're representing, except in inverted charts or when the legend
    * position doesn't allow it.
    */
  var layout: js.UndefOr[OptionsLayoutValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If the plot area sized is
    * calculated automatically and the legend is not floating, the legend
    * margin is the space between the legend and the axis labels or plot area.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Maximum pixel height for the
    * legend. When the maximum height is extended, navigation will show.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the paging or
    * navigation appearing when the legend is overflown. Navigation works well
    * on screen, but not in static exported images. One way of working around
    * that is to increase the chart height in export.
    */
  var navigation: js.UndefOr[LegendNavigationOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The inner padding of the legend
    * box.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to reverse the order of
    * the legend items compared to the order of the series or points as defined
    * in the configuration object.
    */
  var reversed: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the symbol on
    * the right side of the text rather than the left side. This is common in
    * Arabic and Hebraic.
    */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
    * to the legend. A `backgroundColor` also needs to be applied for this to
    * take effect. The shadow can be an object configuration containing
    * `color`, `offsetX`, `offsetY`, `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When this is true, the legend
    * symbol width will be the same as the symbol height, which in turn
    * defaults to the font size of the legend items.
    */
  var squareSymbol: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel height of the symbol
    * for series types that use a rectangle in the legend. Defaults to the font
    * size of legend items.
    */
  var symbolHeight: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel padding between the
    * legend item symbol and the legend item text.
    */
  var symbolPadding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border radius of the symbol
    * for series types that use a rectangle in the legend. Defaults to half the
    * `symbolHeight`.
    */
  var symbolRadius: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the legend
    * item symbol. When the `squareSymbol` option is set, this defaults to the
    * `symbolHeight`, otherwise 16.
    */
  var symbolWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A title to be added on top of
    * the legend.
    */
  var title: js.UndefOr[LegendTitleOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
    * the legend item texts.
    *
    * Prior to 4.1.7, when using HTML, legend.navigation was disabled.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
    * legend box. Can be one of `top`, `middle` or `bottom`. Vertical position
    * can be further determined by the `y` option.
    *
    * In the case that the legend is aligned in a corner position, the `layout`
    * option will determine whether to place it above/below or on the side of
    * the plot area.
    *
    * When the layout option is `proximate`, the `verticalAlign` option doesn't
    * apply.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the legend box. If
    * a number is set, it translates to pixels. Since v7.0.2 it allows setting
    * a percent string of the full chart width, for example `40%`.
    *
    * Defaults to the full chart width from legends below or above the chart,
    * half the chart width for legends to the left and right.
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x offset of the legend
    * relative to its horizontal alignment `align` within chart.spacingLeft and
    * chart.spacingRight. Negative x moves it to the left, positive x moves it
    * to the right.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
    * legend relative to it's vertical alignment `verticalAlign` within
    * chart.spacingTop and chart.spacingBottom. Negative y moves it up,
    * positive y moves it down.
    */
  var y: js.UndefOr[Double] = js.native
}

object LegendOptions {
  @scala.inline
  def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  @scala.inline
  implicit class LegendOptionsOps[Self <: LegendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: js.Object | LegendAccessibilityOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withAlign(value: AlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
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
    def withBubbleLegend(value: LegendBubbleLegendOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFloating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCheckboxStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCheckboxStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCheckboxStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCheckboxStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHiddenStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHiddenStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHiddenStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHiddenStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHoverStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMarginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withItemMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMarginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMarginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFormatter(value: FormatterCallbackFunction[Point | Series]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: OptionsLayoutValue): Self = {
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
    def withMargin(value: Double): Self = {
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
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigation(value: LegendNavigationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Boolean | CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withSquareSymbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squareSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquareSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squareSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: LegendTitleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: VerticalAlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
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
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

