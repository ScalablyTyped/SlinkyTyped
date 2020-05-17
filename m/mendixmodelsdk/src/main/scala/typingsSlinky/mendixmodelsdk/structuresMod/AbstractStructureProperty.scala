package typingsSlinky.mendixmodelsdk.structuresMod

import typingsSlinky.mendixmodelsdk.propertiesMod.PartListProperty
import typingsSlinky.mendixmodelsdk.propertiesMod.PartProperty
import typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildListProperty
import typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.propertiesMod.PartProperty[js.Any]
  - typingsSlinky.mendixmodelsdk.propertiesMod.PartListProperty[js.Any]
  - typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildProperty[js.Any]
  - typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildListProperty[js.Any]
*/
trait AbstractStructureProperty extends js.Object

object AbstractStructureProperty {
  @scala.inline
  implicit def apply(value: PartListProperty[js.Any]): AbstractStructureProperty = value.asInstanceOf[AbstractStructureProperty]
  @scala.inline
  implicit def apply(value: PartProperty[js.Any]): AbstractStructureProperty = value.asInstanceOf[AbstractStructureProperty]
  @scala.inline
  implicit def apply(value: StructuralChildListProperty[js.Any]): AbstractStructureProperty = value.asInstanceOf[AbstractStructureProperty]
  @scala.inline
  implicit def apply(value: StructuralChildProperty[js.Any]): AbstractStructureProperty = value.asInstanceOf[AbstractStructureProperty]
}

