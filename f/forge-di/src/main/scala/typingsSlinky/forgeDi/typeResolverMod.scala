package typingsSlinky.forgeDi

import typingsSlinky.forgeDi.constructorMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeResolverMod {
  
  @JSImport("forge-di/dist/resolvers/TypeResolver", JSImport.Default)
  @js.native
  class default protected () extends TypeResolver {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  @js.native
  trait TypeResolver
    extends typingsSlinky.forgeDi.resolverMod.default {
    
    var `type`: Constructor = js.native
  }
}
