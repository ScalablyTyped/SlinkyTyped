package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.compilerMod.NgAnalyzeModulesHost
import typingsSlinky.angularCompiler.compilerMod.NgAnalyzedFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "analyzeFile")
@js.native
object analyzeFile extends js.Object {
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = js.native
}

