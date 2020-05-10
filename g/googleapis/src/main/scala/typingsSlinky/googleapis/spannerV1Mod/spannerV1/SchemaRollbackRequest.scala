package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Rollback.
  */
@js.native
trait SchemaRollbackRequest extends js.Object {
  /**
    * Required. The transaction to roll back.
    */
  var transactionId: js.UndefOr[String] = js.native
}

object SchemaRollbackRequest {
  @scala.inline
  def apply(): SchemaRollbackRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRollbackRequest]
  }
  @scala.inline
  implicit class SchemaRollbackRequestOps[Self <: SchemaRollbackRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

