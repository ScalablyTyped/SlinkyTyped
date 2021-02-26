package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "StructuralChildListProperty")
@js.native
class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: js.Array[T]
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: js.Array[T],
    targetRefType: String
  ) = this()
}
