package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Term Agent List
  */
@js.native
trait ContractTermAgent extends BackboneElement {
  /**
    * Contract Term Agent Subject
    */
  var actor: Reference = js.native
  /**
    * Type of the Contract Term Agent
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object ContractTermAgent {
  @scala.inline
  def apply(actor: Reference): ContractTermAgent = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractTermAgent]
  }
  @scala.inline
  implicit class ContractTermAgentOps[Self <: ContractTermAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActor(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(value.asInstanceOf[js.Any])
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
  }
  
}

