package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the admission to a healthcare service
  */
@js.native
trait EncounterHospitalization extends BackboneElement {
  /**
    * From where patient was admitted (physician referral, transfer)
    */
  var admitSource: js.UndefOr[CodeableConcept] = js.native
  /**
    * Location to which the patient is discharged
    */
  var destination: js.UndefOr[Reference] = js.native
  /**
    * Diet preferences reported by the patient
    */
  var dietPreference: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Category or kind of location after discharge
    */
  var dischargeDisposition: js.UndefOr[CodeableConcept] = js.native
  /**
    * The location from which the patient came before admission
    */
  var origin: js.UndefOr[Reference] = js.native
  /**
    * Pre-admission identifier
    */
  var preAdmissionIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * The type of hospital re-admission that has occurred (if any). If the value is absent, then this is not identified as a readmission
    */
  var reAdmission: js.UndefOr[CodeableConcept] = js.native
  /**
    * Wheelchair, translator, stretcher, etc.
    */
  var specialArrangement: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Special courtesies (VIP, board member)
    */
  var specialCourtesy: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object EncounterHospitalization {
  @scala.inline
  def apply(): EncounterHospitalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterHospitalization]
  }
  @scala.inline
  implicit class EncounterHospitalizationOps[Self <: EncounterHospitalization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmitSource(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admitSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdmitSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admitSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDietPreference(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dietPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDietPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dietPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withDischargeDisposition(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dischargeDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDischargeDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dischargeDisposition")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPreAdmissionIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preAdmissionIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreAdmissionIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preAdmissionIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withReAdmission(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reAdmission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReAdmission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reAdmission")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialArrangement(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialArrangement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialArrangement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialArrangement")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialCourtesy(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialCourtesy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialCourtesy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialCourtesy")(js.undefined)
        ret
    }
  }
  
}

