package typingsSlinky.apolloDashClient.coreQueryManagerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashClient.Anon_AssumeImmutableResults
import typingsSlinky.apolloDashClient.Anon_ClientQuery
import typingsSlinky.apolloDashClient.Anon_Data
import typingsSlinky.apolloDashClient.Anon_Document
import typingsSlinky.apolloDashClient.coreLocalStateMod.LocalState
import typingsSlinky.apolloDashClient.coreObservableQueryMod.ObservableQuery
import typingsSlinky.apolloDashClient.coreTypesMod.ApolloQueryResult
import typingsSlinky.apolloDashClient.coreTypesMod.FetchType
import typingsSlinky.apolloDashClient.coreTypesMod.OperationVariables
import typingsSlinky.apolloDashClient.coreTypesMod.QueryListener
import typingsSlinky.apolloDashClient.coreWatchQueryOptionsMod.MutationOptions
import typingsSlinky.apolloDashClient.coreWatchQueryOptionsMod.QueryOptions
import typingsSlinky.apolloDashClient.coreWatchQueryOptionsMod.SubscriptionOptions
import typingsSlinky.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryOptions
import typingsSlinky.apolloDashClient.dataMutationsMod.MutationStore
import typingsSlinky.apolloDashClient.dataQueriesMod.QueryStore
import typingsSlinky.apolloDashClient.dataStoreMod.DataStore
import typingsSlinky.apolloDashClient.utilObservableMod.Observable
import typingsSlinky.apolloDashClient.utilObservableMod.Observer
import typingsSlinky.apolloDashLink.apolloDashLinkMod.ApolloLink
import typingsSlinky.apolloDashLink.libTypesMod.FetchResult
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/QueryManager", "QueryManager")
@js.native
class QueryManager[TStore] protected () extends js.Object {
  def this(hasLinkQueryDeduplicationStoreOnBroadcastSsrModeClientAwarenessLocalStateAssumeImmutableResults: Anon_AssumeImmutableResults[TStore]) = this()
  val assumeImmutableResults: Boolean = js.native
  var clientAwareness: js.Any = js.native
  var dataStore: DataStore[TStore] = js.native
  var fetchQueryRejectFns: js.Any = js.native
  var fetchRequest: js.Any = js.native
  var getObservableFromLink: js.Any = js.native
  var getQuery: js.Any = js.native
  var getVariables: js.Any = js.native
  var idCounter: js.Any = js.native
  var inFlightLinkObservables: js.Any = js.native
  var invalidate: js.Any = js.native
  var link: ApolloLink = js.native
  var localState: js.Any = js.native
  var markQueryResult: js.Any = js.native
  var mutationStore: MutationStore = js.native
  var onBroadcast: js.Any = js.native
  var pollingInfoByQueryId: js.Any = js.native
  var prepareContext: js.Any = js.native
  var queries: js.Any = js.native
  var queryDeduplication: js.Any = js.native
  var queryStore: QueryStore = js.native
  var setQuery: js.Any = js.native
  var ssrMode: js.Any = js.native
  var stopQueryInStoreNoBroadcast: js.Any = js.native
  var stopQueryNoBroadcast: js.Any = js.native
  var transformCache: js.Any = js.native
  def addObservableQuery[T](queryId: String, observableQuery: ObservableQuery[T, OperationVariables]): Unit = js.native
  def addQueryListener(queryId: String, listener: QueryListener): Unit = js.native
  def broadcastQueries(): Unit = js.native
  def checkInFlight(queryId: String): Boolean = js.native
  def clearStore(): js.Promise[Unit] = js.native
  def fetchQuery[T](queryId: String, options: WatchQueryOptions[OperationVariables]): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def fetchQuery[T](queryId: String, options: WatchQueryOptions[OperationVariables], fetchType: FetchType): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def fetchQuery[T](
    queryId: String,
    options: WatchQueryOptions[OperationVariables],
    fetchType: FetchType,
    fetchMoreForQueryId: String
  ): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def generateQueryId(): String = js.native
  def getCurrentQueryResult[T](observableQuery: ObservableQuery[T, OperationVariables]): Anon_Data[T] = js.native
  def getCurrentQueryResult[T](observableQuery: ObservableQuery[T, OperationVariables], optimistic: Boolean): Anon_Data[T] = js.native
  def getLocalState(): LocalState[TStore] = js.native
  def getQueryWithPreviousResult[TData, TVariables](queryIdOrObservable: String): Anon_Document[TVariables] = js.native
  def getQueryWithPreviousResult[TData, TVariables](queryIdOrObservable: ObservableQuery[TData, TVariables]): Anon_Document[TVariables] = js.native
  def mutate[T](
    hasMutationVariablesOptimisticResponseUpdateQueriesRefetchQueriesAwaitRefetchQueriesUpdateErrorPolicyFetchPolicyContext: MutationOptions[StringDictionary[_], OperationVariables]
  ): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def observeQuery[T](
    queryId: String,
    options: WatchQueryOptions[OperationVariables],
    observer: Observer[ApolloQueryResult[T]]
  ): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def query[T](options: QueryOptions[OperationVariables]): js.Promise[ApolloQueryResult[T]] = js.native
  def queryListenerForObserver[T](
    queryId: String,
    options: WatchQueryOptions[OperationVariables],
    observer: Observer[ApolloQueryResult[T]]
  ): QueryListener = js.native
  def reFetchObservableQueries(): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  def reFetchObservableQueries(includeStandby: Boolean): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  def removeObservableQuery(queryId: String): Unit = js.native
  def removeQuery(queryId: String): Unit = js.native
  def resetStore(): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  def startGraphQLSubscription[T](hasQueryFetchPolicyVariables: SubscriptionOptions[OperationVariables]): Observable[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def startPollingQuery(options: WatchQueryOptions[OperationVariables], queryId: String): String = js.native
  def startPollingQuery(options: WatchQueryOptions[OperationVariables], queryId: String, listener: QueryListener): String = js.native
  def startQuery[T](queryId: String, options: WatchQueryOptions[OperationVariables], listener: QueryListener): String = js.native
  def stop(): Unit = js.native
  def stopPollingQuery(queryId: String): Unit = js.native
  def stopQuery(queryId: String): Unit = js.native
  def stopQueryInStore(queryId: String): Unit = js.native
  def transform(document: DocumentNode): Anon_ClientQuery = js.native
  def updateQueryWatch(queryId: String, document: DocumentNode, options: WatchQueryOptions[OperationVariables]): js.Function0[Unit] = js.native
  def watchQuery[T, TVariables](options: WatchQueryOptions[OperationVariables]): ObservableQuery[T, TVariables] = js.native
  def watchQuery[T, TVariables](options: WatchQueryOptions[OperationVariables], shouldSubscribe: Boolean): ObservableQuery[T, TVariables] = js.native
}

