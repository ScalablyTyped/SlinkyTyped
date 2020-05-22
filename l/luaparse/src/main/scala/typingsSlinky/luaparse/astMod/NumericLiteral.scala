package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericLiteral
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.NumericLiteral] {
  var raw: String
  var value: Double
}

object NumericLiteral {
  @scala.inline
  def apply(
    raw: String,
    `type`: typingsSlinky.luaparse.luaparseStrings.NumericLiteral,
    value: Double,
    loc: End = null
  ): NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericLiteral]
  }
}

