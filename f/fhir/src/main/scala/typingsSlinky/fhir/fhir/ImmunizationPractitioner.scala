package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who performed event
  */
@js.native
trait ImmunizationPractitioner extends BackboneElement {
  /**
    * Individual who was performing
    */
  var actor: Reference = js.native
  /**
    * What type of performance was done
    */
  var role: js.UndefOr[CodeableConcept] = js.native
}

object ImmunizationPractitioner {
  @scala.inline
  def apply(actor: Reference): ImmunizationPractitioner = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationPractitioner]
  }
  @scala.inline
  implicit class ImmunizationPractitionerOps[Self <: ImmunizationPractitioner] (val x: Self) extends AnyVal {
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
    def withRole(value: CodeableConcept): Self = {
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

