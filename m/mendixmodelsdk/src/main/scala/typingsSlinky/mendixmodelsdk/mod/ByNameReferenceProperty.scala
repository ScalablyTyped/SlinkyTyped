package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "ByNameReferenceProperty")
@js.native
class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
  extends typingsSlinky.mendixmodelsdk.propertiesMod.ByNameReferenceProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement,
    name: String,
    initialValue: T,
    _targetType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement,
    name: String,
    initialValue: Null,
    _targetType: String
  ) = this()
}
