package typingsSlinky.forgeDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-di/dist/resolvers/FunctionResolver", JSImport.Namespace)
@js.native
object functionResolverMod extends js.Object {
  
  @js.native
  trait FunctionResolver
    extends typingsSlinky.forgeDi.resolverMod.default {
    
    var func: js.Function = js.native
  }
  
  @js.native
  class default protected () extends FunctionResolver {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      func: js.Function
    ) = this()
  }
}
