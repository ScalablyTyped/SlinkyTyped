package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitRequest extends js.Object {
  /**
    * If non-empty, applies all writes in this transaction, and commits it.
    * Otherwise, applies the writes as if they were in their own transaction.
    */
  var transaction: js.UndefOr[String] = js.native
  /**
    * The writes to apply.
    *
    * Always executed atomically and in order.
    */
  var writes: js.UndefOr[js.Array[Write]] = js.native
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
    def withTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
    @scala.inline
    def withWrites(value: js.Array[Write]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writes")(js.undefined)
        ret
    }
  }
  
}

