package typingsSlinky.reactRelay

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.reactRelay.anon.CacheConfig
import typingsSlinky.reactRelay.anon.ComponentRef
import typingsSlinky.reactRelay.anon.Count
import typingsSlinky.reactRelay.anon.Error
import typingsSlinky.reactRelay.anon.PartialPageInfo
import typingsSlinky.reactRelay.anon.Relay
import typingsSlinky.reactRelay.anon.RelayRelayPaginationProp
import typingsSlinky.reactRelay.anon.RelayRelayRefetchProp
import typingsSlinky.reactRelay.reactRelayStrings.`network-only`
import typingsSlinky.reactRelay.reactRelayStrings.`store-or-network`
import typingsSlinky.reactRelay.reactRelayStrings.backward
import typingsSlinky.reactRelay.reactRelayStrings.forward
import typingsSlinky.reactRelay.reactRelayStrings.relay
import typingsSlinky.relayRuntime.applyOptimisticMutationMod.OptimisticMutationConfig
import typingsSlinky.relayRuntime.commitMutationMod.MutationConfig
import typingsSlinky.relayRuntime.commitMutationMod.MutationParameters
import typingsSlinky.relayRuntime.mod.FragmentRef
import typingsSlinky.relayRuntime.mod.RefType
import typingsSlinky.relayRuntime.mod._FragmentRefs
import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayModernEnvironmentMod.EnvironmentConfig
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayObservableMod.Observer
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.RelayContext
import typingsSlinky.relayRuntime.relayStoreTypesMod.StoreUpdater
import typingsSlinky.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-relay", "Environment")
  @js.native
  class Environment protected ()
    extends typingsSlinky.relayRuntime.mod.Environment {
    def this(config: EnvironmentConfig) = this()
  }
  
  @JSImport("react-relay", "LocalQueryRenderer")
  @js.native
  class LocalQueryRenderer[TOperation /* <: OperationType */] ()
    extends Component[QueryRendererProps[TOperation], js.Object, js.Any]
  
  @JSImport("react-relay", "QueryRenderer")
  @js.native
  class QueryRenderer[TOperation /* <: OperationType */] ()
    extends Component[CacheConfig with QueryRendererProps[TOperation], js.Object, js.Any]
  
  @JSImport("react-relay", "ReactRelayContext")
  @js.native
  val ReactRelayContext: Context[RelayContext | Null] = js.native
  
  @JSImport("react-relay", "applyOptimisticMutation")
  @js.native
  def applyOptimisticMutation(
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    config: OptimisticMutationConfig
  ): Disposable = js.native
  
  @JSImport("react-relay", "commitLocalUpdate")
  @js.native
  def commitLocalUpdate(environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment, updater: StoreUpdater): Unit = js.native
  
  @JSImport("react-relay", "commitMutation")
  @js.native
  def commitMutation[TOperation /* <: MutationParameters */](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
  
  @JSImport("react-relay", "createFragmentContainer")
  @js.native
  def createFragmentContainer[Props](Component: ReactComponentClass[Props with Relay], fragmentSpec: Record[String, GraphQLTaggedNode]): Container[Props] = js.native
  
  @JSImport("react-relay", "createPaginationContainer")
  @js.native
  def createPaginationContainer[Props](
    Component: ReactComponentClass[Props with RelayRelayPaginationProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
  
  @JSImport("react-relay", "createRefetchContainer")
  @js.native
  def createRefetchContainer[Props](
    Component: ReactComponentClass[Props with RelayRelayRefetchProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    refetchQuery: GraphQLTaggedNode
  ): Container[Props] = js.native
  
  @JSImport("react-relay", "fetchQuery")
  @js.native
  def fetchQuery_variables[T /* <: OperationType */](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  @JSImport("react-relay", "fetchQuery")
  @js.native
  def fetchQuery_variables[T /* <: OperationType */](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  
  @JSImport("react-relay", "graphql")
  @js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  
  @JSImport("react-relay", "readInlineData")
  @js.native
  def readInlineData[T /* <: RefType[_] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = js.native
  @JSImport("react-relay", "readInlineData")
  @js.native
  def readInlineData[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = js.native
  @JSImport("react-relay", "readInlineData")
  @js.native
  def readInlineData_T_RefTypeWildcard_Union[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): js.UndefOr[T | Null] = js.native
  
  @JSImport("react-relay", "requestSubscription")
  @js.native
  def requestSubscription[TSubscription /* <: OperationType */](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = js.native
  
  @js.native
  trait ConnectionConfig[Props] extends StObject {
    
    var direction: js.UndefOr[backward | forward] = js.native
    
    var getConnectionFromProps: js.UndefOr[js.Function1[/* props */ Props, js.UndefOr[ConnectionData | Null]]] = js.native
    
    var getFragmentVariables: js.UndefOr[js.Function2[/* prevVars */ Variables, /* totalCount */ Double, Variables]] = js.native
    
    def getVariables(props: Props, paginationInfo: Count, fragmentVariables: Variables): Variables = js.native
    
    var query: GraphQLTaggedNode = js.native
  }
  object ConnectionConfig {
    
    @scala.inline
    def apply[Props](getVariables: (Props, Count, Variables) => Variables, query: GraphQLTaggedNode): ConnectionConfig[Props] = {
      val __obj = js.Dynamic.literal(getVariables = js.Any.fromFunction3(getVariables), query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionConfig[Props]]
    }
    
    @scala.inline
    implicit class ConnectionConfigMutableBuilder[Self <: ConnectionConfig[_], Props] (val x: Self with ConnectionConfig[Props]) extends AnyVal {
      
      @scala.inline
      def setDirection(value: backward | forward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setGetConnectionFromProps(value: /* props */ Props => js.UndefOr[ConnectionData | Null]): Self = StObject.set(x, "getConnectionFromProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetConnectionFromPropsUndefined: Self = StObject.set(x, "getConnectionFromProps", js.undefined)
      
      @scala.inline
      def setGetFragmentVariables(value: (/* prevVars */ Variables, /* totalCount */ Double) => Variables): Self = StObject.set(x, "getFragmentVariables", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetFragmentVariablesUndefined: Self = StObject.set(x, "getFragmentVariables", js.undefined)
      
      @scala.inline
      def setGetVariables(value: (Props, Count, Variables) => Variables): Self = StObject.set(x, "getVariables", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQuery(value: GraphQLTaggedNode): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryFunction0(value: () => ReaderFragment | ConcreteRequest): Self = StObject.set(x, "query", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ConnectionData extends StObject {
    
    var edges: js.UndefOr[js.Array[_] | Null] = js.native
    
    var pageInfo: js.UndefOr[PartialPageInfo | Null] = js.native
  }
  object ConnectionData {
    
    @scala.inline
    def apply(): ConnectionData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionData]
    }
    
    @scala.inline
    implicit class ConnectionDataMutableBuilder[Self <: ConnectionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdges(value: js.Array[_]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesNull: Self = StObject.set(x, "edges", null)
      
      @scala.inline
      def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      @scala.inline
      def setEdgesVarargs(value: js.Any*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      @scala.inline
      def setPageInfo(value: PartialPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageInfoNull: Self = StObject.set(x, "pageInfo", null)
      
      @scala.inline
      def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    }
  }
  
  type Container[Props] = ReactComponentClass[ContainerProps[Props] with ComponentRef]
  
  type ContainerProps[Props] = MappedFragmentProps[Pick[Props, Exclude[/* keyof Props */ String, relay]]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactRelay.reactRelayStrings.`store-and-network`
    - typingsSlinky.reactRelay.reactRelayStrings.`network-only`
  */
  trait FetchPolicy extends StObject
  object FetchPolicy {
    
    @scala.inline
    def `network-only`: typingsSlinky.reactRelay.reactRelayStrings.`network-only` = "network-only".asInstanceOf[typingsSlinky.reactRelay.reactRelayStrings.`network-only`]
    
    @scala.inline
    def `store-and-network`: typingsSlinky.reactRelay.reactRelayStrings.`store-and-network` = "store-and-network".asInstanceOf[typingsSlinky.reactRelay.reactRelayStrings.`store-and-network`]
  }
  
  type FragmentOrRegularProp[T] = T | js.Array[_FragmentRefs[js.Any]] | _FragmentRefs[js.Any]
  
  type MappedFragmentProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-relay.react-relay.FragmentOrRegularProp<T[K]>}
    */ typingsSlinky.reactRelay.reactRelayStrings.MappedFragmentProps with TopLevel[T]
  
  type ObserverOrCallback = Observer[Unit] | (js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit])
  
  @js.native
  trait QueryRendererProps[TOperation /* <: OperationType */] extends StObject {
    
    var environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment = js.native
    
    var query: js.UndefOr[GraphQLTaggedNode | Null] = js.native
    
    def render(renderProps: Error[TOperation]): ReactElement = js.native
    
    var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any = js.native
  }
  object QueryRendererProps {
    
    @scala.inline
    def apply[TOperation /* <: OperationType */](
      environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
      render: Error[TOperation] => ReactElement,
      variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
    ): QueryRendererProps[TOperation] = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryRendererProps[TOperation]]
    }
    
    @scala.inline
    implicit class QueryRendererPropsMutableBuilder[Self <: QueryRendererProps[_], TOperation /* <: OperationType */] (val x: Self with QueryRendererProps[TOperation]) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: GraphQLTaggedNode): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryFunction0(value: () => ReaderFragment | ConcreteRequest): Self = StObject.set(x, "query", js.Any.fromFunction0(value))
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRender(value: Error[TOperation] => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVariables(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
      ): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactRelayLocalQueryRenderer[TOperation /* <: OperationType */] = ReactComponentClass[QueryRendererProps[TOperation]]
  
  type ReactRelayQueryRenderer[TOperation /* <: OperationType */] = ReactComponentClass[CacheConfig with QueryRendererProps[TOperation]]
  
  @js.native
  trait RefetchOptions extends StObject {
    
    var fetchPolicy: js.UndefOr[`store-or-network` | `network-only`] = js.native
    
    var force: js.UndefOr[Boolean] = js.native
  }
  object RefetchOptions {
    
    @scala.inline
    def apply(): RefetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefetchOptions]
    }
    
    @scala.inline
    implicit class RefetchOptionsMutableBuilder[Self <: RefetchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchPolicy(value: `store-or-network` | `network-only`): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  @js.native
  trait RelayPaginationProp extends StObject {
    
    val environment: typingsSlinky.relayRuntime.mod.Environment = js.native
    
    def hasMore(): Boolean = js.native
    
    def isLoading(): Boolean = js.native
    
    def loadMore(pageSize: Double): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: js.UndefOr[ObserverOrCallback], options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: Null, options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: ObserverOrCallback): js.UndefOr[Disposable | Null] = js.native
    
    var refetch: js.UndefOr[scala.Nothing] = js.native
    
    def refetchConnection(totalCount: Double): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(
      totalCount: Double,
      observerOrCallback: js.UndefOr[ObserverOrCallback],
      refetchVariables: Variables
    ): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(totalCount: Double, observerOrCallback: Null, refetchVariables: Variables): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(totalCount: Double, observerOrCallback: ObserverOrCallback): js.UndefOr[Disposable | Null] = js.native
  }
  
  @js.native
  trait RelayProp extends StObject {
    
    var environment: typingsSlinky.relayRuntime.mod.Environment = js.native
    
    // ensures no RelayRefetchProp is used with a fragment container
    var hasMore: js.UndefOr[scala.Nothing] = js.native
    
    var refetch: js.UndefOr[scala.Nothing] = js.native
  }
  object RelayProp {
    
    @scala.inline
    def apply(environment: typingsSlinky.relayRuntime.mod.Environment): RelayProp = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayProp]
    }
    
    @scala.inline
    implicit class RelayPropMutableBuilder[Self <: RelayProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: typingsSlinky.relayRuntime.mod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RelayRefetchProp extends StObject {
    
    var environment: typingsSlinky.relayRuntime.mod.Environment = js.native
    
    var hasMore: js.UndefOr[scala.Nothing] = js.native
    
    def refetch(refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables]): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: js.UndefOr[scala.Nothing],
      observerOrCallback: js.UndefOr[ObserverOrCallback],
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: js.UndefOr[scala.Nothing],
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: js.UndefOr[scala.Nothing],
      observerOrCallback: ObserverOrCallback
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: js.UndefOr[ObserverOrCallback],
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: ObserverOrCallback
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: js.UndefOr[ObserverOrCallback],
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: ObserverOrCallback
    ): Disposable = js.native
    def refetch(refetchVariables: Variables): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: js.UndefOr[scala.Nothing],
      observerOrCallback: js.UndefOr[ObserverOrCallback],
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: js.UndefOr[scala.Nothing],
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: js.UndefOr[scala.Nothing],
      observerOrCallback: ObserverOrCallback
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Null,
      observerOrCallback: js.UndefOr[ObserverOrCallback],
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Null,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Null, observerOrCallback: ObserverOrCallback): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Variables): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Variables,
      observerOrCallback: js.UndefOr[ObserverOrCallback],
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Variables,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Variables, observerOrCallback: ObserverOrCallback): Disposable = js.native
  }
}
