package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubmitForSettlement extends js.Object {
  var submitForSettlement: Boolean = js.native
}

object AnonSubmitForSettlement {
  @scala.inline
  def apply(submitForSettlement: Boolean): AnonSubmitForSettlement = {
    val __obj = js.Dynamic.literal(submitForSettlement = submitForSettlement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubmitForSettlement]
  }
  @scala.inline
  implicit class AnonSubmitForSettlementOps[Self <: AnonSubmitForSettlement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubmitForSettlement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitForSettlement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

