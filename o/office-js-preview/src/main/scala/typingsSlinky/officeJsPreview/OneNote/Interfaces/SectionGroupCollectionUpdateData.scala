package typingsSlinky.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SectionGroupCollection object, for use in "sectionGroupCollection.set({ ... })". */
@js.native
trait SectionGroupCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[SectionGroupData]] = js.native
}

object SectionGroupCollectionUpdateData {
  @scala.inline
  def apply(): SectionGroupCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroupCollectionUpdateData]
  }
  @scala.inline
  implicit class SectionGroupCollectionUpdateDataOps[Self <: SectionGroupCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SectionGroupData]): Self = {
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

