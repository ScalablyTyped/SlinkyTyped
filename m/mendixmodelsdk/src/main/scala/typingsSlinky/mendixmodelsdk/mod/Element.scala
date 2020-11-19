package typingsSlinky.mendixmodelsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "Element")
@js.native
abstract class Element protected ()
  extends typingsSlinky.mendixmodelsdk.internalMod.Element {
  def this(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
  ) = this()
}
