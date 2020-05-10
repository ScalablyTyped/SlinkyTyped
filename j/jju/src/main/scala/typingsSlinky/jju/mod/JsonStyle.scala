package typingsSlinky.jju.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonStyle extends js.Object {
  /** True if input has a comment token. */
  var has_comments: Boolean = js.native
  /** True if input has a newline token. */
  var has_newlines: Boolean = js.native
  /** True if input has at least one trailing comma. */
  var has_trailing_comma: Boolean = js.native
  /** True if input has a whitespace token. */
  var has_whitespace: Boolean = js.native
  /** Preferred indentation. */
  var indent: String = js.native
  /** Preferred newline. */
  var newline: String = js.native
  /** " or ' depending on which quote is preferred. */
  var quote: String = js.native
  /** True if unquoted keys were used at least once. */
  var quote_keys: Boolean = js.native
}

object JsonStyle {
  @scala.inline
  def apply(
    has_comments: Boolean,
    has_newlines: Boolean,
    has_trailing_comma: Boolean,
    has_whitespace: Boolean,
    indent: String,
    newline: String,
    quote: String,
    quote_keys: Boolean
  ): JsonStyle = {
    val __obj = js.Dynamic.literal(has_comments = has_comments.asInstanceOf[js.Any], has_newlines = has_newlines.asInstanceOf[js.Any], has_trailing_comma = has_trailing_comma.asInstanceOf[js.Any], has_whitespace = has_whitespace.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any], quote_keys = quote_keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonStyle]
  }
  @scala.inline
  implicit class JsonStyleOps[Self <: JsonStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHas_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_newlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_newlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_trailing_comma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_trailing_comma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_whitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_whitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuote_keys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote_keys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

