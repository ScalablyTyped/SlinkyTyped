package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunQueryRequest extends js.Object {
  var newTransaction: js.UndefOr[TransactionOptions] = js.native
  var readTime: js.UndefOr[String] = js.native
  var structuredQuery: js.UndefOr[StructuredQuery] = js.native
  var transaction: js.UndefOr[String] = js.native
}

object RunQueryRequest {
  @scala.inline
  def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  @scala.inline
  implicit class RunQueryRequestOps[Self <: RunQueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewTransaction(value: TransactionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStructuredQuery(value: StructuredQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructuredQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredQuery")(js.undefined)
        ret
    }
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
  }
  
}

