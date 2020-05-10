package typingsSlinky.polished

import typingsSlinky.polished.polishedStrings.BackslashLeftparenthesis
import typingsSlinky.polished.polishedStrings.Leftparenthesis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrefixRegSymbol extends js.Object {
  var prefix: AnonRightToLeftSymbol = js.native
  var regSymbol: BackslashLeftparenthesis = js.native
  var symbol: Leftparenthesis = js.native
}

object AnonPrefixRegSymbol {
  @scala.inline
  def apply(prefix: AnonRightToLeftSymbol, regSymbol: BackslashLeftparenthesis, symbol: Leftparenthesis): AnonPrefixRegSymbol = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrefixRegSymbol]
  }
  @scala.inline
  implicit class AnonPrefixRegSymbolOps[Self <: AnonPrefixRegSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: AnonRightToLeftSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegSymbol(value: BackslashLeftparenthesis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: Leftparenthesis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

