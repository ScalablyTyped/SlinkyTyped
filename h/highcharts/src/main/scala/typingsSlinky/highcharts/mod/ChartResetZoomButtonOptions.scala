package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartResetZoomButtonOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
    */
  var position: js.UndefOr[AlignObject | ChartResetZoomButtonPositionOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) What frame the button placement
    * should be related to. Can be either `plotBox` or `spacingBox`.
    */
  var relativeTo: js.UndefOr[ButtonRelativeToValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of attributes for
    * the button. The object takes SVG attributes like `fill`, `stroke`,
    * `stroke-width` or `r`, the border radius. The theme also supports
    * `style`, a collection of CSS properties for the text. Equivalent
    * attributes for the hover state are given in `theme.states.hover`.
    */
  var theme: js.UndefOr[SVGAttributes] = js.native
}

object ChartResetZoomButtonOptions {
  @scala.inline
  def apply(): ChartResetZoomButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartResetZoomButtonOptions]
  }
  @scala.inline
  implicit class ChartResetZoomButtonOptionsOps[Self <: ChartResetZoomButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: AlignObject | ChartResetZoomButtonPositionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeTo(value: ButtonRelativeToValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTo")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

