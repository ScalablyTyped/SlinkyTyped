package typingsSlinky.mendixmodelsdk.internalMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.utilsMod.utils.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "createElementFromJSON")
@js.native
object createElementFromJSON extends js.Object {
  def apply(model: IAbstractModel, json: IAbstractElementJson): typingsSlinky.mendixmodelsdk.elementsMod.Element = js.native
  def apply(
    model: IAbstractModel,
    json: IAbstractElementJson,
    idToStructureMap: IMap[typingsSlinky.mendixmodelsdk.structuresMod.Structure]
  ): typingsSlinky.mendixmodelsdk.elementsMod.Element = js.native
}

