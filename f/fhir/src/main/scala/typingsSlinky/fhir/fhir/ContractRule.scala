package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Computable Contract Language
  */
@js.native
trait ContractRule extends BackboneElement {
  /**
    * Computable Contract Rules
    */
  var contentAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Computable Contract Rules
    */
  var contentReference: js.UndefOr[Reference] = js.native
}

object ContractRule {
  @scala.inline
  def apply(): ContractRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractRule]
  }
  @scala.inline
  implicit class ContractRuleOps[Self <: ContractRule] (val x: Self) extends AnyVal {
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

