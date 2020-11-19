package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "StaticSymbolResolver")
@js.native
class StaticSymbolResolver protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.StaticSymbolResolver {
  def this(
    host: StaticSymbolResolverHost,
    staticSymbolCache: typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbolCache,
    summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol]
  ) = this()
  def this(
    host: StaticSymbolResolverHost,
    staticSymbolCache: typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbolCache,
    summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}
