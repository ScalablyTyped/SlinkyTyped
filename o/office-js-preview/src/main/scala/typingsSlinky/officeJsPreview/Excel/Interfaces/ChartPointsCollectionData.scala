package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPointsCollection.toJSON()`. */
@js.native
trait ChartPointsCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ChartPointData]] = js.native
}

object ChartPointsCollectionData {
  @scala.inline
  def apply(): ChartPointsCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointsCollectionData]
  }
  @scala.inline
  implicit class ChartPointsCollectionDataOps[Self <: ChartPointsCollectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ChartPointData]): Self = {
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

