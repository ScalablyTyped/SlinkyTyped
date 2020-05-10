package typingsSlinky.antlr4.treeMod

import typingsSlinky.antlr4.parserRuleContextMod.ParserRuleContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseTreeListener extends js.Object {
  def enterEveryRule(node: ParserRuleContext): Unit = js.native
  def exitEveryRule(node: ParserRuleContext): Unit = js.native
  def visitErrorNode(node: ErrorNode): Unit = js.native
  def visitTerminal(node: TerminalNode): Unit = js.native
}

object ParseTreeListener {
  @scala.inline
  def apply(
    enterEveryRule: ParserRuleContext => Unit,
    exitEveryRule: ParserRuleContext => Unit,
    visitErrorNode: ErrorNode => Unit,
    visitTerminal: TerminalNode => Unit
  ): ParseTreeListener = {
    val __obj = js.Dynamic.literal(enterEveryRule = js.Any.fromFunction1(enterEveryRule), exitEveryRule = js.Any.fromFunction1(exitEveryRule), visitErrorNode = js.Any.fromFunction1(visitErrorNode), visitTerminal = js.Any.fromFunction1(visitTerminal))
    __obj.asInstanceOf[ParseTreeListener]
  }
  @scala.inline
  implicit class ParseTreeListenerOps[Self <: ParseTreeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterEveryRule(value: ParserRuleContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterEveryRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExitEveryRule(value: ParserRuleContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitEveryRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitErrorNode(value: ErrorNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitErrorNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitTerminal(value: TerminalNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTerminal")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

