package typingsSlinky.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDeclaration
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.FunctionDeclaration]
     with Statement {
  var body: js.Array[Statement] = js.native
  var identifier: Identifier | MemberExpression | Null = js.native
  var isLocal: Boolean = js.native
  var parameters: js.Array[Identifier | VarargLiteral] = js.native
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typingsSlinky.luaparse.luaparseStrings.FunctionDeclaration
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration]
  }
  @scala.inline
  implicit class FunctionDeclarationOps[Self <: FunctionDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: js.Array[Statement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[Identifier | VarargLiteral]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier | MemberExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifierNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(null)
        ret
    }
  }
  
}

