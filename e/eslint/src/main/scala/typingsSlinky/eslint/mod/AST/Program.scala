package typingsSlinky.eslint.mod.AST

import typingsSlinky.estree.estreeStrings.module
import typingsSlinky.estree.estreeStrings.script
import typingsSlinky.estree.mod.Directive
import typingsSlinky.estree.mod.ModuleDeclaration
import typingsSlinky.estree.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Program
  extends typingsSlinky.estree.mod.Program {
  
  var tokens: js.Array[Token] = js.native
}
object Program {
  
  @scala.inline
  def apply(
    body: js.Array[Directive | Statement | ModuleDeclaration],
    sourceType: script | module,
    tokens: js.Array[Token],
    `type`: typingsSlinky.estree.estreeStrings.Program
  ): Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
  
  @scala.inline
  implicit class ProgramOps[Self <: Program] (val x: Self) extends AnyVal {
    
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
    def setTokensVarargs(value: Token*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[Token]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
}
