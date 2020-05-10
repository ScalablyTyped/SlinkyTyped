package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Legal Language
  */
@js.native
trait ContractLegal extends BackboneElement {
  /**
    * Contract Legal Text
    */
  var contentAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Contract Legal Text
    */
  var contentReference: js.UndefOr[Reference] = js.native
}

object ContractLegal {
  @scala.inline
  def apply(): ContractLegal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractLegal]
  }
  @scala.inline
  implicit class ContractLegalOps[Self <: ContractLegal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentReference")(js.undefined)
        ret
    }
  }
  
}

