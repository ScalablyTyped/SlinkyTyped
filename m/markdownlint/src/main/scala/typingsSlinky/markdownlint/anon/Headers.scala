package typingsSlinky.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  /**
    * Exclude this rule for code blocks.
    */
  var code_blocks: js.UndefOr[Boolean] = js.native
  /**
    * Exclude this rule for headings/headers (alias for `headings`).
    */
  var headers: js.UndefOr[Boolean] = js.native
  var heading_line_length: Double = js.native
  /**
    * Exclude this rule for headings/headers.
    */
  var headings: js.UndefOr[Boolean] = js.native
  var line_length: Double = js.native
  /**
    * Exclude this rule for tables.
    */
  var tables: js.UndefOr[Boolean] = js.native
}

object Headers {
  @scala.inline
  def apply(heading_line_length: Double, line_length: Double): Headers = {
    val __obj = js.Dynamic.literal(heading_line_length = heading_line_length.asInstanceOf[js.Any], line_length = line_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeading_line_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading_line_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode_blocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode_blocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_blocks")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headings")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
  }
  
}

