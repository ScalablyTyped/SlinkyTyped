package typingsSlinky.jju.jjuMod

import typingsSlinky.jju.jjuStrings.comment
import typingsSlinky.jju.jjuStrings.key
import typingsSlinky.jju.jjuStrings.literal
import typingsSlinky.jju.jjuStrings.newline
import typingsSlinky.jju.jjuStrings.separator
import typingsSlinky.jju.jjuStrings.whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /** Raw text of this token. If you join all raws, you will get the original document. */
  var raw: String
  /** Path to the current token in the syntax tree. */
  var stack: js.Array[String]
  /** Type of the token. */
  var `type`: whitespace | comment | key | literal | separator | newline
  /** Value of the token if token is a key or literal. */
  var value: js.UndefOr[js.Any] = js.undefined
}

object Token {
  @scala.inline
  def apply(
    raw: String,
    stack: js.Array[String],
    `type`: whitespace | comment | key | literal | separator | newline,
    value: js.Any = null
  ): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

