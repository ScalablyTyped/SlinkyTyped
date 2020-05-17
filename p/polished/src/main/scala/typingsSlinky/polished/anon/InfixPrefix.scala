package typingsSlinky.polished.anon

import typingsSlinky.polished.polishedStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfixPrefix extends js.Object {
  var infix: FNotation = js.native
  var prefix: NotationPrecedence = js.native
  var regSymbol: `-_` = js.native
  var symbol: `-_` = js.native
}

object InfixPrefix {
  @scala.inline
  def apply(infix: FNotation, prefix: NotationPrecedence, regSymbol: `-_`, symbol: `-_`): InfixPrefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfixPrefix]
  }
  @scala.inline
  implicit class InfixPrefixOps[Self <: InfixPrefix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfix(value: FNotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: NotationPrecedence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegSymbol(value: `-_`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: `-_`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

