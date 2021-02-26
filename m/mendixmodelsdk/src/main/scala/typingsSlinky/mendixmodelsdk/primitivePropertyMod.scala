package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivePropertyMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/PrimitiveProperty", "PrimitiveProperty")
  @js.native
  class PrimitiveProperty[T] protected () extends AbstractProperty[T, IObservableValue[T]] {
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
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
    
    var beforeChange: js.Any = js.native
    
    def deepCopyInto(clone: Structure[IAbstractModel, IContainer | Null]): Unit = js.native
    
    var defaultValue: T = js.native
    
    /* protected */ def getRawValue(value: T): js.Any = js.native
    
    def markCurrentValueAsDefault(): Unit = js.native
    
    var primitiveType: js.Any = js.native
    
    def set(newValue: T): Unit = js.native
    
    def updateWithRawValue(value: T): Unit = js.native
  }
}
