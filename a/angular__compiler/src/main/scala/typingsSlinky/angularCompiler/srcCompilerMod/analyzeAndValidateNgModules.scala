package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost
import typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "analyzeAndValidateNgModules")
@js.native
object analyzeAndValidateNgModules extends js.Object {
  
  def apply(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ): NgAnalyzedModules = js.native
}
