package typingsSlinky.mendixmodelsdk.instancesMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.elementsMod.Element
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsSlinky.mendixmodelsdk.utilsMod.utils.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/instances", "createElementFromJSON")
@js.native
object createElementFromJSON extends js.Object {
  def apply(model: IAbstractModel, json: IAbstractElementJson): Element = js.native
  def apply(model: IAbstractModel, json: IAbstractElementJson, idToStructureMap: IMap[Structure]): Element = js.native
}

