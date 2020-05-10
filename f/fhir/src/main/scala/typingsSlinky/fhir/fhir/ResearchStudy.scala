package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait ResearchStudy extends DomainResource {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * Defined path through the study for a subject
    */
  var arm: js.UndefOr[js.Array[ResearchStudyArm]] = js.native
  /**
    * Classifications for the study
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Contact details for the study
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  /**
    * What this is study doing
    */
  var description: js.UndefOr[markdown] = js.native
  /**
    * Inclusion & exclusion criteria
    */
  var enrollment: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Drugs, devices, conditions, etc. under study
    */
  var focus: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Business Identifier for study
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Geographic region(s) for study
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Used to search for the study
    */
  var keyword: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Comments made about the event
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Part of larger study
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * When the study began and ended
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * The individual responsible for the study
    */
  var principalInvestigator: js.UndefOr[Reference] = js.native
  /**
    * Steps followed in executing study
    */
  var protocol: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Reason for terminating study early
    */
  var reasonStopped: js.UndefOr[CodeableConcept] = js.native
  /**
    * References and dependencies
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.native
  /**
    * Location involved in study execution
    */
  var site: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Organization responsible for the study
    */
  var sponsor: js.UndefOr[Reference] = js.native
  /**
    * draft | in-progress | suspended | stopped | completed | entered-in-error
    */
  var status: code = js.native
  /**
    * Name for this study
    */
  var title: js.UndefOr[String] = js.native
}

object ResearchStudy {
  @scala.inline
  def apply(status: code): ResearchStudy = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudy]
  }
  @scala.inline
  implicit class ResearchStudyOps[Self <: ResearchStudy] (val x: Self) extends AnyVal {
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
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
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
    def with_title(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_title")(js.undefined)
        ret
    }
    @scala.inline
    def withArm(value: js.Array[ResearchStudyArm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arm")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: js.Array[CodeableConcept]): Self = {
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
    def withContact(value: js.Array[ContactDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: markdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnrollment(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollment")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
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
    def withJurisdiction(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdiction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJurisdiction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdiction")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyword(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.undefined)
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
    def withPrincipalInvestigator(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalInvestigator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalInvestigator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalInvestigator")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonStopped(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonStopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonStopped")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedArtifact(value: js.Array[RelatedArtifact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedArtifact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedArtifact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedArtifact")(js.undefined)
        ret
    }
    @scala.inline
    def withSite(value: js.Array[Reference]): Self = {
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
    def withSponsor(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sponsor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSponsor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sponsor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

