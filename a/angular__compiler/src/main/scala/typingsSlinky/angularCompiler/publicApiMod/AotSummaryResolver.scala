package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.summaryResolverMod.AotSummaryResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "AotSummaryResolver")
@js.native
class AotSummaryResolver protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.AotSummaryResolver {
  def this(
    host: AotSummaryResolverHost,
    staticSymbolCache: typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbolCache
  ) = this()
}

