package typingsSlinky.reactApollo

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typingsSlinky.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsSlinky.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import typingsSlinky.apolloReactCommon.typesMod.OperationVariables
import typingsSlinky.apolloReactCommon.typesMod.QueryResult
import typingsSlinky.apolloReactComponents.typesMod.MutationComponentOptions
import typingsSlinky.apolloReactComponents.typesMod.QueryComponentOptions
import typingsSlinky.apolloReactComponents.typesMod.SubscriptionComponentOptions
import typingsSlinky.apolloReactHoc.typesMod.ChildProps
import typingsSlinky.apolloReactHoc.typesMod.OperationOption
import typingsSlinky.apolloReactHoc.typesMod.WithApolloClient
import typingsSlinky.apolloReactHooks.anon.Error
import typingsSlinky.apolloReactHooks.typesMod.LazyQueryHookOptions
import typingsSlinky.apolloReactHooks.typesMod.MutationHookOptions
import typingsSlinky.apolloReactHooks.typesMod.MutationTuple
import typingsSlinky.apolloReactHooks.typesMod.QueryHookOptions
import typingsSlinky.apolloReactHooks.typesMod.QueryTuple
import typingsSlinky.apolloReactHooks.typesMod.SubscriptionHookOptions
import typingsSlinky.apolloReactSsr.getDataFromTreeMod.GetMarkupFromTreeOptions
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.react.mod.Context
import typingsSlinky.reactApollo.reactApolloStrings.client
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-apollo", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ApolloConsumer: ReactComponentClass[ApolloConsumerProps] = js.native
  
  val ApolloProvider: ReactComponentClass[ApolloProviderProps[js.Any]] = js.native
  
  def getApolloContext(): Context[ApolloContextValue] = js.native
  
  def getDataFromTree(tree: ReactElement): js.Promise[String] = js.native
  def getDataFromTree(tree: ReactElement, context: StringDictionary[js.Any]): js.Promise[String] = js.native
  
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
  
  def useLazyQuery[TData, TVariables](query: DocumentNode): QueryTuple[TData, TVariables] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode, options: LazyQueryHookOptions[TData, TVariables]): QueryTuple[TData, TVariables] = js.native
  
  def useMutation[TData, TVariables](mutation: DocumentNode): MutationTuple[TData, TVariables] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode, options: MutationHookOptions[TData, TVariables]): MutationTuple[TData, TVariables] = js.native
  
  def useQuery[TData, TVariables](query: DocumentNode): QueryResult[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): QueryResult[TData, TVariables] = js.native
  
  def useSubscription[TData, TVariables](subscription: DocumentNode): Error[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): Error[TVariables, TData] = js.native
  
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
    
    def apply[TData, TVariables](props: MutationComponentOptions[TData, TVariables]): ReactElement | Null = js.native
    
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
    
    def apply[TData, TVariables](props: QueryComponentOptions[TData, TVariables]): ReactElement | Null = js.native
    
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
    
    def apply[TData, TVariables](props: SubscriptionComponentOptions[TData, TVariables]): ReactElement | Null = js.native
    
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
