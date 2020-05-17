package typingsSlinky.asmcryptoJs.anon

import typingsSlinky.asmcryptoJs.bignumMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quotient extends js.Object {
  var quotient: BigNumber = js.native
  var remainder: BigNumber = js.native
}

object Quotient {
  @scala.inline
  def apply(quotient: BigNumber, remainder: BigNumber): Quotient = {
    val __obj = js.Dynamic.literal(quotient = quotient.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quotient]
  }
  @scala.inline
  implicit class QuotientOps[Self <: Quotient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuotient(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemainder(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

