package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "PrimitiveListProperty")
@js.native
class PrimitiveListProperty[T] protected ()
  extends typingsSlinky.mendixmodelsdk.propertiesMod.PrimitiveListProperty[T] {
  /**
    * parent is the structure that the value of this property attaches to,
    * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
    *    item.container === this.parent.
    *
    * initialValue is default value except parts and GUID-typed primitives.
    * (by-id/name references do not have default values.)
    */
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
    name: String,
    initialValue: js.Array[T],
    moreArgs: js.Any*
  ) = this()
}
