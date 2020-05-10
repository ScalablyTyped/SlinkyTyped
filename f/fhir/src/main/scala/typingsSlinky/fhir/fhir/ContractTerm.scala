package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ContractTermOps[Self <: ContractTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_issued(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_issued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_issued: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_issued")(js.undefined)
        ret
    }
    @scala.inline
    def with_text(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(js.undefined)
        ret
    }
    @scala.inline
    def withAction(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withActionReason(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionReason")(js.undefined)
        ret
    }
    @scala.inline
    def withAgent(value: js.Array[ContractTermAgent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withApplies(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: js.Array[ContractTerm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
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
    def withIssued(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssued: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityLabel(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSubType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
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
    @scala.inline
    def withValuedItem(value: js.Array[ContractTermValuedItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuedItem")(js.undefined)
        ret
    }
  }
  
}

