package typingsSlinky.angularCompiler.aotCompilerMod

import typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/compiler", "analyzeFile")
@js.native
object analyzeFile extends js.Object {
  
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = js.native
}
