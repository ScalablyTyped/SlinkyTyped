package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonSeriesColor
import typingsSlinky.devextreme.devextremeStrings.excludePoints
import typingsSlinky.devextreme.devextremeStrings.includePoints
import typingsSlinky.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartLegend extends BaseChartLegend {
  /** Specifies the text for a hint that appears when a user hovers the mouse pointer over a legend item. */
  var customizeHint: js.UndefOr[js.Function1[/* seriesInfo */ AnonSeriesColor, String]] = js.native
  /** Specifies a callback function that returns the text to be displayed by legend items. */
  var customizeText: js.UndefOr[js.Function1[/* seriesInfo */ AnonSeriesColor, String]] = js.native
  /** Specifies what series elements to highlight when a corresponding item in the legend is hovered over. */
  var hoverMode: js.UndefOr[excludePoints | includePoints | none] = js.native
}

object dxPolarChartLegend {
  @scala.inline
  def apply(): dxPolarChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartLegend]
  }
  @scala.inline
  implicit class dxPolarChartLegendOps[Self <: dxPolarChartLegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizeHint(value: /* seriesInfo */ AnonSeriesColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeHint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeHint")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeText(value: /* seriesInfo */ AnonSeriesColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverMode(value: excludePoints | includePoints | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(js.undefined)
        ret
    }
  }
  
}

