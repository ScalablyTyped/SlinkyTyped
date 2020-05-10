package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.Commit.
  */
@js.native
trait SchemaCommitRequest extends js.Object {
  /**
    * If set, applies all writes in this transaction, and commits it.
    */
  var transaction: js.UndefOr[String] = js.native
  /**
    * The writes to apply.  Always executed atomically and in order.
    */
  var writes: js.UndefOr[js.Array[SchemaWrite]] = js.native
}

object SchemaCommitRequest {
  @scala.inline
  def apply(): SchemaCommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitRequest]
  }
  @scala.inline
  implicit class SchemaCommitRequestOps[Self <: SchemaCommitRequest] (val x: Self) extends AnyVal {
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
    def withWrites(value: js.Array[SchemaWrite]): Self = {
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

