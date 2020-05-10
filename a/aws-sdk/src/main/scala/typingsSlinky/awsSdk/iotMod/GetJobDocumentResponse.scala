package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobDocumentResponse extends js.Object {
  /**
    * The job document content.
    */
  var document: js.UndefOr[JobDocument] = js.native
}

object GetJobDocumentResponse {
  @scala.inline
  def apply(): GetJobDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobDocumentResponse]
  }
  @scala.inline
  implicit class GetJobDocumentResponseOps[Self <: GetJobDocumentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: JobDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
  }
  
}

