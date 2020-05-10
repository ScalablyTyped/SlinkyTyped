package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartSeriesCollection object, for use in `chartSeriesCollection.set({ ... })`. */
@js.native
trait ChartSeriesCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ChartSeriesData]] = js.native
}

object ChartSeriesCollectionUpdateData {
  @scala.inline
  def apply(): ChartSeriesCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesCollectionUpdateData]
  }
  @scala.inline
  implicit class ChartSeriesCollectionUpdateDataOps[Self <: ChartSeriesCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ChartSeriesData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

