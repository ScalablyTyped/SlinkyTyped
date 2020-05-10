package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CommentReplyCollection object, for use in `commentReplyCollection.set({ ... })`. */
@js.native
trait CommentReplyCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[CommentReplyData]] = js.native
}

object CommentReplyCollectionUpdateData {
  @scala.inline
  def apply(): CommentReplyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyCollectionUpdateData]
  }
  @scala.inline
  implicit class CommentReplyCollectionUpdateDataOps[Self <: CommentReplyCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[CommentReplyData]): Self = {
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

