package typingsSlinky.angularCompiler.aotCompilerMod

import typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/compiler", "analyzeNgModules")
@js.native
object analyzeNgModules extends js.Object {
  
  def apply(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver
  ): NgAnalyzedModules = js.native
}
