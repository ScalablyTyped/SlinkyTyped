package typingsSlinky.forgeDashDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/InstanceResolver", JSImport.Namespace)
@js.native
object distResolversInstanceResolverMod extends js.Object {
  @js.native
  trait InstanceResolver
    extends typingsSlinky.forgeDashDi.distResolversResolverMod.default {
    var instance: js.Any = js.native
  }
  
  @js.native
  class default protected () extends InstanceResolver {
    def this(
      forge: typingsSlinky.forgeDashDi.distForgeMod.default,
      binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default,
      instance: js.Any
    ) = this()
  }
  
}

