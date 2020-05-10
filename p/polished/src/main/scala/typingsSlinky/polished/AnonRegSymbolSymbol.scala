package typingsSlinky.polished

import typingsSlinky.polished.polishedStrings.sqrt
import typingsSlinky.polished.polishedStrings.sqrtBackslashb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRegSymbolSymbol extends js.Object {
  var func: AnonPrecedenceRightToLeftSymbol = js.native
  var regSymbol: sqrtBackslashb = js.native
  var symbol: sqrt = js.native
}

object AnonRegSymbolSymbol {
  @scala.inline
  def apply(func: AnonPrecedenceRightToLeftSymbol, regSymbol: sqrtBackslashb, symbol: sqrt): AnonRegSymbolSymbol = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRegSymbolSymbol]
  }
  @scala.inline
  implicit class AnonRegSymbolSymbolOps[Self <: AnonRegSymbolSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunc(value: AnonPrecedenceRightToLeftSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegSymbol(value: sqrtBackslashb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: sqrt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

