package typingsSlinky.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkedOptions extends js.Object {
  /**
    * A prefix URL for any relative link.
    */
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * Enable GFM line breaks. This option requires the gfm option to be true.
    */
  var breaks: js.UndefOr[Boolean] = js.native
  /**
    * Enable GitHub flavored markdown.
    */
  var gfm: js.UndefOr[Boolean] = js.native
  /**
    * Include an id attribute when emitting headings.
    */
  var headerIds: js.UndefOr[Boolean] = js.native
  /**
    * Set the prefix for header tag ids.
    */
  var headerPrefix: js.UndefOr[String] = js.native
  /**
    * A function to highlight code blocks. The function can either be
    * synchronous (returning a string) or asynchronous (callback invoked
    * with an error if any occurred during highlighting and a string
    * if highlighting was successful)
    */
  var highlight: js.UndefOr[
    js.Function3[
      /* code */ String, 
      /* lang */ String, 
      /* callback */ js.UndefOr[
        js.Function2[/* error */ js.UndefOr[js.Any], /* code */ js.UndefOr[String], Unit]
      ], 
      String | Unit
    ]
  ] = js.native
  /**
    * Set the prefix for code block classes.
    */
  var langPrefix: js.UndefOr[String] = js.native
  /**
    * Mangle autolinks (<email@domain.com>).
    */
  var mangle: js.UndefOr[Boolean] = js.native
  /**
    * Conform to obscure parts of markdown.pl as much as possible. Don't fix any of the original markdown bugs or poor behavior.
    */
  var pedantic: js.UndefOr[Boolean] = js.native
  /**
    * Type: object Default: new Renderer()
    *
    * An object containing functions to render tokens to HTML.
    */
  var renderer: js.UndefOr[Renderer] = js.native
  /**
    * Sanitize the output. Ignore any HTML that has been input.
    */
  var sanitize: js.UndefOr[Boolean] = js.native
  /**
    * Optionally sanitize found HTML with a sanitizer function.
    */
  var sanitizer: js.UndefOr[js.Function1[/* html */ String, String]] = js.native
  /**
    * Shows an HTML error message when rendering fails.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Use smarter list behavior than the original markdown. May eventually be default with the old behavior moved into pedantic.
    */
  var smartLists: js.UndefOr[Boolean] = js.native
  /**
    * Use "smart" typograhic punctuation for things like quotes and dashes.
    */
  var smartypants: js.UndefOr[Boolean] = js.native
  /**
    * Generate closing slash for self-closing tags (<br/> instead of <br>)
    */
  var xhtml: js.UndefOr[Boolean] = js.native
}

object MarkedOptions {
  @scala.inline
  def apply(): MarkedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkedOptions]
  }
  @scala.inline
  implicit class MarkedOptionsOps[Self <: MarkedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
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
    def withGfm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGfm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfm")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderIds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerIds")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(
      value: (/* code */ String, /* lang */ String, /* callback */ js.UndefOr[
          js.Function2[/* error */ js.UndefOr[js.Any], /* code */ js.UndefOr[String], Unit]
        ]) => String | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
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
    def withMangle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mangle")(js.undefined)
        ret
    }
    @scala.inline
    def withPedantic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pedantic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPedantic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pedantic")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: Renderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
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
    @scala.inline
    def withSanitizer(value: /* html */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartLists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartLists")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartypants(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartypants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartypants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartypants")(js.undefined)
        ret
    }
    @scala.inline
    def withXhtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtml")(js.undefined)
        ret
    }
  }
  
}

