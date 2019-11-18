package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typingsSlinky.atAngularCompiler.srcCoreMod.Pipe
import typingsSlinky.atAngularCompiler.srcCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/pipe_resolver", JSImport.Namespace)
@js.native
object srcPipeUnderscoreResolverMod extends js.Object {
  @js.native
  class PipeResolver protected () extends js.Object {
    def this(_reflector: CompileReflector) = this()
    var _reflector: js.Any = js.native
    def isPipe(`type`: Type): Boolean = js.native
    /**
      * Return {@link Pipe} for a given `Type`.
      */
    def resolve(`type`: Type): Pipe | Null = js.native
    def resolve(`type`: Type, throwIfNotFound: Boolean): Pipe | Null = js.native
  }
  
}

