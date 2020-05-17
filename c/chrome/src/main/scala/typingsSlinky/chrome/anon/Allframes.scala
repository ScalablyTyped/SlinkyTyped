package typingsSlinky.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allframes extends js.Object {
  var all_frames: js.UndefOr[Boolean] = js.native
  var css: js.UndefOr[js.Array[String]] = js.native
  var exclude_globs: js.UndefOr[js.Array[String]] = js.native
  var exclude_matches: js.UndefOr[js.Array[String]] = js.native
  var include_globs: js.UndefOr[js.Array[String]] = js.native
  @JSName("js")
  var js_ : js.UndefOr[js.Array[String]] = js.native
  var match_about_blank: js.UndefOr[Boolean] = js.native
  var matches: js.UndefOr[js.Array[String]] = js.native
  var run_at: js.UndefOr[String] = js.native
}

object Allframes {
  @scala.inline
  def apply(): Allframes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allframes]
  }
  @scala.inline
  implicit class AllframesOps[Self <: Allframes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withJs_(value: js.Array[String]): Self = {
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
    def withMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
    @scala.inline
    def withRun_at(value: String): Self = {
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

