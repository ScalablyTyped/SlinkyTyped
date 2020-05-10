package typingsSlinky.firefoxWebextBrowser.browser.manifest

import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.RunAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be
  * set at the same time. Based on InjectDetails, but using underscore rather than camel case naming conventions.
  */
@js.native
trait ContentScript extends js.Object {
  /**
    * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current
    * page. By default, it's `false` and is only injected into the top frame.
    */
  var all_frames: js.UndefOr[Boolean] = js.native
  /** The list of CSS files to inject */
  var css: js.UndefOr[js.Array[ExtensionURL]] = js.native
  var exclude_globs: js.UndefOr[js.Array[String]] = js.native
  var exclude_matches: js.UndefOr[js.Array[MatchPattern]] = js.native
  var include_globs: js.UndefOr[js.Array[String]] = js.native
  /** The list of JS files to inject */
  @JSName("js")
  var js_ : js.UndefOr[js.Array[ExtensionURL]] = js.native
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
    * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
    * it is `false`.
    */
  var match_about_blank: js.UndefOr[Boolean] = js.native
  var matches: js.Array[MatchPattern] = js.native
  /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
  var run_at: js.UndefOr[RunAt] = js.native
}

object ContentScript {
  @scala.inline
  def apply(matches: js.Array[MatchPattern]): ContentScript = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentScript]
  }
  @scala.inline
  implicit class ContentScriptOps[Self <: ContentScript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatches(value: js.Array[MatchPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
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
    def withCss(value: js.Array[ExtensionURL]): Self = {
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
    def withExclude_matches(value: js.Array[MatchPattern]): Self = {
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
    def withJs_(value: js.Array[ExtensionURL]): Self = {
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

