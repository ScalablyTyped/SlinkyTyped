package typingsSlinky.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Convert "\n" in paragraphs into <br>.
    */
  var breaks: js.UndefOr[Boolean] = js.native
  /**
    * Highlighter function. Should return escaped HTML, or "" if the source
    * string is not changed.
    */
  var highlight: js.UndefOr[js.Function2[/* str */ String, /* lang */ String, String]] = js.native
  /**
    * Enable HTML tags in source.
    */
  var html: js.UndefOr[Boolean] = js.native
  /**
    * CSS language prefix for fenced blocks.
    */
  var langPrefix: js.UndefOr[String] = js.native
  /**
    * Set target to open link in
    */
  var linkTarget: js.UndefOr[String] = js.native
  /**
    * Autoconvert URL-like text to links.
    */
  var linkify: js.UndefOr[Boolean] = js.native
  /**
    * Double + single quotes replacement pairs, when typographer enabled,
    * and smartquotes on. Set doubles to "«»" for Russian, "„“" for German.
    */
  var quotes: js.UndefOr[String] = js.native
  /**
    * Enable some language-neutral replacement + quotes beautification.
    */
  var typographer: js.UndefOr[Boolean] = js.native
  /**
    * Use "/" to close single tags (<br />).
    */
  var xhtmlOut: js.UndefOr[Boolean] = js.native
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
    def withBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: (/* str */ String, /* lang */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withLangPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLangPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkify")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(js.undefined)
        ret
    }
    @scala.inline
    def withTypographer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typographer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypographer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typographer")(js.undefined)
        ret
    }
    @scala.inline
    def withXhtmlOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtmlOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhtmlOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtmlOut")(js.undefined)
        ret
    }
  }
  
}

