package typingsSlinky.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSymbol extends js.Object {
  var symbol: String = js.native
}

object AnonSymbol {
  @scala.inline
  def apply(symbol: String): AnonSymbol = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSymbol]
  }
  @scala.inline
  implicit class AnonSymbolOps[Self <: AnonSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

