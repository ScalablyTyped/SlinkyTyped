package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitForSettlement extends js.Object {
  var submitForSettlement: Boolean = js.native
}

object SubmitForSettlement {
  @scala.inline
  def apply(submitForSettlement: Boolean): SubmitForSettlement = {
    val __obj = js.Dynamic.literal(submitForSettlement = submitForSettlement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitForSettlement]
  }
  @scala.inline
  implicit class SubmitForSettlementOps[Self <: SubmitForSettlement] (val x: Self) extends AnyVal {
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

