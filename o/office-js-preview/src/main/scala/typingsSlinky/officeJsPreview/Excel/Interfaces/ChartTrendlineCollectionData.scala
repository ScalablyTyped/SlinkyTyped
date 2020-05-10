package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartTrendlineCollection.toJSON()`. */
@js.native
trait ChartTrendlineCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ChartTrendlineData]] = js.native
}

object ChartTrendlineCollectionData {
  @scala.inline
  def apply(): ChartTrendlineCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineCollectionData]
  }
  @scala.inline
  implicit class ChartTrendlineCollectionDataOps[Self <: ChartTrendlineCollectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ChartTrendlineData]): Self = {
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

