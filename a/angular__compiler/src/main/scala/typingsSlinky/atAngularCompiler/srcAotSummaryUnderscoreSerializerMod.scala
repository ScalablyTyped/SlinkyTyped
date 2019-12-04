package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache
import typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.ResolvedStaticSymbol
import typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
import typingsSlinky.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver
import typingsSlinky.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/summary_serializer", JSImport.Namespace)
@js.native
object srcAotSummaryUnderscoreSerializerMod extends js.Object {
  def createForJitStub(outputCtx: OutputContext, reference: StaticSymbol): Unit = js.native
  def deserializeSummaries(
    symbolCache: StaticSymbolCache,
    summaryResolver: SummaryResolver[StaticSymbol],
    libraryFileName: String,
    json: String
  ): Anon_ImportAsModuleName = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata]
  ): Anon_ExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata],
    createExternalSymbolReexports: Boolean
  ): Anon_ExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata]
  ): Anon_ExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata],
    createExternalSymbolReexports: Boolean
  ): Anon_ExportAsJson = js.native
}

