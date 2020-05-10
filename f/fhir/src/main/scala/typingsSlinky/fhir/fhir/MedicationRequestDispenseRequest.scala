package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Medication supply authorization
  */
@js.native
trait MedicationRequestDispenseRequest extends BackboneElement {
  /**
    * Contains extended information for property 'numberOfRepeatsAllowed'.
    */
  var _numberOfRepeatsAllowed: js.UndefOr[Element] = js.native
  /**
    * Number of days supply per dispense
    */
  var expectedSupplyDuration: js.UndefOr[Duration] = js.native
  /**
    * Number of refills authorized
    */
  var numberOfRepeatsAllowed: js.UndefOr[positiveInt] = js.native
  /**
    * Intended dispenser
    */
  var performer: js.UndefOr[Reference] = js.native
  /**
    * Amount of medication to supply per dispense
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Time period supply is authorized for
    */
  var validityPeriod: js.UndefOr[Period] = js.native
}

object MedicationRequestDispenseRequest {
  @scala.inline
  def apply(): MedicationRequestDispenseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationRequestDispenseRequest]
  }
  @scala.inline
  implicit class MedicationRequestDispenseRequestOps[Self <: MedicationRequestDispenseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_numberOfRepeatsAllowed(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberOfRepeatsAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_numberOfRepeatsAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberOfRepeatsAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedSupplyDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedSupplyDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedSupplyDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedSupplyDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfRepeatsAllowed(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRepeatsAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfRepeatsAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRepeatsAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performer")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withValidityPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validityPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidityPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validityPeriod")(js.undefined)
        ret
    }
  }
  
}

