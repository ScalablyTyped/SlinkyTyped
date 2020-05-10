package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseChartLegendItem extends BaseLegendItem {
  /** The series that the item represents on the legend. */
  var series: js.UndefOr[baseSeriesObject] = js.native
}

object BaseChartLegendItem {
  @scala.inline
  def apply(): BaseChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartLegendItem]
  }
  @scala.inline
  implicit class BaseChartLegendItemOps[Self <: BaseChartLegendItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeries(value: baseSeriesObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
  }
  
}

