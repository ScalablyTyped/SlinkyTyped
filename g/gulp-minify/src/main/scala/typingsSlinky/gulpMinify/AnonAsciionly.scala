package typingsSlinky.gulpMinify

import typingsSlinky.gulpMinify.gulpMinifyBooleans.`false`
import typingsSlinky.gulpMinify.gulpMinifyNumbers.`32000`
import typingsSlinky.gulpMinify.gulpMinifyNumbers.`80`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsciionly extends js.Object {
  /**
    * Output ASCII-safe? (encodes Unicode characters as ASCII)
    */
  var ascii_only: js.UndefOr[Boolean] = js.native
  /**
    * Beautify output?
    */
  var beautify: js.UndefOr[Boolean] = js.native
  /**
    * Use brackets every time?
    */
  var bracketize: js.UndefOr[Boolean] = js.native
  /**
    * Output comments?
    */
  var comments: js.UndefOr[Boolean] = js.native
  /**
    * Beautify output?
    */
  var ie_proof: js.UndefOr[Boolean] = js.native
  /**
    * Indentation level (only when `beautify`)
    */
  var indent_level: js.UndefOr[Double] = js.native
  /**
    * Start indentation on every line (only when `beautify`)
    */
  var indent_start: js.UndefOr[Double] = js.native
  /**
    * Escape "</script"?
    */
  var inline_script: js.UndefOr[Boolean] = js.native
  /**
    * Maximum line length (for non-beautified output)
    */
  var max_line_len: js.UndefOr[`32000`] = js.native
  /**
    * Quote all keys in object literals?
    */
  var quote_keys: js.UndefOr[`false`] = js.native
  /**
    * Use semicolons to separate statements? (otherwise, newlines)
    */
  var semicolons: js.UndefOr[Boolean] = js.native
  /**
    * Output a source map
    */
  var source_map: js.UndefOr[Boolean] = js.native
  /**
    * Add a space after colon signs?
    */
  var space_colon: js.UndefOr[Boolean] = js.native
  /**
    * Informative maximum line width (for beautified output)
    */
  var width: js.UndefOr[`80`] = js.native
}

object AnonAsciionly {
  @scala.inline
  def apply(): AnonAsciionly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAsciionly]
  }
  @scala.inline
  implicit class AnonAsciionlyOps[Self <: AnonAsciionly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscii_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascii_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscii_only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascii_only")(js.undefined)
        ret
    }
    @scala.inline
    def withBeautify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beautify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeautify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beautify")(js.undefined)
        ret
    }
    @scala.inline
    def withBracketize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracketize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBracketize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracketize")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withIe_proof(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie_proof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIe_proof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie_proof")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_level: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_level")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_start(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_start")(js.undefined)
        ret
    }
    @scala.inline
    def withInline_script(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline_script: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_script")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_line_len(value: `32000`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_line_len")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_line_len: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_line_len")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote_keys(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote_keys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote_keys")(js.undefined)
        ret
    }
    @scala.inline
    def withSemicolons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemicolons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolons")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_map(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_map: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_map")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace_colon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_colon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace_colon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_colon")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: `80`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

