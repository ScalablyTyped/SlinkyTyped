package typingsSlinky.apolloClient.observableQueryMod

import typingsSlinky.apolloClient.anon.Options
import typingsSlinky.apolloClient.apolloErrorMod.ApolloError
import typingsSlinky.apolloClient.typesMod.ApolloQueryResult
import typingsSlinky.apolloClient.typesMod.OperationVariables
import typingsSlinky.apolloClient.watchQueryOptionsMod.FetchMoreQueryOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.SubscribeToMoreOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import typingsSlinky.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-client/core/ObservableQuery", "ObservableQuery")
@js.native
class ObservableQuery[TData, TVariables] protected () extends Observable[ApolloQueryResult[TData]] {
  def this(hasQueryManagerOptionsShouldSubscribe: Options[TVariables]) = this()
  
  def currentResult(): ApolloCurrentResult[TData] = js.native
  
  def fetchMore[K /* <: /* keyof TVariables */ String */](
    fetchMoreOptions: (FetchMoreQueryOptions[TVariables, K]) with (FetchMoreOptions[TData, TVariables])
  ): js.Promise[ApolloQueryResult[TData]] = js.native
  
  def getCurrentResult(): ApolloCurrentQueryResult[TData] = js.native
  
  def getLastError(): ApolloError = js.native
  
  def getLastResult(): ApolloQueryResult[TData] = js.native
  
  def isDifferentFromLastResult(newResult: ApolloQueryResult[TData]): Boolean = js.native
  
  var isTornDown: js.Any = js.native
  
  var lastError: js.Any = js.native
  
  var lastResult: js.Any = js.native
  
  var lastResultSnapshot: js.Any = js.native
  
  var observers: js.Any = js.native
  
  var onSubscribe: js.Any = js.native
  
  var options: WatchQueryOptions[TVariables] = js.native
  
  val queryId: String = js.native
  
  var queryManager: js.Any = js.native
  
  val queryName: js.UndefOr[String] = js.native
  
  def refetch(): js.Promise[ApolloQueryResult[TData]] = js.native
  def refetch(variables: TVariables): js.Promise[ApolloQueryResult[TData]] = js.native
  
  def resetLastResults(): Unit = js.native
  
  def resetQueryStoreErrors(): Unit = js.native
  
  def result(): js.Promise[ApolloQueryResult[TData]] = js.native
  
  def setOptions(opts: WatchQueryOptions[OperationVariables]): js.Promise[ApolloQueryResult[TData] | Unit] = js.native
  
  var setUpQuery: js.Any = js.native
  
  def setVariables(variables: TVariables): js.Promise[ApolloQueryResult[TData] | Unit] = js.native
  def setVariables(variables: TVariables, tryFetch: js.UndefOr[scala.Nothing], fetchResults: Boolean): js.Promise[ApolloQueryResult[TData] | Unit] = js.native
  def setVariables(variables: TVariables, tryFetch: Boolean): js.Promise[ApolloQueryResult[TData] | Unit] = js.native
  def setVariables(variables: TVariables, tryFetch: Boolean, fetchResults: Boolean): js.Promise[ApolloQueryResult[TData] | Unit] = js.native
  
  var shouldSubscribe: js.Any = js.native
  
  def startPolling(pollInterval: Double): Unit = js.native
  
  def stopPolling(): Unit = js.native
  
  def subscribeToMore[TSubscriptionData, TSubscriptionVariables](options: SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData]): js.Function0[Unit] = js.native
  
  var subscriptions: js.Any = js.native
  
  var tearDownQuery: js.Any = js.native
  
  var updateLastResult: js.Any = js.native
  
  def updateQuery[TVars](
    mapFn: js.Function2[/* previousQueryResult */ TData, /* options */ UpdateQueryOptions[TVars], TData]
  ): Unit = js.native
  
  var variables: TVariables = js.native
}
