package typingsSlinky.picomatch.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var backtrack: Boolean = js.native
  var braces: Double = js.native
  var brackets: Double = js.native
  var consumed: String = js.native
  var globstar: Boolean = js.native
  var index: Double = js.native
  var output: String = js.native
  var parens: Double = js.native
  var start: Double = js.native
  var tokens: js.Array[Token] = js.native
}

object State {
  @scala.inline
  def apply(
    backtrack: Boolean,
    braces: Double,
    brackets: Double,
    consumed: String,
    globstar: Boolean,
    index: Double,
    output: String,
    parens: Double,
    start: Double,
    tokens: js.Array[Token]
  ): State = {
    val __obj = js.Dynamic.literal(backtrack = backtrack.asInstanceOf[js.Any], braces = braces.asInstanceOf[js.Any], brackets = brackets.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parens = parens.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBacktrack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backtrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBraces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrackets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobstar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParens(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Array[Token]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

