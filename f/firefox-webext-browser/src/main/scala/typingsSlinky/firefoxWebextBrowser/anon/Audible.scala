package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.tabs.MutedInfo
import typingsSlinky.firefoxWebextBrowser.browser.tabs.SharingState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audible extends js.Object {
  /** The tab's new attention state. */
  var attention: js.UndefOr[Boolean] = js.native
  /** The tab's new audible state. */
  var audible: js.UndefOr[Boolean] = js.native
  /** True while the tab is not loaded with content. */
  var discarded: js.UndefOr[Boolean] = js.native
  /**
    * The tab's new favicon URL. This property is only present if the extension's manifest includes the `"tabs"`
    * permission.
    */
  var favIconUrl: js.UndefOr[String] = js.native
  /** The tab's new hidden state. */
  var hidden: js.UndefOr[Boolean] = js.native
  /** Whether the document in the tab can be rendered in reader mode. */
  var isArticle: js.UndefOr[Boolean] = js.native
  /** The tab's new muted state and the reason for the change. */
  var mutedInfo: js.UndefOr[MutedInfo] = js.native
  /** The tab's new pinned state. */
  var pinned: js.UndefOr[Boolean] = js.native
  /** The tab's new sharing state for screen, microphone and camera. */
  var sharingState: js.UndefOr[SharingState] = js.native
  /** The status of the tab. Can be either _loading_ or _complete_. */
  var status: js.UndefOr[String] = js.native
  /**
    * The title of the tab if it has changed. This property is only present if the extension's manifest includes
    * the `"tabs"` permission.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The tab's URL if it has changed. This property is only present if the extension's manifest includes the
    * `"tabs"` permission.
    */
  var url: js.UndefOr[String] = js.native
}

object Audible {
  @scala.inline
  def apply(): Audible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audible]
  }
  @scala.inline
  implicit class AudibleOps[Self <: Audible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttention(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attention")(js.undefined)
        ret
    }
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
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsArticle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArticle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArticle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArticle")(js.undefined)
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
    def withSharingState(value: SharingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharingState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingState")(js.undefined)
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

