package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutDocumentResponse extends js.Object {
  /**
    * A list of documents that were not added to the index because the document failed a validation check. Each document contains an error message that indicates why the document couldn't be added to the index. If there was an error adding a document to an index the error is reported in your AWS CloudWatch log.
    */
  var FailedDocuments: js.UndefOr[BatchPutDocumentResponseFailedDocuments] = js.native
}

object BatchPutDocumentResponse {
  @scala.inline
  def apply(): BatchPutDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutDocumentResponse]
  }
  @scala.inline
  implicit class BatchPutDocumentResponseOps[Self <: BatchPutDocumentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedDocuments(value: BatchPutDocumentResponseFailedDocuments): Self = {
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

