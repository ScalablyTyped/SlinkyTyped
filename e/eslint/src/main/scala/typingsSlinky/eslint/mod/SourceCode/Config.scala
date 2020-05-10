package typingsSlinky.eslint.mod.SourceCode

import typingsSlinky.eslint.mod.AST.Program
import typingsSlinky.eslint.mod.Scope.ScopeManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var ast: Program = js.native
  var parserServices: js.UndefOr[ParserServices] = js.native
  var scopeManager: js.UndefOr[ScopeManager] = js.native
  var text: String = js.native
  var visitorKeys: js.UndefOr[VisitorKeys] = js.native
}

object Config {
  @scala.inline
  def apply(ast: Program, text: String): Config = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAst(value: Program): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParserServices(value: ParserServices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParserServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserServices")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeManager(value: ScopeManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeManager")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitorKeys(value: VisitorKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitorKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitorKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitorKeys")(js.undefined)
        ret
    }
  }
  
}

