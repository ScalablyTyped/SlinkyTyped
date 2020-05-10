package typingsSlinky.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabChangeInfo extends js.Object {
  /**
    * The tab's new audible state.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[Boolean] = js.native
  /**
    * The tab's new auto-discardable
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.native
  /**
    * The tab's new discarded state.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[Boolean] = js.native
  /**
    * The tab's new favicon URL.
    * @since Chrome 27.
    */
  var favIconUrl: js.UndefOr[String] = js.native
  /**
    * The tab's new muted state and the reason for the change.
    * @since Chrome 46. Warning: this is the current Beta channel.
    */
  var mutedInfo: js.UndefOr[MutedInfo] = js.native
  /**
    * The tab's new pinned state.
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /** Optional. The status of the tab. Can be either loading or complete. */
  var status: js.UndefOr[String] = js.native
  /**
    * The tab's new title.
    * @since Chrome 48.
    */
  var title: js.UndefOr[String] = js.native
  /** Optional. The tab's URL if it has changed. */
  var url: js.UndefOr[String] = js.native
}

object TabChangeInfo {
  @scala.inline
  def apply(): TabChangeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabChangeInfo]
  }
  @scala.inline
  implicit class TabChangeInfoOps[Self <: TabChangeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audible")(js.undefined)
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
    def withDiscarded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discarded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscarded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discarded")(js.undefined)
        ret
    }
    @scala.inline
    def withFavIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favIconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMutedInfo(value: MutedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutedInfo")(js.undefined)
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
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

