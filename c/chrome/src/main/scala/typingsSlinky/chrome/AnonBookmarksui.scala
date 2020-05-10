package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBookmarksui extends js.Object {
  var bookmarks_ui: js.UndefOr[AnonRemovebookmarkshortcut] = js.native
}

object AnonBookmarksui {
  @scala.inline
  def apply(): AnonBookmarksui = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBookmarksui]
  }
  @scala.inline
  implicit class AnonBookmarksuiOps[Self <: AnonBookmarksui] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookmarks_ui(value: AnonRemovebookmarkshortcut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks_ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarks_ui: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks_ui")(js.undefined)
        ret
    }
  }
  
}

