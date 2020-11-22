package typingsSlinky.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object entryPointTypesMod {
  
  type EntryPoint[TEntryPointComponent, TEntryPointParams /* <: js.Object */] = typingsSlinky.reactRelay.entryPointTypesMod.InternalEntryPointRepresentation[TEntryPointParams, js.Any, js.Any, js.Any, js.Any]
  
  type EntryPointComponent[TPreloadedQueries /* <: typingsSlinky.std.Record[java.lang.String, typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType] */, TPreloadedEntryPoints /* <: typingsSlinky.std.Record[
    java.lang.String, 
    js.UndefOr[typingsSlinky.reactRelay.entryPointTypesMod.EntryPoint[_, _]]
  ] */, TRuntimeProps /* <: js.Object */, TExtraProps /* <: js.Object | scala.Null */] = slinky.core.ReactComponentClass[
    typingsSlinky.reactRelay.entryPointTypesMod.EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  ]
  
  type EnvironmentProviderOptions[T /* <: typingsSlinky.std.Record[java.lang.String, _] */] = T
  
  type PreloadedEntryPoint[TEntryPointComponent] = typingsSlinky.reactRelay.anon.Dispose[TEntryPointComponent]
  
  type PreloadedEntryPoints[TPreloadedEntryPoints] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadedEntryPoint<react-relay.react-relay/lib/relay-experimental/helpers.GetEntryPointComponentFromEntryPoint<TPreloadedEntryPoints[T]>>}
    */ typingsSlinky.reactRelay.reactRelayStrings.PreloadedEntryPoints with org.scalablytyped.runtime.TopLevel[TPreloadedEntryPoints]
  
  type PreloadedQueries[TPreloadedQueries] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadedQuery<TPreloadedQueries[T], react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions<std.Record<string, unknown>>>}
    */ typingsSlinky.reactRelay.reactRelayStrings.PreloadedQueries with org.scalablytyped.runtime.TopLevel[TPreloadedQueries]
  
  type ThinNestedEntryPointParamsObject[TPreloadedEntryPoints /* <: typingsSlinky.std.Record[
    java.lang.String, 
    js.UndefOr[typingsSlinky.reactRelay.entryPointTypesMod.EntryPoint[_, _]]
  ] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ThinNestedEntryPointParams<TPreloadedEntryPoints[K]>}
    */ typingsSlinky.reactRelay.reactRelayStrings.ThinNestedEntryPointParamsObject with org.scalablytyped.runtime.TopLevel[TPreloadedEntryPoints]
  
  type ThinQueryParamsObject[TPreloadedQueries /* <: typingsSlinky.std.Record[java.lang.String, typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ThinQueryParams<TPreloadedQueries[K], react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions<std.Record<string, unknown>>>}
    */ typingsSlinky.reactRelay.reactRelayStrings.ThinQueryParamsObject with org.scalablytyped.runtime.TopLevel[TPreloadedQueries]
}
