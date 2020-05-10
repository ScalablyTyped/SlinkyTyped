package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDocumentsResponse extends js.Object {
  var found: js.UndefOr[Document] = js.native
  var missing: js.UndefOr[String] = js.native
  var readTime: js.UndefOr[String] = js.native
  var transaction: js.UndefOr[String] = js.native
}

object BatchGetDocumentsResponse {
  @scala.inline
  def apply(): BatchGetDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDocumentsResponse]
  }
  @scala.inline
  implicit class BatchGetDocumentsResponseOps[Self <: BatchGetDocumentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFound(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(js.undefined)
        ret
    }
    @scala.inline
    def withMissing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(js.undefined)
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

