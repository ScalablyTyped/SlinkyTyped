package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insurance or medical plan or a payment agreement
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Coverage extends DomainResource {
  /**
    * Contains extended information for property 'dependent'.
    */
  var _dependent: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'network'.
    */
  var _network: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'order'.
    */
  var _order: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'subscriberId'.
    */
  var _subscriberId: js.UndefOr[Element] = js.native
  /**
    * Plan Beneficiary
    */
  var beneficiary: js.UndefOr[Reference] = js.native
  /**
    * Contract details
    */
  var contract: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Dependent number
    */
  var dependent: js.UndefOr[String] = js.native
  /**
    * Additional coverage classifications
    */
  var grouping: js.UndefOr[CoverageGrouping] = js.native
  /**
    * The primary coverage ID
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Insurer network
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Relative order of the coverage
    */
  var order: js.UndefOr[positiveInt] = js.native
  /**
    * Identifier for the plan or agreement issuer
    */
  var payor: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Coverage start and end dates
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Owner of the policy
    */
  var policyHolder: js.UndefOr[Reference] = js.native
  /**
    * Beneficiary relationship to the Subscriber
    */
  var relationship: js.UndefOr[CodeableConcept] = js.native
  /**
    * The plan instance or sequence counter
    */
  var sequence: js.UndefOr[String] = js.native
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Subscriber to the policy
    */
  var subscriber: js.UndefOr[Reference] = js.native
  /**
    * ID assigned to the Subscriber
    */
  var subscriberId: js.UndefOr[String] = js.native
  /**
    * Type of coverage such as medical or accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object Coverage {
  @scala.inline
  def apply(): Coverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coverage]
  }
  @scala.inline
  implicit class CoverageOps[Self <: Coverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_dependent(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dependent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_dependent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dependent")(js.undefined)
        ret
    }
    @scala.inline
    def with_network(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_network: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_network")(js.undefined)
        ret
    }
    @scala.inline
    def with_order(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_order: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_order")(js.undefined)
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
    def with_subscriberId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subscriberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_subscriberId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subscriberId")(js.undefined)
        ret
    }
    @scala.inline
    def withBeneficiary(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beneficiary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeneficiary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beneficiary")(js.undefined)
        ret
    }
    @scala.inline
    def withContract(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract")(js.undefined)
        ret
    }
    @scala.inline
    def withDependent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependent")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: CoverageGrouping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
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
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withPayor(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payor")(js.undefined)
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
    def withPolicyHolder(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationship(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationship: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(js.undefined)
        ret
    }
    @scala.inline
    def withSequence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
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
    def withSubscriber(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriber")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriberId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriberId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

