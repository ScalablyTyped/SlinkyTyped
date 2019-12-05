package typingsSlinky.mendixmodelsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSdkInternalStructuresMod {
  import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesMod.PartListProperty
  import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesMod.PartProperty
  import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesMod.StructuralChildListProperty
  import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesMod.StructuralChildProperty

  type AbstractStructureProperty = PartProperty[js.Any] | PartListProperty[js.Any] | StructuralChildProperty[js.Any] | StructuralChildListProperty[js.Any]
}
