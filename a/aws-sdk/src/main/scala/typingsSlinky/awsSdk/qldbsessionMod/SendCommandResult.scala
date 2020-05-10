package typingsSlinky.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCommandResult extends js.Object {
  /**
    * Contains the details of the aborted transaction.
    */
  var AbortTransaction: js.UndefOr[AbortTransactionResult] = js.native
  /**
    * Contains the details of the committed transaction.
    */
  var CommitTransaction: js.UndefOr[CommitTransactionResult] = js.native
  /**
    * Contains the details of the ended session.
    */
  var EndSession: js.UndefOr[EndSessionResult] = js.native
  /**
    * Contains the details of the executed statement.
    */
  var ExecuteStatement: js.UndefOr[ExecuteStatementResult] = js.native
  /**
    * Contains the details of the fetched page.
    */
  var FetchPage: js.UndefOr[FetchPageResult] = js.native
  /**
    * Contains the details of the started session that includes a session token. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var StartSession: js.UndefOr[StartSessionResult] = js.native
  /**
    * Contains the details of the started transaction.
    */
  var StartTransaction: js.UndefOr[StartTransactionResult] = js.native
}

object SendCommandResult {
  @scala.inline
  def apply(): SendCommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandResult]
  }
  @scala.inline
  implicit class SendCommandResultOps[Self <: SendCommandResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortTransaction(value: AbortTransactionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbortTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbortTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitTransaction(value: CommitTransactionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommitTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommitTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withEndSession(value: EndSessionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndSession")(js.undefined)
        ret
    }
    @scala.inline
    def withExecuteStatement(value: ExecuteStatementResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecuteStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecuteStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecuteStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchPage(value: FetchPageResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FetchPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FetchPage")(js.undefined)
        ret
    }
    @scala.inline
    def withStartSession(value: StartSessionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartSession")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTransaction(value: StartTransactionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTransaction")(js.undefined)
        ret
    }
  }
  
}

