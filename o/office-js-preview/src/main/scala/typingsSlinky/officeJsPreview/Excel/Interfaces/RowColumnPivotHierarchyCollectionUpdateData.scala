package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RowColumnPivotHierarchyCollection object, for use in `rowColumnPivotHierarchyCollection.set({ ... })`. */
@js.native
trait RowColumnPivotHierarchyCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.native
}

object RowColumnPivotHierarchyCollectionUpdateData {
  @scala.inline
  def apply(): RowColumnPivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowColumnPivotHierarchyCollectionUpdateData]
  }
  @scala.inline
  implicit class RowColumnPivotHierarchyCollectionUpdateDataOps[Self <: RowColumnPivotHierarchyCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[RowColumnPivotHierarchyData]): Self = {
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

