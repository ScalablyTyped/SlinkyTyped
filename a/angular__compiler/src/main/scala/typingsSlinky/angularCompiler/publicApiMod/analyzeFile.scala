package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost
import typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "analyzeFile")
@js.native
object analyzeFile extends js.Object {
  
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = js.native
}
