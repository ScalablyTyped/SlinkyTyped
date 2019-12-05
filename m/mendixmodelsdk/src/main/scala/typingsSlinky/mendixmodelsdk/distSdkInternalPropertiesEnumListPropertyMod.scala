package typingsSlinky.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.distSdkInternalPropertiesPrimitiveListPropertyMod.PrimitiveListProperty
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typingsSlinky.mendixmodelsdk.distSdkInternalVersionChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/EnumListProperty", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesEnumListPropertyMod extends js.Object {
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

