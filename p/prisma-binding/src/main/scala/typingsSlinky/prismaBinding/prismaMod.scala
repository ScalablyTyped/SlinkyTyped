package typingsSlinky.prismaBinding

import typingsSlinky.graphqlBinding.mod.Binding
import typingsSlinky.prismaBinding.typesMod.Exists
import typingsSlinky.prismaBinding.typesMod.PrismaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prisma-binding/dist/Prisma", JSImport.Namespace)
@js.native
object prismaMod extends js.Object {
  
  @js.native
  class Prisma protected () extends Binding {
    def this(hasTypeDefsEndpointSecretFragmentReplacementsDebugDisableCache: PrismaOptions) = this()
    
    var buildExists: js.Any = js.native
    
    var exists: Exists = js.native
  }
}
