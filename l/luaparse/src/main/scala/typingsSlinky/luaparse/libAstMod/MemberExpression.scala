package typingsSlinky.luaparse.libAstMod

import typingsSlinky.luaparse.Anon_End
import typingsSlinky.luaparse.luaparseStrings.DOT
import typingsSlinky.luaparse.luaparseStrings.`:`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.MemberExpression] {
  var base: Expression
  var identifier: Identifier
  var indexer: DOT | `:`
}

object MemberExpression {
  @scala.inline
  def apply(
    base: Expression,
    identifier: Identifier,
    indexer: DOT | `:`,
    `type`: typingsSlinky.luaparse.luaparseStrings.MemberExpression,
    loc: Anon_End = null
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberExpression]
  }
}

