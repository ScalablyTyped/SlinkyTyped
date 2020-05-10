package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteDocumentResponse extends js.Object {
  /**
    * A list of documents that could not be removed from the index. Each entry contains an error message that indicates why the document couldn't be removed from the index.
    */
  var FailedDocuments: js.UndefOr[BatchDeleteDocumentResponseFailedDocuments] = js.native
}

object BatchDeleteDocumentResponse {
  @scala.inline
  def apply(): BatchDeleteDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteDocumentResponse]
  }
  @scala.inline
  implicit class BatchDeleteDocumentResponseOps[Self <: BatchDeleteDocumentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedDocuments(value: BatchDeleteDocumentResponseFailedDocuments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedDocuments")(js.undefined)
        ret
    }
  }
  
}

