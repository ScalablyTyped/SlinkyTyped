package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientWebDocumentViewerDocumentOperationResponse extends js.Object {
  var customData: String = js.native
  var documentId: String = js.native
  var message: String = js.native
  var succeeded: Boolean = js.native
}

object ASPxClientWebDocumentViewerDocumentOperationResponse {
  @scala.inline
  def apply(customData: String, documentId: String, message: String, succeeded: Boolean): ASPxClientWebDocumentViewerDocumentOperationResponse = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], documentId = documentId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerDocumentOperationResponse]
  }
  @scala.inline
  implicit class ASPxClientWebDocumentViewerDocumentOperationResponseOps[Self <: ASPxClientWebDocumentViewerDocumentOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

