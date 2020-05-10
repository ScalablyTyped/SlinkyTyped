package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prescription for vision correction products for a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait VisionPrescription extends DomainResource {
  /**
    * Contains extended information for property 'dateWritten'.
    */
  var _dateWritten: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * When prescription was authorized
    */
  var dateWritten: js.UndefOr[dateTime] = js.native
  /**
    * Vision supply authorization
    */
  var dispense: js.UndefOr[js.Array[VisionPrescriptionDispense]] = js.native
  /**
    * Created during encounter / admission / stay
    */
  var encounter: js.UndefOr[Reference] = js.native
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Who prescription is for
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * Who authorizes the vision product
    */
  var prescriber: js.UndefOr[Reference] = js.native
  /**
    * Reason or indication for writing the prescription
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Reason or indication for writing the prescription
    */
  var reasonReference: js.UndefOr[Reference] = js.native
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
}

object VisionPrescription {
  @scala.inline
  def apply(): VisionPrescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisionPrescription]
  }
  @scala.inline
  implicit class VisionPrescriptionOps[Self <: VisionPrescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_dateWritten(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dateWritten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_dateWritten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dateWritten")(js.undefined)
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
    def withDateWritten(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateWritten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateWritten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateWritten")(js.undefined)
        ret
    }
    @scala.inline
    def withDispense(value: js.Array[VisionPrescriptionDispense]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispense")(js.undefined)
        ret
    }
    @scala.inline
    def withEncounter(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encounter")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: js.Array[Identifier]): Self = {
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
    def withPatient(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(js.undefined)
        ret
    }
    @scala.inline
    def withPrescriber(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prescriber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrescriber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prescriber")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonReference")(js.undefined)
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

