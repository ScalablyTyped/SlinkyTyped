package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the WorksheetCollection object, for use in `worksheetCollection.set({ ... })`. */
@js.native
trait WorksheetCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[WorksheetData]] = js.native
}

object WorksheetCollectionUpdateData {
  @scala.inline
  def apply(): WorksheetCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCollectionUpdateData]
  }
  @scala.inline
  implicit class WorksheetCollectionUpdateDataOps[Self <: WorksheetCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[WorksheetData]): Self = {
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

