package typingsSlinky.chessJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewlinechar extends js.Object {
  /**
    * The newline_char is a string representation of a valid RegExp
    * fragment and is used to process the PGN.
    * It defaults to \r?\n.
    * Special characters should not be pre-escaped, but any literal
    * special characters should be escaped as is normal for a RegExp.
    * Keep in mind that backslashes in JavaScript strings must
    * themselves be escaped.
    * Avoid using a newline_char that may occur elsewhere in a PGN,
    * such as . or x, as this will result in unexpected behavior.
    */
  var newline_char: js.UndefOr[String] = js.native
  /**
    * The sloppy flag is a boolean that permits chess.js to parse moves in
    * non-standard notations.
    * See .move documentation for more information about non-SAN
    * notations.
    */
  var sloppy: js.UndefOr[Boolean] = js.native
}

object AnonNewlinechar {
  @scala.inline
  def apply(): AnonNewlinechar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNewlinechar]
  }
  @scala.inline
  implicit class AnonNewlinecharOps[Self <: AnonNewlinechar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewline_char(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline_char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewline_char: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline_char")(js.undefined)
        ret
    }
    @scala.inline
    def withSloppy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sloppy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSloppy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sloppy")(js.undefined)
        ret
    }
  }
  
}

