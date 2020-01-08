package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typingsSlinky.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ng_module_compiler", JSImport.Namespace)
@js.native
object srcNgUnderscoreModuleUnderscoreCompilerMod extends js.Object {
  @js.native
  class NgModuleCompileResult protected () extends js.Object {
    def this(ngModuleFactoryVar: String) = this()
    var ngModuleFactoryVar: String = js.native
  }
  
  @js.native
  class NgModuleCompiler protected () extends js.Object {
    def this(reflector: CompileReflector) = this()
    var _createNgModuleFactory: js.Any = js.native
    var reflector: js.Any = js.native
    def compile(
      ctx: OutputContext,
      ngModuleMeta: CompileNgModuleMetadata,
      extraProviders: js.Array[CompileProviderMetadata]
    ): NgModuleCompileResult = js.native
    def createStub(ctx: OutputContext, ngModuleReference: js.Any): Unit = js.native
  }
  
}

