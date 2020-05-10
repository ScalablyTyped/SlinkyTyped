package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of how medication was taken
  */
@js.native
trait MedicationAdministrationDosage extends BackboneElement {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Amount of medication per dose
    */
  var dose: js.UndefOr[Quantity] = js.native
  /**
    * How drug was administered
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  /**
    * Dose quantity per unit of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Dose quantity per unit of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.native
  /**
    * Path of substance into body
    */
  var route: js.UndefOr[CodeableConcept] = js.native
  /**
    * Body site administered to
    */
  var site: js.UndefOr[CodeableConcept] = js.native
  /**
    * Free text dosage instructions e.g. SIG
    */
  var text: js.UndefOr[String] = js.native
}

object MedicationAdministrationDosage {
  @scala.inline
  def apply(): MedicationAdministrationDosage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationAdministrationDosage]
  }
  @scala.inline
  implicit class MedicationAdministrationDosageOps[Self <: MedicationAdministrationDosage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_text(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(js.undefined)
        ret
    }
    @scala.inline
    def withDose(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dose")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withRateQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withRateRatio(value: Ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
    @scala.inline
    def withSite(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

