package typingsSlinky.apolloReactHoc

import slinky.core.ReactComponentClass
import typingsSlinky.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typingsSlinky.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsSlinky.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import typingsSlinky.apolloReactCommon.typesMod.OperationVariables
import typingsSlinky.apolloReactHoc.apolloReactHocStrings.client
import typingsSlinky.apolloReactHoc.typesMod.ChildProps
import typingsSlinky.apolloReactHoc.typesMod.OperationOption
import typingsSlinky.apolloReactHoc.typesMod.WithApolloClient
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.react.mod.Context
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hoc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ApolloConsumer: ReactComponentClass[ApolloConsumerProps] = js.native
  
  val ApolloProvider: ReactComponentClass[ApolloProviderProps[js.Any]] = js.native
  
  def getApolloContext(): Context[ApolloContextValue] = js.native
  
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
  
  def resetApolloContext(): Unit = js.native
  
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
}
