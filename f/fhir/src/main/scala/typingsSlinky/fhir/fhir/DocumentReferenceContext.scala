package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Clinical context of document
  */
@js.native
trait DocumentReferenceContext extends BackboneElement {
  /**
    * Context of the document  content
    */
  var encounter: js.UndefOr[Reference] = js.native
  /**
    * Main clinical acts documented
    */
  var event: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Kind of facility where patient was seen
    */
  var facilityType: js.UndefOr[CodeableConcept] = js.native
  /**
    * Time of service that is being documented
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Additional details about where the content was created (e.g. clinical specialty)
    */
  var practiceSetting: js.UndefOr[CodeableConcept] = js.native
  /**
    * Related identifiers or resources
    */
  var related: js.UndefOr[js.Array[DocumentReferenceContextRelated]] = js.native
  /**
    * Patient demographics from source
    */
  var sourcePatientInfo: js.UndefOr[Reference] = js.native
}

object DocumentReferenceContext {
  @scala.inline
  def apply(): DocumentReferenceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentReferenceContext]
  }
  @scala.inline
  implicit class DocumentReferenceContextOps[Self <: DocumentReferenceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEvent(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withFacilityType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacilityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilityType")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withPracticeSetting(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("practiceSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPracticeSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("practiceSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withRelated(value: js.Array[DocumentReferenceContextRelated]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePatientInfo(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePatientInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePatientInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePatientInfo")(js.undefined)
        ret
    }
  }
  
}

