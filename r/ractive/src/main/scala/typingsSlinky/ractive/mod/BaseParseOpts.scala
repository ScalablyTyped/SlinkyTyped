package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseParseOpts extends js.Object {
  /** The number of lines of template above and below a line with an error to include in the error message. */
  var contextLines: js.UndefOr[Double] = js.native
  /** Whether or not to produce a map of expression string -> function when parsing the template. */
  var csp: js.UndefOr[Boolean] = js.native
  /** The regular mustach delimiters - defaults to {{ }}. */
  var delimiters: js.UndefOr[ParseDelimiters] = js.native
  /** Whether or not to collapse consective whitespace into a single space. */
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  /** Whether or not to remove certain elements and event attributes from the parsed template. */
  var sanitize: js.UndefOr[Boolean | SanitizeOpts] = js.native
  /** The static mustache delimiters - defaults to [[ ]]. */
  var staticDelimiters: js.UndefOr[ParseDelimiters] = js.native
  /** The static triple mustache delimiters - defaults to [[[ ]]]. */
  var staticTripleDelimiters: js.UndefOr[ParseDelimiters] = js.native
  /** Whether or not to remove HTML comments from the template. Defaults to true. */
  var stripComments: js.UndefOr[Boolean] = js.native
  /** The triple mustache delimiters - defaults to {{{ }}}. */
  var tripleDelimiters: js.UndefOr[ParseDelimiters] = js.native
}

object BaseParseOpts {
  @scala.inline
  def apply(): BaseParseOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseParseOpts]
  }
  @scala.inline
  implicit class BaseParseOptsOps[Self <: BaseParseOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextLines")(js.undefined)
        ret
    }
    @scala.inline
    def withCsp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csp")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiters(value: ParseDelimiters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitize(value: Boolean | SanitizeOpts): Self = {
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
    def withStaticDelimiters(value: ParseDelimiters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticDelimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticDelimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticDelimiters")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticTripleDelimiters(value: ParseDelimiters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticTripleDelimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticTripleDelimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticTripleDelimiters")(js.undefined)
        ret
    }
    @scala.inline
    def withStripComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripComments")(js.undefined)
        ret
    }
    @scala.inline
    def withTripleDelimiters(value: ParseDelimiters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tripleDelimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTripleDelimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tripleDelimiters")(js.undefined)
        ret
    }
  }
  
}

