package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocumentDefaultVersionRequest extends js.Object {
  /**
    * The version of a custom document that you want to set as the default version.
    */
  var DocumentVersion: DocumentVersionNumber = js.native
  /**
    * The name of a custom document that you want to set as the default version.
    */
  var Name: DocumentName = js.native
}

object UpdateDocumentDefaultVersionRequest {
  @scala.inline
  def apply(DocumentVersion: DocumentVersionNumber, Name: DocumentName): UpdateDocumentDefaultVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentVersion = DocumentVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentDefaultVersionRequest]
  }
  @scala.inline
  implicit class UpdateDocumentDefaultVersionRequestOps[Self <: UpdateDocumentDefaultVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentVersion(value: DocumentVersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: DocumentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

