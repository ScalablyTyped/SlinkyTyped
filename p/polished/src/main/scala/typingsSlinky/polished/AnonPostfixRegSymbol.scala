package typingsSlinky.polished

import typingsSlinky.polished.polishedStrings.BackslashRightparenthesis
import typingsSlinky.polished.polishedStrings.Rightparenthesis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPostfixRegSymbol extends js.Object {
  var postfix: AnonArgCountFNotation = js.native
  var regSymbol: BackslashRightparenthesis = js.native
  var symbol: Rightparenthesis = js.native
}

object AnonPostfixRegSymbol {
  @scala.inline
  def apply(postfix: AnonArgCountFNotation, regSymbol: BackslashRightparenthesis, symbol: Rightparenthesis): AnonPostfixRegSymbol = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPostfixRegSymbol]
  }
  @scala.inline
  implicit class AnonPostfixRegSymbolOps[Self <: AnonPostfixRegSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostfix(value: AnonArgCountFNotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegSymbol(value: BackslashRightparenthesis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: Rightparenthesis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

