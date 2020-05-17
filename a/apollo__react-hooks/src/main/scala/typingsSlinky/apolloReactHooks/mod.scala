package typingsSlinky.apolloReactHooks

import slinky.core.ReactComponentClass
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typingsSlinky.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsSlinky.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import typingsSlinky.apolloReactCommon.typesMod.QueryResult
import typingsSlinky.apolloReactHooks.anon.Error
import typingsSlinky.apolloReactHooks.typesMod.LazyQueryHookOptions
import typingsSlinky.apolloReactHooks.typesMod.MutationHookOptions
import typingsSlinky.apolloReactHooks.typesMod.MutationTuple
import typingsSlinky.apolloReactHooks.typesMod.QueryHookOptions
import typingsSlinky.apolloReactHooks.typesMod.QueryLazyOptions
import typingsSlinky.apolloReactHooks.typesMod.SubscriptionHookOptions
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RenderPromises ()
    extends typingsSlinky.apolloReactHooks.renderPromisesMod.RenderPromises
  
  val ApolloConsumer: ReactComponentClass[ApolloConsumerProps] = js.native
  val ApolloProvider: ReactComponentClass[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
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
  def useSubscription[TData, TVariables](subscription: DocumentNode): Error[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): Error[TVariables, TData] = js.native
}

