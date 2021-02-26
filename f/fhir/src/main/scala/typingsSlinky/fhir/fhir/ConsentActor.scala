package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who|what controlled by this consent (or group, by role)
  */
@js.native
trait ConsentActor extends BackboneElement {
  
  /**
    * Resource for the actor (or group, by role)
    */
  var reference: Reference = js.native
  
  /**
    * How the actor is involved
    */
  var role: CodeableConcept = js.native
}
object ConsentActor {
  
  @scala.inline
  def apply(reference: Reference, role: CodeableConcept): ConsentActor = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentActor]
  }
  
  @scala.inline
  implicit class ConsentActorMutableBuilder[Self <: ConsentActor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
