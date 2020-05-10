package typingsSlinky.firefoxWebextBrowser.browser.sessions

import typingsSlinky.firefoxWebextBrowser.browser.tabs.Tab
import typingsSlinky.firefoxWebextBrowser.browser.windows.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /** The time when the window or tab was closed or modified, represented in milliseconds since the epoch. */
  var lastModified: Double = js.native
  /** The `tabs.Tab`, if this entry describes a tab. Either this or `sessions.Session.window` will be set. */
  var tab: js.UndefOr[Tab] = js.native
  /**
    * The `windows.Window`, if this entry describes a window. Either this or `sessions.Session.tab` will be set.
    */
  var window: js.UndefOr[Window] = js.native
}

object Session {
  @scala.inline
  def apply(lastModified: Double): Session = {
    val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTab(value: Tab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

