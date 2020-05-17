package typingsSlinky.mendixmodelsdk.unitsMod

import typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
trait IModelUnit extends IAbstractElement {
  @JSName("container")
  val container_IModelUnit: IStructuralUnit = js.native
  def delete(): Unit = js.native
}

