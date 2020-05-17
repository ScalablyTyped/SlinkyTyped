package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeBlocked extends js.Object {
  /** Include sites that the user has blocked from appearing on the Firefox new tab. */
  var includeBlocked: js.UndefOr[Boolean] = js.native
  /** Include sites favicon if available. */
  var includeFavicon: js.UndefOr[Boolean] = js.native
  /** Include sites that the user has pinned on the Firefox new tab. */
  var includePinned: js.UndefOr[Boolean] = js.native
  /** Include search shortcuts appearing on the Firefox new tab. */
  var includeSearchShortcuts: js.UndefOr[Boolean] = js.native
  /** The number of top sites to return, defaults to the value used by Firefox */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Return the sites that exactly appear on the user's new-tab page. When true, all other options are ignored
    * except limit and includeFavicon.
    */
  var newtab: js.UndefOr[Boolean] = js.native
  /** Limit the result to a single top site link per domain */
  var onePerDomain: js.UndefOr[Boolean] = js.native
  /** @deprecated Please use the other options to tune the results received from topSites. */
  var providers: js.UndefOr[js.Array[String]] = js.native
}

object IncludeBlocked {
  @scala.inline
  def apply(): IncludeBlocked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeBlocked]
  }
  @scala.inline
  implicit class IncludeBlockedOps[Self <: IncludeBlocked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFavicon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFavicon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFavicon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFavicon")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePinned")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSearchShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSearchShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSearchShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSearchShortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNewtab(value: Boolean): Self = {
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
    @scala.inline
    def withOnePerDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onePerDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnePerDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onePerDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withProviders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(js.undefined)
        ret
    }
  }
  
}

