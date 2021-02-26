package typingsSlinky.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionResolverMod {
  
  @JSImport("forge-di/dist/resolvers/FunctionResolver", JSImport.Default)
  @js.native
  class default protected () extends FunctionResolver {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @js.native
  trait FunctionResolver
    extends typingsSlinky.forgeDi.resolverMod.default {
    
    var func: js.Function = js.native
  }
}
