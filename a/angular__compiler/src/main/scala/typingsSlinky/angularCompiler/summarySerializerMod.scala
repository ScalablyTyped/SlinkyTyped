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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object summarySerializerMod {
  
  @JSImport("@angular/compiler/src/aot/summary_serializer", "createForJitStub")
  @js.native
  def createForJitStub(outputCtx: OutputContext, reference: StaticSymbol): Unit = js.native
  
  @JSImport("@angular/compiler/src/aot/summary_serializer", "deserializeSummaries")
  @js.native
  def deserializeSummaries(
    symbolCache: StaticSymbolCache,
    summaryResolver: SummaryResolver[StaticSymbol],
    libraryFileName: String,
    json: String
  ): ModuleName = js.native
  
  @JSImport("@angular/compiler/src/aot/summary_serializer", "serializeSummaries")
  @js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata]
  ): Json = js.native
  @JSImport("@angular/compiler/src/aot/summary_serializer", "serializeSummaries")
  @js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata],
    createExternalSymbolReexports: Boolean
  ): Json = js.native
  @JSImport("@angular/compiler/src/aot/summary_serializer", "serializeSummaries")
  @js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Metadata]
  ): Json = js.native
  @JSImport("@angular/compiler/src/aot/summary_serializer", "serializeSummaries")
  @js.native
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
