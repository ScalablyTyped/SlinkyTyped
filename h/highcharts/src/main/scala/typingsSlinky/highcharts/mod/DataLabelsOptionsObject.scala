package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLabelsOptionsObject extends js.Object {
  /**
    * The alignment of the data label compared to the point. If `right`, the
    * right side of the label should be touching the point. For points with an
    * extent, like columns, the alignments also dictates how to align it inside
    * the box, as given with the inside option. Can be one of `left`, `center`
    * or `right`.
    */
  var align: js.UndefOr[AlignValue | Null] = js.native
  /**
    * Whether to allow data labels to overlap. To make the labels less
    * sensitive for overlapping, the dataLabels.padding can be set to 0.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.native
  /**
    * The background color or gradient for the data label.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * The border color for the data label. Defaults to `undefined`.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * The border radius in pixels for the data label.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * The border width in pixels for the data label.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * A class name for the data label. Particularly in styled mode, this can be
    * used to give each series' or point's data label unique styling. In
    * addition to this option, a default color class name is added so that we
    * can give the labels a contrast text shadow.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The text color for the data labels. Defaults to `undefined`. For certain
    * series types, like column or map, the data labels can be drawn inside the
    * points. In this case the data label will be drawn with maximum contrast
    * by default. Additionally, it will be given a `text-outline` style with
    * the opposite color, to further increase the contrast. This can be
    * overridden by setting the `text-outline` style to `none` in the
    * `dataLabels.style` option.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * Whether to hide data labels that are outside the plot area. By default,
    * the data label is moved inside the plot area according to the overflow
    * option.
    */
  var crop: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
    * labels until the initial series animation has finished.
    */
  var defer: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable the data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * A declarative filter to control of which data labels to display. The
    * declarative filter is designed for use when callback functions are not
    * available, like when the chart options require a pure JSON structure or
    * for use with graphical editors. For programmatic control, use the
    * `formatter` instead, and return `undefined` to disable a single data
    * label.
    */
  var filter: js.UndefOr[DataLabelsFilterOptionsObject] = js.native
  /**
    * A format string for the data label. Available variables are the same as
    * for `formatter`.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Callback JavaScript function to format the data label. Note that if a
    * `format` is defined, the format takes precedence and the formatter is
    * ignored.
    */
  var formatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.native
  /**
    * For points with an extent, like columns or map areas, whether to align
    * the data label inside the box or to the actual value point. Defaults to
    * `false` in most cases, `true` in stacked columns.
    */
  var inside: js.UndefOr[Boolean] = js.native
  /**
    * Format for points with the value of null. Works analogously to format.
    * `nullFormat` can be applied only to series which support displaying null
    * points.
    */
  var nullFormat: js.UndefOr[Boolean | String] = js.native
  /**
    * Callback JavaScript function that defines formatting for points with the
    * value of null. Works analogously to formatter. `nullPointFormatter` can
    * be applied only to series which support displaying null points.
    */
  var nullFormatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.native
  /**
    * How to handle data labels that flow outside the plot area. The default is
    * `"justify"`, which aligns them inside the plot area. For columns and
    * bars, this means it will be moved inside the bar. To display data labels
    * outside the plot area, set `crop` to `false` and `overflow` to `"allow"`.
    */
  var overflow: js.UndefOr[DataLabelsOverflowValue] = js.native
  /**
    * When either the `borderWidth` or the `backgroundColor` is set, this is
    * the padding within the box.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * Text rotation in degrees. Note that due to a more complex structure,
    * backgrounds, borders and padding will be lost on a rotated data label.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * The shadow of the box. Works best with `borderWidth` or
    * `backgroundColor`. Since 2.3 the shadow can be an object configuration
    * containing `color`, `offsetX`, `offsetY`, `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.native
  /**
    * The name of a symbol to use for the border around the label. Symbols are
    * predefined functions on the Renderer object.
    */
  var shape: js.UndefOr[String] = js.native
  /**
    * Styles for the label. The default `color` setting is `"contrast"`, which
    * is a pseudo color that Highcharts picks up and applies the maximum
    * contrast to the underlying point item, for example the bar in a bar
    * chart.
    *
    * The `textOutline` is a pseudo property that applies an outline of the
    * given width with the given color, which by default is the maximum
    * contrast to the text. So a bright text color will result in a black text
    * outline for maximum readability on a mixed background. In some cases,
    * especially with grayscale text, the text outline doesn't work well, in
    * which cases it can be disabled by setting it to `"none"`. When `useHTML`
    * is true, the `textOutline` will not be picked up. In this, case, the same
    * effect can be acheived through the `text-shadow` CSS property.
    *
    * For some series types, where each point has an extent, like for example
    * tree maps, the data label may overflow the point. There are two
    * strategies for handling overflow. By default, the text will wrap to
    * multiple lines. The other strategy is to set `style.textOverflow` to
    * `ellipsis`, which will keep the text on one line plus it will break
    * inside long words.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * Options for a label text which should follow marker's shape. Border and
    * background are disabled for a label that follows a path. **Note:** Only
    * SVG-based renderer supports this option. Setting `useHTML` to true will
    * disable this option.
    */
  var textPath: js.UndefOr[DataLabelsTextPathOptionsObject] = js.native
  /**
    * Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  /**
    * The vertical alignment of a data label. Can be one of `top`, `middle` or
    * `bottom`. The default value depends on the data, for instance in a column
    * chart, the label is above positive values and below negative values.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue | Null] = js.native
  /**
    * The x position offset of the label relative to the point in pixels.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y position offset of the label relative to the point in pixels.
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * The Z index of the data labels. The default Z index puts it above the
    * series. Use a Z index of 2 to display it behind the series.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object DataLabelsOptionsObject {
  @scala.inline
  def apply(): DataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabelsOptionsObject]
  }
  @scala.inline
  implicit class DataLabelsOptionsObjectOps[Self <: DataLabelsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAlignNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(null)
        ret
    }
    @scala.inline
    def withAllowOverlap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverlap")(js.undefined)
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
    def withColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(js.undefined)
        ret
    }
    @scala.inline
    def withDefer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(js.undefined)
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
    def withFilter(value: DataLabelsFilterOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: DataLabelsFormatterCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withInside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inside")(js.undefined)
        ret
    }
    @scala.inline
    def withNullFormat(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNullFormatter(value: DataLabelsFormatterCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: DataLabelsOverflowValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
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
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Boolean | ShadowOptionsObject): Self = {
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
    def withShape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSObject): Self = {
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
    def withTextPath(value: DataLabelsTextPathOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPath")(js.undefined)
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
    def withVerticalAlignNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(null)
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
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

