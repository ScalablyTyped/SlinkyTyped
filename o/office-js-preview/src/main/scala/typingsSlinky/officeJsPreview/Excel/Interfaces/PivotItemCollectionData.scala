package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotItemCollection.toJSON()`. */
@js.native
trait PivotItemCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[PivotItemData]] = js.native
}

object PivotItemCollectionData {
  @scala.inline
  def apply(): PivotItemCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotItemCollectionData]
  }
  @scala.inline
  implicit class PivotItemCollectionDataOps[Self <: PivotItemCollectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[PivotItemData]): Self = {
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

