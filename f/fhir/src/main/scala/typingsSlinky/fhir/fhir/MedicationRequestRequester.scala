package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who/What requested the Request
  */
@js.native
trait MedicationRequestRequester extends BackboneElement {
  /**
    * Who ordered the initial medication(s)
    */
  var agent: Reference = js.native
  /**
    * Organization agent is acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.native
}

object MedicationRequestRequester {
  @scala.inline
  def apply(agent: Reference): MedicationRequestRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationRequestRequester]
  }
  @scala.inline
  implicit class MedicationRequestRequesterOps[Self <: MedicationRequestRequester] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBehalfOf(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBehalfOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOf")(js.undefined)
        ret
    }
  }
  
}

