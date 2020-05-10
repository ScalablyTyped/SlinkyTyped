package typingsSlinky.nearley.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompiledRules extends js.Object {
  var Lexer: js.UndefOr[typingsSlinky.nearley.mod.Lexer] = js.native
  var ParserRules: js.Array[ParserRule] = js.native
  var ParserStart: String = js.native
}

object CompiledRules {
  @scala.inline
  def apply(ParserRules: js.Array[ParserRule], ParserStart: String): CompiledRules = {
    val __obj = js.Dynamic.literal(ParserRules = ParserRules.asInstanceOf[js.Any], ParserStart = ParserStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledRules]
  }
  @scala.inline
  implicit class CompiledRulesOps[Self <: CompiledRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParserRules(value: js.Array[ParserRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParserRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParserStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParserStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLexer(value: Lexer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lexer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLexer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lexer")(js.undefined)
        ret
    }
  }
  
}

