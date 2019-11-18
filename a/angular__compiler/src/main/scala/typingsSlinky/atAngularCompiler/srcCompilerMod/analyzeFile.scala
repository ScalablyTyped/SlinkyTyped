package typingsSlinky.atAngularCompiler.srcCompilerMod

import typingsSlinky.atAngularCompiler.srcAotCompilerMod.NgAnalyzeModulesHost
import typingsSlinky.atAngularCompiler.srcAotCompilerMod.NgAnalyzedFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "analyzeFile")
@js.native
object analyzeFile extends js.Object {
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: typingsSlinky.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = js.native
}

