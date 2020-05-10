package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Related identifiers or resources
  */
@js.native
trait DocumentReferenceContextRelated extends BackboneElement {
  /**
    * Identifier of related objects or events
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Related Resource
    */
  var ref: js.UndefOr[Reference] = js.native
}

object DocumentReferenceContextRelated {
  @scala.inline
  def apply(): DocumentReferenceContextRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentReferenceContextRelated]
  }
  @scala.inline
  implicit class DocumentReferenceContextRelatedOps[Self <: DocumentReferenceContextRelated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
  }
  
}

