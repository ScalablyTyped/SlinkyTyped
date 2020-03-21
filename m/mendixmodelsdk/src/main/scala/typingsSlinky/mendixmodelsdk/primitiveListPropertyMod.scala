package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PrimitiveListProperty", JSImport.Namespace)
@js.native
object primitiveListPropertyMod extends js.Object {
  @js.native
  class PrimitiveListProperty[T] ()
    extends AbstractProperty[js.Array[T], IList[T]] {
    var primitiveType: js.Any = js.native
    def deepCopyInto(clone: Structure): Unit = js.native
    def updateWithRawValue(value: js.Array[T]): Unit = js.native
  }
  
}

