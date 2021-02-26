package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitiveListPropertyMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/PrimitiveListProperty", "PrimitiveListProperty")
  @js.native
  class PrimitiveListProperty[T] protected ()
    extends AbstractProperty[js.Array[T], IList[T]] {
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
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: js.Any*
    ) = this()
    
    def deepCopyInto(clone: Structure[IAbstractModel, IContainer | Null]): Unit = js.native
    
    var primitiveType: js.Any = js.native
    
    def updateWithRawValue(value: js.Array[T]): Unit = js.native
  }
}
