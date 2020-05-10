package typingsSlinky.luaparse.mod

import typingsSlinky.luaparse.astMod.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  def end(segment: String): Chunk = js.native
  def lex(): Token = js.native
  def write(segment: String): Unit = js.native
}

object Parser {
  @scala.inline
  def apply(end: String => Chunk, lex: () => Token, write: String => Unit): Parser = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), lex = js.Any.fromFunction0(lex), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Parser]
  }
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: String => Chunk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLex(value: () => Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrite(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

