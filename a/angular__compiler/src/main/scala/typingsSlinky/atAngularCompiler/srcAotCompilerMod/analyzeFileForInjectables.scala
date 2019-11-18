package typingsSlinky.atAngularCompiler.srcAotCompilerMod

import typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
import typingsSlinky.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

