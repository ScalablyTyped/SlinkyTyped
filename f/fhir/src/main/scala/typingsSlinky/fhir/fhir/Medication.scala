package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a Medication
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Medication extends DomainResource {
  /**
    * Contains extended information for property 'isBrand'.
    */
  var _isBrand: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'isOverTheCounter'.
    */
  var _isOverTheCounter: js.UndefOr[Element] = js.native
  /**
    * Details about packaged medications
    */
  @JSName("package")
  var _package: js.UndefOr[MedicationPackage] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Codes that identify this medication
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * powder | tablets | capsule +
    */
  var form: js.UndefOr[CodeableConcept] = js.native
  /**
    * Picture of the medication
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.native
  /**
    * Active or inactive ingredient
    */
  var ingredient: js.UndefOr[js.Array[MedicationIngredient]] = js.native
  /**
    * True if a brand
    */
  var isBrand: js.UndefOr[Boolean] = js.native
  /**
    * True if medication does not require a prescription
    */
  var isOverTheCounter: js.UndefOr[Boolean] = js.native
  /**
    * Manufacturer of the item
    */
  var manufacturer: js.UndefOr[Reference] = js.native
  /**
    * active | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
}

object Medication {
  @scala.inline
  def apply(): Medication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Medication]
  }
  @scala.inline
  implicit class MedicationOps[Self <: Medication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_isBrand(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isBrand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_isBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isBrand")(js.undefined)
        ret
    }
    @scala.inline
    def with_isOverTheCounter(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isOverTheCounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_isOverTheCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isOverTheCounter")(js.undefined)
        ret
    }
    @scala.inline
    def with_package(value: MedicationPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
    @scala.inline
    def with_status(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withIngredient(value: js.Array[MedicationIngredient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingredient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngredient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingredient")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBrand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBrand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBrand")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOverTheCounter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverTheCounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOverTheCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverTheCounter")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

