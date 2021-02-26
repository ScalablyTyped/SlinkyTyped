package typingsSlinky.reactRelay

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.anon.Dispose
import typingsSlinky.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typingsSlinky.reactRelay.reactRelayStrings.cache
import typingsSlinky.reactRelay.reactRelayStrings.network
import typingsSlinky.relayRuntime.mod.Observable
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayConcreteNodeMod.RequestParameters
import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DisposeFn
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryPointTypesMod {
  
  type EntryPoint[TEntryPointComponent, TEntryPointParams /* <: js.Object */] = InternalEntryPointRepresentation[TEntryPointParams, js.Any, js.Any, js.Any, js.Any]
  
  type EntryPointComponent[TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[_, _]]] */, TRuntimeProps /* <: js.Object */, TExtraProps /* <: js.Object | Null */] = ReactComponentClass[
    EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  ]
  
  /* Inlined parent std.Readonly<{  entryPoints :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadedEntryPoints<TPreloadedEntryPoints>,   extraProps :TExtraProps,   props :TRuntimeProps,   queries :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadedQueries<TPreloadedQueries>}> */
  @js.native
  trait EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends StObject {
    
    val entryPoints: PreloadedEntryPoints[TPreloadedEntryPoints] = js.native
    
    val extraProps: TExtraProps = js.native
    
    val props: TRuntimeProps = js.native
    
    val queries: PreloadedQueries[TPreloadedQueries] = js.native
  }
  object EntryPointProps {
    
    @scala.inline
    def apply[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](
      entryPoints: PreloadedEntryPoints[TPreloadedEntryPoints],
      extraProps: TExtraProps,
      props: TRuntimeProps,
      queries: PreloadedQueries[TPreloadedQueries]
    ): EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
      val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
    }
    
    @scala.inline
    implicit class EntryPointPropsMutableBuilder[Self <: EntryPointProps[_, _, _, _], TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] (val x: Self with (EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps])) extends AnyVal {
      
      @scala.inline
      def setEntryPoints(value: PreloadedEntryPoints[TPreloadedEntryPoints]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraProps(value: TExtraProps): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: TRuntimeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueries(value: PreloadedQueries[TPreloadedQueries]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    }
  }
  
  type EnvironmentProviderOptions[T /* <: Record[String, _] */] = T
  
  @js.native
  trait IEnvironmentProvider[TOptions] extends StObject {
    
    def getEnvironment(): Environment = js.native
    def getEnvironment(options: TOptions): Environment = js.native
  }
  
  /**
    * The Interface of the EntryPoints .entrypoint files
    *
    * Every .entrypoint file it's an object that must have two required fields:
    * - getPreloadProps(...)  function that will return the description of preloaded
    *   queries and preloaded (nested) entry points for the current entry point
    * - root - JSResource of the module that will render those preloaded queries
    *
    * TEntryPointParams - object that contains all necessary information to execute
    * the preloaders (routeParams, query variables)
    *
    * TPreloadedQueries -  queries, defined in the root components
    *
    * TPreloadedEntryPoints - nested entry points, defined in the root components
    *
    * TRuntimeProps - the type of additional props that you may pass to the
    * component (like `onClick` handler, etc) during runtime. Values for them
    * defined during component runtime
    *
    * TExtraProps - a bag of extra props that you may define in `entrypoint` file
    * and they will be passed to the EntryPointComponent as `extraProps`
    */
  /* Inlined parent std.Readonly<{  root :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.JSResourceReference<react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EntryPointComponent<TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps>>, getPreloadProps (entryPointParams : TEntryPointParams): react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadProps<TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps>}> */
  @js.native
  trait InternalEntryPointRepresentation[/**
    * object that contains all necessary information to execute the preloaders (routeParams, query variables)
    */
  TEntryPointParams /* <: js.Object */, /**
    * queries, defined in the root components
    */
  TPreloadedQueries /* <: Record[String, OperationType] */, /**
    * nested entry points, defined in the root components
    */
  TPreloadedEntryPoints /* <: js.Object */, /**
    * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
    * Values for them defined during component runtime
    */
  TRuntimeProps /* <: js.Object */, /**
    * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
    * as `extraProps`
    */
  TExtraProps] extends StObject {
    
    val getPreloadProps: js.Function1[
        /* entryPointParams */ TEntryPointParams, 
        PreloadProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]
      ] = js.native
    
    val root: JSResourceReference[
        EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
      ] = js.native
  }
  object InternalEntryPointRepresentation {
    
    @scala.inline
    def apply[/**
      * object that contains all necessary information to execute the preloaders (routeParams, query variables)
      */
    TEntryPointParams /* <: js.Object */, /**
      * queries, defined in the root components
      */
    TPreloadedQueries /* <: Record[String, OperationType] */, /**
      * nested entry points, defined in the root components
      */
    TPreloadedEntryPoints /* <: js.Object */, /**
      * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
      * Values for them defined during component runtime
      */
    TRuntimeProps /* <: js.Object */, /**
      * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
      * as `extraProps`
      */
    TExtraProps](
      getPreloadProps: /* entryPointParams */ TEntryPointParams => PreloadProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps],
      root: JSResourceReference[
          EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
        ]
    ): InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
      val __obj = js.Dynamic.literal(getPreloadProps = js.Any.fromFunction1(getPreloadProps), root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
    }
    
    @scala.inline
    implicit class InternalEntryPointRepresentationMutableBuilder[Self <: InternalEntryPointRepresentation[_, _, _, _, _], /**
      * object that contains all necessary information to execute the preloaders (routeParams, query variables)
      */
    TEntryPointParams /* <: js.Object */, /**
      * queries, defined in the root components
      */
    TPreloadedQueries /* <: Record[String, OperationType] */, /**
      * nested entry points, defined in the root components
      */
    TPreloadedEntryPoints /* <: js.Object */, /**
      * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
      * Values for them defined during component runtime
      */
    TRuntimeProps /* <: js.Object */, /**
      * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
      * as `extraProps`
      */
    TExtraProps] (val x: Self with (InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps])) extends AnyVal {
      
      @scala.inline
      def setGetPreloadProps(
        value: /* entryPointParams */ TEntryPointParams => PreloadProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]
      ): Self = StObject.set(x, "getPreloadProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoot(
        value: JSResourceReference[
              EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
            ]
      ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSResourceReference[TModule] extends StObject {
    
    def getModuleId(): String = js.native
    
    def getModuleIfRequired(): TModule | Null = js.native
    
    def load(): js.Promise[TModule] = js.native
  }
  object JSResourceReference {
    
    @scala.inline
    def apply[TModule](
      getModuleId: () => String,
      getModuleIfRequired: () => TModule | Null,
      load: () => js.Promise[TModule]
    ): JSResourceReference[TModule] = {
      val __obj = js.Dynamic.literal(getModuleId = js.Any.fromFunction0(getModuleId), getModuleIfRequired = js.Any.fromFunction0(getModuleIfRequired), load = js.Any.fromFunction0(load))
      __obj.asInstanceOf[JSResourceReference[TModule]]
    }
    
    @scala.inline
    implicit class JSResourceReferenceMutableBuilder[Self <: JSResourceReference[_], TModule] (val x: Self with JSResourceReference[TModule]) extends AnyVal {
      
      @scala.inline
      def setGetModuleId(value: () => String): Self = StObject.set(x, "getModuleId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModuleIfRequired(value: () => TModule | Null): Self = StObject.set(x, "getModuleIfRequired", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoad(value: () => js.Promise[TModule]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<{  fetchPolicy :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadFetchPolicy | null | undefined,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   onQueryAstLoadTimeout :(): void | null | undefined}> */
  @js.native
  trait LoadQueryOptions extends StObject {
    
    val fetchPolicy: js.UndefOr[PreloadFetchPolicy | Null] = js.native
    
    val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.native
    
    val onQueryAstLoadTimeout: js.UndefOr[js.Function0[Unit] | Null] = js.native
  }
  object LoadQueryOptions {
    
    @scala.inline
    def apply(): LoadQueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadQueryOptions]
    }
    
    @scala.inline
    implicit class LoadQueryOptionsMutableBuilder[Self <: LoadQueryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchPolicy(value: PreloadFetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicyNull: Self = StObject.set(x, "fetchPolicy", null)
      
      @scala.inline
      def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      @scala.inline
      def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
      
      @scala.inline
      def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
      
      @scala.inline
      def setOnQueryAstLoadTimeout(value: () => Unit): Self = StObject.set(x, "onQueryAstLoadTimeout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnQueryAstLoadTimeoutNull: Self = StObject.set(x, "onQueryAstLoadTimeout", null)
      
      @scala.inline
      def setOnQueryAstLoadTimeoutUndefined: Self = StObject.set(x, "onQueryAstLoadTimeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactRelay.reactRelayStrings.`store-or-network`
    - typingsSlinky.reactRelay.reactRelayStrings.`store-and-network`
    - typingsSlinky.reactRelay.reactRelayStrings.`network-only`
  */
  trait PreloadFetchPolicy extends StObject
  object PreloadFetchPolicy {
    
    @scala.inline
    def `network-only`: typingsSlinky.reactRelay.reactRelayStrings.`network-only` = "network-only".asInstanceOf[typingsSlinky.reactRelay.reactRelayStrings.`network-only`]
    
    @scala.inline
    def `store-and-network`: typingsSlinky.reactRelay.reactRelayStrings.`store-and-network` = "store-and-network".asInstanceOf[typingsSlinky.reactRelay.reactRelayStrings.`store-and-network`]
    
    @scala.inline
    def `store-or-network`: typingsSlinky.reactRelay.reactRelayStrings.`store-or-network` = "store-or-network".asInstanceOf[typingsSlinky.reactRelay.reactRelayStrings.`store-or-network`]
  }
  
  /* Inlined std.Readonly<{  fetchKey :string | number | undefined,   fetchPolicy :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadFetchPolicy | null | undefined,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined}> */
  @js.native
  trait PreloadOptions extends StObject {
    
    val fetchKey: js.UndefOr[String | Double] = js.native
    
    val fetchPolicy: js.UndefOr[PreloadFetchPolicy | Null] = js.native
    
    val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.native
  }
  object PreloadOptions {
    
    @scala.inline
    def apply(): PreloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreloadOptions]
    }
    
    @scala.inline
    implicit class PreloadOptionsMutableBuilder[Self <: PreloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchKey(value: String | Double): Self = StObject.set(x, "fetchKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchKeyUndefined: Self = StObject.set(x, "fetchKey", js.undefined)
      
      @scala.inline
      def setFetchPolicy(value: PreloadFetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicyNull: Self = StObject.set(x, "fetchPolicy", null)
      
      @scala.inline
      def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      @scala.inline
      def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
      
      @scala.inline
      def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
    }
  }
  
  /* Inlined parent std.Readonly<{  entryPoints :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ThinNestedEntryPointParamsObject<TPreloadedEntryPoints> | undefined,   extraProps :TExtraProps | undefined,   queries :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ThinQueryParamsObject<TPreloadedQueries> | undefined}> */
  @js.native
  trait PreloadProps[TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[_, _]]] */, TExtraProps /* <: js.Object | Null */] extends StObject {
    
    val entryPoints: js.UndefOr[ThinNestedEntryPointParamsObject[TPreloadedEntryPoints]] = js.native
    
    val extraProps: js.UndefOr[TExtraProps] = js.native
    
    val queries: js.UndefOr[ThinQueryParamsObject[TPreloadedQueries]] = js.native
  }
  object PreloadProps {
    
    @scala.inline
    def apply[TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[_, _]]] */, TExtraProps /* <: js.Object | Null */](): PreloadProps[TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreloadProps[TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]]
    }
    
    @scala.inline
    implicit class PreloadPropsMutableBuilder[Self <: PreloadProps[_, _, _, _], TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[_, _]]] */, TExtraProps /* <: js.Object | Null */] (val x: Self with (PreloadProps[TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps])) extends AnyVal {
      
      @scala.inline
      def setEntryPoints(value: ThinNestedEntryPointParamsObject[TPreloadedEntryPoints]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
      
      @scala.inline
      def setExtraProps(value: TExtraProps): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraPropsUndefined: Self = StObject.set(x, "extraProps", js.undefined)
      
      @scala.inline
      def setQueries(value: ThinQueryParamsObject[TPreloadedQueries]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  cacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   source :'cache' | 'network',   fetchTime :number | null | undefined}> */
  @js.native
  trait PreloadQueryStatus extends StObject {
    
    val cacheConfig: js.UndefOr[CacheConfig | Null] = js.native
    
    val fetchTime: js.UndefOr[Double | Null] = js.native
    
    val source: cache | network = js.native
  }
  object PreloadQueryStatus {
    
    @scala.inline
    def apply(source: cache | network): PreloadQueryStatus = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreloadQueryStatus]
    }
    
    @scala.inline
    implicit class PreloadQueryStatusMutableBuilder[Self <: PreloadQueryStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheConfigNull: Self = StObject.set(x, "cacheConfig", null)
      
      @scala.inline
      def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
      
      @scala.inline
      def setFetchTime(value: Double): Self = StObject.set(x, "fetchTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchTimeNull: Self = StObject.set(x, "fetchTime", null)
      
      @scala.inline
      def setFetchTimeUndefined: Self = StObject.set(x, "fetchTime", js.undefined)
      
      @scala.inline
      def setSource(value: cache | network): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PreloadableConcreteRequest[TQuery /* <: OperationType */] extends StObject {
    
    var kind: typingsSlinky.reactRelay.reactRelayStrings.PreloadableConcreteRequest = js.native
    
    var params: RequestParameters = js.native
  }
  object PreloadableConcreteRequest {
    
    @scala.inline
    def apply[TQuery /* <: OperationType */](
      kind: typingsSlinky.reactRelay.reactRelayStrings.PreloadableConcreteRequest,
      params: RequestParameters
    ): PreloadableConcreteRequest[TQuery] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreloadableConcreteRequest[TQuery]]
    }
    
    @scala.inline
    implicit class PreloadableConcreteRequestMutableBuilder[Self <: PreloadableConcreteRequest[_], TQuery /* <: OperationType */] (val x: Self with PreloadableConcreteRequest[TQuery]) extends AnyVal {
      
      @scala.inline
      def setKind(value: typingsSlinky.reactRelay.reactRelayStrings.PreloadableConcreteRequest): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: RequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  type PreloadedEntryPoint[TEntryPointComponent] = Dispose[TEntryPointComponent]
  
  type PreloadedEntryPoints[TPreloadedEntryPoints] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadedEntryPoint<react-relay.react-relay/lib/relay-experimental/helpers.GetEntryPointComponentFromEntryPoint<TPreloadedEntryPoints[T]>>}
    */ typingsSlinky.reactRelay.reactRelayStrings.PreloadedEntryPoints with TopLevel[TPreloadedEntryPoints]
  
  type PreloadedQueries[TPreloadedQueries] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadedQuery<TPreloadedQueries[T], react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions<std.Record<string, unknown>>>}
    */ typingsSlinky.reactRelay.reactRelayStrings.PreloadedQueries with TopLevel[TPreloadedQueries]
  
  /* Inlined parent std.Readonly<{  kind :'PreloadedQuery',   environment :relay-runtime.relay-runtime.IEnvironment,   environmentProviderOptions :TEnvironmentProviderOptions | null | undefined,   fetchKey :string | number,   fetchPolicy :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadFetchPolicy,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   id :string | null | undefined,   name :string,   source :relay-runtime.relay-runtime.Observable<relay-runtime.relay-runtime.GraphQLResponse> | null | undefined,   variables :relay-runtime.relay-runtime.VariablesOf<TQuery>,   dispose :relay-runtime.relay-runtime.DisposeFn,   isDisposed :boolean}> */
  @js.native
  trait PreloadedQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions] extends StObject {
    
    val dispose: DisposeFn = js.native
    
    val environment: Environment = js.native
    
    val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.native
    
    val fetchKey: String | Double = js.native
    
    val fetchPolicy: PreloadFetchPolicy = js.native
    
    val id: js.UndefOr[String | Null] = js.native
    
    val isDisposed: Boolean = js.native
    
    val kind: typingsSlinky.reactRelay.reactRelayStrings.PreloadedQuery = js.native
    
    val name: String = js.native
    
    val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.native
    
    val source: js.UndefOr[Observable[GraphQLResponse] | Null] = js.native
    
    val variables: VariablesOf[TQuery] = js.native
  }
  object PreloadedQuery {
    
    @scala.inline
    def apply[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
      dispose: () => Unit,
      environment: Environment,
      fetchKey: String | Double,
      fetchPolicy: PreloadFetchPolicy,
      isDisposed: Boolean,
      kind: typingsSlinky.reactRelay.reactRelayStrings.PreloadedQuery,
      name: String,
      variables: VariablesOf[TQuery]
    ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), environment = environment.asInstanceOf[js.Any], fetchKey = fetchKey.asInstanceOf[js.Any], fetchPolicy = fetchPolicy.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
    }
    
    @scala.inline
    implicit class PreloadedQueryMutableBuilder[Self <: PreloadedQuery[_, _], TQuery /* <: OperationType */, TEnvironmentProviderOptions] (val x: Self with (PreloadedQuery[TQuery, TEnvironmentProviderOptions])) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentProviderOptions(value: TEnvironmentProviderOptions): Self = StObject.set(x, "environmentProviderOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentProviderOptionsNull: Self = StObject.set(x, "environmentProviderOptions", null)
      
      @scala.inline
      def setEnvironmentProviderOptionsUndefined: Self = StObject.set(x, "environmentProviderOptions", js.undefined)
      
      @scala.inline
      def setFetchKey(value: String | Double): Self = StObject.set(x, "fetchKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicy(value: PreloadFetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typingsSlinky.reactRelay.reactRelayStrings.PreloadedQuery): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
      
      @scala.inline
      def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
      
      @scala.inline
      def setSource(value: Observable[GraphQLResponse]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNull: Self = StObject.set(x, "source", null)
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setVariables(value: VariablesOf[TQuery]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Readonly<{  entryPoint :TEntryPoint,   entryPointParams :react-relay.react-relay/lib/relay-experimental/helpers.GetEntryPointParamsFromEntryPoint<TEntryPoint>}> */
  @js.native
  trait ThinNestedEntryPointParams[TEntryPoint] extends StObject {
    
    val entryPoint: TEntryPoint = js.native
    
    val entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint] = js.native
  }
  object ThinNestedEntryPointParams {
    
    @scala.inline
    def apply[TEntryPoint](entryPoint: TEntryPoint, entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]): ThinNestedEntryPointParams[TEntryPoint] = {
      val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThinNestedEntryPointParams[TEntryPoint]]
    }
    
    @scala.inline
    implicit class ThinNestedEntryPointParamsMutableBuilder[Self <: ThinNestedEntryPointParams[_], TEntryPoint] (val x: Self with ThinNestedEntryPointParams[TEntryPoint]) extends AnyVal {
      
      @scala.inline
      def setEntryPoint(value: TEntryPoint): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryPointParams(value: GetEntryPointParamsFromEntryPoint[TEntryPoint]): Self = StObject.set(x, "entryPointParams", value.asInstanceOf[js.Any])
    }
  }
  
  type ThinNestedEntryPointParamsObject[TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[_, _]]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ThinNestedEntryPointParams<TPreloadedEntryPoints[K]>}
    */ typingsSlinky.reactRelay.reactRelayStrings.ThinNestedEntryPointParamsObject with TopLevel[TPreloadedEntryPoints]
  
  /* Inlined parent std.Readonly<{  parameters :relay-runtime.relay-runtime.ConcreteRequest | react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadableConcreteRequest<TQuery>,   variables :relay-runtime.relay-runtime.VariablesOf<TQuery>,   options :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadOptions | null | undefined,   environmentProviderOptions :TEnvironmentProviderOptions | null | undefined}> */
  @js.native
  trait ThinQueryParams[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */] extends StObject {
    
    val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.native
    
    val options: js.UndefOr[PreloadOptions | Null] = js.native
    
    val parameters: ConcreteRequest | PreloadableConcreteRequest[TQuery] = js.native
    
    val variables: VariablesOf[TQuery] = js.native
  }
  object ThinQueryParams {
    
    @scala.inline
    def apply[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](parameters: ConcreteRequest | PreloadableConcreteRequest[TQuery], variables: VariablesOf[TQuery]): ThinQueryParams[TQuery, TEnvironmentProviderOptions] = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThinQueryParams[TQuery, TEnvironmentProviderOptions]]
    }
    
    @scala.inline
    implicit class ThinQueryParamsMutableBuilder[Self <: ThinQueryParams[_, _], TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */] (val x: Self with (ThinQueryParams[TQuery, TEnvironmentProviderOptions])) extends AnyVal {
      
      @scala.inline
      def setEnvironmentProviderOptions(value: TEnvironmentProviderOptions): Self = StObject.set(x, "environmentProviderOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentProviderOptionsNull: Self = StObject.set(x, "environmentProviderOptions", null)
      
      @scala.inline
      def setEnvironmentProviderOptionsUndefined: Self = StObject.set(x, "environmentProviderOptions", js.undefined)
      
      @scala.inline
      def setOptions(value: PreloadOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsNull: Self = StObject.set(x, "options", null)
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setParameters(value: ConcreteRequest | PreloadableConcreteRequest[TQuery]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: VariablesOf[TQuery]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  type ThinQueryParamsObject[TPreloadedQueries /* <: Record[String, OperationType] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ThinQueryParams<TPreloadedQueries[K], react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions<std.Record<string, unknown>>>}
    */ typingsSlinky.reactRelay.reactRelayStrings.ThinQueryParamsObject with TopLevel[TPreloadedQueries]
}
