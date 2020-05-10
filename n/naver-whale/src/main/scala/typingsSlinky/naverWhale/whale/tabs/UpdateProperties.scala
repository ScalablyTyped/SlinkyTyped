package typingsSlinky.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProperties extends js.Object {
  /**
    * Optional. Whether the tab should be active. Does not affect whether the window is focused (see windows.update).
    * @since Chrome 16.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Whether the tab should be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Adds or removes the tab from the current selection.
    * @since Chrome 16.
    */
  var highlighted: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Whether the tab should be muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  /**
    * Optional. Whether the tab should be pinned.
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Whether the tab should be selected.
    * @deprecated since Chrome 33. Please use highlighted.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /** Optional. A URL to navigate the tab to. */
  var url: js.UndefOr[String] = js.native
}

object UpdateProperties {
  @scala.inline
  def apply(): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProperties]
  }
  @scala.inline
  implicit class UpdatePropertiesOps[Self <: UpdateProperties] (val x: Self) extends AnyVal {
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
    def withAutoDiscardable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDiscardable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDiscardable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDiscardable")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(js.undefined)
        ret
    }
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
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
  }
  
}

