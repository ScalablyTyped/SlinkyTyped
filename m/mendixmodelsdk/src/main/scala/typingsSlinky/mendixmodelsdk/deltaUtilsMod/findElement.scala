package typingsSlinky.mendixmodelsdk.deltaUtilsMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "findElement")
@js.native
object findElement extends js.Object {
  
  def apply(model: AbstractModel, unit: ModelUnit[IAbstractModel], elementId: String): (AbstractElement[IAbstractModel, Container]) | Null = js.native
}
