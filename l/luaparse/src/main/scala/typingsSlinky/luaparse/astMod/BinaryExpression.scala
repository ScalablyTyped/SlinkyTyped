package typingsSlinky.luaparse.astMod

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

@js.native
trait BinaryExpression
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.BinaryExpression] {
  var left: Expression = js.native
  var operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign = js.native
  var right: Expression = js.native
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.BinaryExpression
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
  @scala.inline
  implicit class BinaryExpressionOps[Self <: BinaryExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(
      value: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

