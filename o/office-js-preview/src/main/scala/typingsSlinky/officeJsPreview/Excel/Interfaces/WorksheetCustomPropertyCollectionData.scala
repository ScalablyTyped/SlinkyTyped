package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `worksheetCustomPropertyCollection.toJSON()`. */
@js.native
trait WorksheetCustomPropertyCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[WorksheetCustomPropertyData]] = js.native
}

object WorksheetCustomPropertyCollectionData {
  @scala.inline
  def apply(): WorksheetCustomPropertyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyCollectionData]
  }
  @scala.inline
  implicit class WorksheetCustomPropertyCollectionDataOps[Self <: WorksheetCustomPropertyCollectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[WorksheetCustomPropertyData]): Self = {
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

