package typingsSlinky.forgeDi

import typingsSlinky.forgeDi.constructorMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-di/dist/resolvers/TypeResolver", JSImport.Namespace)
@js.native
object typeResolverMod extends js.Object {
  
  @js.native
  trait TypeResolver
    extends typingsSlinky.forgeDi.resolverMod.default {
    
    var `type`: Constructor = js.native
  }
  
  @js.native
  class default protected () extends TypeResolver {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      `type`: Constructor
    ) = this()
  }
}
