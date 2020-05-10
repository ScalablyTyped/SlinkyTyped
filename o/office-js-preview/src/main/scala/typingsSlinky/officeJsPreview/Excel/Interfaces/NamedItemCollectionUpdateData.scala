package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the NamedItemCollection object, for use in `namedItemCollection.set({ ... })`. */
@js.native
trait NamedItemCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[NamedItemData]] = js.native
}

object NamedItemCollectionUpdateData {
  @scala.inline
  def apply(): NamedItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemCollectionUpdateData]
  }
  @scala.inline
  implicit class NamedItemCollectionUpdateDataOps[Self <: NamedItemCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[NamedItemData]): Self = {
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

