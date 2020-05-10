package typingsSlinky.eslint.mod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintOptions extends js.Object {
  var allowInlineConfig: js.UndefOr[Boolean] = js.native
  var filename: js.UndefOr[String] = js.native
  var postprocess: js.UndefOr[
    js.Function1[/* problemLists */ js.Array[js.Array[LintMessage]], js.Array[LintMessage]]
  ] = js.native
  var preprocess: js.UndefOr[js.Function1[/* code */ String, js.Array[String]]] = js.native
  var reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.native
}

object LintOptions {
  @scala.inline
  def apply(): LintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintOptions]
  }
  @scala.inline
  implicit class LintOptionsOps[Self <: LintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInlineConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInlineConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInlineConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInlineConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withPostprocess(value: /* problemLists */ js.Array[js.Array[LintMessage]] => js.Array[LintMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postprocess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostprocess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postprocess")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocess(value: /* code */ String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreprocess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.undefined)
        ret
    }
    @scala.inline
    def withReportUnusedDisableDirectives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUnusedDisableDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportUnusedDisableDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUnusedDisableDirectives")(js.undefined)
        ret
    }
  }
  
}

