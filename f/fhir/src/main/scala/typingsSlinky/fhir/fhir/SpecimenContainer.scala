package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Direct container of specimen (tube/slide, etc.)
  */
@js.native
trait SpecimenContainer extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Additive associated with container
    */
  var additiveCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Additive associated with container
    */
  var additiveReference: js.UndefOr[Reference] = js.native
  /**
    * Container volume or size
    */
  var capacity: js.UndefOr[Quantity] = js.native
  /**
    * Textual description of the container
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Id for the container
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Quantity of specimen within container
    */
  var specimenQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Kind of container directly associated with specimen
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object SpecimenContainer {
  @scala.inline
  def apply(): SpecimenContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenContainer]
  }
  @scala.inline
  implicit class SpecimenContainerOps[Self <: SpecimenContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditiveCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additiveCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditiveCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additiveCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditiveReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additiveReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditiveReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additiveReference")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecimenQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specimenQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecimenQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specimenQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

