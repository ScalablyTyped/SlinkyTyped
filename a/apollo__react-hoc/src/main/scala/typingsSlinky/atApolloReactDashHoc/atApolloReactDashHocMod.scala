package typingsSlinky.atApolloReactDashHoc

import slinky.core.ReactComponentClass
import typingsSlinky.atApolloReactDashCommon.libContextApolloConsumerMod.ApolloConsumerProps
import typingsSlinky.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typingsSlinky.atApolloReactDashCommon.libContextApolloProviderMod.ApolloProviderProps
import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.OperationVariables
import typingsSlinky.atApolloReactDashHoc.atApolloReactDashHocStrings.client
import typingsSlinky.atApolloReactDashHoc.libTypesMod.ChildProps
import typingsSlinky.atApolloReactDashHoc.libTypesMod.OperationOption
import typingsSlinky.atApolloReactDashHoc.libTypesMod.WithApolloClient
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.react.reactMod.Context
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hoc", JSImport.Namespace)
@js.native
object atApolloReactDashHocMod extends js.Object {
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

