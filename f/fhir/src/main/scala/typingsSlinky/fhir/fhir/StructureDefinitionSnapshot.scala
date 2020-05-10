package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Snapshot view of the structure
  */
@js.native
trait StructureDefinitionSnapshot extends BackboneElement {
  /**
    * Definition of elements in the resource (if no StructureDefinition)
    */
  var element: js.Array[ElementDefinition] = js.native
}

object StructureDefinitionSnapshot {
  @scala.inline
  def apply(element: js.Array[ElementDefinition]): StructureDefinitionSnapshot = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinitionSnapshot]
  }
  @scala.inline
  implicit class StructureDefinitionSnapshotOps[Self <: StructureDefinitionSnapshot] (val x: Self) extends AnyVal {
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

