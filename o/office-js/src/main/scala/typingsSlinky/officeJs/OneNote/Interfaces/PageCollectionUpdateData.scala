package typingsSlinky.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageCollection object, for use in "pageCollection.set({ ... })". */
@js.native
trait PageCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PageData]] = js.native
}

object PageCollectionUpdateData {
  @scala.inline
  def apply(): PageCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageCollectionUpdateData]
  }
  @scala.inline
  implicit class PageCollectionUpdateDataOps[Self <: PageCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[PageData]): Self = {
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

