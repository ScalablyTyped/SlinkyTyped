package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.menus.OverrideContextContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /** Required when context is 'bookmark'. Requires 'bookmark' permission. */
  var bookmarkId: js.UndefOr[String] = js.native
  /**
    * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark'
    * and 'tab' are supported. showDefaults cannot be used with this option.
    */
  var context: js.UndefOr[OverrideContextContext] = js.native
  /** Whether to also include default menu items in the menu. */
  var showDefaults: js.UndefOr[Boolean] = js.native
  /** Required when context is 'tab'. Requires 'tabs' permission. */
  var tabId: js.UndefOr[Double] = js.native
}

object Context {
  @scala.inline
  def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookmarkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkId")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: OverrideContextContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDefaults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(js.undefined)
        ret
    }
  }
  
}

