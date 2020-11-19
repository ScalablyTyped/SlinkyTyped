package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost
import typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedFileWithInjectables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "analyzeFileForInjectables")
@js.native
object analyzeFileForInjectables extends js.Object {
  
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFileWithInjectables = js.native
}
