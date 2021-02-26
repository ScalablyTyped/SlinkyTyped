package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object r3ModuleFactoryCompilerMod {
  
  @JSImport("@angular/compiler/src/render3/r3_module_factory_compiler", "compileModuleFactory")
  @js.native
  def compileModuleFactory(
    outputCtx: OutputContext,
    module: CompileNgModuleMetadata,
    backPatchReferenceOf: js.Function1[/* module */ CompileTypeMetadata, Expression],
    resolver: CompileMetadataResolver
  ): Unit = js.native
}
