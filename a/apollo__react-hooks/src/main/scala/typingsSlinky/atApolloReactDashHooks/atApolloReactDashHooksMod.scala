package typingsSlinky.atApolloReactDashHooks

import slinky.core.ReactComponentClass
import typingsSlinky.apolloDashClient.apolloDashClientMod.default
import typingsSlinky.atApolloReactDashCommon.libContextApolloConsumerMod.ApolloConsumerProps
import typingsSlinky.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typingsSlinky.atApolloReactDashCommon.libContextApolloProviderMod.ApolloProviderProps
import typingsSlinky.atApolloReactDashCommon.libTypesTypesMod.QueryResult
import typingsSlinky.atApolloReactDashHooks.libTypesMod.LazyQueryHookOptions
import typingsSlinky.atApolloReactDashHooks.libTypesMod.MutationHookOptions
import typingsSlinky.atApolloReactDashHooks.libTypesMod.MutationTuple
import typingsSlinky.atApolloReactDashHooks.libTypesMod.QueryHookOptions
import typingsSlinky.atApolloReactDashHooks.libTypesMod.QueryLazyOptions
import typingsSlinky.atApolloReactDashHooks.libTypesMod.SubscriptionHookOptions
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks", JSImport.Namespace)
@js.native
object atApolloReactDashHooksMod extends js.Object {
  @js.native
  class RenderPromises ()
    extends typingsSlinky.atApolloReactDashHooks.libSsrRenderPromisesMod.RenderPromises
  
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
  def useSubscription[TData, TVariables](subscription: DocumentNode): Anon_DataError[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): Anon_DataError[TVariables, TData] = js.native
}

