package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.luaparseStrings.Colon
import typingsSlinky.luaparse.luaparseStrings.Dot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberExpression
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.MemberExpression] {
  var base: Expression = js.native
  var identifier: Identifier = js.native
  var indexer: Dot | Colon = js.native
}

object MemberExpression {
  @scala.inline
  def apply(
    base: Expression,
    identifier: Identifier,
    indexer: Dot | Colon,
    `type`: typingsSlinky.luaparse.luaparseStrings.MemberExpression
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberExpression]
  }
  @scala.inline
  implicit class MemberExpressionOps[Self <: MemberExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexer(value: Dot | Colon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

