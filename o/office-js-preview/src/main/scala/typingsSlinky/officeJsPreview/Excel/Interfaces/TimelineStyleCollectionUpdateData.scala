package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TimelineStyleCollection object, for use in `timelineStyleCollection.set({ ... })`. */
@js.native
trait TimelineStyleCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[TimelineStyleData]] = js.native
}

object TimelineStyleCollectionUpdateData {
  @scala.inline
  def apply(): TimelineStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineStyleCollectionUpdateData]
  }
  @scala.inline
  implicit class TimelineStyleCollectionUpdateDataOps[Self <: TimelineStyleCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[TimelineStyleData]): Self = {
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

