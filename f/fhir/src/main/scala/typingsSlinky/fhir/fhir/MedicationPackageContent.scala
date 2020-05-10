package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What is  in the package
  */
@js.native
trait MedicationPackageContent extends BackboneElement {
  /**
    * Quantity present in the package
    */
  var amount: js.UndefOr[Quantity] = js.native
  /**
    * The item in the package
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * The item in the package
    */
  var itemReference: js.UndefOr[Reference] = js.native
}

object MedicationPackageContent {
  @scala.inline
  def apply(): MedicationPackageContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationPackageContent]
  }
  @scala.inline
  implicit class MedicationPackageContentOps[Self <: MedicationPackageContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withItemReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemReference")(js.undefined)
        ret
    }
  }
  
}

