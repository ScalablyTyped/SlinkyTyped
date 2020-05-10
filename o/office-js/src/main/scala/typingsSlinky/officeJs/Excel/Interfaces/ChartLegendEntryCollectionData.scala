package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartLegendEntryCollection.toJSON()`. */
@js.native
trait ChartLegendEntryCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ChartLegendEntryData]] = js.native
}

object ChartLegendEntryCollectionData {
  @scala.inline
  def apply(): ChartLegendEntryCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendEntryCollectionData]
  }
  @scala.inline
  implicit class ChartLegendEntryCollectionDataOps[Self <: ChartLegendEntryCollectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ChartLegendEntryData]): Self = {
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

