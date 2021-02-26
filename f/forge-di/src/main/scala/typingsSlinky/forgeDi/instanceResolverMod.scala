package typingsSlinky.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceResolverMod {
  
  @JSImport("forge-di/dist/resolvers/InstanceResolver", JSImport.Default)
  @js.native
  class default protected () extends InstanceResolver {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      instance: js.Any
    ) = this()
  }
  
  @js.native
  trait InstanceResolver
    extends typingsSlinky.forgeDi.resolverMod.default {
    
    var instance: js.Any = js.native
  }
}
