package typingsSlinky.markdownlint.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownlintOptions extends js.Object {
  var config: js.UndefOr[MarkdownlintConfig] = js.native
  var files: js.UndefOr[js.Array[String] | String] = js.native
  var frontMatter: js.UndefOr[js.RegExp] = js.native
  var noInlineConfig: js.UndefOr[Boolean] = js.native
  var resultVersion: js.UndefOr[Double] = js.native
  var strings: js.UndefOr[StringDictionary[String]] = js.native
}

object MarkdownlintOptions {
  @scala.inline
  def apply(): MarkdownlintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownlintOptions]
  }
  @scala.inline
  implicit class MarkdownlintOptionsOps[Self <: MarkdownlintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: MarkdownlintConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withFrontMatter(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frontMatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrontMatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frontMatter")(js.undefined)
        ret
    }
    @scala.inline
    def withNoInlineConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInlineConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoInlineConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInlineConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withResultVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
  }
  
}

