package typingsSlinky.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisLineCollection object, for use in "inkAnalysisLineCollection.set({ ... })". */
@js.native
trait InkAnalysisLineCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InkAnalysisLineData]] = js.native
}

object InkAnalysisLineCollectionUpdateData {
  @scala.inline
  def apply(): InkAnalysisLineCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineCollectionUpdateData]
  }
  @scala.inline
  implicit class InkAnalysisLineCollectionUpdateDataOps[Self <: InkAnalysisLineCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[InkAnalysisLineData]): Self = {
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

