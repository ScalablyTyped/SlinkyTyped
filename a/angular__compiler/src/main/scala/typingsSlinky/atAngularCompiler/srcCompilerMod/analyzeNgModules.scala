package typingsSlinky.atAngularCompiler.srcCompilerMod

import typingsSlinky.atAngularCompiler.srcAotCompilerMod.NgAnalyzeModulesHost
import typingsSlinky.atAngularCompiler.srcAotCompilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "analyzeNgModules")
@js.native
object analyzeNgModules extends js.Object {
  def apply(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    metadataResolver: typingsSlinky.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ): NgAnalyzedModules = js.native
}

