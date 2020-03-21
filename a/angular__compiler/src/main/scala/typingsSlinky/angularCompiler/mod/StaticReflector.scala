package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.AnonCtor
import typingsSlinky.angularCompiler.AnonFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "StaticReflector")
@js.native
class StaticReflector protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.StaticReflector {
  def this(
    summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
  ) = this()
  def this(
    summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[AnonCtor]
  ) = this()
  def this(
    summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[AnonCtor],
    knownMetadataFunctions: js.Array[AnonFilePath]
  ) = this()
  def this(
    summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[AnonCtor],
    knownMetadataFunctions: js.Array[AnonFilePath],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}

