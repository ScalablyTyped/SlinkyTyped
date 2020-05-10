package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.extensionTypes.RunAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details of the content script to inject. **/
@js.native
trait ContentScriptDetails extends js.Object {
  /**
    * If all_frames is true, this implies that the JavaScript or CSS should be injected into all frames of current page.
    * By default, all_frames is false and the JavaScript or CSS is only injected into the top frame.
    * @default false
    */
  var all_frames: js.UndefOr[Boolean] = js.native
  /** JavaScript code or CSS to be injected into matching pages. */
  var code: js.UndefOr[String] = js.native
  /**
    * The CSS code or a list of CSS files to be injected into matching pages.
    * These are injected in the order they appear,
    * before any DOM is constructed or displayed for the page.
    */
  var css: js.UndefOr[InjectionItems] = js.native
  /**
    * Applied after matches to exclude URLs that match this glob.
    * Intended to emulate the @exclude Greasemonkey keyword.
    */
  var exclude_globs: js.UndefOr[js.Array[String]] = js.native
  /** Excludes pages that this content script would otherwise be injected into. */
  var exclude_matches: js.UndefOr[js.Array[String]] = js.native
  /**
    * Applied after matches to include only those URLs that also match this glob.
    * Intended to emulate the @include Greasemonkey keyword.
    */
  var include_globs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The JavaScript code or a list of JavaScript files to be injected into matching pages.
    * These are injected in the order they appear.
    */
  @JSName("js")
  var js_ : js.UndefOr[InjectionItems] = js.native
  /**
    * Whether to insert the content script on about:blank and about:srcdoc.
    * Content scripts will only be injected on pages when their inherit URL
    * is matched by one of the declared patterns in the matches field.
    * The inherit URL is the URL of the document that created the frame or window.
    * Content scripts cannot be inserted in sandboxed frames.
    */
  var match_about_blank: js.UndefOr[Boolean] = js.native
  /** Specifies which pages this content script will be injected into. */
  var matches: js.Array[String] = js.native
  /** The name of the content script to inject. */
  var name: String = js.native
  /**
    * The soonest that the JavaScript or CSS will be injected into the tab.
    * Defaults to 'document_idle'.
    */
  var run_at: js.UndefOr[RunAt] = js.native
}

object ContentScriptDetails {
  @scala.inline
  def apply(matches: js.Array[String], name: String): ContentScriptDetails = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentScriptDetails]
  }
  @scala.inline
  implicit class ContentScriptDetailsOps[Self <: ContentScriptDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAll_frames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll_frames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_frames")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: InjectionItems): Self = {
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
    def withExclude_globs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_globs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_globs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_globs")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_matches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_matches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_matches")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_globs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_globs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_globs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_globs")(js.undefined)
        ret
    }
    @scala.inline
    def withJs_(value: InjectionItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJs_ : Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch_about_blank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match_about_blank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch_about_blank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match_about_blank")(js.undefined)
        ret
    }
    @scala.inline
    def withRun_at(value: RunAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRun_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run_at")(js.undefined)
        ret
    }
  }
  
}

