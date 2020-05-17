package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.anon.Ctor
import typingsSlinky.angularCompiler.anon.FilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "StaticReflector")
@js.native
class StaticReflector protected ()
  extends typingsSlinky.angularCompiler.staticReflectorMod.StaticReflector {
  def this(
    summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
  ) = this()
  def this(
    summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[Ctor]
  ) = this()
  def this(
    summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[Ctor],
    knownMetadataFunctions: js.Array[FilePath]
  ) = this()
  def this(
    summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[Ctor],
    knownMetadataFunctions: js.Array[FilePath],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}

