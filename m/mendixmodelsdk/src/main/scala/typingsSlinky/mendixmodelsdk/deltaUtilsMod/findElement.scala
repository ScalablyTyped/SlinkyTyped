package typingsSlinky.mendixmodelsdk.deltaUtilsMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "findElement")
@js.native
object findElement extends js.Object {
  def apply(model: AbstractModel, unit: ModelUnit, elementId: String): AbstractElement | Null = js.native
}

