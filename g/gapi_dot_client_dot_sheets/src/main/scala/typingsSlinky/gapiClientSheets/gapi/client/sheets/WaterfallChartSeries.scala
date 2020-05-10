package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaterfallChartSeries extends js.Object {
  /**
    * Custom subtotal columns appearing in this series. The order in which
    * subtotals are defined is not significant. Only one subtotal may be
    * defined for each data point.
    */
  var customSubtotals: js.UndefOr[js.Array[WaterfallChartCustomSubtotal]] = js.native
  /** The data being visualized in this series. */
  var data: js.UndefOr[ChartData] = js.native
  /**
    * True to hide the subtotal column from the end of the series. By default,
    * a subtotal column will appear at the end of each series. Setting this
    * field to true will hide that subtotal column for this series.
    */
  var hideTrailingSubtotal: js.UndefOr[Boolean] = js.native
  /** Styles for all columns in this series with negative values. */
  var negativeColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
  /** Styles for all columns in this series with positive values. */
  var positiveColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
  /** Styles for all subtotal columns in this series. */
  var subtotalColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
}

object WaterfallChartSeries {
  @scala.inline
  def apply(): WaterfallChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartSeries]
  }
  @scala.inline
  implicit class WaterfallChartSeriesOps[Self <: WaterfallChartSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomSubtotals(value: js.Array[WaterfallChartCustomSubtotal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSubtotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSubtotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSubtotals")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTrailingSubtotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTrailingSubtotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTrailingSubtotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTrailingSubtotal")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeColumnsStyle(value: WaterfallChartColumnStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColumnsStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeColumnsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColumnsStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPositiveColumnsStyle(value: WaterfallChartColumnStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveColumnsStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositiveColumnsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveColumnsStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtotalColumnsStyle(value: WaterfallChartColumnStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotalColumnsStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtotalColumnsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotalColumnsStyle")(js.undefined)
        ret
    }
  }
  
}

