package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectableCompilerMod {
  
  @JSImport("@angular/compiler/src/injectable_compiler", "InjectableCompiler")
  @js.native
  class InjectableCompiler protected () extends StObject {
    def this(reflector: CompileReflector, alwaysGenerateDef: Boolean) = this()
    
    var alwaysGenerateDef: js.Any = js.native
    
    def compile(injectable: CompileInjectableMetadata, ctx: OutputContext): Unit = js.native
    
    var depsArray: js.Any = js.native
    
    def factoryFor(injectable: CompileInjectableMetadata, ctx: OutputContext): Expression = js.native
    
    def injectableDef(injectable: CompileInjectableMetadata, ctx: OutputContext): Expression = js.native
    
    var reflector: js.Any = js.native
    
    var tokenInjector: js.Any = js.native
  }
}
