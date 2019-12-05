package typingsSlinky.prismaDashBinding

import typingsSlinky.graphqlDashBinding.graphqlDashBindingMod.Binding
import typingsSlinky.prismaDashBinding.distTypesMod.Exists
import typingsSlinky.prismaDashBinding.distTypesMod.PrismaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/Prisma", JSImport.Namespace)
@js.native
object distPrismaMod extends js.Object {
  @js.native
  class Prisma protected () extends Binding {
    def this(hasTypeDefsEndpointSecretFragmentReplacementsDebugDisableCache: PrismaOptions) = this()
    var buildExists: js.Any = js.native
    var exists: Exists = js.native
  }
  
}

