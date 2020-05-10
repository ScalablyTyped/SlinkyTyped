package typingsSlinky.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteStatementRequest extends js.Object {
  /**
    * Specifies the parameters for the parameterized statement in the request.
    */
  var Parameters: js.UndefOr[StatementParameters] = js.native
  /**
    * Specifies the statement of the request.
    */
  var Statement: typingsSlinky.awsSdk.qldbsessionMod.Statement = js.native
  /**
    * Specifies the transaction id of the request.
    */
  var TransactionId: typingsSlinky.awsSdk.qldbsessionMod.TransactionId = js.native
}

object ExecuteStatementRequest {
  @scala.inline
  def apply(Statement: Statement, TransactionId: TransactionId): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
  @scala.inline
  implicit class ExecuteStatementRequestOps[Self <: ExecuteStatementRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatement(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionId(value: TransactionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: StatementParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
  }
  
}

