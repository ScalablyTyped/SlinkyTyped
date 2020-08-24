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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLeft(value: Expression): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(
      value: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
    ): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Expression): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

