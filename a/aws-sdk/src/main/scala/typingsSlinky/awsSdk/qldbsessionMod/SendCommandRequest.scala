package typingsSlinky.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCommandRequest extends js.Object {
  /**
    * Command to abort the current transaction.
    */
  var AbortTransaction: js.UndefOr[AbortTransactionRequest] = js.native
  /**
    * Command to commit the specified transaction.
    */
  var CommitTransaction: js.UndefOr[CommitTransactionRequest] = js.native
  /**
    * Command to end the current session.
    */
  var EndSession: js.UndefOr[EndSessionRequest] = js.native
  /**
    * Command to execute a statement in the specified transaction.
    */
  var ExecuteStatement: js.UndefOr[ExecuteStatementRequest] = js.native
  /**
    * Command to fetch a page.
    */
  var FetchPage: js.UndefOr[FetchPageRequest] = js.native
  /**
    * Specifies the session token for the current command. A session token is constant throughout the life of the session. To obtain a session token, run the StartSession command. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var SessionToken: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.SessionToken] = js.native
  /**
    * Command to start a new session. A session token is obtained as part of the response.
    */
  var StartSession: js.UndefOr[StartSessionRequest] = js.native
  /**
    * Command to start a new transaction.
    */
  var StartTransaction: js.UndefOr[StartTransactionRequest] = js.native
}

object SendCommandRequest {
  @scala.inline
  def apply(): SendCommandRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandRequest]
  }
  @scala.inline
  implicit class SendCommandRequestOps[Self <: SendCommandRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortTransaction(value: AbortTransactionRequest): Self = {
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
    def withCommitTransaction(value: CommitTransactionRequest): Self = {
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
    def withEndSession(value: EndSessionRequest): Self = {
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
    def withExecuteStatement(value: ExecuteStatementRequest): Self = {
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
    def withFetchPage(value: FetchPageRequest): Self = {
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
    def withSessionToken(value: SessionToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStartSession(value: StartSessionRequest): Self = {
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
    def withStartTransaction(value: StartTransactionRequest): Self = {
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

