package typingsSlinky.reactRelay

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.reactRelay.anon.EntryPointReference
import typingsSlinky.reactRelay.anon.FetchKey
import typingsSlinky.reactRelay.anon.FetchPolicy
import typingsSlinky.reactRelay.anon.FnCall
import typingsSlinky.reactRelay.anon.UNSTABLErenderPolicy
import typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typingsSlinky.reactRelay.entryPointTypesMod.LoadQueryOptions
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadableConcreteRequest
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedQuery
import typingsSlinky.reactRelay.helpersMod.ArrayKeyType
import typingsSlinky.reactRelay.helpersMod.ArrayKeyTypeData
import typingsSlinky.reactRelay.helpersMod.GetEntryPointComponentFromEntryPoint
import typingsSlinky.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typingsSlinky.reactRelay.helpersMod.KeyType
import typingsSlinky.reactRelay.helpersMod.KeyTypeData
import typingsSlinky.reactRelay.matchContainerMod.MatchContainerProps
import typingsSlinky.reactRelay.profilerContextMod.ProfilerContextType
import typingsSlinky.reactRelay.relayEnvironmentProviderMod.Props
import typingsSlinky.reactRelay.useBlockingPaginationFragmentMod.ReturnTypeNode
import typingsSlinky.reactRelay.useEntryPointLoaderMod.UseEntryPointLoaderHookType
import typingsSlinky.reactRelay.useMutationMod.UseMutationConfig
import typingsSlinky.reactRelay.usePaginationFragmentMod.ReturnType
import typingsSlinky.reactRelay.useQueryLoaderMod.useQueryLoaderHookType
import typingsSlinky.relayRuntime.commitMutationMod.MutationConfig
import typingsSlinky.relayRuntime.commitMutationMod.MutationParameters
import typingsSlinky.relayRuntime.mod.Observable
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import typingsSlinky.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  
  def EntryPointContainer[TPreloadedEntryPoint /* <: PreloadedEntryPoint[_] */](hasEntryPointReferenceProps: EntryPointReference[TPreloadedEntryPoint]): ReactElement = js.native
  
  def MatchContainer[TProps, TFallback](props: MatchContainerProps[TProps, TFallback]): ReactElement | TFallback | Null = js.native
  
  val ProfilerContext: Context[ProfilerContextType] = js.native
  
  def RelayEnvironmentProvider(props: Props): ReactElement = js.native
  
  def fetchQuery[TQuery /* <: OperationType */](environment: Environment, query: GraphQLTaggedNode, variables: VariablesOf[TQuery]): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  def fetchQuery[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: FetchPolicy
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  
  def loadEntryPoint[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, _]]],
    entryPoint: TEntryPoint,
    entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  ): PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] = js.native
  
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery]
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: js.UndefOr[scala.Nothing],
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](environment: Environment, preloadableRequest: GraphQLTaggedNode, variables: VariablesOf[TQuery]): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: js.UndefOr[scala.Nothing],
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: Null, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  
  def useEntryPointLoader[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, _]]],
    entryPoint: TEntryPoint
  ): UseEntryPointLoaderHookType[TEntryPoint] = js.native
  
  def useFragment[TKey /* <: ArrayKeyType[_] */](fragmentInput: GraphQLTaggedNode): (ArrayKeyTypeData[TKey, _]) | Null = js.native
  def useFragment[TKey /* <: ArrayKeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (ArrayKeyTypeData[TKey, _]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyTypeWildcard_ArrayKeyTypeData[TKey /* <: ArrayKeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, _] = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyTypeWildcard[TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, _]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyTypeWildcard[TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, _]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyTypeWildcard_KeyTypeData[TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, _] = js.native
  
  def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery], options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  
  def useMutation[TMutation /* <: MutationParameters */](mutation: GraphQLTaggedNode): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  def useMutation[TMutation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    commitMutationFn: js.Function2[/* environment */ Environment, /* config */ MutationConfig[TMutation], Disposable]
  ): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, (KeyTypeData[TKey, _]) | Null] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, (KeyTypeData[TKey, _]) | Null] = js.native
  
  def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, _]]]
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, _]]],
    options: UNSTABLErenderPolicy
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  
  def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: PreloadableConcreteRequest[TQuery]): useQueryLoaderHookType[TQuery] = js.native
  def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: GraphQLTaggedNode): useQueryLoaderHookType[TQuery] = js.native
  
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  typingsSlinky.reactRelay.useRefetchableFragmentMod.ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  typingsSlinky.reactRelay.useRefetchableFragmentMod.ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  
  def useRelayEnvironment(): typingsSlinky.relayRuntime.mod.Environment = js.native
  
  def useSubscribeToInvalidationState(dataIDs: js.Array[DataID], callback: js.Function0[Unit]): Disposable = js.native
  
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Unit = js.native
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload],
    requestSubscriptionFn: FnCall
  ): Unit = js.native
}
