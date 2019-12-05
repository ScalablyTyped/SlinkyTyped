package typingsSlinky.reactDashApollo

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.apolloDashClient.apolloDashClientMod.default
import typingsSlinky.atApolloReactDashCommon.libContextApolloConsumerMod.ApolloConsumerProps
import typingsSlinky.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typingsSlinky.atApolloReactDashCommon.libContextApolloProviderMod.ApolloProviderProps
import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.OperationVariables
import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.QueryResult
import typingsSlinky.atApolloReactDashComponents.libTypesMod.MutationComponentOptions
import typingsSlinky.atApolloReactDashComponents.libTypesMod.QueryComponentOptions
import typingsSlinky.atApolloReactDashComponents.libTypesMod.SubscriptionComponentOptions
import typingsSlinky.atApolloReactDashHoc.libTypesMod.ChildProps
import typingsSlinky.atApolloReactDashHoc.libTypesMod.OperationOption
import typingsSlinky.atApolloReactDashHoc.libTypesMod.WithApolloClient
import typingsSlinky.atApolloReactDashHooks.Anon_DataError
import typingsSlinky.atApolloReactDashHooks.libTypesMod.LazyQueryHookOptions
import typingsSlinky.atApolloReactDashHooks.libTypesMod.MutationHookOptions
import typingsSlinky.atApolloReactDashHooks.libTypesMod.MutationTuple
import typingsSlinky.atApolloReactDashHooks.libTypesMod.QueryHookOptions
import typingsSlinky.atApolloReactDashHooks.libTypesMod.QueryLazyOptions
import typingsSlinky.atApolloReactDashHooks.libTypesMod.SubscriptionHookOptions
import typingsSlinky.atApolloReactDashSsr.libGetDataFromTreeMod.GetMarkupFromTreeOptions
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.propDashTypes.propDashTypesMod.Requireable
import typingsSlinky.propDashTypes.propDashTypesMod.Validator
import typingsSlinky.react.reactMod.Context
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.reactDashApollo.reactDashApolloStrings.client
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", JSImport.Namespace)
@js.native
object reactDashApolloMod extends js.Object {
  val ApolloConsumer: ReactComponentClass[ApolloConsumerProps] = js.native
  val ApolloProvider: ReactComponentClass[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
  def getDataFromTree(tree: TagMod[Any]): js.Promise[String] = js.native
  def getDataFromTree(tree: TagMod[Any], context: StringDictionary[js.Any]): js.Promise[String] = js.native
  def getMarkupFromTree(hasTreeContextRenderFunction: GetMarkupFromTreeOptions): js.Promise[String] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
  def renderToStringWithData(component: ReactElement): js.Promise[String] = js.native
  def resetApolloContext(): Unit = js.native
  def useApolloClient(): default[js.Object] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode, options: LazyQueryHookOptions[TData, TVariables]): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode): MutationTuple[TData, TVariables] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode, options: MutationHookOptions[TData, TVariables]): MutationTuple[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode): QueryResult[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): QueryResult[TData, TVariables] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode): Anon_DataError[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): Anon_DataError[TVariables, TData] = js.native
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](WrappedComponent: ReactComponentClass[WithApolloClient[Omit[TProps, client]]]): ReactComponentClass[Omit[TProps, client]] = js.native
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](
    WrappedComponent: ReactComponentClass[WithApolloClient[Omit[TProps, client]]],
    operationOptions: OperationOption[TProps, TResult, OperationVariables, ChildProps[TProps, TResult, OperationVariables]]
  ): ReactComponentClass[Omit[TProps, client]] = js.native
  def withMutation[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
  def withMutation[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ReactComponentClass[TProps with TChildProps], 
    ReactComponentClass[TProps]
  ] = js.native
  @js.native
  object Mutation extends js.Object {
    def apply[TData, TVariables](props: MutationComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var awaitRefetchQueries: Requireable[Boolean] = js.native
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var mutation: Validator[js.Object] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var optimisticResponse: Requireable[js.Object] = js.native
      var refetchQueries: Requireable[
            (js.Function1[/* repeated */ _, _]) | (js.Array[js.UndefOr[String | js.Object | Null]])
          ] = js.native
      var update: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
  @js.native
  object Query extends js.Object {
    def apply[TData, TVariables](props: QueryComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var client: Requireable[js.Object] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var notifyOnNetworkStatusChange: Requireable[Boolean] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var partialRefetch: Requireable[Boolean] = js.native
      var pollInterval: Requireable[Double] = js.native
      var query: Validator[js.Object] = js.native
      var returnPartialData: Requireable[Boolean] = js.native
      var ssr: Requireable[Boolean] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
  @js.native
  object Subscription extends js.Object {
    def apply[TData, TVariables](props: SubscriptionComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionComplete: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionData: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var shouldResubscribe: Requireable[Boolean | (js.Function1[/* repeated */ _, _])] = js.native
      var subscription: Validator[js.Object] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
}

