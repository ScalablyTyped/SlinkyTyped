package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmexPayWithPoints extends js.Object {
  var AmexPayWithPoints: AnonIneligibleCard = js.native
  var CardTypeIndicators: AnonDebit = js.native
  var Dispute: AnonChargeback = js.native
}

object AnonAmexPayWithPoints {
  @scala.inline
  def apply(AmexPayWithPoints: AnonIneligibleCard, CardTypeIndicators: AnonDebit, Dispute: AnonChargeback): AnonAmexPayWithPoints = {
    val __obj = js.Dynamic.literal(AmexPayWithPoints = AmexPayWithPoints.asInstanceOf[js.Any], CardTypeIndicators = CardTypeIndicators.asInstanceOf[js.Any], Dispute = Dispute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmexPayWithPoints]
  }
  @scala.inline
  implicit class AnonAmexPayWithPointsOps[Self <: AnonAmexPayWithPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmexPayWithPoints(value: AnonIneligibleCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmexPayWithPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardTypeIndicators(value: AnonDebit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardTypeIndicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispute(value: AnonChargeback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dispute")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

