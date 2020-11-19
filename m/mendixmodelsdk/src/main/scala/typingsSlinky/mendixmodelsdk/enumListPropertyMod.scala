package typingsSlinky.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.primitiveListPropertyMod.PrimitiveListProperty
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/EnumListProperty", JSImport.Namespace)
@js.native
object enumListPropertyMod extends js.Object {
  
  @js.native
  class EnumListProperty[T /* <: AbstractEnum */] protected () extends PrimitiveListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
    
    var enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum] = js.native
    
    var initialValue: js.Any = js.native
  }
}
