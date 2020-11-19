package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who performed charged service
  */
@js.native
trait ChargeItemParticipant extends BackboneElement {
  
  /**
    * Individual who was performing
    */
  var actor: Reference = js.native
  
  /**
    * What type of performance was done
    */
  var role: js.UndefOr[CodeableConcept] = js.native
}
object ChargeItemParticipant {
  
  @scala.inline
  def apply(actor: Reference): ChargeItemParticipant = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeItemParticipant]
  }
  
  @scala.inline
  implicit class ChargeItemParticipantOps[Self <: ChargeItemParticipant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActor(value: Reference): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: CodeableConcept): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
