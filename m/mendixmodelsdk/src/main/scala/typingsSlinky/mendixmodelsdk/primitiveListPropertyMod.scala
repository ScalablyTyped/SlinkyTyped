package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PrimitiveListProperty", JSImport.Namespace)
@js.native
object primitiveListPropertyMod extends js.Object {
  
  @js.native
  class PrimitiveListProperty[T] ()
    extends AbstractProperty[js.Array[T], IList[T]] {
    
    def deepCopyInto(clone: Structure[IAbstractModel, IContainer | Null]): Unit = js.native
    
    var primitiveType: js.Any = js.native
    
    def updateWithRawValue(value: js.Array[T]): Unit = js.native
  }
}
