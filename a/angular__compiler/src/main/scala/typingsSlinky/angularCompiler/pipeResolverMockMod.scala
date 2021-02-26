package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.coreMod.Pipe
import typingsSlinky.angularCompiler.coreMod.Type
import typingsSlinky.angularCompiler.mod.CompileReflector
import typingsSlinky.angularCompiler.mod.PipeResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeResolverMockMod {
  
  @JSImport("@angular/compiler/testing/src/pipe_resolver_mock", "MockPipeResolver")
  @js.native
  class MockPipeResolver protected () extends PipeResolver {
    def this(refector: CompileReflector) = this()
    
    var _pipes: js.Any = js.native
    
    /**
      * Overrides the {@link Pipe} for a pipe.
      */
    def setPipe(`type`: Type, metadata: Pipe): Unit = js.native
  }
}
