package typingsSlinky.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadDocumentsRequest extends js.Object {
  /**
    * The format of the batch you are uploading. Amazon CloudSearch supports two document batch formats:  application/json application/xml 
    */
  var contentType: ContentType = js.native
  /**
    * A batch of documents formatted in JSON or HTML.
    */
  var documents: _Blob = js.native
}

object UploadDocumentsRequest {
  @scala.inline
  def apply(contentType: ContentType, documents: _Blob): UploadDocumentsRequest = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadDocumentsRequest]
  }
  @scala.inline
  implicit class UploadDocumentsRequestOps[Self <: UploadDocumentsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: ContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentsUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocuments(value: _Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

