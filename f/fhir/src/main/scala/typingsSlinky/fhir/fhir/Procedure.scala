package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action that is being or was performed on a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Procedure extends DomainResource {
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'performedDateTime'.
    */
  var _performedDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * A request for this procedure
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Target body sites
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Classification of the procedure
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Identification of the procedure
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * Complication following the procedure
    */
  var complication: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * A condition that is a result of the procedure
    */
  var complicationDetail: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Encounter or episode associated with the procedure
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Device changed in procedure
    */
  var focalDevice: js.UndefOr[js.Array[ProcedureFocalDevice]] = js.native
  /**
    * Instructions for follow up
    */
  var followUp: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * External Identifiers for this procedure
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Where the procedure happened
    */
  var location: js.UndefOr[Reference] = js.native
  /**
    * True if procedure was not performed as scheduled
    */
  var notDone: js.UndefOr[Boolean] = js.native
  /**
    * Reason procedure was not performed
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Additional information about the procedure
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * The result of procedure
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Date/Period the procedure was performed
    */
  var performedDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Date/Period the procedure was performed
    */
  var performedPeriod: js.UndefOr[Period] = js.native
  /**
    * The people who performed the procedure
    */
  var performer: js.UndefOr[js.Array[ProcedurePerformer]] = js.native
  /**
    * Coded reason procedure performed
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Condition that is the reason the procedure performed
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Any report resulting from the procedure
    */
  var report: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * preparation | in-progress | suspended | aborted | completed | entered-in-error | unknown
    */
  var status: code = js.native
  /**
    * Who the procedure was performed on
    */
  var subject: Reference = js.native
  /**
    * Coded items used during the procedure
    */
  var usedCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Items used during procedure
    */
  var usedReference: js.UndefOr[js.Array[Reference]] = js.native
}

object Procedure {
  @scala.inline
  def apply(status: code, subject: Reference): Procedure = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  @scala.inline
  implicit class ProcedureOps[Self <: Procedure] (val x: Self) extends AnyVal {
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
    def with_notDone(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_notDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_notDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_notDone")(js.undefined)
        ret
    }
    @scala.inline
    def with_performedDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_performedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_performedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_performedDateTime")(js.undefined)
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
    def withBodySite(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodySite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySite")(js.undefined)
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
    def withComplication(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complication")(js.undefined)
        ret
    }
    @scala.inline
    def withComplicationDetail(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complicationDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplicationDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complicationDetail")(js.undefined)
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
    def withDefinition(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withFocalDevice(value: js.Array[ProcedureFocalDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focalDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocalDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focalDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowUp(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followUp")(js.undefined)
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
    def withLocation(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withNotDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDone")(js.undefined)
        ret
    }
    @scala.inline
    def withNotDoneReason(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDoneReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotDoneReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDoneReason")(js.undefined)
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
    def withOutcome(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(js.undefined)
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
    def withPerformedDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformedPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performedPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformedPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performedPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformer(value: js.Array[ProcedurePerformer]): Self = {
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
    @scala.inline
    def withReport(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedCode")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedReference(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedReference")(js.undefined)
        ret
    }
  }
  
}

