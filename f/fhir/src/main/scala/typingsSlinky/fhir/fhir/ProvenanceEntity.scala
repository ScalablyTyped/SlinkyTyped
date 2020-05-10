package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entity used in this activity
  */
@js.native
trait ProvenanceEntity extends BackboneElement {
  /**
    * Contains extended information for property 'role'.
    */
  var _role: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'whatUri'.
    */
  var _whatUri: js.UndefOr[Element] = js.native
  /**
    * Entity is attributed to this agent
    */
  var agent: js.UndefOr[js.Array[ProvenanceAgent]] = js.native
  /**
    * derivation | revision | quotation | source | removal
    */
  var role: code = js.native
  /**
    * Identity of entity
    */
  var whatIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Identity of entity
    */
  var whatReference: js.UndefOr[Reference] = js.native
  /**
    * Identity of entity
    */
  var whatUri: js.UndefOr[uri] = js.native
}

object ProvenanceEntity {
  @scala.inline
  def apply(role: code): ProvenanceEntity = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvenanceEntity]
  }
  @scala.inline
  implicit class ProvenanceEntityOps[Self <: ProvenanceEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRole(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_role(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_role: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_role")(js.undefined)
        ret
    }
    @scala.inline
    def with_whatUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_whatUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_whatUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_whatUri")(js.undefined)
        ret
    }
    @scala.inline
    def withAgent(value: js.Array[ProvenanceAgent]): Self = {
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
    def withWhatIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whatIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhatIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whatIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withWhatReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whatReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhatReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whatReference")(js.undefined)
        ret
    }
    @scala.inline
    def withWhatUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whatUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhatUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whatUri")(js.undefined)
        ret
    }
  }
  
}

