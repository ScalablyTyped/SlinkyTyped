package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Actor involved in the event
  */
@js.native
trait AuditEventAgent extends BackboneElement {
  /**
    * Contains extended information for property 'altId'.
    */
  var _altId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'policy'.
    */
  var _policy: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'requestor'.
    */
  var _requestor: js.UndefOr[Element] = js.native
  /**
    * Alternative User id e.g. authentication
    */
  var altId: js.UndefOr[String] = js.native
  /**
    * Where
    */
  var location: js.UndefOr[Reference] = js.native
  /**
    * Type of media
    */
  var media: js.UndefOr[Coding] = js.native
  /**
    * Human-meaningful name for the agent
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Logical network location for application activity
    */
  var network: js.UndefOr[AuditEventAgentNetwork] = js.native
  /**
    * Policy that authorized event
    */
  var policy: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Reason given for this user
    */
  var purposeOfUse: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Direct reference to resource
    */
  var reference: js.UndefOr[Reference] = js.native
  /**
    * Whether user is initiator
    */
  var requestor: Boolean = js.native
  /**
    * Agent role in the event
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Unique identifier for the user
    */
  var userId: js.UndefOr[Identifier] = js.native
}

object AuditEventAgent {
  @scala.inline
  def apply(requestor: Boolean): AuditEventAgent = {
    val __obj = js.Dynamic.literal(requestor = requestor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventAgent]
  }
  @scala.inline
  implicit class AuditEventAgentOps[Self <: AuditEventAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_altId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_altId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_altId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_altId")(js.undefined)
        ret
    }
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
    def with_policy(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_policy")(js.undefined)
        ret
    }
    @scala.inline
    def with_requestor(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_requestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requestor")(js.undefined)
        ret
    }
    @scala.inline
    def withAltId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
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
    def withNetwork(value: AuditEventAgentNetwork): Self = {
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
    def withPolicy(value: js.Array[uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withPurposeOfUse(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purposeOfUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurposeOfUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purposeOfUse")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
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
    def withUserId(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

