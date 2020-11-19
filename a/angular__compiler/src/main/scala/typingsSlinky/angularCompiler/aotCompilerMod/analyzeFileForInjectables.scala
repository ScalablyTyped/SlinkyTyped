package typingsSlinky.angularCompiler.aotCompilerMod

import typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/compiler", "analyzeFileForInjectables")
@js.native
object analyzeFileForInjectables extends js.Object {
  
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFileWithInjectables = js.native
}
