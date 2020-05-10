package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifyDocumentRequest extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the endpoint.
    */
  var EndpointArn: DocumentClassifierEndpointArn = js.native
  /**
    * The document text to be analyzed.
    */
  var Text: String = js.native
}

object ClassifyDocumentRequest {
  @scala.inline
  def apply(EndpointArn: DocumentClassifierEndpointArn, Text: String): ClassifyDocumentRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyDocumentRequest]
  }
  @scala.inline
  implicit class ClassifyDocumentRequestOps[Self <: ClassifyDocumentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointArn(value: DocumentClassifierEndpointArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

