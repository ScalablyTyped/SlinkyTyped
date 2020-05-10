package typingsSlinky.accounting.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrencyFormat extends js.Object {
           // for positive values, eg. "$ 1.00"
  var neg: js.UndefOr[String] = js.native
  var pos: String = js.native
          // for negative values, eg. "$ (1.00)"
  var zero: js.UndefOr[String] = js.native
}

object CurrencyFormat {
  @scala.inline
  def apply(pos: String): CurrencyFormat = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyFormat]
  }
  @scala.inline
  implicit class CurrencyFormatOps[Self <: CurrencyFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neg")(js.undefined)
        ret
    }
    @scala.inline
    def withZero(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zero")(js.undefined)
        ret
    }
  }
  
}

