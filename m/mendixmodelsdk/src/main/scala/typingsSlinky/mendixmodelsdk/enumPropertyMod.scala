package typingsSlinky.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.primitivePropertyMod.PrimitiveProperty
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumPropertyMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/EnumProperty", "EnumProperty")
  @js.native
  class EnumProperty[T /* <: AbstractEnum */] protected () extends PrimitiveProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
    
    var enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum] = js.native
    
    var initialValue: js.Any = js.native
  }
}
