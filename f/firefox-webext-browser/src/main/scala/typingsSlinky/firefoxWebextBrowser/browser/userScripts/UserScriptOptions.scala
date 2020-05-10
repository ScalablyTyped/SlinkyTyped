package typingsSlinky.firefoxWebextBrowser.browser.userScripts

import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.PlainJSONValue
import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* userScripts types */
/** Details of a user script */
@js.native
trait UserScriptOptions extends js.Object {
  /**
    * If allFrames is `true`, implies that the JavaScript should be injected into all frames of current page. By
    * default, it's `false` and is only injected into the top frame.
    */
  var allFrames: js.UndefOr[Boolean] = js.native
  var excludeGlobs: js.UndefOr[js.Array[String]] = js.native
  var excludeMatches: js.UndefOr[js.Array[MatchPattern]] = js.native
  var includeGlobs: js.UndefOr[js.Array[String]] = js.native
  /** The list of JS files to inject */
  @JSName("js")
  var js_ : js.UndefOr[js.Array[ExtensionFileOrCode]] = js.native
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
    * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
    * it is `false`.
    */
  var matchAboutBlank: js.UndefOr[Boolean] = js.native
  var matches: js.Array[MatchPattern] = js.native
  /** The soonest that the JavaScript will be injected into the tab. Defaults to "document_idle". */
  var runAt: js.UndefOr[RunAt] = js.native
  /** An opaque user script metadata value */
  var scriptMetadata: js.UndefOr[PlainJSONValue] = js.native
}

object UserScriptOptions {
  @scala.inline
  def apply(matches: js.Array[MatchPattern]): UserScriptOptions = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserScriptOptions]
  }
  @scala.inline
  implicit class UserScriptOptionsOps[Self <: UserScriptOptions] (val x: Self) extends AnyVal {
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
    def withAllFrames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeGlobs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeGlobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeGlobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeGlobs")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeMatches(value: js.Array[MatchPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeGlobs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGlobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeGlobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGlobs")(js.undefined)
        ret
    }
    @scala.inline
    def withJs_(value: js.Array[ExtensionFileOrCode]): Self = {
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
    def withMatchAboutBlank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAboutBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchAboutBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAboutBlank")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAt(value: RunAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAt")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptMetadata(value: PlainJSONValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptMetadataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptMetadata")(null)
        ret
    }
  }
  
}

