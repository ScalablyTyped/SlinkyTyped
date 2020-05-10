package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determine insurance validity and scope of coverage
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait EligibilityRequest extends DomainResource {
  /**
    * Contains extended information for property 'businessArrangement'.
    */
  var _businessArrangement: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'servicedDate'.
    */
  var _servicedDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Type of services covered
    */
  var benefitCategory: js.UndefOr[CodeableConcept] = js.native
  /**
    * Detailed services covered within the type
    */
  var benefitSubCategory: js.UndefOr[CodeableConcept] = js.native
  /**
    * Business agreement
    */
  var businessArrangement: js.UndefOr[String] = js.native
  /**
    * Insurance or medical plan
    */
  var coverage: js.UndefOr[Reference] = js.native
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  /**
    * Author
    */
  var enterer: js.UndefOr[Reference] = js.native
  /**
    * Servicing Facility
    */
  var facility: js.UndefOr[Reference] = js.native
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Target
    */
  var insurer: js.UndefOr[Reference] = js.native
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.native
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * Desired processing priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.native
  /**
    * Responsible practitioner
    */
  var provider: js.UndefOr[Reference] = js.native
  /**
    * Estimated date or dates of Service
    */
  var servicedDate: js.UndefOr[date] = js.native
  /**
    * Estimated date or dates of Service
    */
  var servicedPeriod: js.UndefOr[Period] = js.native
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
}

object EligibilityRequest {
  @scala.inline
  def apply(): EligibilityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EligibilityRequest]
  }
  @scala.inline
  implicit class EligibilityRequestOps[Self <: EligibilityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_businessArrangement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_businessArrangement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_businessArrangement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_businessArrangement")(js.undefined)
        ret
    }
    @scala.inline
    def with_created(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_created: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_created")(js.undefined)
        ret
    }
    @scala.inline
    def with_servicedDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_servicedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_servicedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_servicedDate")(js.undefined)
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
    def withBenefitCategory(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benefitCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBenefitCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benefitCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withBenefitSubCategory(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benefitSubCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBenefitSubCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benefitSubCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessArrangement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessArrangement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessArrangement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessArrangement")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverage(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterer")(js.undefined)
        ret
    }
    @scala.inline
    def withFacility(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facility")(js.undefined)
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
    def withInsurer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insurer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsurer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insurer")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganization(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(js.undefined)
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
    def withPriority(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withServicedDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withServicedPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicedPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicedPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicedPeriod")(js.undefined)
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

