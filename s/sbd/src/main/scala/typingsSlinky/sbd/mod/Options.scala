package typingsSlinky.sbd.mod

import typingsSlinky.sbd.sbdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var abbreviations: js.UndefOr[js.Array[String]] = js.native
  var allowed_tags: js.UndefOr[`false` | js.Array[String]] = js.native
  var html_boundaries: js.UndefOr[Boolean] = js.native
  var html_boundaries_tags: js.UndefOr[js.Array[String]] = js.native
  var newline_boundaries: js.UndefOr[Boolean] = js.native
  var preserve_whitespace: js.UndefOr[Boolean] = js.native
  var sanitize: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbbreviations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbbreviations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviations")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowed_tags(value: `false` | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed_tags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_tags")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml_boundaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_boundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml_boundaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_boundaries")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml_boundaries_tags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_boundaries_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml_boundaries_tags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_boundaries_tags")(js.undefined)
        ret
    }
    @scala.inline
    def withNewline_boundaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline_boundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewline_boundaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline_boundaries")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserve_whitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve_whitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserve_whitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve_whitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSanitize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.undefined)
        ret
    }
  }
  
}

