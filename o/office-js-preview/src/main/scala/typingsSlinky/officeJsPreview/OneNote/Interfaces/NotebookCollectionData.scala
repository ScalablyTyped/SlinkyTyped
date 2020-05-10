package typingsSlinky.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "notebookCollection.toJSON()". */
@js.native
trait NotebookCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[NotebookData]] = js.native
}

object NotebookCollectionData {
  @scala.inline
  def apply(): NotebookCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCollectionData]
  }
  @scala.inline
  implicit class NotebookCollectionDataOps[Self <: NotebookCollectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[NotebookData]): Self = {
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

