package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "StructuralChildProperty")
@js.native
class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typingsSlinky.mendixmodelsdk.propertiesMod.StructuralChildProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
    name: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: T
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: T,
    targetRefType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: Null,
    targetRefType: String
  ) = this()
}
