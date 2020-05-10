package typingsSlinky.nearley.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserRule extends js.Object {
  var name: String = js.native
  var postprocess: js.UndefOr[Postprocessor] = js.native
  var symbols: js.Array[_] = js.native
}

object ParserRule {
  @scala.inline
  def apply(name: String, symbols: js.Array[_]): ParserRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserRule]
  }
  @scala.inline
  implicit class ParserRuleOps[Self <: ParserRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbols(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostprocess(
      value: (/* data */ js.Array[js.Any], /* reference */ js.UndefOr[Double], /* wantedBy */ js.UndefOr[js.Object]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postprocess")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPostprocess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postprocess")(js.undefined)
        ret
    }
  }
  
}

