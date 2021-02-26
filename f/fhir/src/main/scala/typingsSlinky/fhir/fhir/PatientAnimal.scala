package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This patient is known to be an animal (non-human)
  */
@js.native
trait PatientAnimal extends BackboneElement {
  
  /**
    * E.g. Poodle, Angus
    */
  var breed: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * E.g. Neutered, Intact
    */
  var genderStatus: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * E.g. Dog, Cow
    */
  var species: CodeableConcept = js.native
}
object PatientAnimal {
  
  @scala.inline
  def apply(species: CodeableConcept): PatientAnimal = {
    val __obj = js.Dynamic.literal(species = species.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientAnimal]
  }
  
  @scala.inline
  implicit class PatientAnimalMutableBuilder[Self <: PatientAnimal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreed(value: CodeableConcept): Self = StObject.set(x, "breed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreedUndefined: Self = StObject.set(x, "breed", js.undefined)
    
    @scala.inline
    def setGenderStatus(value: CodeableConcept): Self = StObject.set(x, "genderStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderStatusUndefined: Self = StObject.set(x, "genderStatus", js.undefined)
    
    @scala.inline
    def setSpecies(value: CodeableConcept): Self = StObject.set(x, "species", value.asInstanceOf[js.Any])
  }
}
