package typingsSlinky.atAngularCompiler.srcAotSummaryUnderscoreResolverMod

import typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache
import typingsSlinky.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/summary_resolver", "AotSummaryResolver")
@js.native
class AotSummaryResolver protected () extends SummaryResolver[StaticSymbol] {
  def this(host: AotSummaryResolverHost, staticSymbolCache: StaticSymbolCache) = this()
  var _loadSummaryFile: js.Any = js.native
  var host: js.Any = js.native
  var importAs: js.Any = js.native
  var knownFileNameToModuleNames: js.Any = js.native
  var loadedFilePaths: js.Any = js.native
  var staticSymbolCache: js.Any = js.native
  var summaryCache: js.Any = js.native
}

