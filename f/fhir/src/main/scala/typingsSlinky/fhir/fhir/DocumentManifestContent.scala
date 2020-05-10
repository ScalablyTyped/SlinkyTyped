package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The items included
  */
@js.native
trait DocumentManifestContent extends BackboneElement {
  /**
    * Contents of this set of documents
    */
  var pAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Contents of this set of documents
    */
  var pReference: js.UndefOr[Reference] = js.native
}

object DocumentManifestContent {
  @scala.inline
  def apply(): DocumentManifestContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentManifestContent]
  }
  @scala.inline
  implicit class DocumentManifestContentOps[Self <: DocumentManifestContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withPReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pReference")(js.undefined)
        ret
    }
  }
  
}

