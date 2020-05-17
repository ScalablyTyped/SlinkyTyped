package typingsSlinky.polished.anon

import typingsSlinky.polished.polishedStrings.Comma
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfixRegSymbol extends js.Object {
  var infix: PrecedenceRightToLeft = js.native
  var regSymbol: Comma = js.native
  var symbol: Comma = js.native
}

object InfixRegSymbol {
  @scala.inline
  def apply(infix: PrecedenceRightToLeft, regSymbol: Comma, symbol: Comma): InfixRegSymbol = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfixRegSymbol]
  }
  @scala.inline
  implicit class InfixRegSymbolOps[Self <: InfixRegSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfix(value: PrecedenceRightToLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegSymbol(value: Comma): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: Comma): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

