package typingsSlinky.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitTransactionRequest extends js.Object {
  /**
    * Specifies the commit digest for the transaction to commit. For every active transaction, the commit digest must be passed. QLDB validates CommitDigest and rejects the commit with an error if the digest computed on the client does not match the digest computed by QLDB.
    */
  var CommitDigest: typingsSlinky.awsSdk.qldbsessionMod.CommitDigest = js.native
  /**
    * Specifies the transaction id of the transaction to commit.
    */
  var TransactionId: typingsSlinky.awsSdk.qldbsessionMod.TransactionId = js.native
}

object CommitTransactionRequest {
  @scala.inline
  def apply(CommitDigest: CommitDigest, TransactionId: TransactionId): CommitTransactionRequest = {
    val __obj = js.Dynamic.literal(CommitDigest = CommitDigest.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitTransactionRequest]
  }
  @scala.inline
  implicit class CommitTransactionRequestOps[Self <: CommitTransactionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitDigestUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommitDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitDigest(value: CommitDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommitDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionId(value: TransactionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransactionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

