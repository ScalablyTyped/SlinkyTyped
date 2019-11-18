package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "StaticSymbolResolver")
@js.native
class StaticSymbolResolver protected ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.StaticSymbolResolver {
  def this(
    host: StaticSymbolResolverHost,
    staticSymbolCache: typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache,
    summaryResolver: typingsSlinky.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol]
  ) = this()
  def this(
    host: StaticSymbolResolverHost,
    staticSymbolCache: typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache,
    summaryResolver: typingsSlinky.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}

