package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentOptions extends js.Object {
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentEnd: js.UndefOr[String] = js.native
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentLead: js.UndefOr[String] = js.native
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var blockCommentStart: js.UndefOr[String] = js.native
  /** Whether, when adding line comments, to also comment lines that contain only whitespace. */
  var commentBlankLines: js.UndefOr[Boolean] = js.native
  /** When block commenting, this controls whether the whole lines are indented, or only the precise range that is given. Defaults to `true`. */
  var fullLines: js.UndefOr[Boolean] = js.native
  /** When adding line comments and this is turned on, it will align the comment block to the current indentation of the first line of the block. */
  var indent: js.UndefOr[Boolean] = js.native
  /** Override the [comment string properties](https://codemirror.net/doc/manual.html#mode_comment) of the mode with custom comment strings. */
  var lineComment: js.UndefOr[String] = js.native
  /** A string that will be inserted after opening and leading markers, and before closing comment markers. Defaults to a single space. */
  var padding: js.UndefOr[String] = js.native
}

object CommentOptions {
  @scala.inline
  def apply(): CommentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentOptions]
  }
  @scala.inline
  implicit class CommentOptionsOps[Self <: CommentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockCommentEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockCommentEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockCommentLead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentLead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockCommentLead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentLead")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockCommentStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockCommentStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentBlankLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentBlankLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentBlankLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentBlankLines")(js.undefined)
        ret
    }
    @scala.inline
    def withFullLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullLines")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withLineComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineComment")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
  }
  
}

