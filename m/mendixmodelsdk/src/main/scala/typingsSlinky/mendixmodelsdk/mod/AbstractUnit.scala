package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "AbstractUnit")
@js.native
abstract class AbstractUnit protected ()
  extends typingsSlinky.mendixmodelsdk.internalMod.AbstractUnit {
  def this(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
}
