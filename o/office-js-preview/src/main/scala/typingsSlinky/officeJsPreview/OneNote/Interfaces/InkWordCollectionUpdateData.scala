package typingsSlinky.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkWordCollection object, for use in "inkWordCollection.set({ ... })". */
@js.native
trait InkWordCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InkWordData]] = js.native
}

object InkWordCollectionUpdateData {
  @scala.inline
  def apply(): InkWordCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkWordCollectionUpdateData]
  }
  @scala.inline
  implicit class InkWordCollectionUpdateDataOps[Self <: InkWordCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[InkWordData]): Self = {
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

