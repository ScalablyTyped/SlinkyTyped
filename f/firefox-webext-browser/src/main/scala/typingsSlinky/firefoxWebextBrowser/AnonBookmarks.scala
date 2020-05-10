package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBookmarks extends js.Object {
  /** @deprecated Unsupported on Firefox at this time. */
  var bookmarks: js.UndefOr[ExtensionURL] = js.native
  /** @deprecated Unsupported on Firefox at this time. */
  var history: js.UndefOr[ExtensionURL] = js.native
  var newtab: js.UndefOr[ExtensionURL] = js.native
}

object AnonBookmarks {
  @scala.inline
  def apply(): AnonBookmarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBookmarks]
  }
  @scala.inline
  implicit class AnonBookmarksOps[Self <: AnonBookmarks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookmarks(value: ExtensionURL): Self = {
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
    def withHistory(value: ExtensionURL): Self = {
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
    def withNewtab(value: ExtensionURL): Self = {
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

