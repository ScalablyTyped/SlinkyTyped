package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "StructuralUnit")
@js.native
abstract class StructuralUnit protected ()
  extends typingsSlinky.mendixmodelsdk.internalMod.StructuralUnit {
  def this(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _ignoredIsPartial: Boolean,
    container: IStructuralUnit
  ) = this()
}

