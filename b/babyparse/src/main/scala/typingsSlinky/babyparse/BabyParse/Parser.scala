package typingsSlinky.babyparse.BabyParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  // Sets the abort flag
  def abort(): Unit = js.native
  // Gets the cursor position
  def getCharIndex(): Double = js.native
  // Parses the input
  def parse(input: String): js.Any = js.native
}

object Parser {
  @scala.inline
  def apply(abort: () => Unit, getCharIndex: () => Double, parse: String => js.Any): Parser = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), getCharIndex = js.Any.fromFunction0(getCharIndex), parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Parser]
  }
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCharIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCharIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParse(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

