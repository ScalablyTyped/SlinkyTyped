package typingsSlinky.forgeDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/InstanceResolver", JSImport.Namespace)
@js.native
object instanceResolverMod extends js.Object {
  @js.native
  trait InstanceResolver
    extends typingsSlinky.forgeDi.resolverMod.default {
    var instance: js.Any = js.native
  }
  
  @js.native
  class default protected () extends InstanceResolver {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      instance: js.Any
    ) = this()
  }
  
}

