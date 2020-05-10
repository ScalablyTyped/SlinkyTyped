package typingsSlinky.braintree.mod

import typingsSlinky.braintree.AnonGroupByCustomField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettlementBatchSummaryGateway extends js.Object {
  def generate(request: AnonGroupByCustomField): js.Promise[SettlementBatchSummary] = js.native
}

object SettlementBatchSummaryGateway {
  @scala.inline
  def apply(generate: AnonGroupByCustomField => js.Promise[SettlementBatchSummary]): SettlementBatchSummaryGateway = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[SettlementBatchSummaryGateway]
  }
  @scala.inline
  implicit class SettlementBatchSummaryGatewayOps[Self <: SettlementBatchSummaryGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerate(value: AnonGroupByCustomField => js.Promise[SettlementBatchSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

