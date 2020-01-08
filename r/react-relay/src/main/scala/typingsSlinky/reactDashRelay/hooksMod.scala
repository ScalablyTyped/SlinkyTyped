package typingsSlinky.reactDashRelay

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.reactMod.ClassicElement
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPoint
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPointProps
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.IEnvironmentProvider
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadOptions
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadableConcreteRequest
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadedEntryPoint
import typingsSlinky.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadedQuery
import typingsSlinky.reactDashRelay.libRelayDashExperimentalLazyLoadEntryPointContainerMod.EntryPointContainerProps
import typingsSlinky.reactDashRelay.libRelayDashExperimentalRelayEnvironmentProviderMod.Props
import typingsSlinky.reactDashRelay.libRelayDashExperimentalUseBlockingPaginationFragmentMod.$Call
import typingsSlinky.reactDashRelay.libRelayDashExperimentalUseBlockingPaginationFragmentMod.KeyReturnType
import typingsSlinky.reactDashRelay.libRelayDashExperimentalUseBlockingPaginationFragmentMod.KeyType
import typingsSlinky.reactDashRelay.libRelayDashExperimentalUseBlockingPaginationFragmentMod.ReturnType
import typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.ArrayKeyReturnType
import typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.ArrayKeyType
import typingsSlinky.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsSlinky.relayDashRuntime.relayDashRuntimeMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  def EntryPointContainer[TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: ReactComponentClass[
    EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]
  ] */](hasEntryPointReferenceProps: Anon_EntryPointReference[TEntryPointComponent, TRuntimeProps]): ClassicElement[ReactElement] = js.native
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
  ): Element = js.native
  def RelayEnvironmentProvider(props: Props): Element = js.native
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
    options: Anon_NetworkCacheConfig
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
  ReturnType[TQuery, TKey | Null, $Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, $Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, $Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: Null, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, $Call[KeyReturnType[TKey]] | Null] = js.native
  def useFragment[TKey /* <: typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): (typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[
    typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyReturnType[TKey]
  ]) | Null = js.native
  def useFragment[TKey /* <: typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[
    typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyReturnType[TKey]
  ]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyType[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode): (js.Array[
    typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[ArrayKeyReturnType[TKey]]
  ]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyType[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (js.Array[
    typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[ArrayKeyReturnType[TKey]]
  ]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyType_Array[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): js.Array[
    typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[ArrayKeyReturnType[TKey]]
  ] = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyType_$Call[TKey /* <: typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[
    typingsSlinky.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyReturnType[TKey]
  ] = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: Anon_FetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typingsSlinky.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  typingsSlinky.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.ReturnType[
    TQuery, 
    TKey | Null, 
    (typingsSlinky.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.$Call[
      typingsSlinky.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.KeyReturnType[TKey]
    ]) | Null
  ] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typingsSlinky.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  typingsSlinky.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.ReturnType[
    TQuery, 
    TKey | Null, 
    (typingsSlinky.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.$Call[
      typingsSlinky.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.KeyReturnType[TKey]
    ]) | Null
  ] = js.native
  def usePreloadedQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: Anon_Data */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typingsSlinky.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentMod.ReturnType[TQuery, TKey] = js.native
  def useRelayEnvironment(): typingsSlinky.relayDashRuntime.relayDashRuntimeMod.Environment = js.native
}

