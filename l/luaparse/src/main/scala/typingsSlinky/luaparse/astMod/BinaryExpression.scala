package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.AnonEnd
import typingsSlinky.luaparse.luaparseStrings.Ampersand
import typingsSlinky.luaparse.luaparseStrings.Asterisk
import typingsSlinky.luaparse.luaparseStrings.DotDot
import typingsSlinky.luaparse.luaparseStrings.EqualssignEqualssign
import typingsSlinky.luaparse.luaparseStrings.Greaterthansign
import typingsSlinky.luaparse.luaparseStrings.GreaterthansignEqualssign
import typingsSlinky.luaparse.luaparseStrings.GreaterthansignGreaterthansign
import typingsSlinky.luaparse.luaparseStrings.Lessthansign
import typingsSlinky.luaparse.luaparseStrings.LessthansignEqualssign
import typingsSlinky.luaparse.luaparseStrings.LessthansignLessthansign
import typingsSlinky.luaparse.luaparseStrings.Percentsign
import typingsSlinky.luaparse.luaparseStrings.Plussign
import typingsSlinky.luaparse.luaparseStrings.Slash
import typingsSlinky.luaparse.luaparseStrings.SlashSlash
import typingsSlinky.luaparse.luaparseStrings.Tilde
import typingsSlinky.luaparse.luaparseStrings.TildeEqualssign
import typingsSlinky.luaparse.luaparseStrings.Verticalline
import typingsSlinky.luaparse.luaparseStrings.^
import typingsSlinky.luaparse.luaparseStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.BinaryExpression] {
  var left: Expression
  var operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
  var right: Expression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.BinaryExpression,
    loc: AnonEnd = null
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
}

