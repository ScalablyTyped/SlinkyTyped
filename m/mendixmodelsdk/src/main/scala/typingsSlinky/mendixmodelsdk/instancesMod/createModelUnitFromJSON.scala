package typingsSlinky.mendixmodelsdk.instancesMod

import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/instances", "createModelUnitFromJSON")
@js.native
object createModelUnitFromJSON extends js.Object {
  def apply(containerUnit: IStructuralUnit, containmentName: String, contents: IAbstractElementJson): ModelUnit = js.native
}

