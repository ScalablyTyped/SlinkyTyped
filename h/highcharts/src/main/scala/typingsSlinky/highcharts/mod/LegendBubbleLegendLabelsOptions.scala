package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendBubbleLegendLabelsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) The alignment of the labels compared to
    * the bubble legend. Can be one of `left`, `center` or `right`.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Whether to allow data labels to
    * overlap.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) An additional class name to apply to
    * the bubble legend label graphical elements. This option does not replace
    * default class names of the graphical element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) A format string for the bubble legend
    * labels. Available variables are the same as for `formatter`.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Available `this` properties are:
    *
    * - `this.value`: The bubble value.
    *
    * - `this.radius`: The radius of the bubble range.
    *
    * - `this.center`: The center y position of the range.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[BubbleLegendFormatterContextObject]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) CSS styles for the labels.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The x position offset of the label
    * relative to the connector.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The y position offset of the label
    * relative to the connector.
    */
  var y: js.UndefOr[Double] = js.native
}

object LegendBubbleLegendLabelsOptions {
  @scala.inline
  def apply(): LegendBubbleLegendLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendBubbleLegendLabelsOptions]
  }
  @scala.inline
  implicit class LegendBubbleLegendLabelsOptionsOps[Self <: LegendBubbleLegendLabelsOptions] (val x: Self) extends AnyVal {
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
    def withFormatter(value: FormatterCallbackFunction[BubbleLegendFormatterContextObject]): Self = {
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

