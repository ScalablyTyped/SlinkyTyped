package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.anon.Json
import typingsSlinky.angularCompiler.anon.Metadata
import typingsSlinky.angularCompiler.anon.ModuleName
import typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbolCache
import typingsSlinky.angularCompiler.staticSymbolResolverMod.ResolvedStaticSymbol
import typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/summary_serializer", JSImport.Namespace)
@js.native
object summarySerializerMod extends js.Object {
  
  def createForJitStub(outputCtx: OutputContext, reference: StaticSymbol): Unit = js.native
  
  def deserializeSummaries(
    symbolCache: StaticSymbolCache,
    summaryResolver: SummaryResolver[StaticSymbol],
    libraryFileName: String,
    json: String
  ): ModuleName = js.native
  
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata]
  ): Json = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata],
    createExternalSymbolReexports: Boolean
  ): Json = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata]
  ): Json = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata],
    createExternalSymbolReexports: Boolean
  ): Json = js.native
}
