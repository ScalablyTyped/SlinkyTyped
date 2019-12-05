package typingsSlinky.forgeDashDi

import typingsSlinky.forgeDashDi.distFrameworkConstructorMod.Constructor
import typingsSlinky.forgeDashDi.distResolversTypeResolverMod.TypeResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/TypeResolver", JSImport.Namespace)
@js.native
object distResolversTypeResolverMod extends js.Object {
  @js.native
  trait TypeResolver
    extends typingsSlinky.forgeDashDi.distResolversResolverMod.default {
    var `type`: Constructor = js.native
  }
  
  @js.native
  class default protected () extends TypeResolver {
    def this(
      forge: typingsSlinky.forgeDashDi.distForgeMod.default,
      binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
}

