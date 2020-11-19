package typingsSlinky.apolloClient.queryManagerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloClient.anon.AssumeImmutableResults
import typingsSlinky.apolloClient.anon.Data
import typingsSlinky.apolloClient.anon.Document
import typingsSlinky.apolloClient.anon.ReadonlydocumentReadonlyD
import typingsSlinky.apolloClient.localStateMod.LocalState
import typingsSlinky.apolloClient.mutationsMod.MutationStore
import typingsSlinky.apolloClient.observableMod.Observable
import typingsSlinky.apolloClient.observableMod.Observer
import typingsSlinky.apolloClient.observableQueryMod.ObservableQuery
import typingsSlinky.apolloClient.queriesMod.QueryStore
import typingsSlinky.apolloClient.storeMod.DataStore
import typingsSlinky.apolloClient.typesMod.ApolloQueryResult
import typingsSlinky.apolloClient.typesMod.FetchType
import typingsSlinky.apolloClient.typesMod.OperationVariables
import typingsSlinky.apolloClient.typesMod.QueryListener
import typingsSlinky.apolloClient.watchQueryOptionsMod.MutationOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.QueryOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.SubscriptionOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-client/core/QueryManager", "QueryManager")
@js.native
class QueryManager[TStore] protected () extends js.Object {
  def this(hasLinkQueryDeduplicationStoreOnBroadcastSsrModeClientAwarenessLocalStateAssumeImmutableResults: AssumeImmutableResults[TStore]) = this()
  
  def addObservableQuery[T](queryId: String, observableQuery: ObservableQuery[T, OperationVariables]): Unit = js.native
  
  def addQueryListener(queryId: String, listener: QueryListener): Unit = js.native
  
  val assumeImmutableResults: Boolean = js.native
  
  def broadcastQueries(): Unit = js.native
  
  def checkInFlight(queryId: String): Boolean = js.native
  
  def clearStore(): js.Promise[Unit] = js.native
  
  var clientAwareness: js.Any = js.native
  
  var dataStore: DataStore[TStore] = js.native
  
  def fetchQuery[T](queryId: String, options: WatchQueryOptions[OperationVariables]): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def fetchQuery[T](
    queryId: String,
    options: WatchQueryOptions[OperationVariables],
    fetchType: js.UndefOr[scala.Nothing],
    fetchMoreForQueryId: String
  ): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def fetchQuery[T](queryId: String, options: WatchQueryOptions[OperationVariables], fetchType: FetchType): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def fetchQuery[T](
    queryId: String,
    options: WatchQueryOptions[OperationVariables],
    fetchType: FetchType,
    fetchMoreForQueryId: String
  ): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  
  var fetchQueryRejectFns: js.Any = js.native
  
  var fetchRequest: js.Any = js.native
  
  def generateQueryId(): String = js.native
  
  def getCurrentQueryResult[T](observableQuery: ObservableQuery[T, OperationVariables]): Data[T] = js.native
  def getCurrentQueryResult[T](observableQuery: ObservableQuery[T, OperationVariables], optimistic: Boolean): Data[T] = js.native
  
  def getLocalState(): LocalState[TStore] = js.native
  
  var getObservableFromLink: js.Any = js.native
  
  var getQuery: js.Any = js.native
  
  def getQueryWithPreviousResult[TData, TVariables](queryIdOrObservable: String): Document[TVariables] = js.native
  def getQueryWithPreviousResult[TData, TVariables](queryIdOrObservable: ObservableQuery[TData, TVariables]): Document[TVariables] = js.native
  
  var getVariables: js.Any = js.native
  
  var idCounter: js.Any = js.native
  
  var inFlightLinkObservables: js.Any = js.native
  
  var invalidate: js.Any = js.native
  
  var link: ApolloLink = js.native
  
  var localState: js.Any = js.native
  
  var markQueryResult: js.Any = js.native
  
  def mutate[T](
    hasMutationVariablesOptimisticResponseUpdateQueriesRefetchQueriesAwaitRefetchQueriesUpdateErrorPolicyFetchPolicyContext: MutationOptions[StringDictionary[_], OperationVariables]
  ): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  
  var mutationStore: MutationStore = js.native
  
  def observeQuery[T](
    queryId: String,
    options: WatchQueryOptions[OperationVariables],
    observer: Observer[ApolloQueryResult[T]]
  ): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  
  var onBroadcast: js.Any = js.native
  
  var pollingInfoByQueryId: js.Any = js.native
  
  var prepareContext: js.Any = js.native
  
  var queries: js.Any = js.native
  
  def query[T](options: QueryOptions[OperationVariables]): js.Promise[ApolloQueryResult[T]] = js.native
  
  var queryDeduplication: js.Any = js.native
  
  def queryListenerForObserver[T](
    queryId: String,
    options: WatchQueryOptions[OperationVariables],
    observer: Observer[ApolloQueryResult[T]]
  ): QueryListener = js.native
  
  var queryStore: QueryStore = js.native
  
  def reFetchObservableQueries(): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  def reFetchObservableQueries(includeStandby: Boolean): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  
  def removeObservableQuery(queryId: String): Unit = js.native
  
  def removeQuery(queryId: String): Unit = js.native
  
  def resetStore(): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  
  var setQuery: js.Any = js.native
  
  var ssrMode: js.Any = js.native
  
  def startGraphQLSubscription[T](hasQueryFetchPolicyVariables: SubscriptionOptions[OperationVariables]): Observable[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  
  def startPollingQuery(options: WatchQueryOptions[OperationVariables], queryId: String): String = js.native
  def startPollingQuery(options: WatchQueryOptions[OperationVariables], queryId: String, listener: QueryListener): String = js.native
  
  def startQuery[T](queryId: String, options: WatchQueryOptions[OperationVariables], listener: QueryListener): String = js.native
  
  def stop(): Unit = js.native
  
  def stopPollingQuery(queryId: String): Unit = js.native
  
  def stopQuery(queryId: String): Unit = js.native
  
  def stopQueryInStore(queryId: String): Unit = js.native
  
  var stopQueryInStoreNoBroadcast: js.Any = js.native
  
  var stopQueryNoBroadcast: js.Any = js.native
  
  def transform(document: DocumentNode): ReadonlydocumentReadonlyD = js.native
  
  var transformCache: js.Any = js.native
  
  def updateQueryWatch(queryId: String, document: DocumentNode, options: WatchQueryOptions[OperationVariables]): js.Function0[Unit] = js.native
  
  def watchQuery[T, TVariables](options: WatchQueryOptions[OperationVariables]): ObservableQuery[T, TVariables] = js.native
  def watchQuery[T, TVariables](options: WatchQueryOptions[OperationVariables], shouldSubscribe: Boolean): ObservableQuery[T, TVariables] = js.native
}
