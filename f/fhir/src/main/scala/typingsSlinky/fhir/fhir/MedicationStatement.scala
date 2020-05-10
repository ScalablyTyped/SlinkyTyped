package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Record of medication being taken by a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait MedicationStatement extends DomainResource {
  /**
    * Contains extended information for property 'dateAsserted'.
    */
  var _dateAsserted: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'taken'.
    */
  var _taken: js.UndefOr[Element] = js.native
  /**
    * Fulfils plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Encounter / Episode associated with MedicationStatement
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * When the statement was asserted?
    */
  var dateAsserted: js.UndefOr[dateTime] = js.native
  /**
    * Additional supporting information
    */
  var derivedFrom: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Details of how medication is/was taken or should be taken
    */
  var dosage: js.UndefOr[js.Array[Dosage]] = js.native
  /**
    * The date/time or interval when the medication was taken
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.native
  /**
    * The date/time or interval when the medication was taken
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Person or organization that provided the information about the taking of this medication
    */
  var informationSource: js.UndefOr[Reference] = js.native
  /**
    * What medication was taken
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * What medication was taken
    */
  var medicationReference: js.UndefOr[Reference] = js.native
  /**
    * Further information about the statement
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Reason for why the medication is being/was taken
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * True if asserting medication was not given
    */
  var reasonNotTaken: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Condition or observation that supports why the medication is being/was taken
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * active | completed | entered-in-error | intended | stopped | on-hold
    */
  var status: code = js.native
  /**
    * Who is/was taking  the medication
    */
  var subject: Reference = js.native
  /**
    * y | n | unk | na
    */
  var taken: code = js.native
}

object MedicationStatement {
  @scala.inline
  def apply(status: code, subject: Reference, taken: code): MedicationStatement = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], taken = taken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationStatement]
  }
  @scala.inline
  implicit class MedicationStatementOps[Self <: MedicationStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaken(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_dateAsserted(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dateAsserted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_dateAsserted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dateAsserted")(js.undefined)
        ret
    }
    @scala.inline
    def with_effectiveDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effectiveDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_effectiveDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effectiveDateTime")(js.undefined)
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
    def with_taken(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_taken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_taken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_taken")(js.undefined)
        ret
    }
    @scala.inline
    def withBasedOn(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDateAsserted(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateAsserted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateAsserted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateAsserted")(js.undefined)
        ret
    }
    @scala.inline
    def withDerivedFrom(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivedFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDerivedFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivedFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withDosage(value: js.Array[Dosage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dosage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDosage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dosage")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectivePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectivePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectivePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectivePeriod")(js.undefined)
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
    def withInformationSource(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("informationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInformationSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("informationSource")(js.undefined)
        ret
    }
    @scala.inline
    def withMedicationCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medicationCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedicationCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medicationCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withMedicationReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medicationReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedicationReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medicationReference")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withPartOf(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOf")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonNotTaken(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonNotTaken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonNotTaken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonNotTaken")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonReference(value: js.Array[Reference]): Self = {
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
  }
  
}

