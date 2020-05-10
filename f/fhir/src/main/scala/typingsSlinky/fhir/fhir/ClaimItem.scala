package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Goods and Services
  */
@js.native
trait ClaimItem extends BackboneElement {
  /**
    * Contains extended information for property 'careTeamLinkId'.
    */
  var _careTeamLinkId: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'diagnosisLinkId'.
    */
  var _diagnosisLinkId: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'informationLinkId'.
    */
  var _informationLinkId: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'procedureLinkId'.
    */
  var _procedureLinkId: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'servicedDate'.
    */
  var _servicedDate: js.UndefOr[Element] = js.native
  /**
    * Service Location
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.native
  /**
    * Applicable careTeam members
    */
  var careTeamLinkId: js.UndefOr[js.Array[positiveInt]] = js.native
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Additional items
    */
  var detail: js.UndefOr[js.Array[ClaimItemDetail]] = js.native
  /**
    * Applicable diagnoses
    */
  var diagnosisLinkId: js.UndefOr[js.Array[positiveInt]] = js.native
  /**
    * Encounters related to this billed item
    */
  var encounter: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Price scaling factor
    */
  var factor: js.UndefOr[decimal] = js.native
  /**
    * Applicable exception and supporting information
    */
  var informationLinkId: js.UndefOr[js.Array[positiveInt]] = js.native
  /**
    * Place of service
    */
  var locationAddress: js.UndefOr[Address] = js.native
  /**
    * Place of service
    */
  var locationCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Place of service
    */
  var locationReference: js.UndefOr[Reference] = js.native
  /**
    * Service/Product billing modifiers
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Total item cost
    */
  var net: js.UndefOr[Money] = js.native
  /**
    * Applicable procedures
    */
  var procedureLinkId: js.UndefOr[js.Array[positiveInt]] = js.native
  /**
    * Program specific reason for item inclusion
    */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Count of Products or Services
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Revenue or cost center code
    */
  var revenue: js.UndefOr[CodeableConcept] = js.native
  /**
    * Service instance
    */
  var sequence: positiveInt = js.native
  /**
    * Billing Code
    */
  var service: js.UndefOr[CodeableConcept] = js.native
  /**
    * Date or dates of Service
    */
  var servicedDate: js.UndefOr[date] = js.native
  /**
    * Date or dates of Service
    */
  var servicedPeriod: js.UndefOr[Period] = js.native
  /**
    * Service Sub-location
    */
  var subSite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Unique Device Identifier
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Fee, charge or cost per point
    */
  var unitPrice: js.UndefOr[Money] = js.native
}

object ClaimItem {
  @scala.inline
  def apply(sequence: positiveInt): ClaimItem = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimItem]
  }
  @scala.inline
  implicit class ClaimItemOps[Self <: ClaimItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSequence(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_careTeamLinkId(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_careTeamLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_careTeamLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_careTeamLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def with_diagnosisLinkId(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_diagnosisLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_diagnosisLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_diagnosisLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def with_factor(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_factor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_factor")(js.undefined)
        ret
    }
    @scala.inline
    def with_informationLinkId(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_informationLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_informationLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_informationLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def with_procedureLinkId(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_procedureLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_procedureLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_procedureLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def with_sequence(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sequence")(js.undefined)
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
    def withBodySite(value: CodeableConcept): Self = {
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
    def withCareTeamLinkId(value: js.Array[positiveInt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("careTeamLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCareTeamLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("careTeamLinkId")(js.undefined)
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
    def withDetail(value: js.Array[ClaimItemDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnosisLinkId(value: js.Array[positiveInt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosisLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosisLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosisLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def withEncounter(value: js.Array[Reference]): Self = {
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
    def withFactor(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withInformationLinkId(value: js.Array[positiveInt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("informationLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInformationLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("informationLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationReference")(js.undefined)
        ret
    }
    @scala.inline
    def withModifier(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(js.undefined)
        ret
    }
    @scala.inline
    def withNet(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("net")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("net")(js.undefined)
        ret
    }
    @scala.inline
    def withProcedureLinkId(value: js.Array[positiveInt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedureLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcedureLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedureLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programCode")(js.undefined)
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
    def withRevenue(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revenue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevenue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revenue")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
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
    def withSubSite(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subSite")(js.undefined)
        ret
    }
    @scala.inline
    def withUdi(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUdi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udi")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitPrice(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPrice")(js.undefined)
        ret
    }
  }
  
}

