package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SlicerCollection object, for use in `slicerCollection.set({ ... })`. */
@js.native
trait SlicerCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[SlicerData]] = js.native
}

object SlicerCollectionUpdateData {
  @scala.inline
  def apply(): SlicerCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerCollectionUpdateData]
  }
  @scala.inline
  implicit class SlicerCollectionUpdateDataOps[Self <: SlicerCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SlicerData]): Self = {
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

