package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait ResearchSubject extends DomainResource {
  /**
    * Contains extended information for property 'actualArm'.
    */
  var _actualArm: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'assignedArm'.
    */
  var _assignedArm: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * What path was followed
    */
  var actualArm: js.UndefOr[String] = js.native
  /**
    * What path should be followed
    */
  var assignedArm: js.UndefOr[String] = js.native
  /**
    * Agreement to participate in study
    */
  var consent: js.UndefOr[Reference] = js.native
  /**
    * Business Identifier for research subject
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Who is part of study
    */
  var individual: Reference = js.native
  /**
    * Start and end of participation
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * candidate | enrolled | active | suspended | withdrawn | completed
    */
  var status: code = js.native
  /**
    * Study subject is part of
    */
  var study: Reference = js.native
}

object ResearchSubject {
  @scala.inline
  def apply(individual: Reference, status: code, study: Reference): ResearchSubject = {
    val __obj = js.Dynamic.literal(individual = individual.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchSubject]
  }
  @scala.inline
  implicit class ResearchSubjectOps[Self <: ResearchSubject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndividual(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStudy(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("study")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_actualArm(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_actualArm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_actualArm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_actualArm")(js.undefined)
        ret
    }
    @scala.inline
    def with_assignedArm(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_assignedArm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_assignedArm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_assignedArm")(js.undefined)
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
    def withActualArm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualArm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualArm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualArm")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignedArm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedArm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedArm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedArm")(js.undefined)
        ret
    }
    @scala.inline
    def withConsent(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consent")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
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
  }
  
}

