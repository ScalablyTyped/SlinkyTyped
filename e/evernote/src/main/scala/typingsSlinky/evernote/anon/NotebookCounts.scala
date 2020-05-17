package typingsSlinky.evernote.anon

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookCounts extends js.Object {
  var notebookCounts: js.UndefOr[Map[typingsSlinky.evernote.mod.Types.Guid, Double]] = js.native
  var tagCounts: js.UndefOr[Map[typingsSlinky.evernote.mod.Types.Guid, Double]] = js.native
  var trashCount: js.UndefOr[Double] = js.native
}

object NotebookCounts {
  @scala.inline
  def apply(): NotebookCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCounts]
  }
  @scala.inline
  implicit class NotebookCountsOps[Self <: NotebookCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookCounts(value: Map[typingsSlinky.evernote.mod.Types.Guid, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withTagCounts(value: Map[typingsSlinky.evernote.mod.Types.Guid, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withTrashCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrashCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashCount")(js.undefined)
        ret
    }
  }
  
}

