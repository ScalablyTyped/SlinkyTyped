package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmexPayWithPoints extends js.Object {
  var AmexPayWithPoints: IneligibleCard = js.native
  var CardTypeIndicators: Debit = js.native
  var Dispute: Chargeback = js.native
}

object AmexPayWithPoints {
  @scala.inline
  def apply(AmexPayWithPoints: IneligibleCard, CardTypeIndicators: Debit, Dispute: Chargeback): AmexPayWithPoints = {
    val __obj = js.Dynamic.literal(AmexPayWithPoints = AmexPayWithPoints.asInstanceOf[js.Any], CardTypeIndicators = CardTypeIndicators.asInstanceOf[js.Any], Dispute = Dispute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmexPayWithPoints]
  }
  @scala.inline
  implicit class AmexPayWithPointsOps[Self <: AmexPayWithPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmexPayWithPoints(value: IneligibleCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmexPayWithPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardTypeIndicators(value: Debit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardTypeIndicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispute(value: Chargeback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dispute")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

