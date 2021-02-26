package typingsSlinky.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.entriaRelayExperimental.anon.FetchKey
import typingsSlinky.entriaRelayExperimental.anon.NetworkCacheConfig
import typingsSlinky.entriaRelayExperimental.relayEnvironmentProviderMod.Props
import typingsSlinky.entriaRelayExperimental.useFragmentMod.NonNullableArrayFragmentReturn
import typingsSlinky.entriaRelayExperimental.useFragmentMod.NonNullableFragmentReturn
import typingsSlinky.entriaRelayExperimental.useFragmentMod.NullableArrayFragmentReturn
import typingsSlinky.entriaRelayExperimental.useFragmentMod.NullableFragmentReturn
import typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.ReturnTypePaginationFragment
import typingsSlinky.entriaRelayExperimental.useRefetchableFragmentMod.ReturnTypeRefetchableFragment
import typingsSlinky.relayRuntime.mod.Observable
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@entria/relay-experimental", "RelayEnvironmentProvider")
  @js.native
  def RelayEnvironmentProvider(props: Props): ReactElement = js.native
  
  @JSImport("@entria/relay-experimental", "fetchQuery")
  @js.native
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  @JSImport("@entria/relay-experimental", "fetchQuery")
  @js.native
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: NetworkCacheConfig
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  
  @JSImport("@entria/relay-experimental", "useFragment")
  @js.native
  def useFragment[TKey /* <: StringDictionary[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableFragmentReturn[TKey] = js.native
  @JSImport("@entria/relay-experimental", "useFragment")
  @js.native
  def useFragment_TKey_ArrayStringDictionaryWildcard_NonNullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableArrayFragmentReturn[TKey] = js.native
  @JSImport("@entria/relay-experimental", "useFragment")
  @js.native
  def useFragment_TKey_UnionArrayStringDictionaryWildcardNull_NullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableArrayFragmentReturn[TKey] = js.native
  @JSImport("@entria/relay-experimental", "useFragment")
  @js.native
  def useFragment_TKey_UnionStringDictionaryAnyNull_NullableFragmentReturn[TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableFragmentReturn[TKey] = js.native
  
  @JSImport("@entria/relay-experimental", "useLegacyPaginationFragment")
  @js.native
  def useLegacyPaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] with typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ] = js.native
  
  @JSImport("@entria/relay-experimental", "usePaginationFragment")
  @js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] with typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ] = js.native
  
  @JSImport("@entria/relay-experimental", "useQuery")
  @js.native
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSImport("@entria/relay-experimental", "useQuery")
  @js.native
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: js.UndefOr[scala.Nothing], options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSImport("@entria/relay-experimental", "useQuery")
  @js.native
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: Null, options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSImport("@entria/relay-experimental", "useQuery")
  @js.native
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSImport("@entria/relay-experimental", "useQuery")
  @js.native
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: FetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  
  @JSImport("@entria/relay-experimental", "useRefetchableFragment")
  @js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnTypeRefetchableFragment[TQuery, TKey] = js.native
  
  @JSImport("@entria/relay-experimental", "useRelayEnvironment")
  @js.native
  def useRelayEnvironment(): Environment = js.native
}
