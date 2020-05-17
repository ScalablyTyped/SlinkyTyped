package typingsSlinky.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookmarks extends js.Object {
  var bookmarks: js.UndefOr[String] = js.native
  var history: js.UndefOr[String] = js.native
  var newtab: js.UndefOr[String] = js.native
}

object Bookmarks {
  @scala.inline
  def apply(): Bookmarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bookmarks]
  }
  @scala.inline
  implicit class BookmarksOps[Self <: Bookmarks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookmarks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withNewtab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newtab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewtab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newtab")(js.undefined)
        ret
    }
  }
  
}

