package typingsSlinky.jju.mod

import typingsSlinky.jju.jjuStrings.comment
import typingsSlinky.jju.jjuStrings.key
import typingsSlinky.jju.jjuStrings.literal
import typingsSlinky.jju.jjuStrings.newline
import typingsSlinky.jju.jjuStrings.separator
import typingsSlinky.jju.jjuStrings.whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  /** Raw text of this token. If you join all raws, you will get the original document. */
  var raw: String = js.native
  /** Path to the current token in the syntax tree. */
  var stack: js.Array[String] = js.native
  /** Type of the token. */
  var `type`: whitespace | comment | key | literal | separator | newline = js.native
  /** Value of the token if token is a key or literal. */
  var value: js.UndefOr[js.Any] = js.native
}

object Token {
  @scala.inline
  def apply(
    raw: String,
    stack: js.Array[String],
    `type`: whitespace | comment | key | literal | separator | newline
  ): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: whitespace | comment | key | literal | separator | newline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

