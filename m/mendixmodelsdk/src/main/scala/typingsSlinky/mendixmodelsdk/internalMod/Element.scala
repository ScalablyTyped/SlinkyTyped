package typingsSlinky.mendixmodelsdk.internalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "Element")
@js.native
abstract class Element protected ()
  extends typingsSlinky.mendixmodelsdk.elementsMod.Element {
  def this(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
  ) = this()
}

