package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract Term List
  */
@js.native
trait ContractTerm extends BackboneElement {
  
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Contract Term Activity
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Purpose for the Contract Term Action
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Contract Term Agent List
    */
  var agent: js.UndefOr[js.Array[ContractTermAgent]] = js.native
  
  /**
    * Contract Term Effective Time
    */
  var applies: js.UndefOr[Period] = js.native
  
  /**
    * Nested Contract Term Group
    */
  var group: js.UndefOr[js.Array[ContractTerm]] = js.native
  
  /**
    * Contract Term Number
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Contract Term Issue Date Time
    */
  var issued: js.UndefOr[dateTime] = js.native
  
  /**
    * Security Labels that define affected terms
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * Contract Term Type specific classification
    */
  var subType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Human readable Contract term text
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Context of the Contract term
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Contract Term Type or Form
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Contract Term Valued Item List
    */
  var valuedItem: js.UndefOr[js.Array[ContractTermValuedItem]] = js.native
}
object ContractTerm {
  
  @scala.inline
  def apply(): ContractTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTerm]
  }
  
  @scala.inline
  implicit class ContractTermMutableBuilder[Self <: ContractTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "actionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionReasonUndefined: Self = StObject.set(x, "actionReason", js.undefined)
    
    @scala.inline
    def setActionReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "actionReason", js.Array(value :_*))
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    @scala.inline
    def setAgent(value: js.Array[ContractTermAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    @scala.inline
    def setAgentVarargs(value: ContractTermAgent*): Self = StObject.set(x, "agent", js.Array(value :_*))
    
    @scala.inline
    def setApplies(value: Period): Self = StObject.set(x, "applies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliesUndefined: Self = StObject.set(x, "applies", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Array[ContractTerm]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: ContractTerm*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIssued(value: dateTime): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    @scala.inline
    def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    @scala.inline
    def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value :_*))
    
    @scala.inline
    def setSubType(value: CodeableConcept): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTopic(value: js.Array[Reference]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    @scala.inline
    def setTopicVarargs(value: Reference*): Self = StObject.set(x, "topic", js.Array(value :_*))
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValuedItem(value: js.Array[ContractTermValuedItem]): Self = StObject.set(x, "valuedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuedItemUndefined: Self = StObject.set(x, "valuedItem", js.undefined)
    
    @scala.inline
    def setValuedItemVarargs(value: ContractTermValuedItem*): Self = StObject.set(x, "valuedItem", js.Array(value :_*))
    
    @scala.inline
    def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
