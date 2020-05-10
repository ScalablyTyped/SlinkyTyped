package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitRequest extends js.Object {
  /**
    * The mutations to be executed when this transaction commits. All
    * mutations are applied atomically, in the order they appear in
    * this list.
    */
  var mutations: js.UndefOr[js.Array[Mutation]] = js.native
  /**
    * Execute mutations in a temporary transaction. Note that unlike
    * commit of a previously-started transaction, commit with a
    * temporary transaction is non-idempotent. That is, if the
    * `CommitRequest` is sent to Cloud Spanner more than once (for
    * instance, due to retries in the application, or in the
    * transport library), it is possible that the mutations are
    * executed more than once. If this is undesirable, use
    * BeginTransaction and
    * Commit instead.
    */
  var singleUseTransaction: js.UndefOr[TransactionOptions] = js.native
  /** Commit a previously-started transaction. */
  var transactionId: js.UndefOr[String] = js.native
}

object CommitRequest {
  @scala.inline
  def apply(): CommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitRequest]
  }
  @scala.inline
  implicit class CommitRequestOps[Self <: CommitRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutations(value: js.Array[Mutation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutations")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleUseTransaction(value: TransactionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUseTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleUseTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUseTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(js.undefined)
        ret
    }
  }
  
}

