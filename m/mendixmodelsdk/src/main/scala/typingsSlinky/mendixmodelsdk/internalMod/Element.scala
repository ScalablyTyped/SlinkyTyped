package typingsSlinky.mendixmodelsdk.internalMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal", "Element")
@js.native
abstract class Element[TModel /* <: IAbstractModel */] protected ()
  extends typingsSlinky.mendixmodelsdk.elementsMod.Element[TModel] {
  def this(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel],
    container: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container]
  ) = this()
}
