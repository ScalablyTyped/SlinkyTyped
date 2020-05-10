package typingsSlinky.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProperties extends js.Object {
  /**
    * Optional.
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused (see windows.update). Defaults to true.
    * @since Chrome 16.
    */
  var active: js.UndefOr[Boolean] = js.native
  /** Optional. The position the tab should take in the window. The provided value will be clamped to between zero and the number of tabs in the window. */
  var index: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as the newly created tab.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  /**
    * Optional. Whether the tab should be pinned. Defaults to false
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Whether the tab should become the selected tab in the window. Defaults to true
    * @deprecated since Chrome 33. Please use active.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * The URL to navigate the tab to initially. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[String] = js.native
  /** Optional. The window to create the new tab in. Defaults to the current window. */
  var windowId: js.UndefOr[Double] = js.native
}

object CreateProperties {
  @scala.inline
  def apply(): CreateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProperties]
  }
  @scala.inline
  implicit class CreatePropertiesOps[Self <: CreateProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenerTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openerTabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenerTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openerTabId")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(js.undefined)
        ret
    }
  }
  
}

