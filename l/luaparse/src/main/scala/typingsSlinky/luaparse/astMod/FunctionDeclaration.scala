package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDeclaration
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.FunctionDeclaration]
     with _Statement {
  var body: js.Array[Statement]
  var identifier: Identifier | MemberExpression | Null
  var isLocal: Boolean
  var parameters: js.Array[Identifier | VarargLiteral]
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typingsSlinky.luaparse.luaparseStrings.FunctionDeclaration,
    identifier: Identifier | MemberExpression = null,
    loc: End = null
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

