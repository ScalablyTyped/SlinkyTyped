package typingsSlinky.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SectionCollection object, for use in "sectionCollection.set({ ... })". */
@js.native
trait SectionCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[SectionData]] = js.native
}

object SectionCollectionUpdateData {
  @scala.inline
  def apply(): SectionCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionCollectionUpdateData]
  }
  @scala.inline
  implicit class SectionCollectionUpdateDataOps[Self <: SectionCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SectionData]): Self = {
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

