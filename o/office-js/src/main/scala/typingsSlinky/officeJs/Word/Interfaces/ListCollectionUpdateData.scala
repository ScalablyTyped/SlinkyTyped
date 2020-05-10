package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ListCollection object, for use in "listCollection.set({ ... })". */
@js.native
trait ListCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ListData]] = js.native
}

object ListCollectionUpdateData {
  @scala.inline
  def apply(): ListCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionUpdateData]
  }
  @scala.inline
  implicit class ListCollectionUpdateDataOps[Self <: ListCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ListData]): Self = {
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

