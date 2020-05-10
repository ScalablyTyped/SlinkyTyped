package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestingGateway extends js.Object {
  def settle(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def settlementConfirm(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def settlementDecline(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def settlementOperationWithEnvironmentCheck(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
  def settlementPending(transactionId: String): js.Promise[ValidatedResponse[Transaction]] = js.native
}

object TestingGateway {
  @scala.inline
  def apply(
    settle: String => js.Promise[ValidatedResponse[Transaction]],
    settlementConfirm: String => js.Promise[ValidatedResponse[Transaction]],
    settlementDecline: String => js.Promise[ValidatedResponse[Transaction]],
    settlementOperationWithEnvironmentCheck: String => js.Promise[ValidatedResponse[Transaction]],
    settlementPending: String => js.Promise[ValidatedResponse[Transaction]]
  ): TestingGateway = {
    val __obj = js.Dynamic.literal(settle = js.Any.fromFunction1(settle), settlementConfirm = js.Any.fromFunction1(settlementConfirm), settlementDecline = js.Any.fromFunction1(settlementDecline), settlementOperationWithEnvironmentCheck = js.Any.fromFunction1(settlementOperationWithEnvironmentCheck), settlementPending = js.Any.fromFunction1(settlementPending))
    __obj.asInstanceOf[TestingGateway]
  }
  @scala.inline
  implicit class TestingGatewayOps[Self <: TestingGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSettle(value: String => js.Promise[ValidatedResponse[Transaction]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettlementConfirm(value: String => js.Promise[ValidatedResponse[Transaction]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlementConfirm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettlementDecline(value: String => js.Promise[ValidatedResponse[Transaction]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlementDecline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettlementOperationWithEnvironmentCheck(value: String => js.Promise[ValidatedResponse[Transaction]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlementOperationWithEnvironmentCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettlementPending(value: String => js.Promise[ValidatedResponse[Transaction]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlementPending")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

