package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PrimitiveProperty", JSImport.Namespace)
@js.native
object primitivePropertyMod extends js.Object {
  
  @js.native
  class PrimitiveProperty[T] () extends AbstractProperty[T, IObservableValue[T]] {
    
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
