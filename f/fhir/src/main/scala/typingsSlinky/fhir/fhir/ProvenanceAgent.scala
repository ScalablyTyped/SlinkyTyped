package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Actor involved
  */
@js.native
trait ProvenanceAgent extends BackboneElement {
  /**
    * Contains extended information for property 'onBehalfOfUri'.
    */
  var _onBehalfOfUri: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'whoUri'.
    */
  var _whoUri: js.UndefOr[Element] = js.native
  /**
    * Who the agent is representing
    */
  var onBehalfOfReference: js.UndefOr[Reference] = js.native
  /**
    * Who the agent is representing
    */
  var onBehalfOfUri: js.UndefOr[uri] = js.native
  /**
    * Type of relationship between agents
    */
  var relatedAgentType: js.UndefOr[CodeableConcept] = js.native
  /**
    * What the agents role was
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Who participated
    */
  var whoReference: js.UndefOr[Reference] = js.native
  /**
    * Who participated
    */
  var whoUri: js.UndefOr[uri] = js.native
}

object ProvenanceAgent {
  @scala.inline
  def apply(): ProvenanceAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvenanceAgent]
  }
  @scala.inline
  implicit class ProvenanceAgentOps[Self <: ProvenanceAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_onBehalfOfUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onBehalfOfUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_onBehalfOfUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onBehalfOfUri")(js.undefined)
        ret
    }
    @scala.inline
    def with_whoUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_whoUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_whoUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_whoUri")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBehalfOfReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBehalfOfReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfReference")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBehalfOfUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBehalfOfUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfUri")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedAgentType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedAgentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedAgentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedAgentType")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoReference")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoUri")(js.undefined)
        ret
    }
  }
  
}

