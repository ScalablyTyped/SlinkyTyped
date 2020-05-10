package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who|what controlled by this exception (or group, by role)
  */
@js.native
trait ConsentExceptActor extends BackboneElement {
  /**
    * Resource for the actor (or group, by role)
    */
  var reference: Reference = js.native
  /**
    * How the actor is involved
    */
  var role: CodeableConcept = js.native
}

object ConsentExceptActor {
  @scala.inline
  def apply(reference: Reference, role: CodeableConcept): ConsentExceptActor = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentExceptActor]
  }
  @scala.inline
  implicit class ConsentExceptActorOps[Self <: ConsentExceptActor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

