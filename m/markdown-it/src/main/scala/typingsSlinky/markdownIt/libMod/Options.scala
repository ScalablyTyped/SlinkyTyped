package typingsSlinky.markdownIt.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Set `true` to convert `\n` in paragraphs into `<br>`.
    * @default false
    */
  var breaks: js.UndefOr[Boolean] = js.native
  /**
    * Highlighter function for fenced code blocks.
    * Highlighter `function (str, lang)` should return escaped HTML. It can also
    * return empty string if the source was not changed and should be escaped
    * externaly. If result starts with <pre... internal wrapper is skipped.
    * @default null
    */
  var highlight: js.UndefOr[(js.Function2[/* str */ String, /* lang */ String, String]) | Null] = js.native
  /**
    * Set `true` to enable HTML tags in source. Be careful!
    * That's not safe! You may need external sanitizer to protect output from XSS.
    * It's better to extend features via plugins, instead of enabling HTML.
    * @default false
    */
  var html: js.UndefOr[Boolean] = js.native
  /**
    * CSS language class prefix for fenced blocks.
    * Can be useful for external highlighters.
    * @default 'language-'
    */
  var langPrefix: js.UndefOr[String] = js.native
  /**
    * Set `true` to autoconvert URL-like text to links.
    * @default false
    */
  var linkify: js.UndefOr[Boolean] = js.native
  /**
    * Double + single quotes replacement
    * pairs, when typographer enabled and smartquotes on. For example, you can
    * use `'«»„“'` for Russian, `'„“‚‘'` for German, and
    * `['«\xA0', '\xA0»', '‹\xA0', '\xA0›']` for French (including nbsp).
    * @default '“”‘’'
    */
  var quotes: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Set `true` to enable [some language-neutral replacement](https://github.com/markdown-it/markdown-it/blob/master/lib/rules_core/replacements.js) +
    * quotes beautification (smartquotes).
    * @default false
    */
  var typographer: js.UndefOr[Boolean] = js.native
  /**
    * Set `true` to add '/' when closing single tags
    * (`<br />`). This is needed only for full CommonMark compatibility. In real
    * world you will need HTML output.
    * @default false
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
    def withHighlightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(null)
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
    def withQuotes(value: String | js.Array[String]): Self = {
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

