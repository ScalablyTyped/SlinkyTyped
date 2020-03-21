package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_module_factory_compiler", JSImport.Namespace)
@js.native
object r3ModuleFactoryCompilerMod extends js.Object {
  def compileModuleFactory(
    outputCtx: OutputContext,
    module: CompileNgModuleMetadata,
    backPatchReferenceOf: js.Function1[/* module */ CompileTypeMetadata, Expression],
    resolver: CompileMetadataResolver
  ): Unit = js.native
}

