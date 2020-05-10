package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class PatientAnimalOps[Self <: PatientAnimal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpecies(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("species")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreed(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breed")(js.undefined)
        ret
    }
    @scala.inline
    def withGenderStatus(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genderStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenderStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genderStatus")(js.undefined)
        ret
    }
  }
  
}

