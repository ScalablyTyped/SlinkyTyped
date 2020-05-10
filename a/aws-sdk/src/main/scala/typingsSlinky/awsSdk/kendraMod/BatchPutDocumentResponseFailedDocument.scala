package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutDocumentResponseFailedDocument extends js.Object {
  /**
    * The type of error that caused the document to fail to be indexed.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.kendraMod.ErrorCode] = js.native
  /**
    * A description of the reason why the document could not be indexed.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.kendraMod.ErrorMessage] = js.native
  /**
    * The unique identifier of the document.
    */
  var Id: js.UndefOr[DocumentId] = js.native
}

object BatchPutDocumentResponseFailedDocument {
  @scala.inline
  def apply(): BatchPutDocumentResponseFailedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutDocumentResponseFailedDocument]
  }
  @scala.inline
  implicit class BatchPutDocumentResponseFailedDocumentOps[Self <: BatchPutDocumentResponseFailedDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: DocumentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
  }
  
}

