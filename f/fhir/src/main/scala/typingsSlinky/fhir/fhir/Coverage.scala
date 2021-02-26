package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class CoverageMutableBuilder[Self <: Coverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeneficiary(value: Reference): Self = StObject.set(x, "beneficiary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeneficiaryUndefined: Self = StObject.set(x, "beneficiary", js.undefined)
    
    @scala.inline
    def setContract(value: js.Array[Reference]): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContractUndefined: Self = StObject.set(x, "contract", js.undefined)
    
    @scala.inline
    def setContractVarargs(value: Reference*): Self = StObject.set(x, "contract", js.Array(value :_*))
    
    @scala.inline
    def setDependent(value: String): Self = StObject.set(x, "dependent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentUndefined: Self = StObject.set(x, "dependent", js.undefined)
    
    @scala.inline
    def setGrouping(value: CoverageGrouping): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setOrder(value: positiveInt): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPayor(value: js.Array[Reference]): Self = StObject.set(x, "payor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayorUndefined: Self = StObject.set(x, "payor", js.undefined)
    
    @scala.inline
    def setPayorVarargs(value: Reference*): Self = StObject.set(x, "payor", js.Array(value :_*))
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setPolicyHolder(value: Reference): Self = StObject.set(x, "policyHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyHolderUndefined: Self = StObject.set(x, "policyHolder", js.undefined)
    
    @scala.inline
    def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    @scala.inline
    def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubscriber(value: Reference): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberId(value: String): Self = StObject.set(x, "subscriberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberIdUndefined: Self = StObject.set(x, "subscriberId", js.undefined)
    
    @scala.inline
    def setSubscriberUndefined: Self = StObject.set(x, "subscriber", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_dependent(value: Element): Self = StObject.set(x, "_dependent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dependentUndefined: Self = StObject.set(x, "_dependent", js.undefined)
    
    @scala.inline
    def set_network(value: Element): Self = StObject.set(x, "_network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_networkUndefined: Self = StObject.set(x, "_network", js.undefined)
    
    @scala.inline
    def set_order(value: Element): Self = StObject.set(x, "_order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_orderUndefined: Self = StObject.set(x, "_order", js.undefined)
    
    @scala.inline
    def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_subscriberId(value: Element): Self = StObject.set(x, "_subscriberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_subscriberIdUndefined: Self = StObject.set(x, "_subscriberId", js.undefined)
  }
}
