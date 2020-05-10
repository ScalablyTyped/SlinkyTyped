package typingsSlinky.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitTransactionResult extends js.Object {
  /**
    * The commit digest of the committed transaction.
    */
  var CommitDigest: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.CommitDigest] = js.native
  /**
    * The transaction id of the committed transaction.
    */
  var TransactionId: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.TransactionId] = js.native
}

object CommitTransactionResult {
  @scala.inline
  def apply(): CommitTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitTransactionResult]
  }
  @scala.inline
  implicit class CommitTransactionResultOps[Self <: CommitTransactionResult] (val x: Self) extends AnyVal {
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
    def withoutCommitDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommitDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionId(value: TransactionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransactionId")(js.undefined)
        ret
    }
  }
  
}

