package typingsSlinky.polished.anon

import typingsSlinky.polished.polishedStrings.BackslashPlussign
import typingsSlinky.polished.polishedStrings.Plussign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prefix extends js.Object {
  var infix: RightToLeft = js.native
  var prefix: ArgCountF = js.native
  var regSymbol: BackslashPlussign = js.native
  var symbol: Plussign = js.native
}

object Prefix {
  @scala.inline
  def apply(infix: RightToLeft, prefix: ArgCountF, regSymbol: BackslashPlussign, symbol: Plussign): Prefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
  @scala.inline
  implicit class PrefixOps[Self <: Prefix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfix(value: RightToLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: ArgCountF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegSymbol(value: BackslashPlussign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: Plussign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

