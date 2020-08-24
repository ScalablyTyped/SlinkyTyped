package typingsSlinky.reactRelay

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ClassicElement
import typingsSlinky.reactRelay.anon.EntryPointReference
import typingsSlinky.reactRelay.anon.FetchKey
import typingsSlinky.reactRelay.anon.FnCall
import typingsSlinky.reactRelay.anon.NetworkCacheConfig
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPoint
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPointProps
import typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadOptions
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadableConcreteRequest
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedQuery
import typingsSlinky.reactRelay.lazyLoadEntryPointContainerMod.EntryPointContainerProps
import typingsSlinky.reactRelay.relayEnvironmentProviderMod.Props
import typingsSlinky.reactRelay.useBlockingPaginationFragmentMod.Call
import typingsSlinky.reactRelay.useBlockingPaginationFragmentMod.KeyReturnType
import typingsSlinky.reactRelay.useBlockingPaginationFragmentMod.KeyType
import typingsSlinky.reactRelay.useBlockingPaginationFragmentMod.ReturnType
import typingsSlinky.reactRelay.useFragmentMod.ArrayKeyReturnType
import typingsSlinky.reactRelay.useFragmentMod.ArrayKeyType
import typingsSlinky.reactRelay.useMutationMod.UseMutationConfig
import typingsSlinky.relayRuntime.commitMutationMod.MutationConfig
import typingsSlinky.relayRuntime.commitMutationMod.MutationParameters
import typingsSlinky.relayRuntime.mod.Observable
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import typingsSlinky.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/hooks", JSImport.Namespace)
@js.native
object libHooksMod extends js.Object {
  def EntryPointContainer[TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: ReactComponentClass[
    EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]
  ] */](
    hasEntryPointReferenceProps: EntryPointReference[
      TEntryPointComponent, 
      TRuntimeProps, 
      TPreloadedQueries, 
      TPreloadedNestedEntryPoints, 
      TExtraProps
    ]
  ): ClassicElement[ReactElement] = js.native
  def LazyLoadEntryPointContainer[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps](
    hasEntryPointEntryPointParamsPropsEnvironmentProvider: EntryPointContainerProps[
      // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ]
  ): ReactElement = js.native
  def RelayEnvironmentProvider(props: Props): ReactElement = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: NetworkCacheConfig
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: js.UndefOr[scala.Nothing],
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: Null,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: PreloadOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: PreloadOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  def prepareEntryPoint[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: ReactComponentClass[
    EntryPointProps[
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ]
  ] */, // tslint:disable-next-line no-unnecessary-generics
  TEntryPoint /* <: EntryPoint[TEntryPointParams, TEntryPointComponent] */](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions],
    // tslint:disable-next-line no-unnecessary-generics
  entryPoint: TEntryPoint,
    entryPointParams: TEntryPointParams
  ): PreloadedEntryPoint[TEntryPointComponent] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: Null, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useFragment[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode): js.Array[typingsSlinky.reactRelay.useFragmentMod.Call[ArrayKeyReturnType[TKey]]] | Null = js.native
  def useFragment[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): js.Array[typingsSlinky.reactRelay.useFragmentMod.Call[ArrayKeyReturnType[TKey]]] | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyType_Array[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): js.Array[typingsSlinky.reactRelay.useFragmentMod.Call[ArrayKeyReturnType[TKey]]] = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyType[TKey /* <: typingsSlinky.reactRelay.useFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): typingsSlinky.reactRelay.useFragmentMod.Call[typingsSlinky.reactRelay.useFragmentMod.KeyReturnType[TKey]] | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyType[TKey /* <: typingsSlinky.reactRelay.useFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typingsSlinky.reactRelay.useFragmentMod.Call[typingsSlinky.reactRelay.useFragmentMod.KeyReturnType[TKey]] | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyType_Call[TKey /* <: typingsSlinky.reactRelay.useFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typingsSlinky.reactRelay.useFragmentMod.Call[typingsSlinky.reactRelay.useFragmentMod.KeyReturnType[TKey]] = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: FetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useMutation[TMutation /* <: MutationParameters */](mutation: GraphQLTaggedNode): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  def useMutation[TMutation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    commitMutationFn: js.Function2[/* environment */ Environment, /* config */ MutationConfig[TMutation], Disposable]
  ): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typingsSlinky.reactRelay.useLegacyPaginationFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  typingsSlinky.reactRelay.useLegacyPaginationFragmentMod.ReturnType[
    TQuery, 
    TKey | Null, 
    typingsSlinky.reactRelay.useLegacyPaginationFragmentMod.Call[typingsSlinky.reactRelay.useLegacyPaginationFragmentMod.KeyReturnType[TKey]] | Null
  ] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typingsSlinky.reactRelay.useLegacyPaginationFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  typingsSlinky.reactRelay.useLegacyPaginationFragmentMod.ReturnType[
    TQuery, 
    TKey | Null, 
    typingsSlinky.reactRelay.useLegacyPaginationFragmentMod.Call[typingsSlinky.reactRelay.useLegacyPaginationFragmentMod.KeyReturnType[TKey]] | Null
  ] = js.native
  def usePreloadedQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: typingsSlinky.reactRelay.useRefetchableFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line:no-unnecessary-generics
  typingsSlinky.reactRelay.useRefetchableFragmentMod.ReturnType[
    TQuery, 
    TKey, 
    typingsSlinky.reactRelay.useRefetchableFragmentMod.Call[typingsSlinky.reactRelay.useRefetchableFragmentMod.KeyReturnType[TKey]] | Null
  ] = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: typingsSlinky.reactRelay.useRefetchableFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line:no-unnecessary-generics
  typingsSlinky.reactRelay.useRefetchableFragmentMod.ReturnType[
    TQuery, 
    TKey, 
    typingsSlinky.reactRelay.useRefetchableFragmentMod.Call[typingsSlinky.reactRelay.useRefetchableFragmentMod.KeyReturnType[TKey]] | Null
  ] = js.native
  def useRelayEnvironment(): typingsSlinky.relayRuntime.mod.Environment = js.native
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inferrence inside GraphQLSubscriptionConfig.
  // tslint:disable-next-line:no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Unit = js.native
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inferrence inside GraphQLSubscriptionConfig.
  // tslint:disable-next-line:no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload],
    requestSubscriptionFn: FnCall
  ): Unit = js.native
}

