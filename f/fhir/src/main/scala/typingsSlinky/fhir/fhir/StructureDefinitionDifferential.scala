package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Differential view of the structure
  */
@js.native
trait StructureDefinitionDifferential extends BackboneElement {
  /**
    * Definition of elements in the resource (if no StructureDefinition)
    */
  var element: js.Array[ElementDefinition] = js.native
}

object StructureDefinitionDifferential {
  @scala.inline
  def apply(element: js.Array[ElementDefinition]): StructureDefinitionDifferential = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinitionDifferential]
  }
  @scala.inline
  implicit class StructureDefinitionDifferentialOps[Self <: StructureDefinitionDifferential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: js.Array[ElementDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

