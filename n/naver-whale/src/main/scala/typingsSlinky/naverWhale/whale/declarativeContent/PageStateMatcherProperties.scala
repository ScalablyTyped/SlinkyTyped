package typingsSlinky.naverWhale.whale.declarativeContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageStateMatcherProperties extends js.Object {
  /** Optional. Matches if all of the CSS selectors in the array match displayed elements in a frame with the same origin as the page's main frame. All selectors in this array must be compound selectors to speed up matching. Note that listing hundreds of CSS selectors or CSS selectors that match hundreds of times per page can still slow down web sites.  */
  var css: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.
    * Since Chrome 45. Warning: this is the current Beta channel. More information available on the API documentation pages.
    * Matches if the bookmarked state of the page is equal to the specified value. Requres the bookmarks permission.
    */
  var isBookmarked: js.UndefOr[Boolean] = js.native
  /** Optional. Filters URLs for various criteria. See event filtering. All criteria are case sensitive.  */
  var pageUrl: js.UndefOr[typingsSlinky.chrome.chrome.declarativeContent.PageStateUrlDetails] = js.native
}

object PageStateMatcherProperties {
  @scala.inline
  def apply(): PageStateMatcherProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageStateMatcherProperties]
  }
  @scala.inline
  implicit class PageStateMatcherPropertiesOps[Self <: PageStateMatcherProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBookmarked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBookmarked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBookmarked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBookmarked")(js.undefined)
        ret
    }
    @scala.inline
    def withPageUrl(value: typingsSlinky.chrome.chrome.declarativeContent.PageStateUrlDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(js.undefined)
        ret
    }
  }
  
}

