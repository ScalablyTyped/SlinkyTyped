package typingsSlinky.polished.anon

import typingsSlinky.polished.polishedStrings.Slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol extends js.Object {
  var infix: Precedence = js.native
  var regSymbol: Slash = js.native
  var symbol: Slash = js.native
}

object Symbol {
  @scala.inline
  def apply(infix: Precedence, regSymbol: Slash, symbol: Slash): Symbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  @scala.inline
  implicit class SymbolOps[Self <: Symbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfix(value: Precedence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegSymbol(value: Slash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: Slash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

