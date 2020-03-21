package typingsSlinky.mendixmodelsdk.internalMod

import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralChildListProperty")
@js.native
class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String,
    value: js.Array[T]
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String,
    value: js.Array[T],
    targetRefType: String
  ) = this()
}

