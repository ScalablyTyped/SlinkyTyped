package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.byIdReferenceMod.ByIdReference
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/ByIdReferenceProperty", JSImport.Namespace)
@js.native
object byIdReferencePropertyMod extends js.Object {
  
  @js.native
  class ByIdReferenceProperty[T /* <: AbstractElement */] () extends AbstractProperty[T | Null, ByIdReference[T]] {
    
    @JSName("parent")
    var parent_ByIdReferenceProperty: AbstractElement = js.native
    
    def resolveReference(): Unit = js.native
    
    def set(): Unit = js.native
    def set(value: T): Unit = js.native
    
    def updateElementContainer(): Unit = js.native
    
    def updateWithRawValue(value: String): Unit = js.native
  }
}
