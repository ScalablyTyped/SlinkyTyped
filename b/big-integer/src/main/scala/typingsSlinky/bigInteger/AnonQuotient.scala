package typingsSlinky.bigInteger

import typingsSlinky.bigInteger.mod.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQuotient extends js.Object {
  var quotient: BigInteger = js.native
  var remainder: BigInteger = js.native
}

object AnonQuotient {
  @scala.inline
  def apply(quotient: BigInteger, remainder: BigInteger): AnonQuotient = {
    val __obj = js.Dynamic.literal(quotient = quotient.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuotient]
  }
  @scala.inline
  implicit class AnonQuotientOps[Self <: AnonQuotient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuotient(value: BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemainder(value: BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

