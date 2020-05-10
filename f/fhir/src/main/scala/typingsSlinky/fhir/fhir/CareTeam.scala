package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Planned participants in the coordination and delivery of care for a patient or group
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait CareTeam extends DomainResource {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Type of team
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Encounter or episode associated with CareTeam
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * External Ids for this team
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Organization responsible for the care team
    */
  var managingOrganization: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Name of the team, such as crisis assessment team
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Comments made about the CareTeam
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Members of the team
    */
  var participant: js.UndefOr[js.Array[CareTeamParticipant]] = js.native
  /**
    * Time period team covers
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Why the care team exists
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Why the care team exists
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * proposed | active | suspended | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Who care team is for
    */
  var subject: js.UndefOr[Reference] = js.native
}

object CareTeam {
  @scala.inline
  def apply(): CareTeam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CareTeam]
  }
  @scala.inline
  implicit class CareTeamOps[Self <: CareTeam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_name(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(js.undefined)
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
    def withManagingOrganization(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managingOrganization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagingOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managingOrganization")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withParticipant(value: js.Array[CareTeamParticipant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participant")(js.undefined)
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
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
  }
  
}

