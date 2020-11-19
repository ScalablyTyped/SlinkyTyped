package typingsSlinky.prismaBinding

import typingsSlinky.graphqlBinding.mod.TypescriptGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prisma-binding/dist/PrismaTypescriptGenerator", JSImport.Namespace)
@js.native
object prismaTypescriptGeneratorMod extends js.Object {
  
  @js.native
  class PrismaTypescriptGenerator protected () extends TypescriptGenerator {
    def this(options: js.Any) = this()
    
    def renderExists(): String = js.native
    
    def renderTypedefs(): String = js.native
  }
}
