package typingsSlinky.polished.anon

import typingsSlinky.polished.polishedStrings.max
import typingsSlinky.polished.polishedStrings.maxBackslashb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuncRegSymbol extends js.Object {
  var func: NotationPrecedenceRightToLeft = js.native
  var regSymbol: maxBackslashb = js.native
  var symbol: max = js.native
}

object FuncRegSymbol {
  @scala.inline
  def apply(func: NotationPrecedenceRightToLeft, regSymbol: maxBackslashb, symbol: max): FuncRegSymbol = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuncRegSymbol]
  }
  @scala.inline
  implicit class FuncRegSymbolOps[Self <: FuncRegSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunc(value: NotationPrecedenceRightToLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegSymbol(value: maxBackslashb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: max): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

